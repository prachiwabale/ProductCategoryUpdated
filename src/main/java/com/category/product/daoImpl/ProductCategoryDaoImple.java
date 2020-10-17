package com.category.product.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.category.product.daoInt.ProductCategoryDaoInt;
import com.category.product.dto.CategoryDto;
import com.category.product.dto.ProductDto;
import com.category.product.entity.ICoreEntity;
import com.category.product.entity.QProductCategoryMapping;
import com.category.product.entity.QProductEntity;
import com.category.product.entity.QSubCategoryMapping;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Transactional
@Component
public class ProductCategoryDaoImple extends ProductAbstractCoreDbAccess<ICoreEntity> implements ProductCategoryDaoInt {

	@Autowired
	EntityManager em;

	@Autowired
	JPAQueryFactory queryFactory;

	@Override
	public List<CategoryDto> getAllSubCategoryByCategoryCode(Integer categoryCode) {
		QSubCategoryMapping qSubCategoryMapping = QSubCategoryMapping.subCategoryMapping;
		return null;
	}

	@Override
	public List<String> getAllProductByCategoryCode(Integer categoryCode) {
		QProductEntity qProductEntity = QProductEntity.productEntity;
		QProductCategoryMapping qProductCategoryMapping = QProductCategoryMapping.productCategoryMapping;
		List<String> productList = queryFactory.select(qProductCategoryMapping.productEnityCode.productName)
				.from(qProductEntity).join(qProductCategoryMapping)
				.on(qProductEntity.productCode.eq(qProductCategoryMapping.productCode_))
				.where(qProductCategoryMapping.categoryCode.eq(categoryCode)).fetch();
		return productList;
	}

	@Override
	public Long updateProduct(ProductDto productDto) {
		QProductEntity qProductEntity = QProductEntity.productEntity;
		return queryFactory.update(qProductEntity).where(qProductEntity.productCode.eq(productDto.getProductCode()))
				.set(qProductEntity.productName, productDto.getProductName())
				.set(qProductEntity.productPrice, productDto.getProductPrice()).execute();
	}

}
