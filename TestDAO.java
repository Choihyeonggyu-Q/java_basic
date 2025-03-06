public class TestDAO {
    
    private String [] ary;
    private String name;

    // 객체 생성시 호출되는 메서드로 멤버변수를 초기화하는 역할
    public TestDAO(){
        // ary = new String[]("a", "v") -> 뒤에 소괄호로 바로 값을 할당할 수도 있다.
        ary = new String[10];
    }

    public void tester(){
        ary[0] = "-";
        System.out.println(ary[0]);
    }
}
