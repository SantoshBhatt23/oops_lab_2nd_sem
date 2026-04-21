class Date{
    int month;
    int day;
    int year;
    Date(){
        super();
    }
    Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //getter methods:
    int getDay(){
        return day;
    }
    int getMonth(){
        return month;
    }
    int getYear(){
        return year;
    }
    //setter methods:
    void setDay(int day){
        this.day = day;
    }
    void setMonth(int month){
        this.month = month;
    }
    void setYear(int year){
        this.year = year;
    }

    void displayDate(){
        System.out.println(day+"/"+month+"/"+year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date today = new Date(20,01,2026);
        today.displayDate();
        
    }
}
