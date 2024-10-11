package inheritance_demo1;

/* 
 * Bad example :-(
 * because we are saying Cat "is a" Shape!
 */
public class Cat extends Shape {
    @Override
    public double calcArea() {
        return 0;
    }
}
