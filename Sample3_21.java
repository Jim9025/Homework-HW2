import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_21 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入兩個整數：");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();  // 讀取第一個整數字串
        String str2 = br.readLine();  // 讀取第二個整數字串

        int num1 = Integer.parseInt(str1);  // 轉換成整數
        int num2 = Integer.parseInt(str2);  // 轉換成整數

        int ans = Math.max(num1, num2);  // 使用 Math 類別的 max 方法找出較大值

        System.out.println(num1 + " 與 " + num2 + " 中較大的數是 " + ans + "。");
    }
}
