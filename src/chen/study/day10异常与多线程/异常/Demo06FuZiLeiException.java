package chen.study.day10异常与多线程.异常;

/*
* 子父类的异常：
*           如果父类抛出了多个异常，子类重写父类方法时：
*                                                1.抛出和父类方法相同的异常
*                                                2.抛出父类方法异常的子类
*                                                3.不抛出异常
*            父类方法没有抛出异常，子类方法也不可以抛出异常，若产生异常必须自己进行捕获处理
* */
public class Demo06FuZiLeiException {
    public void show01() throws  NullPointerException,ClassCastException{}
    public void show02() throws  IndexOutOfBoundsException{}
    public void show03() throws  IndexOutOfBoundsException{}

    //父类不抛出异常
    public void show04(){}
}


class Zi extends Demo06FuZiLeiException{
    //子类重写父类方法时，父类抛出异常，1.子类抛出和父类方法相同的异常
    public void show01() throws  NullPointerException,ClassCastException{}
    //子类重写父类方法时，父类抛出异常，2.子类抛出父类方法异常的子类
    public void show02() throws  ArrayIndexOutOfBoundsException{}
    //子类重写父类方法时，父类抛出异常，3.子类不抛出异常
    public void show03(){}

    //子类重写时若产生异常，必须自己处理
    public void show04(){
        try{
            throw new Exception();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}