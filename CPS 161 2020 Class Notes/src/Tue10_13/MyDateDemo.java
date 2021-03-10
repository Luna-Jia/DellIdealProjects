package Tue10_13;

public class MyDateDemo {
    
    public static void main(String[] args){
       
        MyDate myDate = new MyDate();
        MyDate yourDate = new MyDate(2019, "May",5);
        
        myDate.printDate();
        yourDate.printDate();
        System.out.println(myDate.getYear());
        
        myDate.setYear(2019);
        myDate.setDay(40);
        System.out.println("after update");
        myDate.printDate;
    }
}
