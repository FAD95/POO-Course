from car import Car
from account import Account
from uberX import UberX
from uberPool import UberPool

if __name__=="__main__":
    car = uberX("AMQ123", Account("Fadith Escorcia","123456789"), "Chevrolet", "Spark")
    car.id=1
    car.passenger=4
    print(vars(car))

    car2 = Car("QWE258",Account("Camila Troncoso","123456789"),"Hyundai","Elantra")
    car2.id=2
    car2.passenger=5
    print(vars(car2))
