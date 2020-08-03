package chen.study.day06常用API2.String;

/*
 * 题目：定义一个方法，将数组{1，2，3}拼接成一个字符串，格式如下[word1#word2#word3]
 * */
public class Demo08StringPractice {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        String a = strToArray(array);
        System.out.println(a);
    }

    public static String strToArray(int[] array) {
        String str = new String("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "word" + array[i] + "]";
            } else {
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }
}
