package com.curso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.curso.domain.Producto;
import com.curso.domain.repository.ProductoRepository;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    @Qualifier("JPAProductoRepository")
    private ProductoRepository productoRepositorio;

    @Override
    public void generarPedido(String idProducto, int cantidad) {
        Producto producto = productoRepositorio.getProductoPorId(idProducto);

        if (producto.getUnidadesEnStock()< cantidad) {
            throw new IllegalArgumentException("Fuera de Stock. "
                    + "Hay disponibles actualmente " 
                    + producto.getUnidadesEnStock()  +" unidades.");
        }

        producto.setUnidadesEnStock(producto.getUnidadesEnStock()- cantidad);

    }

}
