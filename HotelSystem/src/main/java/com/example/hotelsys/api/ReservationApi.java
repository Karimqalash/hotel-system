package com.example.hotelsys.api;

import com.example.hotelsys.dao.ReservationRepository;
import com.example.hotelsys.models.Reservation;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
//@RequestMapping(value = "/api/bookings")
public class ReservationApi {
    private static SessionFactory factory;

    @Autowired
    ReservationRepository reservationRepository;

    @PostMapping(path = "/api/bookings/")
    public List<Reservation> reserve(@RequestBody com.fasterxml.jackson.databind.JsonNode payload){

        Reservation reservation = new Reservation(payload);
        reservationRepository.save(reservation);
        List<Reservation> reservationList = new ArrayList<>();
        reservationList.add(reservation);
        return reservationList;
    }

    @GetMapping(path = "api/bookings")
    public List<Reservation> getBookings(){
        List<Reservation> li = new ArrayList<>();
        Iterable<Reservation> bookings = reservationRepository.findAll();
        bookings.forEach(item ->{li.add(item);});
        return li;
    }

    @DeleteMapping(path = "/api/bookings/{id}")
    public Optional<Reservation> checkout(@PathVariable Long id){
        Optional<Reservation> op = reservationRepository.findById(id);
        if(op.isPresent()){
            reservationRepository.deleteById(id);
            return op;
        }
        return Optional.ofNullable(null);
    }

    @GetMapping(path = "/api/bookings/Days/{roomNumber}")
    public List<Integer> rservedDaysWith(@PathVariable int roomNumber){
        return reservedDays(roomNumber);
//        return findByRoomNumber(roomNumber);
    }

    private List<Integer> reservedDays(int roomNumber){
        List<Reservation> list= findByRoomNumber(roomNumber);
        List<Integer> res = new ArrayList<>();
        list.forEach(reserve -> {
            Integer from = Integer.parseInt(reserve.getArriveDate().substring(8));
            Integer to = Integer.parseInt(reserve.getDepartDate().substring(8));
            for (int i = from; i <= to; i++) {
                res.add(i);
            }
        });
        return res;
    }
    private List<Reservation> findByRoomNumber(int roomNumber) {
        Iterable<Reservation> it = reservationRepository.findAll();
        List<Reservation> list = new ArrayList<>();
        it.forEach(item -> {
            if(item.getRoomNumber() == roomNumber)  list.add(item);
        });
        return list;
    }
}
