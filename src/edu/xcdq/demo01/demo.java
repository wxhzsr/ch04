package edu.xcdq.demo01;

/**
 * @author zhangshenrui
 * @date 2021/4/22 17:03
 */
public class demo {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.zuoshoushu();
        doctor.eat();

        Nurse nurse = new Nurse();
        nurse.takeCare();
        nurse.eat();
    }
}
