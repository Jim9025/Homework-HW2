public class Sample3_15 {
    public static void main(String[] args) {
        Car.showSum();  // 不用建立物件即可呼叫類別方法

        Car car1;
        car1 = new Car();
        car1.setCar(1234, 20.5);

        Car.showSum();  // 顯示目前生產的車子總數

        Car car2;
        car2 = new Car();
        car2.setCar(4567, 30.5);

        Car.showSum();  // 再次顯示車子總數
    }
}

// Car 類別
class Car {
    public static int sum = 0;  // 類別變數（所有物件共用）

    private int num;
    private double gas;

    // 無參數建構式
    public Car() {
        num = 0;
        gas = 0.0;
        sum++;  // 每建立一台車就讓 sum 加 1
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }

    // 類別方法（不需建立物件即可呼叫）
    public static void showSum() {
        System.out.println("車子總共有" + sum + "台");
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}
