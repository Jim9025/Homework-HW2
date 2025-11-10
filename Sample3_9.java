public class Sample3_9 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.num = 1234;
        car1.gas = -10.0; // 錯誤資料：汽油量不應該是負數

        car1.show();
    }
}

class Car {
    int num;
    double gas;

    void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }
}
