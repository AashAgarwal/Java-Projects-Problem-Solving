/**
 * Ann watched a health TV program and learned that oversleeping is as bad for your health as not getting enough sleep.
 * She decided to follow TV recommendations and keep track of how many hours she spends sleeping.
 *
 * You are given three numbers: A, B and H. According to TV, one should sleep at least A hours per day, but no more
 * than B hours. H is how many hours Ann sleeps.
 *
 * Task: If Ann sleeps less than A hours, print "Deficiency". If she sleeps more than B hours, print "Excess".
 * If her sleep fits the recommendations, print "Normal".
 *
 * Input format: three numbers A, B, H, where A is always less than or equal to B.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int minimumHoursOfSleep = scanner.nextInt();
        int maximumHoursOfSleep = scanner.nextInt();
        int actualHours = scanner.nextInt();

        if (actualHours >= minimumHoursOfSleep && actualHours <= maximumHoursOfSleep) {
            System.out.println("Normal");
        } else if (actualHours < minimumHoursOfSleep) {
            System.out.println("Deficiency");
        } else {
            System.out.println("Excess");
        }
    }
}