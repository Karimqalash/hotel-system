package com.example.hotelsys.models;

import com.sun.istack.NotNull;
import org.hibernate.annotations.NotFound;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.HashMap;

@Entity
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    private String type;
    private Float price;
    private Integer number;
    private String ac;
    private Integer beds;

    public Room(){}
    public Room(String type ,String ac, Float price, Integer number,Integer beds ){
        this.number = number;
        this.price = price;
        this.type = type;
        this.ac = ac;
        this.beds = beds;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Float getPrice() {
        return price;
    }

    public String getAc() {
        return ac;
    }

    public Integer getBeds() {
        return beds;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }
    public Long getId(){ return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    public static boolean validateData(@RequestParam String type,
                                       @RequestParam String ac,
                                       @RequestParam float price,
                                       @RequestParam int number,
                                       @RequestParam int beds) throws MissingServletRequestParameterException {
        if(type.isEmpty() || ac.isEmpty()){
            throw new MissingServletRequestParameterException("type","String");
        }
        return true;
    }
}
 /*
CREATE TABLE ROOM(
        id int auto_increment ,
        roomType VARCHAR(100),
        ac VARCHAR(10),
        roomNumber int not null,
        beds int not null,
        reserveFrom DATE,
        reserveTo DATE,
        PRIMARY KEY(id));
     */

