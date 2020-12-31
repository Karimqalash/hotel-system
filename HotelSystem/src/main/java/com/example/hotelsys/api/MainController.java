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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping (path = "/api/rooms")
public class MainController {
    @PostMapping(path = "/api/rooms")
    public @ResponseBody Room addRoom(@RequestParam String type,
                                      @RequestParam String ac,
                                      @RequestParam float price,
                                      @RequestParam int number,
                                      @RequestParam int beds) throws MissingServletRequestParameterException {
        Room.validateData(type, ac, price, number, beds);
        Room nr = new Room(type,ac,price,number,beds);
        nr = roomRepository.save(nr);
//      roomRepository.
        return nr;

    }

    @Autowired
    RoomRepository roomRepository;

@GetMapping(path = "/")
public String hello(){
    return "hi i'm running dont worry";
}

    @DeleteMapping(path = "/api/rooms/{id}")
    public Optional<Room> deletRoom(@PathVariable Long id){

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

//    @ExceptionHandler(Exception.class)
//    public ModelAndView handleError(HttpServletRequest req, Exception ex) {
////        logger.error("Request: " + req.getRequestURL() + " raised " + ex);
//
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", ex);
//        mav.addObject("url", req.getRequestURL());
//        mav.setViewName("error");
//        return mav;
//    }

}
