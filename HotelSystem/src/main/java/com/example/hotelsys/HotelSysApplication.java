package com.example.hotelsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelSysApplication implements Runnable{
//    @Autowired
//    RoomRepository roomRepository;

    public static void main(String[] args) {
        SpringApplication.run(HotelSysApplication.class, args);
    }

    @Override
    public void run() {
//        roomRepository.save(new Room("happy", (float) 50.02,22));
    }
}
