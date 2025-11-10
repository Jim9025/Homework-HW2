public class Sample3_6 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        // 傳遞引數給方法
        car1.setNum(1234);
        car1.setGas(20.5);
    }
}

class Car {
    int num;
    double gas;

    // 接收 int 型別引數 n
    void setNum(int n) {
        num = n;
        System.out.println("將車號設為" + num);
    }

    // 接收 double 型別引數 g
    void setGas(double g) {
        gas = g;
        System.out.println("將汽油量設為" + gas);
    }
}
