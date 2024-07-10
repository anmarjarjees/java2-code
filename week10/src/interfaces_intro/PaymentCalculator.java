package interfaces_intro;

/* 
 * PaymentCalculator => to calculate the payment:
 * > Seniors (10+ years of experience)
 * > Junior (less than 10 years)
 * 
 * We cannot say:
 * - JuniorLevel is a type of PaymentCalculator! No relation
 * - SeniorLevel is a type of PaymentCalculator! No relation
 * 
 * Interfaces:
 * Instead of using the keyword "class",
 * we use the keyword "interface"
 * In its most common form, an interface is a group of related methods with empty bodies. 
 * so an interface is a completely "abstract class" 
 * it's only used to group related methods with empty bodies
 * 
 * Interface determine the behaviour of the class that will use it.
 * 
 * Java also required to have the name of the interface and the file name 
 * both to be the same:
 * > Current file name: PaymentCalculator.java
 * > Interface name: PaymentCalculator
 * 
 * If the interface name is different,
 * Java will throw this error:
 * "The public type PaymentCalculator must be defined in its own file"
 * 
 * An interface declaration consists of:
 * > Modifiers => the keyword "interface" => the interface name
 * > Optional => a comma-separated list of parent interfaces (if any)
 * > the interface body { }
 * 
 * The "public" access specifier indicates that the interface can be used by any class in any package. 
 * If you do not specify that the interface is public, 
 * then your interface is accessible only to classes defined in the same package as the interface
 * 
 * In Java:
 * - Class can extend only one class (can inherit from one class)
 * - Class can implement multiple interfaces with comma separated values
 */
public interface PaymentCalculator {
    // Constant declarations, if needed
    /*
     * All constant values defined in an interface are "implicitly":
     * - public
     * - static
     * - final
     * So you can omit these modifiers: public static final
     * 
     * FYI: the keyword "explicitly":
     * we as programmer we have to write the options
     */
    // Example: base of natural logarithms
    double E = 2.718282;

    // Identify our methods signatures:
    // methods CANNOT have implementations inside interfaces
    /*
     * Every field or class we define/declare in the interface,
     * must be implemented in the classes that implement this interface
     * 
     * The method(s) signatures have no braces
     * and are terminated with a semicolon ";"
     */

    /*
     * Remember that before Java 8,
     * interface CANNOT have fully implemented methods
     */

    /*
     * Below are examples of two "abstract" methods (without implementation):
     * - calculateGross
     * - doSomething
     * 
     * Just method signatures without implementations.
     * Any class that implements this interface
     * must provide implementations for these two methods.
     */
    double calculateGross(double hours);

    void doSomething(int i, double x);

    /*
     * NOTE:
     * Consider the two methods above which are:
     * - calculateGross
     * - doSomething
     * 
     * They don't have access modifiers,
     * so by default, they are set to "public"
     * So when we implement these two methods in the subclasses,
     * we don't have to explicitly identify them as "public"
     * by adding the keyword "public"
     * 
     * To recap:
     * implicitly => done by the language itself
     * explicitly => done by the programmer
     */

    /*
     * Below is an examples of a "static" method:
     * - testStaticMethod
     * 
     * Are methods with implementations
     * They belong to the interface itself.
     * They can be called without an instance of the implementing class
     * They CANNOT be overridden by implementing classes
     */
    static void testStaticMethod() {
        System.out.println("Interface Static Method");
    }

    /*
     * Below is an examples of a "default" method:
     * - testStaticMethod
     * 
     * Are methods with a default implementation.
     * Classes that implement the interface
     * can either use the default implementation or override it.
     */
    default void testDefaultMethod() {
        System.out.println("Interface Default Method");
    }
    /*
     * To recap, "Interfaces" can contain:
     * 1- abstract methods: method signatures without implementations
     * 
     * 2- default methods: methods with a default implementation (since Java 8)
     * 
     * 3- static methods:
     * > Since Java 8
     * > methods with implementations
     * > belong to the interface itself.
     * > can be called without an instance of the implementing class
     * > can be called using => InterfaceName.methodName()
     */
}
