package com.category.product.daoInt;

import java.util.List;

import com.category.product.dto.CategoryDto;
import com.category.product.dto.ProductDto;
import com.category.product.entity.ICoreEntity;

public interface ProductCategoryDaoInt extends ICoreDbAccess<ICoreEntity> {

	public List<CategoryDto> getAllSubCategoryByCategoryCode(Integer categoryCode);

	public List<String> getAllProductByCategoryCode(Integer categoryCode);

	public Long updateProduct(ProductDto productDto);

}
