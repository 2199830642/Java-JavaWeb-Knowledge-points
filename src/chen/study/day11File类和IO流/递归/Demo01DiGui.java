package chen.study.day11File类和IO流.递归;
/*
   递归：方法自己调用自己

   直接递归：称为方法直接调用自己
   简介递归：可以称为 A方法调用B方法，B方法调用C方法，C方法调用A方法

   注意事项：
          1.递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出
          2.在递归中虽然有条件限定，但递归次数不能太多，否则也会发生栈内存溢出
          3.构造方法，禁止递归

   递归的使用前提：
          当调用方法的时候，方法的主体不变，每次调用方法的参数不同，可以使用递归
 */
public class Demo01DiGui {
    public static void main(String[] args) {
        //a();
        //b(1);
    }

    //3.构造方法，禁止递归
    //编译报错：构造方法使用来创建对象的，一直递归会导致内存中有无数多个对象
   /* public Demo01DiGui(){
        Demo01DiGui()；
    }*/


    //2.在递归中虽然有条件限定，但递归次数不能太多，否则也会发生栈内存溢出
    // java.lang.StackOverflowError 9943
   /* private static void b(int i) {
        System.out.println(i);
        if(i==20000){
            return;//方法结束
        }
        b(++i);
    }*/

    //1.递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出
    //java.lang.StackOverflowError
   /* private static void a() {
        System.out.println("a方法！！！！");
        a();
    }*/
}
