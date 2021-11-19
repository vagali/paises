package com.curso.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@NamedQueries({
	@NamedQuery(name = "Pais.findAll",
			query = "SELECT p FROM Contrie p where p.regionId =: id"),
})
@Entity
@Table(name = "COUNTRIES")
public class Contrie implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	@Size(min = 2, max = 2)
	@Column(name = "COUNTRY_ID")
	private String countryId;
	@NotNull
	@Column(name = "COUNTRY_NAME")
	private String countryName;
	@Column(name = "REGION_ID")
	private Integer regionId;
	@ManyToOne
	@JoinColumn(name = "REGION_ID", insertable = false, updatable = false)
	private Region region;

	public Contrie() {
		super();
	}

	public Contrie(String countryId, String countryName, Integer regionID, Region region) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.regionId = regionID;
		this.region = region;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Integer getRegionID() {
		return regionId;
	}

	public void setRegionID(Integer regionId) {
		this.regionId = regionId;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countryId == null) ? 0 : countryId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrie other = (Contrie) obj;
		if (countryId == null) {
			if (other.countryId != null)
				return false;
		} else if (!countryId.equals(other.countryId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contrie [countryId=" + countryId + ", countryName=" + countryName + ", regionID=" + regionId
				+ ", region=" + region + "]";
	}

}
