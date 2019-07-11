package notice;

import notice.entity.Teacher;

public class EmailNotice implements NoticeInterface {
    private Teacher teacher;
    String message;

    @Override
    public void sendMessage() {
        teacher.setClasstime(message + "_邮件发送");
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
