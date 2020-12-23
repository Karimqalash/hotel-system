package com.example.hotelsys.dao;

import com.example.hotelsys.models.Room;
import org.springframework.data.repository.CrudRepository;


public interface RoomRepository extends CrudRepository<Room, Long>{
}