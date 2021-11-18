package com.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.domain.Producto;
import com.curso.service.ProductoService;

@Controller
@RequestMapping("comercio")
public class ProductosController {

	@Autowired
	private ProductoService productoService;

	@RequestMapping(path = "/productos", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("productos", productoService.getTodosProductos());

		return "productos";
	}

	@GetMapping("/productos/{categoria}")
	public String getProductosPorCategoria(Model model, @PathVariable("categoria") String categoriaProducto) {

		model.addAttribute("productos", productoService.getProductosPorCategoria(categoriaProducto));
		return "productos";
	}

	// mostra el fomulario con un producto vacio para
	// que el cliente rellene los datos
	@GetMapping(value = "/productos/nuevo")
	public String getCrearNuevoProductoFormulario(Model model) {

		System.out.println(".... nuevo");
		Producto nuevoProducto = new Producto();
		nuevoProducto.setDescripcion("**** nuevo ****");

		model.addAttribute("nuevoProducto", nuevoProducto);
		return "crear-producto";
	}

	@PostMapping(value = "/productos/nuevo")
	public String crearProducto(@ModelAttribute("nuevoProducto") Producto nuevoProducto, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "crear-producto";
		}
		productoService.addProducto(nuevoProducto);
		return "redirect:/comercio/productos";
	}

//--------------------------------------------------------------
	@GetMapping(value = "/productos/modificar/{idProducto}")
	public String modificarProductoFormuladio(Model model, @PathVariable("idProducto") String idProducto) {

		model.addAttribute("modificarProducto", productoService.getProductoPorId(idProducto));
		return "modificar";
	}

	@PostMapping(value = "/productos/modificar/{idProducto}")
	public String modificarProducto(@PathVariable("idProducto") String idProducto,
			@ModelAttribute("modificarProducto") Producto productoModificar) {
		Producto pr = new Producto();
		pr = productoService.getProductoPorId(idProducto);
		pr.setIdProducto(productoModificar.getIdProducto());
		pr.setDescripcion(productoModificar.getDescripcion());
		productoService.modifyP(pr);
		return "redirect:/comercio/productos";
	}

	@GetMapping(value = "/productos/remove")
	public String removeProducto(@RequestParam("idProducto") String idProducto) {
		productoService.remove(idProducto);
		return "redirect:/comercio/productos";
	}
//	@ExceptionHandler(GestionProductoException.class)
//
//    public ModelAndView handleError(
//
//    HttpServletRequest req,
//
//    GestionProductoException exception) {
//
// 
//
//        ModelAndView mav = new ModelAndView();
//
//         mav.addObject("idProductoNoEncontrado", 
//
//                exception.getIdProducto());
//
//        mav.addObject("claveMensage", 
//
//                exception.getMessage());
//
//       
//
//        mav.setViewName("producto-exception");
//
//        return mav;
//
//    }

}
