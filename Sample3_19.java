import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_19 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入字串：");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();  // 讀入第一個字串

        System.out.println("請輸入要搜尋的文字：");
        String str2 = br.readLine();  // 讀入要搜尋的文字

        char ch = str2.charAt(0);     // 取出第一個字元作為搜尋目標

        int num = str1.indexOf(ch);   // 搜尋字元在字串中的位置

        if (num != -1)
            System.out.println(str1 + " 的第 " + (num + 1) + " 個字就是「" + ch + "」");
        else
            System.out.println(str1 + " 中沒有字元 " + ch);
    }
}
