public class Sample3_23 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();  // 建立新車物件
        car1.show();       // 顯示初始狀態

        int number = 1234;
        double gasoline = 20.5;
        String str = "1號車";  // 字串是屬於類別型態的變數

        car1.setCar(number, gasoline);  // 傳入基本型態的引數
        car1.setName(str);              // 傳入類別型態的引數

        car1.show();  // 顯示更新後的內容
    }
}

class Car {
    private int num;
    private double gas;
    private String name;  // 使用「類別型態」變數作為欄位

    public Car() {
        num = 0;
        gas = 0.0;
        name = "";
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }

    // 使用「類別型態」變數作為方法的參數
    public void setName(String nm) {
        name = nm;
        System.out.println("將車名設為" + name);
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("車名是" + name);
    }
}
