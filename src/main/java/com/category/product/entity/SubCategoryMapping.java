package com.category.product.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity(name = "SubCategoryMapping")
@Table(name = "sub_category_mapping")
public class SubCategoryMapping implements ICoreEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@Id
	@Column(name = "sub_category_code")
	private Integer subCategoryCode;

	@NotNull(message = "Sub category name can not be null")
	@Column(name = "sub_category_name", nullable = false, unique = false)
	private String subCategoryName;

	@Column(name = "modified_timestamp", nullable = false, unique = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar modifiedTimeStamp;

	@Column(name = "is_active")
	private Boolean isActive;

	public Integer getSubCategoryCode() {
		return subCategoryCode;
	}

	public void setSubCategoryCode(Integer subCategoryCode) {
		this.subCategoryCode = subCategoryCode;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
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
