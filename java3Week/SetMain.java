package java3Week;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("jslim");
        set.add("siat");
        // set.add(1);
        // set.add(true);
        // set.add(1);
        System.out.println(set); // 중복된 데이터를 넣지 않아야만 할 떄 set을 사용한다.
        //generics 문법으로 명시적인 데이터 타입을 정해주는게 현업에서 사용된다.
    
        Object [] ary = set.toArray(); // Array 로 변환해서 셀 수 있도록 만들러준다.
        // String [] ary1 = (String [])(set.toArray()); // String []로 캐스팅 하면 이러한 방식으로 배열을 만들 수 있다.

        // 배열이라 이런 식으로 출력 가능
        for(Object str : ary){
            System.out.println( str );
        }
    }
}
