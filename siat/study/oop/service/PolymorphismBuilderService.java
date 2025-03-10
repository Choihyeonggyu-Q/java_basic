package siat.study.oop.service;

import lombok.Builder;
import siat.study.oop.domain.builder.ManagerVO;
import siat.study.oop.domain.builder.PersonVO;
import siat.study.oop.domain.builder.StudentVO;
import siat.study.oop.domain.builder.TeacherVO;
import siat.study.oop.util.EnumOop;

@Builder
public class PolymorphismBuilderService {
    
    private PersonVO perAry[];
    private int idx; // 선언과 동시에 묵시적인 초기화가 된다

    public void makePerson(EnumOop division, String name, String addr, String spea){
        switch (division.getDivision()) {
            case "강사":
                TeacherVO tea = TeacherVO.builder()
                                            .name(name)
                                            .addr(addr)
                                            .subject(spea)
                                            .build();
                setPerson(tea);
                break;
            
            case "매니저":
                ManagerVO emp = ManagerVO.builder()
                                            .name(name)
                                            .addr(addr)
                                            .dept(spea)
                                            .build();
                setPerson(emp);
                break;
                
            case "학생":
                StudentVO stu = StudentVO.builder()
                                            .name(name)
                                            .addr(addr)
                                            .stuId(spea)
                                            .build();
                setPerson(stu);
                break;
        
            default:
                break;
        }
    }
    public void setPerson(PersonVO per){
        perAry[idx++] = per;
    }
    
    public PersonVO[] getPerson(){
        return perAry;
    }
    
    public PersonVO findPerson(String name){
        PersonVO per = null;
        
        for(int i = 0; i < perAry.length; i++){
            per = perAry[i];
            if(per != null){
                if (per.getName().equals(name)) {
                    return per;
                }
            }
        }
        return null;
        
    }


    // Person 타입의 변수를 통해 배열을 생성 그 배열을 생성할때의 초기화 작업을 해줘야함
}
