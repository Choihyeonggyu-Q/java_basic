package java2Week;
import siat.study.oop.domain.builder.ManagerVO;
import siat.study.oop.domain.builder.StudentVO;
import siat.study.oop.domain.builder.TeacherVO;

public class OOPBuilderMain {
    public static void main(String[] args) {
        /*
        @Builder
        @SuperBuilder(상속 관계에서 생성자에서 상속받은 필드에 대한 접근) 
        */
        StudentVO stu = StudentVO.builder()
                                .addr("혜화")
                                .name("최여명")
                                .stuId("2018")
                                .build();
        System.out.println( stu.perInfo());
        System.out.println( stu.stuInfo());

        TeacherVO tea = TeacherVO.builder()
                                .name("임정섭")
                                .addr("서초")
                                .subject("자바")
                                .build();
        System.out.println( tea.perInfo());
        System.out.println( tea.teacherInfo());

        ManagerVO man = ManagerVO.builder()
                                .name("이진규")
                                .addr("서초")
                                .dept("교육담당")
                                .build();
        System.out.println( man.perInfo());
        System.out.println( man.manInfo());
    }
}
