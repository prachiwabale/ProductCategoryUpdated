package com.category.product.facadeImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.category.product.converter.ProductCategoryConvertor;
import com.category.product.daoInt.ProductCategoryDaoInt;
import com.category.product.dto.CategoryDto;
import com.category.product.dto.ProductDto;
import com.category.product.entity.CategoryEntity;
import com.category.product.entity.ICoreEntity;
import com.category.product.entity.ProductCategoryMapping;
import com.category.product.entity.ProductEntity;
import com.category.product.facadeInt.ProductCategoryFacadInt;

@Transactional
@Component("ProductCategoryFacadImple")
public class ProductCategoryFacadImple extends AbstractFacade<ICoreEntity> implements ProductCategoryFacadInt {

	@Autowired
	private ProductCategoryDaoInt productCategoryDaoInt;

	@Autowired
	private ProductCategoryConvertor productCategoryConvertor;

	@Override
	public Integer addCategoryDetails(CategoryDto categoryDto) {
		CategoryEntity categoryEntity = productCategoryConvertor.categoryDtoConvertToCategoryEntity(categoryDto);
		productCategoryDaoInt.add(categoryEntity);
		return categoryEntity.getCategoryCode();

	}

	@Override
	public Integer addProduct(ProductDto productDto) {
		ProductEntity productEntity = productCategoryConvertor.productDtoConvertToProductEntity(productDto);
		productCategoryDaoInt.add(productEntity);
		return productEntity.getProductCode();
	}

	@Override
	public void addProductCategory(Integer categoryCode, Integer productCode) {
		ProductCategoryMapping productCategoryMapping = productCategoryConvertor
				.convertProductMappingDtoToProductMappingEntity(categoryCode, productCode);
		productCategoryDaoInt.add(productCategoryMapping);

	}

	@Override
	public List<String> getAllProductByCategoryCode(Integer categoryCode) {
		List<String> listOfString = productCategoryDaoInt.getAllProductByCategoryCode(categoryCode);
		return listOfString;
	}

	@Override
	public Long updateProduct(ProductDto productDto) {
		Long updateCount = productCategoryDaoInt.updateProduct(productDto);
		return updateCount;
	}

}
