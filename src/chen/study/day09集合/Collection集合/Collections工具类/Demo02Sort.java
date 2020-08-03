package chen.study.day09集合.Collection集合.Collections工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 public static <T> void sort(List<T> list,Comparator<? super T>);将集合中元素按指定规则排序
*/
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 4, 23, 5, 43, 654, 7, 65, 7, 4);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;//升序排序
                //反之,降序排序
            }
        });
        System.out.println(list);


        //对自定义内容进行排序
        ArrayList<Student> stu = new ArrayList<>();
        stu.add(new Student("b小陈",1704010321));
        stu.add(new Student("a小陈",1704010321));
        stu.add(new Student("小王",1803020507));
        stu.add(new Student("张三",1234567890));
        System.out.println(stu);//[Student{name='小陈', id=1704010321}, Student{name='小王', id=1803020507}, Student{name='张三', id=1234567890}]

        Collections.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return (int) (o1.getId()-o2.getId());//按照学号升序排序,这个方法的返回值是个整数，所以格式不同必须要强转
                //反之则为降序
                int result = (int)o1.getId()-(int) o2.getId();
                if (result==0){ //如果学号相同，则根据姓名的首字母进行升序排序，反之则为降序
                    result =o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(stu);//[Student{name='张三', id=1234567890}, Student{name='a小陈', id=1704010321}, Student{name='b小陈', id=1704010321}, Student{name='小王', id=1803020507}]
    }
}
