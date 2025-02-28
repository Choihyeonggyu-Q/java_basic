package siat.study.view;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder

public class PostView {
    public void menu(){
        System.out.println(">>> Post Ver1.0 <<<");
        System.out.println("1. 게시글 등록");
        System.out.println("99. 프로그램 종료");
        
        System.out.print("원하시는 서비스를 선택하세요 : ");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        System.out.println("debug >> input number " + num);
    }     
    public void register(){

    }
    public void exit(){
        
    }
}
