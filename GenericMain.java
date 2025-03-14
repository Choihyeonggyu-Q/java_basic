/*
제너릭?
- 컴파일 시점의 타입의 안정성
- 불필요한 캐스팅 지양
- 여러 데이터 타입을 표준화한 클래스를 만들 수 있다.
T : type
K : 키
V : 값
E : 요소의 타입
*/

import java.util.ArrayList;
import java.util.List;

import siat.study.generic.Golf;
import siat.study.generic.MoldApp;
import siat.study.generic.ShortTrack;
import siat.study.generic.Skating;
import siat.study.generic.SpeedSkating;
import siat.study.generic.Sports;

public class GenericMain {
    public static void main(String[] args) {
        // List<String> list = new ArrayList<>(); // 리스트 계열의 컬렉션을 만드는 코드      
        String [] strAry = new String[]{"siat", "java", "itc", "python"};
        Integer [] intAry = new Integer[]{1,2,3,4,5};
        
        printAry(strAry);
        printAry(intAry);
        //////////////////
        /// 
        MoldApp<String> app01 = new MoldApp<>();
        app01.setValue("jslm");
        System.out.println(app01.getValue());
        
        MoldApp<Integer> app02 = new MoldApp<>();
        app02.setValue(123);
        System.out.println(app02.getValue());

        System.out.println("다형성");

        List<Sports> sportLst = new ArrayList<>();
        sportLst.add(new Golf());
        sportLst.add(new Skating());
        sportLst.add(new ShortTrack());
        sportLst.add(new SpeedSkating());

        System.out.println(">>>> 와일드 카드");
        /*
        <?> : 모든 타입을 허용한다.
        <? extends xxxxx> : 매개변수 선언 시 사용
        <? super xxxx> : 선언 시 사용할 수 있다.
        
        api는 이러한 형식을 사용하기 때문에 알아둬야만 한다.
        */
        List<? super Sports> cardLst = new ArrayList<>();
        cardLst.add(new Golf());
        cardLst.add(new Skating());
        cardLst.add(new ShortTrack());
        cardLst.add(new SpeedSkating());
    }
    // 제너릭의 문법 형식
    public static<T> void printAry(T [] ary){
        for( T e : ary){
            System.out.println( e );
        }
    }
}
