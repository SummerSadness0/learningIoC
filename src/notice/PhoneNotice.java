package notice;

import notice.entity.Teacher;

public class PhoneNotice implements NoticeInterface {
    private Teacher teacher;
    String message;

    @Override
    public void sendMessage() {
        teacher.setClasstime(message + "邮件发送");
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
