

abstract class Figure{
    double pi = 3.1420d;
    double a,v;
    public abstract void calcArea();
    public abstract void dispArea();
    public abstract void calcVol();
    public abstract void dispVol();
}

class Cone extends Figure{
    double r,h;//radius , height of cone
    double l = Math.sqrt(r*r+h*h); //calculating slant height of cone required for area
    //now implementing abstract class functions:

    //constructor:
    Cone(double r,double h){
        this.r = r;
        this.h = h;
    }

    Cone(){};

    //methods:
    public void calcVol(){
        v = pi*r*r*h*(1.0/3.0);
    }
    public void dispVol(){
        System.out.println("Volume of cone: "+v);
    }

    public void calcArea(){
        a = pi*r*r*h + pi*r*l;
    }

    public void dispArea(){
        System.out.println("Area of cone: "+a);
    }
}

class Sphere extends Figure{
    double r;

    //cons:
    Sphere(double r){this.r = r;}
    Sphere(){}

    public void calcVol(){
        v = (4.0/3.0)*pi*r*r*r;
    }
    
    public void calcArea(){
        a = 4*pi*r*r;
    }

    public void dispVol(){
        System.out.println("Volume of Sphere = "+v);
    }

    public void dispArea(){
        System.out.println("Area of sphere = "+a);
    }

}

class Cylinder extends Figure{
    double h,r;

    Cylinder(double h,double r){this.h=h;this.r=r;}

    Cylinder(){}

    //methods:
    public void calcArea(){
        a = 2*pi*r*(r+h);
    }
    public void calcVol(){
        v = pi*r*r*h;
    }
    public void dispArea(){
        System.out.println("Area of Cylinder: "+a);
    }
    public void dispVol(){
        System.out.println("Volume of Cylinder: "+v);
    }
}


public class AbstractDemo{
    public static void main(String[] args) {
        //initializing objects:
        Cone cn = new Cone(5.0,10.0);
        Sphere s = new Sphere(10.0);
        Cylinder cyl = new Cylinder(5.0,10.0);

        //invoking methods:

        cn.calcArea();
        cn.calcVol();
        cn.dispArea();
        cn.dispVol();

        s.calcArea();
        s.calcVol();
        s.dispArea();
        s.dispVol();

        cyl.calcArea();
        cyl.calcVol();
        cyl.dispVol();
        cyl.dispArea();
    }
}