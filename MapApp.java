import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import siat.study.oop.domain.constructor.ManagerVO;
import siat.study.oop.domain.constructor.StudentVO;
import siat.study.oop.domain.constructor.TeacherVO;

public class MapApp {
    
    public Map getMap(){
        Map<String, List> map = new HashMap<>();

        List<StudentVO> stuLst = new ArrayList<>();
        stuLst.add(new StudentVO());
        stuLst.add(new StudentVO());

        List<TeacherVO> teaLst = new ArrayList<>();
        teaLst.add(new TeacherVO());
        teaLst.add(new TeacherVO());

        List<ManagerVO> empLst = new ArrayList<>();
        empLst.add(new ManagerVO());
        empLst.add(new ManagerVO());

        map.put("stu", stuLst);
        map.put("tea", teaLst);
        map.put("emp", empLst);
        return map;
    }

    public Map<String, String> dtoTOMap(){
        Map<String, String> map = new HashMap<>();
        map.put("id", "jslim");
        map.put("pwd", "jslim");
        map.put("name", "임섭순");
        map.put("id", "siat");
        // 중복된 key 값을 담을땐 마지막에 넣은 value로 덮어씌워진다
        return map;
    }
}
