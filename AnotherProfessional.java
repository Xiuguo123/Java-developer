package org.example;

/**
 * Part2-2，继承HealthProfessional
 */
public class AnotherProfessional extends HealthProfessional{

    //专业
    private String profession;

    //默认构造函数
    public AnotherProfessional() {
        super();  //调用父类的默认构造函数
        this.profession = "";  //设置子类profession变量
    }

    //初始化变量的构造函数
    public AnotherProfessional(int id, String name, String basicInfo, String profession) {
        super(id, name, basicInfo);  //调用父类的构造函数
        this.profession = profession;
    }

    /**
     * 打印实例变量方法（重写父类方法）
     */
    @Override
    public void print() {
        super.print();  // 调用父类print方法
        System.out.println("profession: " + this.profession);
    }
}
