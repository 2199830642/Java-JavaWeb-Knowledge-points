package chen.study.Day13Stream流_LambdaAPI.常用函数接口.函数式编程;

@FunctionalInterface
public interface MessageUser {
    //定义一个拼接消息的抽象方法，返回被拼接的消息
    public abstract String BuilderMessage();
}
