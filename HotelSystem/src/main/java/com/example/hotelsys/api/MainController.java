package com.example.hotelsys.api;

import com.example.hotelsys.dao.RoomRepository;
import com.example.hotelsys.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (path = "/api")
public class MainController {

    @Autowired
    RoomRepository roomRepository;
@GetMapping(path = "/api")
public String hello(){
    return "hi i'm running dont worry";
}

    @PostMapping(path = "/addRoom")
    public @ResponseBody HashMap<String,Object> addRoom(@RequestParam String type, @RequestParam float price, @RequestParam int number){
        Room nr = new Room(type,price,number);
        roomRepository.save(nr);
//        roomRepository.
        return nr.toJSON();
    }

    @DeleteMapping(path = "/room/{id}")
    public Optional<Room> deletRoom(@PathVariable Long id){
        Optional<Room> it = roomRepository.findById(id);
        if(it.isPresent()){
            roomRepository.deleteById(id);
            return it;
        }
        return Optional.ofNullable(null);
    }
    @GetMapping(path = "/all")
    public @ResponseBody HashMap<Long,Object> getAll(){
        Iterable<Room> it = roomRepository.findAll();
        HashMap<Long,Object> map = new HashMap<>();
        it.forEach(item -> map.put(item.getId(),item));
        return map;
    }

}
