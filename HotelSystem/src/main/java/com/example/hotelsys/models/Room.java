package com.example.hotelsys.models;

import com.sun.istack.NotNull;
import org.hibernate.annotations.NotFound;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.RequestParam;

import javax.imageio.ImageTranscoder;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Entity
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    private String type;
    private Double price;
    private Integer number;
    private String ac;
    private Integer beds;

    public Room(){}
    public Room(com.fasterxml.jackson.databind.JsonNode payload){
        this.type = payload.get("type").asText();
        this.ac = payload.get("ac").asText();
        this.number = payload.get("number").asInt();
        this.beds = payload.get("beds").asInt();
        this.price = payload.get("price").asDouble();
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Double getPrice() {
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

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
//    public static boolean validateData(Map<String,Object> payload) throws MissingServletRequestParameterException {
//        this(payload);
//        if(type.isEmpty() || ac.isEmpty()){
//            throw new MissingServletRequestParameterException("type","String");
//        }
//        return true;
//    }
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

