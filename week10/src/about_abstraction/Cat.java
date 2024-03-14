package about_abstraction;

/* 
 * Bad example:
 * because we are saying" Cat is a Shape!
 */
public class Cat extends Shape {

    @Override
    double calcArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcArea'");
    }

}
