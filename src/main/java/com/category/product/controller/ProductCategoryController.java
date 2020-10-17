package com.category.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.category.product.constant.ProductAPI;
import com.category.product.dto.CategoryDto;
import com.category.product.dto.ProductDto;
import com.category.product.dto.ResponseDto;
import com.category.product.facadeInt.ProductCategoryFacadInt;

@RestController
@RequestMapping(value = ProductAPI.PRODUCT_CATEGORY_RESOURCE)
@CrossOrigin(origins = "*")
public class ProductCategoryController {

	@Autowired
	private ProductCategoryFacadInt productCategoryFacadInt;

	@Autowired
	private ResponseDto responseDto;

	@PostMapping(ProductAPI.ADD_CATEGORY)
	public ResponseEntity<ResponseDto> addCategory(@RequestBody CategoryDto categoryDto) {
		Integer categoryCode = productCategoryFacadInt.addCategoryDetails(categoryDto);
		responseDto.setData(categoryCode);
		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
	}

	@PostMapping(ProductAPI.ADD_PRODUCT)
	public ResponseEntity<ResponseDto> addProduct(@RequestBody ProductDto productDto) {
		Integer productCode = productCategoryFacadInt.addProduct(productDto);
		responseDto.setData(productCode);
		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
	}

	@PostMapping(ProductAPI.MAP_PRODUCT_CATEGORY)
	public ResponseEntity<ResponseDto> addProductCatory(@RequestParam("categoryCode") Integer categoryCode,
			@RequestParam("productCode") Integer productCode) {
		productCategoryFacadInt.addProductCategory(categoryCode, productCode);
		responseDto.setData(productCode);
		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
	}

	@GetMapping(ProductAPI.GET_ALL_PRODUCT_BY_CATEGORY_CODE)
	public ResponseEntity<ResponseDto> getAllProductByCategoryCode(@RequestParam("categoryCode") Integer categoryCode) {
		List<String> listofString = productCategoryFacadInt.getAllProductByCategoryCode(categoryCode);
		responseDto.setData(listofString);
		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
	}

	@PostMapping(ProductAPI.UPDATE_PRODUCT_DETAILS)
	public ResponseEntity<ResponseDto> updateProductDetails(@RequestBody ProductDto productDto) {
		Long productCode = productCategoryFacadInt.updateProduct(productDto);
		responseDto.setData(productCode);
		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
	}

}
