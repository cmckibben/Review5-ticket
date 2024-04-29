package org.example;

public class Advance extends Ticket{
    private int days;
    public Advance(int days) {
        this.days = days;
    }

    @Override
    public double getPrice() {
        if(days >= 10) return 30;
        else return 40;
    }
}
