import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_16 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入一個整數：");

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String str = br.readLine();   // 讀入一行字串
        int num = Integer.parseInt(str);  // 將字串轉為整數

        System.out.println("您輸入的數字是：" + num);
    }
}
