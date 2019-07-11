package business;

import notice.EmailNotice;
import notice.PhoneNotice;
import notice.entity.Teacher;
import noticefactory.NoticeFactory;

public class Pricipal {
    public String notifyTeacher(){
        StringBuilder notifystring = new StringBuilder();
        EmailNotice emailNotice = (EmailNotice) NoticeFactory.getNotice("email");
        PhoneNotice phoneNotice = (PhoneNotice) NoticeFactory.getNotice("phone");

        Teacher teacherZhang = new Teacher();
        teacherZhang.setName("张老师");
        emailNotice.setTeacher(teacherZhang);
        emailNotice.setMessage("8:45上语文课");
        emailNotice.sendMessage();
        notifystring.append(teacherZhang.getNotify()+"\n");

        Teacher teacherWang = new Teacher();
        teacherWang.setName("王老师");
        phoneNotice.setTeacher(teacherWang);
        phoneNotice.setMessage("13:00上数学课");
        phoneNotice.sendMessage();
        notifystring.append(teacherWang.getNotify()+"\n");

        Teacher teacherLi = new Teacher();
        teacherLi.setName("李老师");
        phoneNotice.setTeacher(teacherLi);
        phoneNotice.setMessage("15:00上英语课");
        phoneNotice.sendMessage();
        notifystring.append(teacherLi.getNotify());

        return notifystring.toString();
    }
}
