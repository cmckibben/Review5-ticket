package org.example;

public abstract class Ticket {
    private int serialNumber; //unique ticket id number

    public Ticket()
    { serialNumber = getNextSerialNumber();}

    //returns the price for this ticket
    public abstract double getPrice();

    //returns a string with information about the ticket
    public String toString()
    {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    //returns a new unique serial number
    //implmentation not shown on AP Exam
    private static int serial;
    private static int getNextSerialNumber()
    {
        serial++;
        return serial;
    }
}
