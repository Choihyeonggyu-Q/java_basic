package siat.study.post.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import siat.study.post.domain.PostRequestDTO;
import siat.study.post.domain.PostResponseDTO;

// xxxDAO(Data Access Object)로 DBMS와 작업을 전담하는 역할
@Builder
@RequiredArgsConstructor
@AllArgsConstructor // 멤버변수들을 인자로 받는 speacial construtor
public class PostDAO {

    private PostRequestDTO[] requestAry ;
    private int idx;
    
    public void insertRow(PostRequestDTO request){
        requestAry[idx++] = request;
    }

    // 원래는 response가 맞다
    public PostRequestDTO [] selectRow(){
        return requestAry;
        

        // PostResponseDTO entity = PostResponseDTO.builder()
        //                                     .title("강사를 고발합니다.")
        //                                     .writer("조영석")
        //                                     .content("구라야")
        //                                     .viewCnt(1)
        //                                     .build();

        // PostResponseDTO [] ary = new PostResponseDTO[10];
        // ary[0] = entity;
        // ary[1] = entity;
        // return ary ;
    }



}
