// import siat.study.oop.domain.constructor.PersonVO;
import siat.study.oop.domain.builder.PersonVO;
import siat.study.oop.domain.constructor.ManagerVO;
import siat.study.oop.domain.constructor.StudentVO;
import siat.study.oop.domain.constructor.TeacherVO;

public class OOPMain {
    public static void main(String[] args) {
        ///// 생성자를 이용한 상속
        StudentVO stu = new StudentVO("박신형", "노량진", "2018");
        System.out.println( stu.perInfo());
        System.out.println( stu.stuInfo());

        TeacherVO tea = new TeacherVO("jslim", "siat", "코딩");
        System.out.println( tea.perInfo());
        System.out.println( tea.teacherInfo());

        ManagerVO man = new ManagerVO("이진섭", "sk", "교육");
        System.out.println( man.perInfo());
        System.out.println( man.manInfo());
        
    }
}

