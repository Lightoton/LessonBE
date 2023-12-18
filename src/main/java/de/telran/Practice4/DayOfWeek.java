package de.telran.Practice4;

public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    public DayOfWeek getNextDay(){
        DayOfWeek[] dayOfWeeks = values();
        int indexDay = ordinal();
        if (indexDay+1==dayOfWeeks.length){
            indexDay=0;
        }else {
            indexDay+=1;
        }
        return dayOfWeeks[indexDay];

    }

}
