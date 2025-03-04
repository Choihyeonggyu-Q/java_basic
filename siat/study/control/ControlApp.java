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
}
