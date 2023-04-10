public class Bicycle extends TransportDescription {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 1; i <= this.getWheelsCount();i++) {
            System.out.println("Меняем покрышку");
        }
    }
}
