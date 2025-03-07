package siat.study.oop.domain.constructor;

public class StudentVO extends PersonVO{
    
    private String stuId;

    public StudentVO(){
    }
    
    //speacial constructor
    public StudentVO(String name, String addr, String stuId){
        // super(); // 상속관계에서 접근이 가능해지는 이유는 부모의 instance가 먼저 생성되기 때문 
        // //  super(); -> 부모의 생성자를 호출하는 키워드 명시적으로 쓰지않더라도 생략가능
        // super.setName(name); // this.라고 표현해도 되지만 가독성을 위해 super라고 표현한다.
        // super.setAddr(addr);

        super(name, addr); // personVO에 생성자가 있기 때문에 이런 방식으로 사용가능
        //  즉 super(); 란? -> 부모의 생성자
        
        this.setStuId(stuId);
    }

    public String getStuId() {
        return stuId;
    }
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String stuInfo(){
        return super.perInfo() + "\t" + "학번 : " +this.getStuId();
    }
}
