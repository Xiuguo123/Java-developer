package org.example;

//Part1
public class HealthProfessional {

    //ID
    private int id;

    //名称
    private String title;

    //基本信息
    private String basicInfo;

    /**
     * 默认构造函数
     */
    public HealthProfessional() {
        this.id = 0;
        this.title = "";
        this.basicInfo = "";
    }

    /**
     * 初始化变量的构造函数
     */
    public HealthProfessional(int id, String title, String basicInfo) {
        this.id = id;
        this.title = title;
        this.basicInfo = basicInfo;
    }

    /**
     *  打印变量
     */
    public void print() {
        System.out.println("id: " + this.id);
        System.out.println("title: " + this.title);
        System.out.println("basicInfo: " + this.basicInfo);
    }
}
