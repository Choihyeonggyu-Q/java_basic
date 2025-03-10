package siat.study.oop.domain.builder;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class ManagerVO extends PersonVO{
    private String dept;

    public String manInfo(){
        return super.perInfo() + "\t부서는 : " + this.getDept();
    }

    public String perInfo(){
        return super.perInfo() + "\t부서는 : " + this.getDept();
    }
}
