/**
 * Here is the User class with two fields: firstName and lastName.
 *
 * Implement two null-safety setters and one calculated getter in the following ways:
 *
 * both setters should accept and set a value if it is not null or an empty string "";
 * the getter should return the full name of the user by concatenating firstName and lastName using a single space
 * between them. If one of the parts was not set, the getter should return only the other part without additional
 * spaces. If both parts are empty, the getter should return the word "Unknown".
 */

class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        if ("".equals(firstName) && "".equals(lastName)) {
            return "Unknown";
        } else {
            return (firstName + " " + lastName).trim();
        }
    }
}