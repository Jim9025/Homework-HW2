import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Sample2_21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("請輸入5個人的分數：");
        Integer[] test = new Integer[5];

        // 依序輸入分數
        for (int i = 0; i < test.length; i++) {
            String str = br.readLine();
            test[i] = Integer.parseInt(str);
        }

        // 使用 Arrays.sort 進行排序（由大到小）
        Arrays.sort(test, Collections.reverseOrder());

        // 輸出排序結果
        for (int i = 0; i < test.length; i++) {
            System.out.println("第" + (i + 1) + "名的分數是" + test[i]);
        }
    }
}
