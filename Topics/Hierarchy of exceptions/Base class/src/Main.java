/**
 * Create a class named MyException, which must inherit from the base class for all exceptions and errors. Inside the
 * MyException class declare a constructor that takes String message as an argument and passes the message to the
 * superclass.
 */

// update the class
class MyException extends Throwable {

    public MyException(String message) {
        super(message);
    }
}

//do not change the code
class Main {
    public static void main(String[] args) {
        MyException myException = new MyException("This is a custom exception");
        System.out.println(myException.getMessage());
        Class<?> superClass = myException.getClass().getSuperclass();
        System.out.println(superClass.equals(Throwable.class));
    }
}