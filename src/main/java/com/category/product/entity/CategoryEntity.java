package com.category.product.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity(name = "CategoryEntity")
@Table(name = "tbl_category")
public class CategoryEntity implements ICoreEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tbl_category_SEQ")
	@SequenceGenerator(name = "tbl_category_SEQ", sequenceName = "tbl_category_sequence", allocationSize = 1)
	@Column(name = "category_code", nullable = false, unique = false)
	private Integer categoryCode;

	@NotNull(message = "category name can not be null")
	@Column(name = "category_name")
	private String categoryName;

	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "modified_timestamp", nullable = false, unique = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar modifiedTimeStamp;

	public Integer getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(Integer categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Calendar getModifiedTimeStamp() {
		return modifiedTimeStamp;
	}

	public void setModifiedTimeStamp(Calendar modifiedTimeStamp) {
		this.modifiedTimeStamp = modifiedTimeStamp;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
