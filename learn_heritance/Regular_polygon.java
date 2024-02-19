package learn_heritance;

public class Regular_polygon implements Shape {
    int length,n;
    double angle;
    public void getN(int a){
        this.n=a;
        this.angle=2*Math.PI/n;
    }
    public double getArea(){
        return (n/2)*(((length/2)/Math.sin(angle/2))*((length/2)/Math.sin(angle/2))*Math.sin(angle));
    }
    public double getperiphery(){
        return n*length;
    }
}
