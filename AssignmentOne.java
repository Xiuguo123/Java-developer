package org.example;

import java.util.ArrayList;

public class AssignmentOne {

    public static void main(String[] args) {
        //Part 3 – Using classes and objects
        //创建三个GeneralPractitioner对象
        HealthProfessional generalPractitioner1 = new GeneralPractitioner(1,"王医生","博士","北京");

        HealthProfessional generalPractitioner2 = new GeneralPractitioner(2,"李医生","副教授","上海");
        HealthProfessional generalPractitioner3 = new GeneralPractitioner(3,"赵医生","教授","深圳");

        //创建两个AnotherProfessional对象
        HealthProfessional anotherProfessional1 = new AnotherProfessional(4,"孙医生","博士","外科");
        HealthProfessional anotherProfessional2 = new AnotherProfessional(5,"钱医生","硕士","内科");

        // 打印所有医生的详细信息
        generalPractitioner1.print();
        generalPractitioner2.print();
        generalPractitioner3.print();
        anotherProfessional1.print();
        anotherProfessional2.print();
        System.out.println("------------------------------");




        // Part 5 – Collection of appointments
        //GeneralPractitioner医生预约两次
        createAppointment("赵先生", "11111111111", "08:00", generalPractitioner1);
        createAppointment("钱女士", "22222222222", "10:00", generalPractitioner2);

        //AnotherProfessional预约两次
        createAppointment("孙女士", "33333333333", "14:00", anotherProfessional1);
        createAppointment("李先生", "44444444444", "16:00", anotherProfessional2);

        //打印所有预约
        System.out.println("当前所有预约信息如下：");
        printExistingAppointments();
        System.out.println("------------------------------");

        //取消手机号为11111111111的预约
        cancelBooking("11111111111");

        //打印更新后的预约
        System.out.println("取消手机号为11111111111的预约后，当前所有预约信息如下：");
        printExistingAppointments();

        System.out.println("------------------------------");
    }

    // 创建新预约并添加到ArrayList

    static ArrayList<Appointment> appointments = new ArrayList<>();

    /**
     * 创建预约
     */
    public static void createAppointment(String patientName, String patientMobile, String appointTime, HealthProfessional appointDoctor) {
        //如果预约信息不全，则结束方法
        if ("".equals(patientName) || "".equals(patientMobile) || "".equals(appointTime) || appointDoctor == null){
            System.out.println("预约信息不全，预约失败！");
            return;
        }
        Appointment appointment = new Appointment(patientName, patientMobile, appointTime, appointDoctor);
        //新增预约，加入预约集合
        appointments.add(appointment);
        //加入到arrayList
    }

    /**
     * 打印预约
     */
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {//预约集合是空，打印没有预约
            System.out.println("没有预约信息");
        } else {//预约集合不为空，打印（显示）预约信息
            for (int i = 0; i < appointments.size(); i++){
                Appointment appointment = appointments.get(i);
                appointment.print();
            }
        }
    }

    /**
     * 取消预约
     */
    public static void cancelBooking(String patientMobile) {
        if(!appointments.isEmpty()){//先判断集合不是空的
            for (int i = 0; i < appointments.size(); i++){//遍历预约集合
                Appointment appointment = appointments.get(i);//取出元素
                if (appointment.getPatientMobile().equals(patientMobile)) {//如果集合中某条信息的手机号和传入的一致，则从集合中移除这条数据，也就是取消了
                    appointments.remove(appointment);
                    System.out.println("取消手机号为: " + patientMobile + "的预约信息");
                    return;
                }
            }
        }
        //执行到这里说明没找到相同手机号的预约信息或集合是空的，则打印错误
        System.out.println("没有找到手机号为: " + patientMobile + "的预约信息");
    }
}
