package java3Week;
import siat.study.oop.domain.builder.PersonVO;
import siat.study.oop.service.PolymorphismBuilderService;
import siat.study.oop.util.EnumOop;

public class PolymorphismBuilderMain {
    public static void main(String[] args) {
        PolymorphismBuilderService service = PolymorphismBuilderService.builder()
                                                                        .perAry(new PersonVO[10])               
                                                                        .build();
        service.makePerson(EnumOop.TEA, "입정섭", "서울", "자바");
        service.makePerson(EnumOop.STU, "박신형", "서울", "2018");
        service.makePerson(EnumOop.EMP, "이진규", "서울", "교육 운영팀");

        // System.out.println(">>>>> 전체 출력");
        PersonVO perAry[] = service.getPerson();
        for(int i = 0; i < perAry.length; i++){
            PersonVO per = perAry[i];
            if(per != null){
                // System.out.println(per.perInfo());
            }
        }

        System.out.println("Quiz >>>>>>>");
        System.out.println(">>> 사용자 검색");
        PersonVO per = service.findPerson("이");
        if( per == null ){
            System.out.println("요청하신 사용자를 찾을 수 없습니다.");
        }else{
            System.out.println(per.perInfo());
        }
    }
}