package java3Week;
/*
- 자바의 상수의 집합타입 : enum 
*/
public enum EnumApp {

    // public static final int TEA = 1;
    // public static final int STU = 2;
    // public static final int EMP = 3;
    
    // 위 처럼 하지 않고 밑에 처럼 정의만 해도 된다.
    // 상수들을 객체 타입으로 관리함
    // 단순하게 상수로도 사용이 가능하지만, 상수에 라벨링하는 것도 가능하다.
    STU("학생"),
    EMP("매니저"),
    TEA("강사");

    // 라벨링을 하고 싶으면 반드시 private 접근제어자를 가지는 생성자가 필요함
    // 멤버 변수도 반드시 상수로 만드어서 그 값을 반환하는 메서드를 만들어야한다.
    private final String division;
    private EnumApp(String division){
        this.division = division;
    }
    public String getDivision(){
        return this.division;
    }
    
}
