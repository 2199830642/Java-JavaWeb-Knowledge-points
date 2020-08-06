package chen.study.jedis.test;

import chen.study.jedis.util.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Jedis的测试类
 */
public class JedisTest {
    /**
     * 快速入门
     */
    @Test
    public void test1(){
        //1.获取连接
        Jedis jedis = new Jedis("localhost",6379);
        //2.操作
        jedis.set("username","zhangsan");
        //3.释放资源
        jedis.close();
    }

    /**
     * String 数据结构操作
     */
    @Test
    public void test2(){
        //1.获取连接
        Jedis jedis = new Jedis();//如果是空参构造，默认值就是localhost 端口就是6379
        //2.操作
        jedis.set("username","zhangsan");
        String username = jedis.get("username");
        System.out.println(username);

        //可以使用一个方法setex()方法存储可以指定过期时间的key和value
        jedis.setex("activecode",20,"hehe");//20秒后自动删除该键值对
        //3.释放资源
        jedis.close();
    }

    /**
     * hash 数据结构操作
     */
    @Test
    public void test3(){
        //1.获取连接
        Jedis jedis = new Jedis();//如果是空参构造，默认值就是localhost 端口就是6379
        //2.操作
        jedis.hset("user","name","lisi");
        jedis.hset("user","age","23");
        //获取
        String hget = jedis.hget("user", "name");
        System.out.println(hget);
        //获取所有数据
        Map<String, String> map = jedis.hgetAll("user");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"--->"+value);
        }
        //释放资源
        jedis.close();
    }

    /**
     * list 数据结构操作
     */
    @Test
    public void test4(){
        //1.获取连接
        Jedis jedis = new Jedis();//如果是空参构造，默认值就是localhost 端口就是6379
        //2.操作
        jedis.lpush("myList","a","b","c");
        jedis.rpush("myList","a","b","c");
        //3.获取
        List<String> myList = jedis.lrange("myList", 0, -1);
        for (String s : myList) {
            System.out.println(s);
        }
        //4.弹出
        String ele = jedis.lpop("myList");
        System.out.println(ele);//c
        //释放资源
        jedis.close();
    }

    /**
     * set 数据结构操作
     */
    @Test
    public void test5(){
        //1.获取连接
        Jedis jedis = new Jedis();//如果是空参构造，默认值就是localhost 端口就是6379
        //2.操作
        jedis.sadd("mySet","java","php","c++");
        Set<String> mySet = jedis.smembers("mySet");

        System.out.println(mySet);

        //删除
        jedis.srem("mySet","php");
        //释放资源
        jedis.close();
    }

    /**
     * sortedset 数据结构操作
     */
    @Test
    public void test6(){
        //1.获取连接
        Jedis jedis = new Jedis();//如果是空参构造，默认值就是localhost 端口就是6379
        //2.操作
        jedis.zadd("mySorted",3,"亚瑟");
        jedis.zadd("mySorted",20,"后羿");
        jedis.zadd("mySorted",15,"孙悟空");
        //3.获取
        Set<String> mySorted = jedis.zrange("mySorted", 0, -1);
        System.out.println(mySorted);
        //释放资源
        jedis.close();
    }

    /**
     * Jedis连接池使用
     */
    @Test
    public void test7(){
        //创建一个配置对象
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(10);
        //1.创建连接池对象
        JedisPool jedisPool = new JedisPool(config,"localhost",6379);
        //2.获取连接
        Jedis jedis = jedisPool.getResource();

        jedis.set("hehe","haha");

        //归还到连接池中
        jedis.close();
    }

    /**
     * Jedis连接池工具类使用
     */
    @Test
    public void test8(){
        //通过连接池工具类获取
        Jedis jedis = JedisPoolUtils.getJedis();



        //3. 使用
        jedis.set("hello","world");


        //4. 关闭 归还到连接池中
        jedis.close();;
    }
}
