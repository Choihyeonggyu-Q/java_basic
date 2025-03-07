package siat.study.oop.domain.builder;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class PersonVO {
    // 공통의 요소
    private String name;
    private String addr;


    public String perInfo(){
        return "이름 : " + this.getName() + "\t" + "주소: " +this.getAddr();
    }
}
