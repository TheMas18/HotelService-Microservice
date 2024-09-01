package com.sb.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.hotel.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,String> {

}
