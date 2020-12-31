package com.example.hotelsys.models;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
//import java.time; // import the LocalDate class

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private java.sql.Date arriveDate;
    @Basic
    private java.sql.Date departDate;
    private String roomType,name,email,phoneNumber;
    private int roomNumber;

    public Reservation(){}
    public Reservation(String roomType,String name, String email, String phoneNumber,
                       int roomNumber, java.sql.Date arriveDate,
                       java.sql.Date departDate){
        this.roomType = roomType;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.arriveDate = arriveDate;
        this.departDate = departDate;
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

    public Date getArriveDate() {
        return arriveDate;
    }

    public Date getDepartDate() {
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

    public void setArriveDate(java.sql.Date reservFrom) {
        this.arriveDate = reservFrom;
    }

    public void setDepartDate(java.sql.Date reservTo) {
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