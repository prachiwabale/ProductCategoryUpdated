package com.category.product.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity(name = "ProductEntity")
@Table(name = "tbl_product_entity")
public class ProductEntity implements ICoreEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "product_code", nullable = false, unique = false)
	private Integer productCode;

	@NotNull(message = "product name can not be null")
	@Column(name = "product_name")
	private String productName;

	@NotNull(message = "product price can not be null")
	@Column(name = "product_price")
	private Double productPrice;

	@NotNull(message = "category name can not be null")
	@Column(name = "category_code")
	private Integer categorytCode;

	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "modified_timestamp", nullable = false, unique = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar modifiedTimeStamp;

	public Integer getProductCode() {
		return productCode;
	}

	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public Integer getCategorytCode() {
		return categorytCode;
	}

	public void setCategorytCode(Integer categorytCode) {
		this.categorytCode = categorytCode;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Calendar getModifiedTimeStamp() {
		return modifiedTimeStamp;
	}

	public void setModifiedTimeStamp(Calendar modifiedTimeStamp) {
		this.modifiedTimeStamp = modifiedTimeStamp;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
