package chen.study.day09集合.泛型;
/*
* 定义一个含有泛型的类，模拟ArrayList集合
* 泛型可以接受任意的数据类型
* */
public class GenericClass<E> {
    private E name;

    public GenericClass() {
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
