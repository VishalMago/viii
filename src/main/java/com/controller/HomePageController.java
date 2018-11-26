package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.HotelRepositry;
import com.model.Hotel;

@RestController
public class HomePageController {
	@Autowired
	private HotelRepositry hotelRepository;

	@GetMapping(value = "/hotels")
	public List<Hotel> getHotels() {
		return hotelRepository.listHotels();
	}
}
