package java3Week;
import java.util.List;
import java.util.Map;

import siat.study.oop.domain.constructor.ManagerVO;
import siat.study.oop.domain.constructor.PersonVO;
import siat.study.oop.domain.constructor.StudentVO;
import siat.study.oop.domain.constructor.TeacherVO;

public class MapMain {
    public static void main(String[] args) {
        MapApp app = new MapApp();

        Map<String, List> data = app.getMap();
        List<StudentVO> stuLst = data.get("stu");
        List<TeacherVO> teaLst = data.get("tea");
        List<ManagerVO> empLst = data.get("emp");

        for(StudentVO stu : stuLst){
            System.out.println(stu.perInfo());
        }
        for(TeacherVO tea : teaLst){
            System.out.println(tea.perInfo());
        }
        for(ManagerVO man : empLst){
            System.out.println(man.perInfo());
        }

        // Map은 dto로도 활용이 가능하다
        Map<String, String> dto = app.dtoTOMap();
        System.out.println(dto.get("id"));
        System.out.println(dto.get("pwd"));
        System.out.println(dto.get("name"));
    }
}
