package de.telran.Practice4;

public class Main {
    public static void main(String[] args) {
//        System.out.println(getDay(Days.SUNDAY));
        System.out.println(DayOfWeek.SUNDAY.getNextDay());
        for (DayOfWeek day: DayOfWeek.values()) {
            System.out.println(day.getNextDay());
            DayOfWeek.valueOf()
        }
    }
    enum Days{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY


    }
    public static Days getDay(Days day){
        Days[] days = Days.values();
        int indexDay = day.ordinal();
        if (indexDay+1==days.length){
            indexDay=0;
        }else {
            indexDay+=1;
        }
        return days[indexDay];
    }
}

