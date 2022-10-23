/**
 * You are given a class named Movie. Write two constructors for the class.
 *
 * The first constructor should take three arguments (title, desc, year) and initialize the corresponding fields.
 *
 * The second one should take only two arguments (title, year) and initialize title and year. In this case,
 * the field desc should have a value "empty".
 *
 * Use the provided template, do not change it.
 */

class Movie {
    private String title;
    private String desc;
    private int year;

    // write two constructors here
    public Movie(String title, String desc, int year) {
        this(title, year);
        this.desc = desc;
    }

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
        this.desc = "empty";
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getYear() {
        return year;
    }
}