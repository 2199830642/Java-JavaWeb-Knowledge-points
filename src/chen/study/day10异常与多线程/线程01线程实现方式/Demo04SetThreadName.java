package chen.study.day10异常与多线程.线程01线程实现方式;

public class Demo04SetThreadName {
    public static void main(String[] args) {
        SetThreadName st = new SetThreadName();
        st.setName("酸菜");
        st.start();

        new SetThreadName("西瓜").start();
    }
}
