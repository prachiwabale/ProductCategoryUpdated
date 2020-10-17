package com.category.product.facadeInt;

import java.util.List;

import com.category.product.dto.CategoryDto;
import com.category.product.dto.ProductDto;

public interface ProductCategoryFacadInt {

	public Integer addCategoryDetails(CategoryDto categoryDto);

	public Integer addProduct(ProductDto productDto);

	public void addProductCategory(Integer categoryCode, Integer productCode);

	public List<String> getAllProductByCategoryCode(Integer categoryCode);

	public Long updateProduct(ProductDto productDto);

}
