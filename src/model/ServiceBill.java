/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HNT
 */
public class ServiceBill {
    private String  billID, serviceID, serviceDay, serviceNote;
    private int  serviceAmount; 
    private float serviceDbu, serviceSalary;


    public ServiceBill() {
    }
    
    public float getServiceDbu() {
        return serviceDbu;
    }

    public void setServiceDbu(float serviceDbu) {
        this.serviceDbu = serviceDbu;
    }

   
    public String getBillID() {
        return billID;
    }

    public void setBillID(String billID) {
        this.billID = billID;
    }

    
    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceDay() {
        return serviceDay;
    }

    public void setServiceDay(String serviceDay) {
        this.serviceDay = serviceDay;
    }

    public String getServiceNote() {
        return serviceNote;
    }

    public void setServiceNote(String serviceNote) {
        this.serviceNote = serviceNote;
    }

    public int getServiceAmount() {
        return serviceAmount;
    }

    public void setServiceAmount(int serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public float getServiceSalary() {
        return serviceSalary;
    }

    public void setServiceSalary(float serviceSalary) {
        this.serviceSalary = serviceSalary;
    }

    

    
}
