package com.category.product.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity(name = "ProductSubCategoryMapping")
@Table(name = "product_category_mapping")
public class ProductCategoryMapping implements ICoreEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tbl_product_category_mapping_SEQ")
	@SequenceGenerator(name = "tbl_product_category_mapping_SEQ", sequenceName = "tbl_product_mapping_category_sequence", allocationSize = 1)
	@Column(name = "mapping_code", nullable = false, unique = false)
	private Integer mappingCode;

	@ManyToOne
	@JoinColumn(name = "product_code", referencedColumnName = "product_code", insertable = false, updatable = false)
	private ProductEntity productEnityCode;

	@NotNull(message = "product code can not be null")
	@Column(name = "product_code")
	private Integer productCode_;

	@ManyToOne
	@JoinColumn(name = "category_code", referencedColumnName = "category_code", insertable = false, updatable = false)
	private CategoryEntity categoryCode_;

	@NotNull(message = " code can not be null")
	@Column(name = "category_code")
	private Integer categoryCode;

	@Column(name = "modified_timestamp", nullable = false, unique = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar modifiedTimeStamp;

	public Integer getMappingCode() {
		return mappingCode;
	}

	public void setMappingCode(Integer mappingCode) {
		this.mappingCode = mappingCode;
	}

	public Integer getProductCode_() {
		return productCode_;
	}

	public void setProductCode_(Integer productCode_) {
		this.productCode_ = productCode_;
	}

	public Integer getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(Integer categoryCode) {
		this.categoryCode = categoryCode;
	}

	public ProductEntity getProductEnityCode() {
		return productEnityCode;
	}

	public void setProductEnityCode(ProductEntity productEnityCode) {
		this.productEnityCode = productEnityCode;
	}

	public CategoryEntity getCategoryCode_() {
		return categoryCode_;
	}

	public void setCategoryCode_(CategoryEntity categoryCode_) {
		this.categoryCode_ = categoryCode_;
	}

	public Calendar getModifiedTimeStamp() {
		return modifiedTimeStamp;
	}

	public void setModifiedTimeStamp(Calendar modifiedTimeStamp) {
		this.modifiedTimeStamp = modifiedTimeStamp;
	}

}
