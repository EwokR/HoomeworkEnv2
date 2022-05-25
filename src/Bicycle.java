public class Bicycle extends Vehicle implements ServiceTire {

public Bicycle(String modelName,int wheelsCount) {
    super(modelName, wheelsCount);
}


    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}

