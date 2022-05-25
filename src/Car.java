public class Car extends Vehicle implements ServiceTire, ServiceEngine {
    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}

