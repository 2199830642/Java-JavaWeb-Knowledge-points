package chen.study.自己写的小栗子;

public class square {
    private double length;
    private double width;

    public square() {
    }

    public square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws Exception{
        if(length<0){
            throw new Exception("格式错误！长度不能小于0");
        }
        this.length = length;
    }

    public double getWigth() {
        return width;
    }

    public void setWigth(double wigth) throws Exception{
        if(width<0){
            throw new Exception("格式错误！宽度不能小于0");
        }
        this.width = wigth;
    }
    public double getArea(){
        return length*width;
    }
    public double getGirth(){
        return (length+width)*2;
    }
}
