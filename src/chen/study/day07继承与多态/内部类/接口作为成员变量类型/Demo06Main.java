package chen.study.day07继承与多态.内部类.接口作为成员变量类型;

public class Demo06Main {
    public static void main(String[] args) {
        //设置英雄名称
        Hero b = new Hero();
        b.setName("艾希");

        //设置英雄技能
        b.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu~biu~biu~");
            }
        });
        b.attack();
    }
}
