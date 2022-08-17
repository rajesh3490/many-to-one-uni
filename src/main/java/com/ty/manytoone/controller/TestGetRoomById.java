package com.ty.manytoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.manytoone.dto.Hotel;
import com.ty.manytoone.dto.Room;

public class TestGetRoomById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Room room = entityManager.find(Room.class, 2);

		Hotel hotel = room.getHotel();

		System.out.println("room id is " + room.getId());
		System.out.println("room capacity is " + room.getCapacity());
		System.out.println("room type is " + room.getType());
		System.out.println("room is in the hotel  " + hotel.getName());
		System.out.println("room is in the hotel whose id is " + hotel.getId());
		System.out.println("room is in the hotel with the address  " + hotel.getAddress());

	}
}
