public class Sample3_11 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        // 同名方法 setCar，不同參數類型（多載）
        car1.setCar(1234, 20.5);
        car1.show();

        System.out.println("只變更車號：");
        car1.setCar(2345);
        car1.show();

        System.out.println("只變更汽油量：");
        car1.setCar(30.5);
        car1.show();
    }
}

class Car {
    private int num;
    private double gas;

    // 設定車號的方法（int 參數）
    public void setCar(int n) {
        num = n;
        System.out.println("將車號設為" + num);
    }

    // 設定汽油量的方法（double 參數）
    public void setCar(double g) {
        gas = g;
        System.out.println("將汽油量設為" + gas);
    }

    // 同時設定車號與汽油量的方法（int + double 參數）
    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }

    // 顯示資料
    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}
