package org.example;

/**
 * Part2-1，继承HealthProfessional
 */
public class GeneralPractitioner extends HealthProfessional{

    //地址（区分另一子类的变量）
    private String address;

    //默认构造函数
    public GeneralPractitioner() {
        super();  //调用父类的默认构造函数
        this.address = "";  //设置子类address变量
    }

    //初始化变量的构造函数
    public GeneralPractitioner(int id, String name, String basicInfo, String address) {
        super(id, name, basicInfo);  //调用父类的构造函数
        this.address = address;
    }

    /**
     * 打印实例变量方法（重写父类方法）
     */
    @Override
    public void print() {
        super.print();  // 调用父类print方法
        System.out.println("Address: " + this.address);
    }
}
