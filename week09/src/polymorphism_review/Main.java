package polymorphism_review;

public class Main {
    public static void main(String[] args) {
        Shape anyShape = new Shape(); // the superclass

        Rectangle myRectangle = new Rectangle(5, 7);
        Square mySquare = new Square(10);
        Triangle myTriangle = new Triangle(10, 20, 30);

        System.out.println(myTriangle);
        // The original return:
        // package_name.ClassName@xxxxxxx
        // polymorphism_review.Triangle@7a81197d

        // let's try to investigate toString()
        System.out.println(myTriangle.toString());

        System.out.println("The perimeter value of my rectangle is " + myRectangle.calcPerimeter());
        System.out.println("The perimeter value of my square is " + mySquare.calcPerimeter());
        System.out.println("The perimeter value of my triangle is " + myTriangle.calcPerimeter());

    }
}
