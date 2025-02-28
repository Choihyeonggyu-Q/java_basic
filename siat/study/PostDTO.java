package siat.study;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor 
// 다섯개의 인자를 받는 special을 의미한다. 1-5개의 overloading이 가능해진다.
@Builder // 이걸 쓰기 위해선 반드시 위에 AllArgs가 필요하다.

public class PostDTO {
    // 멤버(전역) 변수
    private String   title;
    private String   regDate;
    private String   writer;
    private String   content;
    private int      viewCnt;

    
}
