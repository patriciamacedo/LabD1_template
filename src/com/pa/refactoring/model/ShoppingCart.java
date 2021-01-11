package com.pa.refactoring.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author patricia.macedo
 */
public class ShoppingCart extends ArrayList<Product>{

    private double total;
    private int day, year,month,hour, minute;
    private boolean terminated;

    public ShoppingCart() {
        LocalDateTime d= LocalDateTime.now();
        day=d.getDayOfMonth();
        month=d.getMonthValue();
        year=d.getYear();
        hour=d.getHour();
        minute =d.getMinute();
        terminated=false;;
    }


    public double getTotal() {
       total=0;
        for (Product p : this) {
            total += p.getCost();
        }
        return total;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public boolean isTerminated() {
        return terminated;
    }

    public void terminate(){

        terminated=true;
        LocalDateTime d= LocalDateTime.now();
        day=d.getDayOfMonth();
        month=d.getMonthValue();
        year=d.getYear();
        hour=d.getHour();
        minute =d.getMinute();

    }


    public String getDateStr() {
      String  dateStr= String.format("%02d/%02d/%4d %02d:%02d", day,month,year,hour, minute);
        return dateStr;
    }
}
