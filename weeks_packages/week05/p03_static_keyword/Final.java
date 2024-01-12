package week05.p03_static_keyword;

public class Final {
    public static void main(String[] args) {
        Dog dogy = new Dog();
        dogy.barking();

        /*
         * Chaining the class method through the constructor
         * Creating an new constructor and chaining to it the barking() method
         * immediately
         */
        new Dog().barking();

    }
}
