package java1Week;
public class Teacher {
    
    // 전역변수 선언
    public String   name;
    public double   height;
    public int      age;
    public String   bloodType;
    public String   birthPlace;
    public boolean  isMarried;

    // 생성자 : Constructor
    // like a method
    // 반환 타입 X , 메서드 명은 클래스의 이름과 동일
    // 메서드처럼 직접적인 호출은 불가
    // 객체 생성시 호출 가능
    // 매개변수를 받지 않는 생성자를 기본 생성자(Default Constructor)
    public Teacher(){


    }

    // method
    public void smoke(){
        System.out.println("흡연을 한다.");
    }
    public void drive(int fuel){
        System.out.println(fuel + "만큼의 기름을 넣고 달린다. ");
    }
    public String golf(){
        System.out.println("골프를 친다.");
        int hole;
        hole = 1;
        return "추가된 홀은 " + hole;
    }

}
