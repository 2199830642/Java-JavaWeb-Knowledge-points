package chen.study.day02方法使用的简单例子;
/*
* 定义一个方法，打印指定次数的hello world*/
public class demo05Methodprint {
    public static void main(String[] args) {
        printcount(10);
    }

    public static void printcount(int a){
        for(int i =1;i<=a;i++){
            System.out.println("helloworld");
        }
    }
}
