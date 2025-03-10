import siat.study.oop.domain.constructor.PersonVO;
import siat.study.oop.service.PolymorphismService;
import siat.study.oop.util.EnumOop;

// 1: 강사, 2: 학생, 3: 매니저
public class PolymorphismMain {
    public static void main(String[] args) {
        
        PolymorphismService service = new PolymorphismService();
        service.makePerson(EnumOop.TEA, "입정섭", "서울", "자바");
        service.makePerson(EnumOop.STU, "박신형", "서울", "2018");
        service.makePerson(EnumOop.EMP, "이진규", "서울", "교육 운영팀");
        
        System.out.println(">>>>> 전체 출력");
        PersonVO perAry[] = service.getPerson();
        for(int i = 0; i < perAry.length; i++){
            PersonVO per = perAry[i];
            if(per != null){
                System.out.println(per.perInfo());
            }
        }
    } 
}
