/**
 * You decide to recall the happy days of your childhood and play Heroes. Of course, you need the army.
 *
 * Your task is to create objects: 5 Unit, 3 Knight, 1 General, 1 Doctor.
 */

class Army {

    public static void createArmy() {
        // Create all objects here
        new Unit("unit 1");
        new Unit("unit 2");
        new Unit("unit 3");
        new Unit("unit 4");
        new Unit("unit 5");

        new Knight("Knight 1");
        new Knight("Knight 2");
        new Knight("Knight 3");

        new General("general 1");

        new Doctor("Doc 1");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}