public class Sample3_24 {
    public static void main(String[] args) {
        Car[] car1;            // 宣告 Car 類型的陣列變數
        car1 = new Car[3];     // 準備好能容納 3 個 Car 物件的陣列空間

        // 逐一建立 3 個 Car 物件，並分別指定給陣列元素
        for (int i = 0; i < car1.length; i++) {
            car1[i] = new Car();
        }

        // 為每個陣列元素設定車號與汽油量
        car1[0].setCar(1234, 20.5);
        car1[1].setCar(2345, 30.5);
        car1[2].setCar(3456, 40.5);

        // 使用 for 迴圈顯示每一台車的資訊
        for (int i = 0; i < car1.length; i++) {
            car1[i].show();
        }
    }
}

class Car {
    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}
