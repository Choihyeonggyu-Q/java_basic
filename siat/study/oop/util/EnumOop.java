package siat.study.oop.util;

public enum EnumOop {
    // TEA, STU, EMP; // 상수
    
    //  라벨
    STU("학생"),
    EMP("매니저"),
    TEA("강사");

    private final String division;
    private EnumOop(String division){
        this.division = division;
    }
    public String getDivision(){
        return this.division;
    }
}
