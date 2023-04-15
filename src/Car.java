public class Car extends TransportDescription {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void service() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 1; i <= this.getWheelsCount();i++) {
            System.out.println("Меняем покрышку");
        }
        System.out.println("Проверяем двигатель");
    }
}


