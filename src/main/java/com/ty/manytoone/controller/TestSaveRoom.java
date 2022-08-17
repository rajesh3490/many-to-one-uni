package com.ty.manytoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytoone.dto.Hotel;
import com.ty.manytoone.dto.Room;

public class TestSaveRoom {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hotel hotel = new Hotel();
		hotel.setName("Taj");
		hotel.setAddress("bangalore");

		Room room = new Room();
		room.setCapacity(2);
		room.setType("AC");
		room.setHotel(hotel);

		Room room1 = new Room();
		room1.setCapacity(3);
		room1.setType("Non-AC");
		room1.setHotel(hotel);

		Room room2 = new Room();
		room2.setCapacity(1);
		room2.setType("AC");
		room2.setHotel(hotel);

		entityTransaction.begin();
		entityManager.persist(room);
//		entityManager.persist(room1);
//		entityManager.persist(room2);
//		entityManager.persist(hotel);
		entityTransaction.commit();
		System.out.println("data is stored");

	}

}
