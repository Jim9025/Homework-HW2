public class Sample3_8 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.setNumGas(1234, 20.5);

        // 呼叫有回傳值的方法
        int number = car1.getNum();
        double gasoline = car1.getGas();

        System.out.println("調查樣品車時得知");
        System.out.println("車號是" + number + "，汽油量是" + gasoline);
    }
}

class Car {
    int num;
    double gas;

    // 有回傳值的方法：回傳 int 型別
    int getNum() {
        System.out.println("調查車號");
        return num;
    }

    // 有回傳值的方法：回傳 double 型別
    double getGas() {
        System.out.println("調查汽油量");
        return gas;
    }

    // 無回傳值的方法：設定車號與汽油量
    void setNumGas(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }
}
