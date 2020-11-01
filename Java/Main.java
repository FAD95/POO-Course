package Java;

/**
 * Main
 */
class Main {
    public static void main(String[] args) {
        UberX car = new UberX("AMQ123", new Account("Fadith Escorcia", "123456789"), "Chevrolet", "Spark");
        car.id=1;
        car.setPassenger(4);
        car.printDataCar();

        UberPool car2 = new UberPool("QWE258", new Account("Camila Troncoso", "123456789"),"Hyundai","Elantra");
        car2.id=2;
        car2.setPassenger(4);
        car2.printDataCar();
    }    
}