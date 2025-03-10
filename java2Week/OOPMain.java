package java2Week;
import siat.study.oop.domain.constructor.ManagerVO;
import siat.study.oop.domain.constructor.PersonVO;
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

        ManagerVO man = new ManagerVO("이진규", "sk", "교육");
        System.out.println( man.perInfo());
        System.out.println( man.manInfo());
        //////////////////////////////////////////////////////
        /// 
        PersonVO stu01 = new StudentVO("박신형1", "노량진", "2018");
        System.out.println( stu01.perInfo());
        System.out.println( ((StudentVO)stu01).stuInfo());

        PersonVO tea01 = new TeacherVO("박신형2", "노량진", "해부");
        System.out.println( tea01.perInfo());
        System.out.println( ((TeacherVO)tea01).teacherInfo());
        
        PersonVO man01 = new ManagerVO("박신형3", "노량진", "생명공학");
        System.out.println( man01.perInfo());
        System.out.println( ((ManagerVO)man01).manInfo());

        ///////////////////////
        /// 다형성을 사용하는 이유?
        System.out.println(" >>>>>>>> 다형성");
        PersonVO [] perAry = new PersonVO[3];
        perAry[0] = stu;
        perAry[1] = tea;
        perAry[2] = man;
        for(int i = 0; i < perAry.length; i++){
            PersonVO per = perAry[i];
            if(per instanceof StudentVO){
                System.out.println(((StudentVO)per).stuInfo());
            }
            if(per instanceof TeacherVO){
                System.out.println(((TeacherVO)per).teacherInfo());
            }
            if(per instanceof ManagerVO){
                System.out.println(((ManagerVO)per).manInfo());
            }
        }
        
    }
}

