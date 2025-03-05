package siat.study.guess;

import java.util.Scanner;

import lombok.Builder;

@Builder
public class GuessGameApp {
    
    public static int generatorNan(){
        int answer = (int)(Math.random() * 100) + 1;
        return answer;
    }

    /*
    기회는 10회
     - 매개변수로 정답을 전달받고
     - 반환값으로
     -- 성공) xx 번째 정답을 맞췄습니다.
     -- 실패) 10번의 기회를 모두 소진했습니다.
     */
    public String gameFor(int answer){
        String check = null;
        
        Scanner scan = new Scanner(System.in);
        int i = 0;
        System.out.println("***************************");
        System.out.println("1 ~ 100 사이의 숫자를 맞춰보세요!");
        System.out.println("10번의 기회가 있습니다!");
        for(i = 0; i < 10; i++){
            
            System.out.println(i+1 + "번 째 기회입니다.");
            int choiceNum = scan.nextInt();
            if(answer == choiceNum){
                check = "정답입니다! " + (i+1) +"회 만에 정답을 맞추셨습니다!";
                break;
            }else if(choiceNum > answer){
                System.out.println("정답이 아닙니다. >>> DOWN");
            }else{
                System.out.println("정답이 아닙니다. >>> UP");
            }
        }

        if(i == 10){
            check = "10번의 기회를 전부 소진하셨습니다.";
        }
        return check;
    }

    public String gameWhile(int answer){
        String check = null;
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(i < 10){

            System.out.println(i+1 + "번 째 기회입니다.");
            int choiceNum = scan.nextInt();
            if(answer == choiceNum){
                check = "정답입니다! " + (i+1) +"회 만에 정답을 맞추셨습니다!";
                break;
            }else if(choiceNum > answer){
                System.out.println("정답이 아닙니다. >>> DOWN");
            }else{
                System.out.println("정답이 아닙니다. >>> UP");
            }
            // 증강
            i++;
        }
        if(i == 10){
            check = "10번의 기회를 전부 소진하셨습니다.";
        }

        return check;
    }

    public String gameDoWhile(int answer){
        String check = null;
        int i = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println(i+1 + "번 째 기회입니다.");
            int choiceNum = scan.nextInt();
            if(answer == choiceNum){
                check = "정답입니다! " + (i+1) +"회 만에 정답을 맞추셨습니다!";
                break;
            }else if(choiceNum > answer){
                System.out.println("정답이 아닙니다. >>> DOWN");
            }else{
                System.out.println("정답이 아닙니다. >>> UP");
            }
            // 증강
            i++;

        }while(i < 10);

        if(i == 10){
            check = "10번의 기회를 전부 소진하셨습니다.";
        }
        return check;
    }
}
