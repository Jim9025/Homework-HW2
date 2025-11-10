public class Sample3_17 {
    public static void main(String[] args) {
        String str = "Hello";  // 建立字串物件 (等同於 new String("Hello"))

        char ch1 = str.charAt(0);  // 取得第1個字元 (索引從0開始)
        char ch2 = str.charAt(1);  // 取得第2個字元
        int len = str.length();    // 取得字串長度

        System.out.println("Hello的第一個字元是" + ch1);
        System.out.println("Hello的第二個字元是" + ch2);
        System.out.println("Hello的長度是" + len);
    }
}
