public class OperatorApp {
    // 클래스를 생성시 일단 생성자를 만든다.
    // 객체 생성 시 전역(멤버) 변수의 초기화를 도와주는 역할
    public OperatorApp(){

    }

    // 반환값 x, 매개변수 x, example01 method 정의
    public void example01(){
        System.out.println(" >>> 산술 연산자 +, -, *, /, %");
        int x = 100, y = 100, result = 0;
        System.out.println(" + " + (x + y));
        System.out.println(" - " + (x - y));
        System.out.println(" * " + (x * y));
        System.out.println(" / " + (x / y));
        System.out.println(" % " + (x % y));
        
        System.out.println(" >>> 증감 연산자 ++, -- ");
        System.out.println(" ++ " + (++x));
        int number = 20;
        result = ++number + 3;
        System.out.println(result);
        // System.out.println(" -- " + (--x));
        System.out.println(" >>> 삼항 연산자 ");
        String strMsg = (number > 0) ? "양수" : (number == 0) ? "0" : "음수";
        System.out.println("result = " + strMsg);
        System.out.println(" >>> 논리 연산자 &, |, !, &&, ||");
        System.out.println(" >>> 관계 연산자 >, >=, <, <=, ==, !=");
        
    }
    // 반환값 String, 매개변수 문자열 두개를 입력 받는 example02 정의
    public String example02(String a, String b){
        
        return a + "\t" + b;
    }

    // 반환값 String , 매개변수 int 하나 입력 받아 홀수인지 짝수인지 판별하는
    // example03 메서드 정의

    public String example03(int a){
        String str = ((a % 2) == 0) ? "짝수" : (a == 0) ? "0" : "홀수";
        return str;
    }
    // 반환값은 boolean, 매개변수는 정수값 하나를 입력받아서 
    // 입력받은 숫자가 1 ~ 100 사이인지를 판단하고 싶다면?
    // example04 메서드 정의
    public boolean example04(int a){
        boolean t = ((0 < a) && (a< 101)) ? true : false;
        return t;
    }
}
