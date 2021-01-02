package com.example.hotelsys.api;

import com.example.hotelsys.dao.RoomRepository;
import com.example.hotelsys.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RestController
//@RequestMapping (path = "/api/rooms")
public class MainController {
    @Autowired
    RoomRepository roomRepository;

    @PostMapping(path = "/api/rooms",consumes = "application/json")
    public @ResponseBody Room addRoom(@RequestBody com.fasterxml.jackson.databind.JsonNode payload) throws MissingServletRequestParameterException {
        Room nr = new Room(payload);
        nr = roomRepository.save(nr);
        return  nr;
    }

    @DeleteMapping(path = "/api/rooms/{id}")
    public Optional<Room> deleteRoom(@PathVariable Long id){
        Optional<Room> it = roomRepository.findById(id);
        if(it.isPresent()){
            roomRepository.deleteById(id);
            return it;
        }
        return Optional.ofNullable(null);
    }

    @GetMapping(path = "/api/rooms")
    public @ResponseBody List<Room> getAll(){
        Iterable<Room> it = roomRepository.findAll();
        List<Room> rooms = new ArrayList<>();
        it.forEach(item -> rooms.add(item));
        return rooms;
    }
}