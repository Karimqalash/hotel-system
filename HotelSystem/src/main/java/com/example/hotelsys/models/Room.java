package com.example.hotelsys.models;

import com.sun.istack.NotNull;
import org.hibernate.annotations.NotFound;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.HashMap;

@Entity
public class Room {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String type;
    private Float price;
    private Integer number;

    public Room(){}
    public Room(String type ,Float price, Integer number){
        this.number = number;
        this.price = price;
        this.type = type;
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
//    public boolean isReserved() {
//        return reservation != null;
//    }

//    public void free() {
//        reservation = null;
//    }

//    public void print(){
//        System.out.printf("RoomNumber: %d, RoomType: %s, isReserved: %b",number,type,isReserved());
//    }

    public HashMap<String,Object> toJSON() {
        HashMap<String,Object> map = new HashMap<>();
        map.put("id",id);
        map.put("price",price);
        map.put("type",type);
        map.put("number",number);
        return map;
    }
}

