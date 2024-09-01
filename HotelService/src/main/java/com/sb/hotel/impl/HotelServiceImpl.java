package com.sb.hotel.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.hotel.Exception.ResourceNotFoundException;
import com.sb.hotel.entities.Hotel;
import com.sb.hotel.repositories.HotelRepository;
import com.sb.hotel.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel create(Hotel hotel) {
	
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return this.hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return this.hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		// TODO Auto-generated method stub
		return this.hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found on server with Id "+id));
	}

}
