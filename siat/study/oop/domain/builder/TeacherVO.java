package siat.study.oop.domain.builder;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class TeacherVO extends PersonVO{
    private String subject;

    public String teacherInfo(){
        return super.perInfo() + "\t과목은 : " + this.getSubject();
    }
}
