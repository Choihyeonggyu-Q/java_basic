package siat.study.oop.abstraction;

// 인터페이스의 구성요소 : 상수 + 추상 메서드
public interface InterfaceApp {
    // public static final int STU = 1; // 기본적인 상수
    //상수는 묵시적인 초기화 X 반드시 값을 명시해야만 함
    public int STU = 1; // 인터페이스는 기본적으로 상수만 갖기 때문에  이렇게 선언한다.

    public void test(); // 구현부 x / 인터페이스는 abstract의 키워드가 들어가지 않아도 이 자체만으로 추상메서드로 본다.

    
    
} 
