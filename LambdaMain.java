/*
람다식은 하나의 메서드를 식으로 표현하는 것
- 메서드 이름이 필요가 없다
- 익명 메서드(일급객체)
- 불필요한 코드를 줄이고, 가독성을 높이기 위함
- 자바에서의 람다식은 함수형 인터페이스 즉, Stream 같은 곳에서만 사용함 


-> 람다식이란 즉, 추상메서드로 정의만 되어 있으면, 
구현부에서 이름만 빌려 원하는 기능들을 원할때마다 삽입이 가능하다
따라서 일회성 함수이면서, 재활용성이 없다.

기존방식)
접근제어자 반환타입 메서드명([매개변수]){
}
public String getName(){
    return "siat";
}
람다식)
(매개변수) -> { 실행문 }
() -> "siat"

[java 제공하는 함수형 인터페이스]
- Supplier<T>
: 매개변수 없이 반환값만을 가지고 있는 함수형 인터페이스
- Consumer<T>
: 매개변수를 받아서 반환값이 없는 함수형 인터페이스
- Function<T, R>
: 매개변수를 받아서 반환값이 있는 함수형 인터페이스
- Predicate
: 매개변수를 받아서 boolean을 반환하는 함수형 인터페이스
*/

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import siat.study.lambda.SiatFunction;

public class LambdaMain {
    public static void main(String[] args) {
        SiatFunction lambdaFunction = (x, y) -> x > y ? x : y ; // 구현부에 삼항 연산자가 들어간 람다식
        System.out.println(lambdaFunction.max(100, 100));

        SiatFunction lambdaSumFunction = (x, y) -> x + y ; // 구현부에 삼항 연산자가 들어간 람다식
        System.out.println(lambdaSumFunction.max(100, 100));

        Supplier<String> supplier = () -> "siat";
        System.out.println(supplier.get());

        Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
        consumer
            .andThen(System.out::println)
            .accept("jslim siat");
            // andThen으로 출력하고 accept로 받는 구조라 순서가 바뀌면 안됨
        
        Function<String, Integer> function = (str) -> str.length();
        int len = function.apply("jslim siat");
        System.out.println(len);

        Predicate<String> predicate = (str) -> str.equals("siat");
        boolean flag = predicate.test("siat");
        System.out.println(flag);
    }
}
