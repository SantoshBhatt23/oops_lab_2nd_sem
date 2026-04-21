
class Figure{
    double r,a,v;
    public void dispArea(){
        System.out.println("Area of figure: "+a);
    }
    public void dispVolume(){
        System.out.println("Volume of figure: "+v);
    }
}
class Cone extends Figure{
    double h;
    public void calcArea(){
        double s = Math.sqrt(r*r + h*h);
        a = Math.PI*r*r + Math.PI*r*s;
    }
    public void calcVol(){
        v = 1.0/3.0 *(Math.PI*r*r*h);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Cone c1 = new Cone();
        c1.r = 10.0;
        c1.h = 5.0;
        c1.calcArea();
        c1.calcVol();
        c1.dispArea();
        c1.dispVolume();
    }
}