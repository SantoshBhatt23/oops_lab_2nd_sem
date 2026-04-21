package ques3;

class Book {
    String ID;
    String Title;
    String Author;
    float price;
}

class Periodical extends Book {
    //additional attribute:
    String Period;

    //constructor:
    Periodical(){};

    Periodical(String ID, String Title , String Author, float price, String Period){
        this.ID = ID;
        this.Title = Title;
        this.Author = Author;
        this.price = price;
        this.Period = Period;
    }

    void updatePrice(float newPrice) {
        price = newPrice;
        System.out.println("Updated price : " + price);
    }

    void updatePeriod(String newPeriod) {
        Period = newPeriod;
        System.out.println("Updated period to " + newPeriod);
    }
    void display(){
        System.out.println("ID: "+ID);
        System.out.println("Title: "+Title);
        System.out.println("Author: "+Author);
        System.out.println("Price: "+price);
        System.out.println("Period: "+Period);
    }
}

class BookDemo{
    public static void main(String[] args) {
        Periodical p1 = new Periodical("ABC2345","Hindustan Times","Ramesh kumar",50.0f,"Weekly");
        p1.display();
        System.out.println("Updating price: ");
        p1.updatePrice(100.0f);
        System.out.println("Updating period: ");
        p1.updatePeriod("Monthly");
        p1.display();
    }
}
