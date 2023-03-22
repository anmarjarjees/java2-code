package week11.p07_polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape anyShape = new Shape(); // the superclass

        Rectangle myRectangle = new Rectangle(5, 7);
        Square mySquare = new Square(10);
        Triangle myTriangle = new Triangle(5, 7, 12);

        System.out.println("The perimeter value of my rectangle is " + myRectangle.calcPerimeter());
        System.out.println("The perimeter value of my square is " + mySquare.calcPerimeter());
        System.out.println("The perimeter value of my triangle is " + myTriangle.calcPerimeter());

    }
}
