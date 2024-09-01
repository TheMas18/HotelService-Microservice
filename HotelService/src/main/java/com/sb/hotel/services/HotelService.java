package com.sb.hotel.services;

import java.util.List;

import com.sb.hotel.entities.Hotel;

public interface HotelService {

	Hotel create(Hotel hotel);

	List<Hotel> getAllHotels();

	Hotel get(String id);
}
