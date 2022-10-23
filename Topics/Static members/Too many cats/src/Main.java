/**
 *Let's count cats! Implement a class named Cat and a static method getNumberOfCats.
 *
 * These are some features of the class:
 *
 * The class Cat has two instance fields: a string name and an int age, and one static int field counter.
 * The static counter field allows you to know how many cats have already been created.
 * The class should have a constructor for initializing the instance fields. During the initialization of a new cat,
 * the value of the static field counter should be incremented. If counter > 5, the message "You have too many cats"
 * must be printed to System.out.
 * Your static method getNumberOfCats returns the current number of created cats and prints no messages.
 *
 * Take a look at the example:
 *
 * Let's assume seven instances of the class Cat have already been created. Then the correctly implemented method
 * Cat.getNumberOfCats() should return 7.
 *
 * Note that the message "You have too many cats" should appear twice: the first time when creating the sixth cat and
 * the second time when creating the seventh cat.
 *
 * Use the provided template and do not make the class private.
 */

class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter;

    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
        this.name = name;
        this.age = age;
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}