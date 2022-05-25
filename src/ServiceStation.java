public class ServiceStation implements Check {

    public void checkBicycle(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }
   public void checkCar(Car car) {
       System.out.println("Обслуживаем " + car.getModelName());
       for (int i = 0; i < car.getWheelsCount(); i++) {
           car.updateTyre();
       }
       car.checkEngine();
   }

    public void checkTruck(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }
}
