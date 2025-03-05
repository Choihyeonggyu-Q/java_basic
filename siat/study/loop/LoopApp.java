package siat.study.loop;

import lombok.Builder;

/*
 반복 구문(for, while, do ~ while)
 - for : 반복 횟수가 정의되어 있을 때
 - while, do ~ while : 반복 횟수가 정의되어 있는 것이 아니라 어떤 상황이 올 때 까지 반복
 - while 반복 되지 않을 수도 있음
 - do ~ while 무조건 한 번은 반복을 수행
 - break, continue

for)
for(초기식; 조건식; 증감식){
}

while)
초기식
while(조건식){
    증감식
}

do ~ while)
초기식
do{
    증감식
}while(조건식)
*/
@Builder
// builder pattern을 주게 되면 외부에서 접근할 수 없도록 생성자에 private을 자동으로 걸어준다.
public class LoopApp {
    // 1에서 10의 합을 반환하는 method
    public int sumOneToTen(){
        int result = 0;
        for(int i = 0; i < 11; i++){
            result = result + i;
        }
        return result;
    }
    public int sumStartToEnd(int start, int end){
        int result = 0;
        for(int i = start; i < end+1; i++){
            result = result + i;
        }
        return result;
    }
    /*
     Quiz)
        sumStartTOEnd -> while, do ~ while 구문으로 변경
        sumStartTOEndWhile
        sumStartTOEndDoWhile

    */
    public int sumStartToEndWhile(int start, int end){
        int sum = 0;
        while(start <= end){
            sum = sum + start;
            start++;
        }
        return sum;
    }

    public int sumStartToEndDoWhile(int start, int end){
        int sum = 0;
        do{
            sum = sum + start;
            start++;
        }while(start <= end);
        return sum;
    }
    /*
     Quiz)
     parameter value -> 1 ~ 차례로 누적하여 합을 구하다가 ex) parameter = 10 -> 1~10 합
     입력 받은 값을 넘으면 중단하고
     마지막으로 더해진 값과 그 때 까지의 합을 출력하고 싶다면?
     입력값) 100 
     출력 예시) 14 105 
    */
    public void loopBreak(int number){
        int sum = 0;
        int checker = 0;
        for(int i = 1; sum < number; i++){
            sum = sum + i;
            if(sum > number){
                checker = i;
            }
        }
        System.out.println(checker);
        System.out.println(sum);
    }
    // 1~ 100 사이의 난수를 발생 시켜서 해당 난수까지의 합을 구한다면?
    public void sumRandom(){
        double ran = (int)(Math.random() * 100) + 1;
        System.out.println(ran);
        int sum = 0;
        for(int i = 1; i <= ran ; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    // 매개변수로 문자열을 입력받아서 문자 하나하나를 반복문을 이용해서 출력
    public void popStr(String str){
        System.out.println("debug >> params = " + str);
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i)+"\t");
        }
    }

    // method가 같은 class내에 정의된 다른 method를 호출
    public void gugudanRow(){
        for(int dan = 2; dan <= 9; dan++){
            gugudnaCol(dan);
        }
    }
    
    private void gugudnaCol(int dan){
        for(int col = 1; col < 10; col++){
            System.out.printf("%d * %d = %d\t",dan, col, (dan * col));
        }
        System.out.println();
    }

    public void gugudanTable(){
        for(int dan = 2; dan <= 9; dan++){
            for(int col = 1; col < 10; col++){
                System.out.printf("%d * %d = %d\t",dan, col, (dan * col));
            }
            System.out.println();
        }
    }

    // Quiz)
    // 이중 반복문을 이용해서 출력 예시처럼 출력하시오.
    /*
     출력 예시)
     23456
     34567
     45678
     56789
     678910
    */
    public void printIJ(){
        for(int i = 1; i < 6; i++){
            for(int j = 1; j < 6; j++){
                System.out.print(i+j);        
            }
            System.out.println();
        }
    }

}
// static -> 클래스의 소유
//  final -> 상수 외부 수정 불가
//  보편적으로 static final을 같이 씀