public class Sample3_12 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();  // 建立新物件時，自動呼叫建構式

        car1.show();
    }
}

// Car 類別
class Car {
    private int num;
    private double gas;

    // 建構式 (Constructor)
    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}
