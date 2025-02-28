package siat.study.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder

public class PostService {
    
    public String savePost() {
        System.out.println("debug >> sevice savePost call");
        return "게시글 작성이 완료되었습니다.";
    }
    public String updatePost(){
        System.out.println("debug >> sevice updatePost call");
        return "게시글 수정이 완료되었습니다.";    
    }
    public String deletePost(){
        System.out.println("debug >> sevice deletePost call");
        return "게시글 삭제가 완료되었습니다.";    
    }
}
