package notice.entity;

public class Teacher {
    private String name;
    private String classtime;
    public String getNotify(){
        return name+"is in" + classtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasstime() {
        return classtime;
    }

    public void setClasstime(String classtime) {
        this.classtime = classtime;
    }
}
