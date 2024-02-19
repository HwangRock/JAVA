package learn_heritance;

public class Circle implements Shape{
    int radius;
    public void getRadius(int a){
        this.radius=a;
    }
    public double getArea(){
        return radius*radius*(3.14);
    }
    public double getperiphery(){
        return 2*(3.14)*radius;
    }
}
