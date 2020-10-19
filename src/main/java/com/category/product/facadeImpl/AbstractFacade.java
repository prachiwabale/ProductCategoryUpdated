package com.category.product.facadeImpl;



import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.category.product.entity.ICoreEntity;
import com.category.product.facadeInt.AbstractFacadeInt;

@Resource
public class AbstractFacade<E extends ICoreEntity> implements AbstractFacadeInt {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	/*
	 * protected void checkConstraintValidations(Object targetObject) throws
	 * ConstraintValidationException {
	 * 
	 * LOGGER.debug("Object Value:----" + targetObject.toString());
	 * LOGGER.debug("Inside isConstraintValidationsDetected"); ValidatorFactory
	 * factory = Validation.buildDefaultValidatorFactory(); Validator validator =
	 * factory.getValidator(); Set<ConstraintViolation<Object>> constraintViolations
	 * = validator.validate(targetObject);
	 * 
	 * if (constraintViolations.size() <= 0) {
	 * LOGGER.debug("No constraintValidationsDetected"); return; } for
	 * (ConstraintViolation<Object> cv : constraintViolations) {
	 * LOGGER.error(cv.getRootBeanClass().getName() + "." + cv.getPropertyPath() +
	 * " Error Mesg :" + cv.getMessage() + " Invalid value :" +
	 * cv.getInvalidValue()); }
	 * 
	 * throw new ConstraintValidationException("Constraint Validation Detected");
	 * 
	 * }
	 */

}
