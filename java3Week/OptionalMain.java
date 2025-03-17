package java3Week;
import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import siat.study.oop.domain.constructor.PersonVO;
/*
Optional ?
- 어떤 메서드가 null을 반환할 지 확신할 수 없거나, null 처리를 놓쳐서 발생하는 예외를 피할 수 있는 것 
- 예외처리를 더 쉽게 할 수 있어 코드의 가독성이 높아지고, 유지보수가 편리하다
- ver 8 현업에서 바로 사용 중
- Spring JavaPersistanceAPI (영속성을 관리하는 api)jpa
주의사항)
- NPE을 피하기 위해 만듦 
- 사용의도에 맞게 사용해야만 한다(null 할당 x)
- method의 반환타입으로 사용(전역 변수의 타입으로 사용 x, method의 매개변수 x)
- 기본 타입(primitive type) -> wrapper Class X -> 원시타입 용도로 만들어진 Optional 클래스 사용 
*/
public class OptionalMain {
    public static void main(String[] args) {
        System.out.println("main start");
        
        OptionalApp app = new OptionalApp();
        // List<String> lst = app.getStr();

        Optional<PersonVO> result = app.findById(1111L);
        if(result.isPresent()){
            System.out.println(result.get().perInfo());
        }

        System.out.println(">>>>");
        Optional<List<PersonVO>> list = app.getUsers();
        if(list.isPresent()){
            list.get().stream().forEach(System.out::println);
        }

        System.out.println(">>>> 생성방법");
        Optional<String> empty = Optional.empty(); // 값이 비어있는 옵셔널
        System.out.println(empty);
        Optional<String> opt = Optional.of("siat"); // 값을 담는 옵셔널 객체 생성

        System.out.println(opt.get());
        Optional<String> optNull = Optional.ofNullable(null);
        System.out.println(optNull);

        System.out.println(">>>>> 메서드 사용");

        if(opt.isPresent()){ // isPresent 메서드를 사용해서 값이 있는지 없는지를 먼저 확인하고 있으면 값을 꺼내써라
            System.out.println(opt.get());
        }
        // opt.ifPresent(str -> System.out.println(str));
        opt.ifPresentOrElse(str -> System.out.println(str),
                            () -> System.out.println("empty"));

        String value = empty.orElse("Default Value");
        System.out.println(value);
        System.out.println(empty.orElseGet(() -> "Default Value")); // 현장에서 많이 쓰이는 코드
        // empty.orElseThrow(() -> new RuntimeException("beacuase empty") ); // exception을 터뜨려라
        
        System.out.println(">>> filter");
        opt.filter(str -> str.length() > 4)
            .ifPresent(str -> System.out.println("filter value " + str));

        System.out.println(">>> map ");
        opt.map(String::toUpperCase)
            .ifPresent(str -> System.out.println(str));

        opt.flatMap(str -> Optional.of(str)
                                    .map(String::toUpperCase))
            .ifPresent(str -> System.out.println(str));

        
        System.out.println("main end");

    }
}
