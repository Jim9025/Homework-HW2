import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_18 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入英文字母：");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();   // 讀取使用者輸入字串

        String stru = str.toUpperCase();  // 將字串轉成大寫
        String strl = str.toLowerCase();  // 將字串轉成小寫

        System.out.println("轉換成大寫時為 " + stru);
        System.out.println("轉換成小寫時為 " + strl);
    }
}
