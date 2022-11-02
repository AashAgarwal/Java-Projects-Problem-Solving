/**
 * Create a class named UncheckedException, which must inherit from an unchecked exception.
 * Inside the UncheckedExceptionclass declare a no-argument constructor.
 */

// update the class
class UncheckedException extends RuntimeException {

    public UncheckedException() {
        super();
    }
}

//do not change the code
class Main {
    public static void main(String[] args) {
        UncheckedException uncheckedException = new UncheckedException();
        System.out.println(uncheckedException instanceof RuntimeException);
    }
}