package chen.study.day11File类和IO流.缓冲流;

import java.io.*;

public class Demo04Copy {
    public static void main(String[] args) throws IOException {
        long l1 = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("/Users/chen/Desktop/1.jpeg");
        BufferedInputStream bis = new BufferedInputStream(fis, 1024);
        FileOutputStream fos = new FileOutputStream("/Users/chen/Desktop/IdeaProjects/1.jpeg");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
        long l2 = System.currentTimeMillis();
        System.out.println("耗时：" + (l2 - l1)+"毫秒");
    }
}
