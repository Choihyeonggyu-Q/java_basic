public class EnumMain {
    public static void main(String[] args) {
        EnumApp division =  EnumApp.EMP;
        // EnumApp -> 변수 타입으로 선언 but, 참조타입이지만 객체 생성이 불가능하다.
        // 따라서 = EnumApp.EMP를 통해 상수로 선언
        if(division == EnumApp.EMP){
            // 라벨값을 반환받기 위한 메서드
            System.out.println(division.getDivision());
        }
    }
}
