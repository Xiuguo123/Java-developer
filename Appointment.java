package org.example;

//Part4
public class Appointment {

    //患者姓名
    private String patientName;

    //患者手机号
    private String patientMobile;

    //预约时间
    private String appointTime;

    //预约医生（这里用的是父类，他能预约两个子类中的任意医生）
    private HealthProfessional appointDoctor;

    //默认构造函数
    public Appointment() {
        this.patientName = "";
        this.patientMobile = "";
        this.appointTime = "";
        this.appointDoctor = null;
    }

    // 带参数的构造函数
    public Appointment(String patientName, String patientMobile, String appointTime, HealthProfessional appointDoctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.appointTime = appointTime;
        this.appointDoctor = appointDoctor;
    }

    // 打印所有实例变量的方法
    public void print() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Appoint Time: " + appointTime);
        appointDoctor.print();
    }

    /**
     *  Getter方法
     */
    public String getPatientMobile() {
        return patientMobile;
    }//part5中取消预约能用到
}
