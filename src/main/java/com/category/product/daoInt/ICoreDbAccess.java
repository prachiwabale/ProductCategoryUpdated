package com.category.product.daoInt;

import com.category.product.entity.ICoreEntity;

public interface ICoreDbAccess<E extends ICoreEntity> {

	public abstract <T extends E> void add(T entity);

	public abstract <T extends E> void delete(T entity);

	public abstract <T extends E> T merge(T entity);

	public abstract <T extends E> T get(Class<T> clasz, Integer entityId);

	public abstract <T extends E> T get(Class<T> clasz, String entityId);

}
