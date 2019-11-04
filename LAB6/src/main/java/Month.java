/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpbig
 */
public class Month {
    private int MonthNumber;
    
    public Month(){
        MonthNumber = 1;
    }
    public Month(int number){
        if(number < 1 || number > 12){
            MonthNumber = 1;
        }else{
            MonthNumber = number;
        }
    }
    public Month(String name){
        switch(name.toUpperCase()){
            case "JANUARY":
                MonthNumber = 1;
                break;
            case "FEBUARY":
                MonthNumber = 2;
                break;
            case "MARCH":
                MonthNumber = 3;
                break;
            case "APRIL":
                MonthNumber = 4;
                break;
            case "MAY":
                MonthNumber = 5;
                break;
            case "JUNE":
                MonthNumber = 6;
                break;
            case "JULY":
                MonthNumber = 7;
                break;
            case "AUGUST":
                MonthNumber = 8;
                break;
            case "SEPTEMBER":
                MonthNumber = 9;
                break;
            case "OCTOBER":
                MonthNumber = 10;
                break;
            case "NOVEMBER":
                MonthNumber = 11;
                break;
            case "DECEMBER":
                MonthNumber = 12;
                break;
            default: MonthNumber = 1;
                 break;
        }
    }
    
    public void setMonthNumber(int newNum){
        if(newNum < 1 || newNum > 12){
            MonthNumber = 1;
        }else{
            MonthNumber = newNum;
        }
    }
    
    public int getMonthNumber(){
        return MonthNumber;
    }
    public String getMonthName(){
        switch (MonthNumber) {
            case 1:  return "January";
            case 2:  return "February";
            case 3:  return "March";
            case 4:  return "April";
            case 5:  return "May";
            case 6:  return "June";
            case 7:  return "July";
            case 8:  return "August";
            case 9:  return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
    
        }
        return "Void";
    }
    
    @Override
    public String toString(){
        switch (MonthNumber) {
            case 1:  return "January";
            case 2:  return "February";
            case 3:  return "March";
            case 4:  return "April";
            case 5:  return "May";
            case 6:  return "June";
            case 7:  return "July";
            case 8:  return "August";
            case 9:  return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
    
        }
        return "Void";
    }
    
    public boolean equals(Month otherMonth){
        return MonthNumber == otherMonth.getMonthNumber();
    }
    
    public boolean greaterThan(Month otherMonth){
        return MonthNumber > otherMonth.getMonthNumber();
    }
    public boolean lessThan(Month otherMonth){
        return MonthNumber < otherMonth.getMonthNumber();
    }
    
}
