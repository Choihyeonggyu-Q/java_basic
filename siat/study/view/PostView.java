package siat.study.view;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import siat.study.post.dao.PostDAO;
import siat.study.post.domain.PostRequestDTO;
import siat.study.post.domain.PostResponseDTO;

@Getter
@AllArgsConstructor
@Builder

public class PostView {

    private PostDAO dao;

    public void menu(){
        while (true) {
            System.out.println(">>> Post Ver1.0 <<<");
            System.out.println("1. 게시글 등록");
            System.out.println("2. 게시글 목록");
            System.out.println("99. 프로그램 종료");
            
            System.out.print("원하시는 서비스를 선택하세요 : ");
            Scanner scan = new Scanner(System.in);

            int num = scan.nextInt();
            System.out.println("debug >> input number " + num);
            switch (num) {
                case 1:
                    register();
                    break;
                case 2:
                    select();
                    break;
                case 99:
                    exit();
                    break;
                default:
                    break;
            }    
        }
    }
    
    public void register(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("제목 : ");
        String title = scan.nextLine();

        System.out.print("내용 : ");
        String content = scan.nextLine();
        
        System.out.print("작성자 : ");
        String writer = scan.nextLine();

        // 입력 데이터를 PostRequestDTO에 담고 DAO에 전달
        PostRequestDTO request = PostRequestDTO.builder()
                                        .title(title)
                                        .content(content)
                                        .writer(writer)
                                        .build();


        dao.insertRow(request);
    }

    public void select(){

        PostRequestDTO [] dtoary = dao.selectRow();   
        for(PostRequestDTO data : dtoary){
            if(data != null){
                System.out.println(data);
            }
        }
    }

    
    public void exit(){
        System.out.println("시스템을 종료합니다.");
        System.exit(0);
    }
}
