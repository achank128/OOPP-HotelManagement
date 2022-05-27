/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author HNT
 */
public class Bill {
    private String BillID, BookingID, employeeID;
    private Date DateFrom, DateTo;
    private String TimeFrom, TimeTo;
    private int SoDem;

    public Bill() {
    }

    public Bill(String BillID, String BookingID, String employeeID, Date DateFrom, Date DateTo, int SoDem) {
 
    }

    public String getBillID() {
        return BillID;
    }

    public void setBillID(String BillID) {
        this.BillID = BillID;
    }

    public String getBookingID() {
        return BookingID;
    }

    public void setBookingID(String BookingID) {
        this.BookingID = BookingID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public Date getDateFrom() {
        return DateFrom;
    }

    public void setDateFrom(Date DateFrom) {
        this.DateFrom = DateFrom;
    }

    public Date getDateTo() {
        return DateTo;
    }

    public void setDateTo(Date DateTo) {
        this.DateTo = DateTo;
    }

    public int getSoDem() {
        return SoDem;
    }

    public void setSoDem(int SoDem) {
        this.SoDem = SoDem;
    }

    public String getTimeFrom() {
        return TimeFrom;
    }

    public void setTimeFrom(String TimeFrom) {
        this.TimeFrom = TimeFrom;
    }

    public String getTimeTo() {
        return TimeTo;
    }

    public void setTimeTo(String TimeTo) {
        this.TimeTo = TimeTo;
    }
    
}
