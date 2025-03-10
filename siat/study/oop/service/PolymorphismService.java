package siat.study.oop.service;

import siat.study.oop.domain.constructor.PersonVO;
import siat.study.oop.domain.constructor.StudentVO;
import siat.study.oop.domain.constructor.TeacherVO;
import siat.study.oop.domain.constructor.ManagerVO;
import siat.study.oop.util.EnumOop;


/*
    역할
    - 객체 생성(Stu, Tea, Man) 담당
    - 생성된 객체를 배열에 관리
    - 사용자의 요천에 따른 업무로직을 수행
*/
public class PolymorphismService {
    // private int num;
    // private String name;
    // private String addr;
    
    private PersonVO [] perAry;
    private int idx; // 선언과 동시에 묵시적인 초기화가 된다

    public PolymorphismService(){
        //기본 생성자
        perAry = new PersonVO[10]; // 멤버변수 초기화
        idx = 0;
    }
    /*
    - 매개변수로 입력된 num 값에 따라서 생성할 객체타입이 달라진다.
    - 생성된 객체는 배열에 담는다. 
    */
    public void makePerson(EnumOop num, String name, String addr, String spea){

        switch (num.getDivision()) {
            case "강사":
                TeacherVO tea = new TeacherVO(name, addr, spea);
                setPerson(tea);
                break;
            case "학생":
                StudentVO stu = new StudentVO(name, addr, spea);
                setPerson(stu);
                break;
            case "매니저":
                ManagerVO emp = new ManagerVO(name, addr, spea);
                setPerson(emp);
                break;    
        }    
    }
    public void setPerson(PersonVO per){
        perAry[idx++] = per;
    }
    
    public PersonVO[] getPerson(){
        return perAry;
    }
    

}
