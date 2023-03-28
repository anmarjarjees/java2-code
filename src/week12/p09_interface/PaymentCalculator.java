package week12.p09_interface;

/* 
 * Interfaces:
 * Instead of using the keyword class,
 * we use interface 
 * In its most common form, an interface is a group of related methods with empty bodies. 
 * so an interface is a completely "abstract class" 
 * it's only used to group related methods with empty bodies
 * 
 * Interface determine the behaviour of a class
 * 
 * Java also required to have the name of the interface and the file name 
 * both to be the same:
 * current file name: PaymentCalculator
 * the interface name: PaymentCalculator
 * 
 * if the interface name is different,
 * Java will throw this error:
 * "The public type PaymentCalculator must be defined in its own file"
 * 
 * An interface declaration consists of modifiers, the keyword interface, the interface name, 
 * a comma-separated list of parent interfaces (if any), and the interface body.
 * 
 * The "public" access specifier indicates that the interface can be used by any class in any package. 
 * If you do not specify that the interface is public, 
 * then your interface is accessible only to classes defined in the same package as the interface
 */
public interface PaymentCalculator {
    // Constant declarations, if any
    // constant declarations
    /*
     * All constant values defined in an interface are implicitly:
     * - public
     * - static
     * - and final
     * 
     * So you can omit these modifiers:
     */

    // Example: base of natural logarithms
    double E = 2.718282;

    // Identify our methods signatures:
    // methods don't have implementations
    /*
     * Every field or class we define/declare in the interface,
     * must be implemented onto its classes
     * 
     * The method(s) signatures have no braces
     * and are terminated with a semicolon ";"
     */
    double calculateGross(double hours);

    void doSomething(int i, double x);

    /*
     * NOTE:
     * Consider the two methods above which are:
     * - calculateGross
     * - doSomething
     * 
     * They don't have access modifiers, so by default, they are set to "public"
     * So when we implement these two methods in the sub classes,
     * we have to explicitly identify them as public by adding the keyword "public"
     * 
     * implicitly => done by the language itself
     * explicitly => done by the programmer
     */

    // The interface body can contain abstract methods, default methods, and static
    // methods
}
