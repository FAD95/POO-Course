package Java;

/**
 * Main
 */
class Main {
    public static void main(String[] args) {
        UberX car = new UberX("AMQ123", new Account("Fadith Escorcia", "123456789"), "Chevrolet", "Spark");
        car.setPassenger(4);
        car.printDataCar();

        UberVan car2 = new UberVan("QWE258", new Account("Camila Troncoso", "123456789"));
        car2.setPassenger(6);
        car2.printDataCar();
    }    
}