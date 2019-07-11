package business;

import notice.EmailNotice;
import notice.PhoneNotice;
import notice.entity.Teacher;
import org.springframework.context.ApplicationContext;

public class IoCPricipal {
    public String notifyTeacher(ApplicationContext ctx){
        StringBuilder res = new StringBuilder();
        EmailNotice emailNoticeZhang = ctx.getBean("emailNoticeZhang",EmailNotice.class);
        emailNoticeZhang.sendMessage();
        Teacher teacherZhang = ctx.getBean("teacherzhang",Teacher.class);
        res.append(teacherZhang.getNotify()+"/n");

        PhoneNotice phoneNoticeWang = ctx.getBean("phoneNoticeWang",PhoneNotice.class);
        phoneNoticeWang.sendMessage();
        Teacher teacherWang = ctx.getBean("teacherwang",Teacher.class);
        res.append(teacherWang.getNotify());
        return res.toString();
    }


}
