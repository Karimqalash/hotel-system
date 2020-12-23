package com.example.hotelsys.models;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.util.Date;
//import java.time; // import the LocalDate class

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private java.sql.Date  reservFrom;
    @Basic
    private java.sql.Date reservTo;
    private String roomType;
    private int roomNumber;

    public Reservation(){}
    public Reservation(String roomType, int roomNumber, java.sql.Date reservFrom, java.sql.Date reservTo){
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.reservFrom = reservFrom;
        this.reservTo = reservTo;
    }

    public Long getId() {
        return id;
    }

    public Date getReservFrom() {
        return reservFrom;
    }

    public Date getReservTo() {
        return reservTo;
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

    public void setReservFrom(java.sql.Date reservFrom) {
        this.reservFrom = reservFrom;
    }

    public void setReservTo(java.sql.Date reservTo) {
        this.reservTo = reservTo;
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
        roomType VARCHAR(100),
        roomNumber int not null,
        reservFrom DATE,
        reservTo DATE,
        PRIMARY KEY(id));
     */