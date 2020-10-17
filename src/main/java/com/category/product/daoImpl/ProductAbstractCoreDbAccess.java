package com.category.product.daoImpl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.category.product.daoInt.ICoreDbAccess;
import com.category.product.entity.ICoreEntity;

@Transactional
@Component
public abstract class ProductAbstractCoreDbAccess<E extends ICoreEntity> implements ICoreDbAccess<E> {

	@Autowired
	EntityManager em;

	protected final EntityManager getEntityManager() {
		return this.em;
	}

	@Override
	public <T extends E> void add(T entity) {
		// if (!constraintValidationsDetected(entity)) {
		getEntityManager().persist(entity);
		// }
	}

	@Override
	public <T extends E> void delete(T entity) {
		assert (entity != null);

		// if (!constraintValidationsDetected(entity)) {
		getEntityManager().remove(getEntityManager().merge(entity));
		// }
	}

	@Override
	public <T extends E> T merge(T entity) {
		// if (!constraintValidationsDetected(entity)) {
		return getEntityManager().merge(entity);
		// } else {
		// return entity;
		// }
	}

	/**
	 * get an entity from its PK
	 * 
	 * @param entityId
	 *            the PK of the entity
	 * @param clazz
	 *            the class of the entity
	 * @return the merged entity
	 */
	@Override
	public <T extends E> T get(Class<T> clazz, Integer entityId) {
		return getEntityManager().find(clazz, entityId);
	}

	@Override
	public <T extends E> T get(Class<T> clazz, String entityId) {
		return getEntityManager().find(clazz, entityId);
	}

}
