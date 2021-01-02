package com.example.hotelsys.models;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.boot.model.relational.Database;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;
//import java.time; // import the LocalDate class

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private Long id;
//    @JsonFormat(pattern="yyyy-MM-dd")
//    private java.sql.Date ;
//    @JsonFormat(pattern="yyyy-MM-dd")
//    private java.util.Date ;
    private String roomType,name,email,phoneNumber,departDate,arriveDate;
    private int roomNumber;

    public Reservation(){}
    public Reservation(com.fasterxml.jackson.databind.JsonNode payload){
        this.roomType = payload.get("roomType").asText();
        this.name = payload.get("name").asText();
        this.email = payload.get("email").asText();
        this.phoneNumber = payload.get("phoneNumber").asText();
        this.roomNumber = payload.get("roomNumber").asInt();
        this.arriveDate = payload.get("arriveDate").asText();
        this.departDate = payload.get("departDate").asText();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public String getArriveDate() {
        return arriveDate;
    }

    public String getDepartDate() {
        return departDate;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setArriveDate(String reservFrom) {
        this.arriveDate = reservFrom;
    }

    public void setDepartDate(String reservTo) {
        this.departDate = reservTo;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
// sql query for this table
    /*
CREATE TABLE RESERVATION(
        id int auto_increment ,
        name VARCHAR(100) NOT NULL,
        email VARCHAR(100) NOT NULL,
        phoneNumber VARCHAR(11) NOT NULL,
        roomType VARCHAR(100),
        roomNumber int not null,
        arriveDate DATE,
        departDate DATE,
        PRIMARY KEY(id));
     */
  /*{
          id: 2,
          name: "karim",
          phone: "0114444",
          email: "karim@gmial.com",
          arrive_date: "1/3/2021",
          depart_date: "5/3/2021",
          room_type: "King",
          room_number: 105,
          }*/