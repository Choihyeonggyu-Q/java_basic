/*
Collection API
- List(중복 허용, 순서존재, 객체를 요소로 갖는다, 가변길이) -> 객체만 담을 수 있음
- Set(중복허용 x, 순서존재 x, 객체를 요소로 갖는다, 가변길이)

- Map({ key : value } 가지고 잇는 자료구조)

Wrapper Class : int -> Integer, boolean -> Boolean
8개의 기본 데이터 타입은 Integer, Boolean 등으로 내부적으로 컴파일러가 boxing 시켜서 객체로 만들어 버린다.

박싱
언박싱
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import siat.study.oop.domain.constructor.ManagerVO;
import siat.study.oop.domain.constructor.PersonVO;
import siat.study.oop.domain.constructor.StudentVO;
import siat.study.oop.domain.constructor.TeacherVO;

public class ArrayListMain {
    public static void main(String[] args) {
        System.out.println("--->>> Array");
        int [] ary = new int[5];
        ary[0] = 10; ary[1] = 20; ary[2] = 30; ary[3] = 40; ary[4] = 50;
        // 정적이고 단일 데이터 타입만 담으면서 resizing 불가능
        System.out.println("length -> " + ary.length);
        // ary[2] = null; // null은 주소값이 없을 때만 null을 씀 따라서 int만 담는 int ary는 null이 못들어감
        ary[2] = 0;
        System.out.println(Arrays.toString(ary));

        System.out.println("--->>> List");
        List lst =  new Vector(); 
        // 기본적으로 10개씩 초기화 된다. -> 데이터를 넣으면 알아서 길이가 가변적으로 변화한다.
        lst.add(new StudentVO());
        lst.add("jslim");
        
        // 기본 타입이지만 가능 -> boxing이 되는 것 내부적으로
        lst.add(1);
        lst.add(true);
        
        // 가변 길이다. 
        System.out.println("length > " + lst.size());
        lst.remove(0);
        System.out.println("length > " + lst.size());
        System.out.println("get = " + lst.get(2));

        System.out.println(" >>> ");
        List<String> strLst = new ArrayList<String>(); // <>를 통해 담을 데이터 타입을 지정할 수 있다 generics
        strLst.add("jslim"); // -> add(String str) -> 매개변수의 타입을 강제시킴
        // strLst.add(1); 
        ///////////////////////////////////////
        /// -> compile 시점의 코드의 안정성 UP
        /// -> 불필요한 명시적인 casting 과정이 사라짐
        List<PersonVO> perLst = new ArrayList<PersonVO>();
        perLst.add(new StudentVO("jslim", "seoul", "2018"));
        perLst.add(new TeacherVO("jslim", "seoul", "java"));
        perLst.add(new ManagerVO("jslim", "seoul", "edu"));

        for(int i = 0 ; i < perLst.size(); i++){
            PersonVO obj = perLst.get(i);
            System.out.println(obj.perInfo());
        }

        System.out.println(" >>>>>>> enhanced loop");
        for(PersonVO entity : perLst){
            System.out.println(entity.perInfo());
        }

        System.out.println(" >>>> Iterator");
        Iterator<PersonVO> ite = perLst.iterator(); // iterator 사용시 받을 떄도 <> 사용해야만 함
        while (ite.hasNext()) { // -> hasNext 다음 값이 있다 없다를 판별해주는 메서드
            PersonVO per = ite.next(); // 현재의 요소를 꺼내고 다음 요소로 시점 변환
            System.out.println(per.perInfo());
        }
        
    }
}
