package siat.study.oop.domain.constructor;

public class TeacherVO extends PersonVO{
    private String subject;

    public TeacherVO(){

    }

    public TeacherVO(String name, String addr, String subject){
        super(name, addr);
        this.subject = subject;
    }
    public String teacherInfo(){
        return super.perInfo() + "\t과목은 : " + this.getSubject();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
