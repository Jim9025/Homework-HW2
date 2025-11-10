public class Sample3_5 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;

        car1.showCar();
    }
}

class Car {
    int num;
    double gas;

    // 方法1：顯示車號與汽油量
    void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }

    // 方法2：呼叫自身的另一個方法
    void showCar() {
        System.out.println("開始顯示車子資料");
        this.show(); // 呼叫同一類別的另一個方法，也可以省略 this.
    }
}
