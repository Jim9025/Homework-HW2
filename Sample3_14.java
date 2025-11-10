public class Sample3_14 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();  // 呼叫無參數建構式
        car1.show();

        Car car2;
        car2 = new Car(1234, 25.0);  // 呼叫兩個參數的建構式
        car2.show();
    }
}

// Car 類別
class Car {
    private int num;
    private double gas;

    // 無參數建構式
    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    // 有參數建構式，並在其中呼叫無參數建構式
    public Car(int n, double g) {
        this();  // 呼叫上方的無參數建構式 (this() 必須在第一行)
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}
