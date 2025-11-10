public class Sample3_13 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();  // 呼叫「沒有參數」的建構式
        car1.show();

        Car car2;
        car2 = new Car(1234, 25.0);  // 呼叫「有兩個參數」的建構式
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

    // 有參數建構式 (多載 Overloaded Constructor)
    public Car(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "、汽油量為" + gas + "的車子");
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}
