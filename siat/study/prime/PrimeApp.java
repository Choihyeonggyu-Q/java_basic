package siat.study.prime;

import java.util.Scanner;

import lombok.Builder;

@Builder
public class PrimeApp {
    
    public String primeNumber(){
        /*
        소수란? 1과 자기 자신으로만 나누어지는 수
        - 판단 로직(for, if)
        - 0, 1 은 소수가 아니다.
        - 어떤 숫자가 소수인지를 판단하려면 2 ~ n 까지 차례대로 나누어 보고
        - 나머지가 0인 경우가 한번도 없을 때 그 수는 소수
        - 즉, n 보다 작은 자연수들로 나누어지는 방식 
         */
        String prime = null;
        System.out.println("소수 판별을 위해 숫자를 입력하세요");
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num == 0){
            prime = "0은 소수가 아닙니다.";
            return prime;
        }else if(num == 1){
            prime = "1은 소수가 아닙니다.";
            return prime;
        }
        else{
            for(int i = 2; i < num; i++){
                if((num%i) == 0){
                    prime = num + "은(는) 소수가 아닙니다.";
                    return prime;
                }
            }
            prime = num + "은(는) 소수입니다.";
        }
        return prime;
    }
}
