package com.ty.manytoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytoone.dto.Product;
import com.ty.manytoone.dto.Review;

public class TestSaveReview {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Product product = new Product();
		product.setName("mobile");
		product.setBrand("redmi");
		product.setCost(10000);

		Review review = new Review();
		review.setUserName("rajesh3490");
		review.setDescription("not good");
		review.setProduct(product);

		Review review1 = new Review();
		review1.setUserName("lokesh");
		review1.setDescription("its very good");
		review1.setProduct(product);

		entityTransaction.begin();
		entityManager.persist(review);
		entityManager.persist(review1);
		entityManager.persist(product);
		entityTransaction.commit();
		System.out.println("data is stored");

	}

}
