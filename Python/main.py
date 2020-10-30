from car import Car

if __name__=="__main__":
    car = Car()
    car.id=1
    car.license="AMQ123"
    car.driver="Fadith Escorcia"
    car.passenger=4
    print(vars(car))

    car2 = Car()
    car2.id=2
    car2.license="QWE258"
    car2.driver="Camila Troncoso"
    car2.passenger=5
    print(vars(car2))
