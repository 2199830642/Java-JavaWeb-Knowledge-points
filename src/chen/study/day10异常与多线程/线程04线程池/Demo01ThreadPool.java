package chen.study.day10异常与多线程.线程04线程池;
/*
* 线程池的概念：
* 其实就是一个可以容纳多个线程的容器，其中的线程可以反复使用省去了频繁创建线程和销毁线程的操作，无需消耗过多资源
* 线程池的原理：
* 线程池(可以理解为一种容器)--->可以用集合（ArrayList，LinkedList,HashSet,HashMap）
* LinkedList是最为适合的，LinkedList<Thread>
*
* 当程序第一次启动时，我们可以创建多个线程保存到一个集合中，如果我们需要使用线程则从集合中取出来一个
* Thread t = list.remove(o);返回的是被移除的元素，线程只能被一个任务所使用的
* Thread t = list.removeFirst();同理
*
* 当我们使用完毕后，要将线程归还给线程池
* list.add(t);
* linked.addLast();
*
* 在jdk1.5之后，JDK内置了线程池，我们可以直接使用
* */
public class Demo01ThreadPool {
}
