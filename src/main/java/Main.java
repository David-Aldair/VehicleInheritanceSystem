public class Main {
    public static void main(String[] args) {

        //moped instance
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        //hovercraft instance
        Hovercraft hotRide = new Hovercraft();
        hotRide.setColor("Blue");
        hotRide.setFuelCapacity(10);

        //car instance
        Car fordF150 = new Car();
        fordF150.setColor("Blue");
        fordF150.setFuelCapacity(35);

        //semitruck instance
        SemiTruck oldFaithful = new SemiTruck();
        oldFaithful.setColor("Hot Red");
        oldFaithful.setFuelCapacity(50);


    }
}
