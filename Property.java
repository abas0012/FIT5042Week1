/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.repository.entities;

/**
 * This is the updated source code for Property.java as per instruction on Tutorial Week 1 Task 1.2
 * Familiarization with Netbeans IDE, including Insert Code feature for constructor, getter, setter and toString methods.
 * @author Adhi Baskoro 29401887
 * 
 */
public class Property {
     //TODO Exercise 1.3 Step 1 Please refer tutorial exercise.
    private int id;
    private String address;
    private int bedrooms;
    private int size;
    private double price;

    
    /**
     * Default constructor
     */
    public Property() {
        this.id = 0;
        this.address = "Unknown";
        this.bedrooms = 0;
        this.size = 0;
        this.price = 0;
    }
    
    /**
     * Parameterized constructor
     *
     * @param id - initialize the attribute id to this value
     * @param address - initialize the attribute address to this value
     * @param bedrooms - initialize the attribute bedrooms to this value
     * @param size - initialize the attribute size to this value
     * @param price - initialize the attribute price to this value
     */
     public Property(int id, String address, int bedrooms, int size, double price) {
        this.id = id;
        this.address = address;
        this.bedrooms = bedrooms;
        this.size = size;
        this.price = price;
    }
     
    /**
     * Copy constructor
     * @param property
     */
    public Property(Property property) {
        this.id = property.id;
        this.address = property.address;
        this.bedrooms = property.bedrooms;
        this.size = property.size;
        this.price = property.price;
    }
     
     
    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return "Property{" + "id:" + id + ", address:" + address + ", bedrooms:" + bedrooms + ", size:" + size + ", price:" + price + '}';
    }
   
}
