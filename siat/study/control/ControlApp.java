package siat.study.control;

public class ControlApp {
    /*
     조건식)
     A or B 라는 행위를 기대할 수 있는 것
     if(조건식){
        조건에 대한 값이 true 일 때 수행하는 블럭
     } else {
        조건에 대한 값이 false일 때 수행하는 블럭
     }

     switch(값){
        case 값 : 
            구현
            break; -> break가 없으면 모든 case를 실행하게 된다.
        default :
            구현
     }
    */

    /*
     조건) 매개변수의 값이 1 ~ 3
     조건) 1 : 금도끼, 2 : 은도끼, 3 : 쇠도끼
     조건) 나무꾼이 제 도끼는 1번입니다. 라고 한다면? -> '거짓말을 하는구나' 메시지를 반환
     조건) 나무꾼이 제 도끼는 2번입니다. 라고 한다면? -> '거짓말을 하는구나' 메시지를 반환
     조건) 나무꾼이 제 도끼는 3번입니다. 라고 한다면? -> '정직하구나 너에게 모든 도끼를 주겠다' 메시지를 반환
     
     */
    // method
    public String woodMan(int num){
        String msg = null;
        if(num > 0 && num < 4){
            System.out.println("산신령이 나타났습니다!");

            if(num == 1){
                msg = "거짓말을 하는구나";
            }else if(num == 2){
                msg = "또 거짓말을 하는구나";
            }else{
                msg = "정직하구나 너에게 모든 도끼를 주겠다";
            }
            System.out.println("산신령이 연못으로 사라졌습니다!");
            
        }else{
            msg = "실패";
        }
        return msg;
    }

    public String woodMan2(int num){
        String msg = null;
        if(num > 0 && num < 4){
            System.out.println("산신령이 나타났습니다!");
            switch (num) {
                case 1:
                    msg = "거짓말을 하는구나";    
                    break;
                case 2:
                    msg = "또 거짓말을 하는구나";
                    break;
                case 3:
                    msg = "정직하구나 너에게 모든 도끼를 주겠다";
                    break;
                default :
                    break;
            }
            System.out.println("산신령이 연못으로 사라졌습니다!");
            
        }else{
            msg = "실패";
        }
        return msg;
    }
    /*
     Quiz)
     parameter   : kor, eng, math 
     return type : "합격", "불합격" 
     method name : PassOrNonpass
     합격의 조건)
     - 세 과목의 점수가 각각 40점 이상이면서
     - 평균이 60점 이상이면 합격
     - 아니면 불합격
    */
    public String PassOrNonpass(int kor, int eng, int math){
        String msg = null;
        double score = (kor + eng + math)/3;
        System.out.println("avg score = " + score);
            
        if ( (100 >= kor && kor >= 40) && (100 >= eng && eng >= 40) && (100 >= math && math >= 40)){
            if(score>=60){
                msg = "합격";
            }else{
                msg = "평균 점수 미달 불합격";
            }
        }else if(kor > 100 || eng > 100 || math > 100){
            msg = "과목 점수 입력 오류";
        }else{
            if(kor < 40){
                msg = "국어 점수 미달 불합격";
            }
            if(eng < 40){
                msg = "영어 점수 미달 불합격";
            }
            if(math < 40){
                msg = "수학 점수 미달 불합격";
            }
            if(kor < 40 && eng < 40){
                msg = "국어 영어 점수 미달 불합격";
            }
            if(kor < 40 && math < 40){
                msg = "국어 수학 점수 미달 불합격";
            }
            if(eng < 40 && math < 40){
                msg = "영어 수학 점수 미달 불합격";
            }
            if(eng < 40 && math < 40 && kor < 40){
                msg = "국어 영어 수학 점수 미달 불합격";
            }
        }
        return msg;
    }
}
