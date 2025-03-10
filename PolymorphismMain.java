import siat.study.oop.service.PolymorphismService;

// 1: 강사, 2: 학생, 3: 매니저
public class PolymorphismMain {
    public static void main(String[] args) {
        
        PolymorphismService service = new PolymorphismService();
        service.makePerson(1, "입정섭", "서울", "자바");
        service.makePerson(2, "박신형", "서울", "2018");
        service.makePerson(3, "이진규", "서울", "교육 운영팀");
    }   
}
