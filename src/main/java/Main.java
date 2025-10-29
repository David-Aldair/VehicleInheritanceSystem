public class Main {
    public static void main(String[] args) {

        //moped instance
        Moped slowRide = new Moped("Red", 2, 2, 5);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        //hovercraft instance
        Hovercraft hotRide = new Hovercraft("Yellow", 1, 3, 10);
        hotRide.setColor("Yellow");
        hotRide.setFuelCapacity(10);

        //car instance
        Car fordRaptor = new Car("Matte Black", 4, 5, 35);
        fordRaptor.setColor("Matte Black");
        fordRaptor.setFuelCapacity(35);

        //semitruck instance
        SemiTruck oldFaithful = new SemiTruck("Hot Red", 1, 3, 50);
        oldFaithful.setColor("Hot Red");
        oldFaithful.setFuelCapacity(50);

        //moped output
        System.out.println();
        System.out.println("======================MOPED'S INFO!=========================");
        System.out.println("The moped's color is " + slowRide.getColor() + " and its fuel capacity is " + slowRide.getFuelCapacity() + " gallons");
        System.out.println();

        //hovercraft output
        System.out.println("======================HOVERCRAFT'S INFO!=========================");
        System.out.println("The hovercraft's color is " + hotRide.getColor() + " and its fuel capacity is " + hotRide.getFuelCapacity() + " gallons");
        System.out.println();

        //car output
        System.out.println("======================CAR'S INFO=========================");
        System.out.println("The car's color is " + fordRaptor.getColor() + " and its fuel capacity is " + fordRaptor.getFuelCapacity() + " gallons");
        System.out.println();

        //semitruck output
        System.out.println("======================SEMI-TRUCK'S INFO!=========================");
        System.out.println("The semi-truck's color is " + oldFaithful.getColor() + " and its fuel capacity is " + oldFaithful.getFuelCapacity() + " gallons");


    }
}
