package siat.study.oop.domain.constructor;

public class PersonVO {
    // 공통의 요소
    private String name;
    private String addr;

    // 각각의 특징적인 요소
    // private String subject;
    // private String stuId;
    // private String dept;

    public PersonVO(){
        // speacial constructor를 만들었기 때문에 명시적으로 기본 생성자를 정의해 놓는다.
    }
    // speacial constructor
    public PersonVO(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String perInfo(){
        return "이름 : " + this.getName() + "\t" + "주소: " +this.getAddr();
    }
}
