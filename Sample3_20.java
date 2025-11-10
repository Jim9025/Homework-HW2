import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_20 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入字串：");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();  // 輸入第一個字串

        System.out.println("請輸入要連接的字串：");
        String str2 = br.readLine();  // 輸入第二個字串

        StringBuffer sb = new StringBuffer(str1);  // 用 str1 建立 StringBuffer 物件
        sb.append(str2);  // 將 str2 接在字串緩衝區後方

        System.out.println("在「" + str1 + "」後面接上「" + str2 + "」的結果為「" + sb + "」。");
    }
}
