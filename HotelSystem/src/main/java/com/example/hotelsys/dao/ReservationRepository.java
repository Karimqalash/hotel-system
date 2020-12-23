package com.example.hotelsys.dao;

import com.example.hotelsys.models.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
//    List<Reservation> findByRoomNumber(int roomNumber);
}
