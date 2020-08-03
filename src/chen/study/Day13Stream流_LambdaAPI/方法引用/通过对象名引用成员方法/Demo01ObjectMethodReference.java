package chen.study.Day13Stream流_LambdaAPI.方法引用.通过对象名引用成员方法;
/*
通过对象名引用成员方法
适用前提：对象名存在，成员方法也存在
 */
public class Demo01ObjectMethodReference {
    public static void printString(Printable pa){
        pa.print("hello");
    }
    public static void main(String[] args) {
        printString(s->
            new MethodRerObject().printUpperCase(s)//HELLO
        );

        //使用方法来优化lambda
        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUpperCase);
    }
}
