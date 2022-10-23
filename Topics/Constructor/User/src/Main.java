/**
 * Write a class named User. It must have three string fields: login, firstName, and lastName and a constructor
 * with three parameters to initialize these fields. The order of parameters in the constructor must be the same as
 * presented above.
 *
 * Do not make the fields and the constructor private. Do not make the User class public.
 */

// write your class here
class User {

    String login;
    String firstName;
    String lastName;

    public User(String login, String firstName, String lastName) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}