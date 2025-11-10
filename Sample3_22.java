public class Sample3_22 {
    public static void main(String[] args) {
        System.out.println("宣告car1");
        Car car1;                 // 宣告car1
        car1 = new Car();         // 建立新物件並指定給car1
        car1.setCar(1234, 20.5);  // 設定車號與汽油量
        car1.show();

        System.out.println("宣告car2");
        Car car2;                 // 宣告car2
        car2 = car1;              // 將car1指定給car2（兩者指向同一個物件）
        System.out.println("改變car1的資料。");
        car1.setCar(2345, 30.5);  // 修改car1的屬性

        System.out.println("car1的資料：");
        car1.show();

        System.out.println("car2的資料：");
        car2.show();              // car2的資料也被改變
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
