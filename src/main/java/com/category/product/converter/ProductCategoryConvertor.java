package com.category.product.converter;


import java.util.Calendar;

import org.springframework.stereotype.Component;

import com.category.product.dto.CategoryDto;
import com.category.product.dto.ProductDto;
import com.category.product.entity.CategoryEntity;
import com.category.product.entity.ProductCategoryMapping;
import com.category.product.entity.ProductEntity;

@Component
public class ProductCategoryConvertor {

	public CategoryEntity categoryDtoConvertToCategoryEntity(CategoryDto categoryDto) {
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setCategoryName(categoryDto.getCategoryName());
		categoryEntity.setIsActive(categoryDto.getIsActive());
		categoryEntity.setModifiedTimeStamp(Calendar.getInstance());
		return categoryEntity;
	}

	public ProductCategoryMapping convertProductMappingDtoToProductMappingEntity(Integer categoryCode,
			Integer productCode) {
		ProductCategoryMapping productCategoryMapping = new ProductCategoryMapping();
		productCategoryMapping.setCategoryCode(categoryCode);
		productCategoryMapping.setProductCode_(productCode);
		productCategoryMapping.setModifiedTimeStamp(Calendar.getInstance());
		return productCategoryMapping;

	}

	public ProductEntity productDtoConvertToProductEntity(ProductDto productDto) {
		ProductEntity productEntity = new ProductEntity();
		productEntity.setProductName(productDto.getProductName());
		productEntity.setProductPrice(productDto.getProductPrice());
		productEntity.setIsActive(productDto.getIsActive());
		productEntity.setModifiedTimeStamp(Calendar.getInstance());
		return productEntity;
	}

}
