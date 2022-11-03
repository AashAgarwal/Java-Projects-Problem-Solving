/**
 *Implement the method areSibling that checks if the files have the same parent.
 *
 * It should take two files and return true if the files have the same parent and false otherwise.
 */

import java.io.File;

class Siblings {

    public static boolean areSiblings(File f1, File f2) {
        // implement me
        return f1.getParent().equals(f2.getParent());
    }
}