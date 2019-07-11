package main;

import business.IoCPricipal;
import business.Pricipal;
import notice.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        IoCPricipal pricipal = new IoCPricipal();
        System.out.println(pricipal.notifyTeacher(ac));
        Teacher stu=(Teacher) ac.getBean("teacherzhang");
                 System.out.println(stu);
    }
}
