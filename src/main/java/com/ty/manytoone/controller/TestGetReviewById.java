package com.ty.manytoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.manytoone.dto.Product;
import com.ty.manytoone.dto.Review;

public class TestGetReviewById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Review review = entityManager.find(Review.class, 1);

		Product product = review.getProduct();

		System.out.println("review id is " + review.getId());
		System.out.println("reviewer userName is " + review.getUserName());
		System.out.println("reviewer description is " + review.getDescription());

		if (product != null) {

			System.out.println("product id is " + product.getId());
			System.out.println("product name is " + product.getName());
			System.out.println("product brand is " + product.getBrand());
			System.out.println("product cost is " + product.getCost());
		}

	}

}
