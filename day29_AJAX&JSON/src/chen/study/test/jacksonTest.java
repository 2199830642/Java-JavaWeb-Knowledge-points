package chen.study.test;

import chen.study.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class jacksonTest {

    //java对象转为json
    @Test
    public void test1() throws Exception {
        //1.创建Person对象
        Person p = new Person("张三",23,"男",new Date());
        //2.创建jackson的核心对象ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //3.调用方法转换
        /*
            转换方法：
                writeValue(参数1,obj)
                    参数1：
                        File：将obj对象转换成json字符串，并保存到指定的文件中
                        Writer：将obj对象转换成json字符串，并将json数据填充到字符输出流中
                        OutputStream：将obj对象转换成json字符串，并将json数据填充到字节输出流中

                writeValueAsString(obj);将对象转为json字符串
        */
        //writeValueAsString(obj)
        //String json = mapper.writeValueAsString(p);
        //System.out.println(json);

        //writeValue
        //mapper.writeValue(new File("/Users/chen/Desktop/a.txt"),p);

        mapper.writeValue(new FileWriter("/Users/chen/Desktop/a.txt"),p);
    }

    @Test
    public void test2() throws Exception {
        //1.创建Person对象
        Person p = new Person("张三", 23, "男", new Date());
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(p);
        System.out.println(json);//{"name":"张三","age":23,"gender":"男","birthday":1596539202407}
        //{"name":"张三","age":23,"gender":"男","birthday":"2020-08-04 11:09:39"}
    }

    @Test
    public void test3() throws Exception {
        //1.创建Person对象
        Person p1 = new Person("张三", 23, "男", new Date());
        Person p2 = new Person("张三", 23, "男", new Date());
        Person p3 = new Person("张三", 23, "男", new Date());
        //2.创建一个集合存储对象
        List<Person> list = new ArrayList<>();
        Collections.addAll(list,p1,p2,p3);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(list);
        System.out.println(json);
        //[{"name":"张三","age":23,"gender":"男","birthday":"2020-08-04 11:13:27"},{"name":"张三","age":23,"gender":"男","birthday":"2020-08-04 11:13:27"},{"name":"张三","age":23,"gender":"男","birthday":"2020-08-04 11:13:27"}]
    }


    @Test
    public void test4() throws Exception {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("name","张三");
        map.put("age","23");
        map.put("gender","男");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);
        System.out.println(json);
        //{"gender":"男","name":"张三","age":"23"}
    }


    @Test
    public void test5() throws Exception {
        //演示json对象转化为java对象
        //初始化
        String json = "{\"gender\":\"男\",\"name\":\"张三\",\"age\":\"23\"}";

        //创建ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //转化为java对象
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);
    }
}
