package com.category.product.dto;

import java.util.List;

public class ProductDto {

	private Integer productCode;

	private String productName;

	private Double productPrice;

	private Integer categoryCode;

	private List<Integer> categoryCodeList;

	private Boolean isActive;

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

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(Integer categoryCode) {
		this.categoryCode = categoryCode;
	}

	public List<Integer> getCategoryCodeList() {
		return categoryCodeList;
	}

	public void setCategoryCodeList(List<Integer> categoryCodeList) {
		this.categoryCodeList = categoryCodeList;
	}

}
