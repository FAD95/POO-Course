package Java;

/**
 * Main
 */
class Main {
    public static void main(String[] args) {
        Car car = new Car("AMQ123", new Account("Fadith Escorcia", "123456789"));
        car.id=1;
        car.passenger=4;
        car.printDataCar();

        Car car2 = new Car("QWE258", new Account("Camila Troncoso", "123456789"));
        car2.id=2;
        car2.license="QWE258";
        car2.passenger=5;
        car2.printDataCar();
    }    
}