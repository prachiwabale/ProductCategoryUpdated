package com.category.product.configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.querydsl.jpa.impl.JPAQueryFactory;

@Configuration
public class QueryDslConfiguration {
	
	@PersistenceContext
	protected EntityManager em;

	@Bean
	public JPAQueryFactory queryfactory() {
		return new JPAQueryFactory(em);
	}
}
