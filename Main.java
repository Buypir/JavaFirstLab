package ua.lvit.iot.labs.first;

    public class Main {
        public static void main(String[] args) {
            System.out.println("Company name: " + Helicopter.CompanyName());
            Helicopter Storm = new Helicopter();
            Helicopter Kolosus = new Helicopter("Kolosus", 4, 230, "Good", 12, 1.5f);
            Helicopter SkyWalker = new Helicopter("Sky Walker", 12, 400);
            System.out.println(Storm);
            System.out.println(Kolosus);
            System.out.println(SkyWalker);
        }
    }

