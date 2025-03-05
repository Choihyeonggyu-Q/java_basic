package siat.study.machine;

import java.util.Scanner;

import lombok.Builder;

@Builder
//  builder를 쓰게 되면 생성자가 private으로 바뀌게 된다. 
public class VendingMachineApp {
    
    // 3가지 물품 판매 -> 콜라, 물, 비타민음료
    // public static final __ UPPER변수
    public static final int COKE  = 800;
    public static final int WATER = 500;
    public static final int VITA  = 1500;


    // 잔액 상수
    public static final int ONEHUNDREAD = 100;
    public static final int FIVEHUNDREAD = 500;
    public static final int ONETHOUSAND = 1000;
    
    // type = if, switch
    public void init(String type){
        switch (type) {
            case "if":
                menuIf();    
                break;

            case "switch":
                menuSwitch();
                break;

            default:
                System.out.println("정확한 타입을 입력하세요.. 프로그램을 종료합니다.");
                System.exit(0);
        }
    }
    public void menuIf(){
        System.out.println("debug >> if Ver Vending Menu");
        System.out.println("메뉴를 고르세요");
        System.out.println("1. 콜라(800), 2.생수(500), 3.비타민워터(1500)");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("원하시는 음료번호를 입력해주세요");
        int choiceNum = scan.nextInt();
        if(choiceNum == 1){
            // COKE
            System.out.println("투입구에 돈을 넣어주세요.");
            int inputMoney = scan.nextInt();
            if(inputMoney > COKE){
                // 잔액 반환
                int recharge = inputMoney - COKE;
                System.out.println("반환 금액 " + recharge);
                if(recharge < FIVEHUNDREAD){
                    // 500원 미만
                    // 100원짜리 여러개로 나누어서 게산
                    recharge = recharge/ONEHUNDREAD;         
                    System.out.println("100원짜리 " + recharge +"개 반환");

                }else if(recharge >= FIVEHUNDREAD && recharge < ONETHOUSAND){
                    // 500원이상 1000원 미만
                    // 500원짜리 하나 혹은 500원짜리 하나와 100원짜리 n개로 반환
                    if (recharge == FIVEHUNDREAD) {
                        // 500원만 반환하는 경우
                        recharge = recharge/FIVEHUNDREAD;
                        System.out.println("500원짜리 " + recharge +"개 반환");
                    }else{
                        // 500원과 n개의 100원짜리 반환의 경우
                        recharge = recharge - FIVEHUNDREAD;
                        recharge = recharge/ONEHUNDREAD;
                        System.out.println("500원짜리 1개와 100원짜리 " + recharge +"개 반환");
                    }
                }else if(recharge >= ONETHOUSAND){
                    // 1000원 이상
                    // 1000원으로 나누고 나머지가 존재할 때를 기준으로 작성
                    // 
                    if(recharge == ONETHOUSAND){
                        // 1000원만 반환하는 경우 -> test case 1800
                        recharge = recharge/ONETHOUSAND;
                        System.out.println("1000원짜리 " + recharge +"개 반환");
                    }else{
                        // 1000원과 n개의 500원 n개의 100원을 반환하는 경우 -> test case01 -> 1900 = 100/ test case02 -> 2400
                        int recharge02 = recharge%ONETHOUSAND;
                        recharge = recharge/ONETHOUSAND;
                        // 나머지 값을 정의할 변수 정의
                        
                        // System.out.println(recharge02);
                        if(recharge02 > FIVEHUNDREAD){
                            // 천원으로 나눈 나머지 값이 500원 이상일때
                            recharge02 = recharge02 - FIVEHUNDREAD;
                            recharge02 = recharge02/ONEHUNDREAD;
                            System.out.println("500원짜리 1개와 100원짜리 " + recharge02 +"개 반환");
                            System.out.println("1000원짜리 " + recharge +"개 반환");

                        }else if(recharge02 == FIVEHUNDREAD){
                            // 천원으로 나눈 나머지 값이 500원일때
                            recharge02 = recharge02/FIVEHUNDREAD;
                            System.out.println("500원짜리 " + recharge02 +"개 반환");
                            System.out.println("1000원짜리 " + recharge +"개 반환");

                        }else{
                            // 천원으로 나눈 나머지 값이 500원 미만일때
                            recharge02 = recharge02/ONEHUNDREAD;            
                            System.out.println("100원짜리 " + recharge02 +"개 반환");
                            System.out.println("1000원짜리 " + recharge +"개 반환");
                        }
                            
                    }
                }
            }
            else if(inputMoney == COKE){
                // 잔액 반환 x
                System.out.println("잔액 반환을 하지 않습니다");
            }
            else{
                // 추가 금액
                System.out.println(COKE-inputMoney + " 만큼 돈을 더 넣어주세요");
            }
        }else if(choiceNum == 2){
            // WATER
            System.out.println("투입구에 돈을 넣어주세요.");
            int inputMoney = scan.nextInt();
            if(inputMoney > WATER){
                // 잔액 반환
                int recharge = inputMoney - WATER;
                System.out.println("반환 금액 " + recharge);
                if(recharge < FIVEHUNDREAD){
                    // 500원 미만
                    // 100원짜리 여러개로 나누어서 게산
                    recharge = recharge/ONEHUNDREAD;         
                    System.out.println("100원짜리 " + recharge +"개 반환");

                }else if(recharge >= FIVEHUNDREAD && recharge < ONETHOUSAND){
                    // 500원이상 1000원 미만
                    // 500원짜리 하나 혹은 500원짜리 하나와 100원짜리 n개로 반환
                    if (recharge == FIVEHUNDREAD) {
                        // 500원만 반환하는 경우
                        recharge = recharge/FIVEHUNDREAD;
                        System.out.println("500원짜리 " + recharge +"개 반환");
                    }else{
                        // 500원과 n개의 100원짜리 반환의 경우
                        recharge = recharge - FIVEHUNDREAD;
                        recharge = recharge/ONEHUNDREAD;
                        System.out.println("500원짜리 1개와 100원짜리 " + recharge +"개 반환");
                    }
                }else if(recharge >= ONETHOUSAND){
                    // 1000원 이상
                    // 1000원으로 나누고 나머지가 존재할 때를 기준으로 작성
                    // 
                    if(recharge == ONETHOUSAND){
                        // 1000원만 반환하는 경우 -> test case 1800
                        recharge = recharge/ONETHOUSAND;
                        System.out.println("1000원짜리 " + recharge +"개 반환");
                    }else{
                        // 1000원과 n개의 500원 n개의 100원을 반환하는 경우 -> test case01 -> 1900 = 100/ test case02 -> 2400
                        int recharge02 = recharge%ONETHOUSAND;
                        recharge = recharge/ONETHOUSAND;
                        // 나머지 값을 정의할 변수 정의
                        
                        // System.out.println(recharge02);
                        if(recharge02 > FIVEHUNDREAD){
                            // 천원으로 나눈 나머지 값이 500원 이상일때
                            recharge02 = recharge02 - FIVEHUNDREAD;
                            recharge02 = recharge02/ONEHUNDREAD;
                            System.out.println("500원짜리 1개와 100원짜리 " + recharge02 +"개 반환");
                            System.out.println("1000원짜리 " + recharge +"개 반환");

                        }else if(recharge02 == FIVEHUNDREAD){
                            // 천원으로 나눈 나머지 값이 500원일때
                            recharge02 = recharge02/FIVEHUNDREAD;
                            System.out.println("500원짜리 " + recharge02 +"개 반환");
                            System.out.println("1000원짜리 " + recharge +"개 반환");

                        }else{
                            // 천원으로 나눈 나머지 값이 500원 미만일때
                            recharge02 = recharge02/ONEHUNDREAD;            
                            System.out.println("100원짜리 " + recharge02 +"개 반환");
                            System.out.println("1000원짜리 " + recharge +"개 반환");
                        }
                            
                    }
                }
            }
            else if(inputMoney == WATER){
                // 잔액 반환 x
                System.out.println("잔액 반환을 하지 않습니다");
            }
            else{
                // 추가 금액
                System.out.println(WATER-inputMoney + " 만큼 돈을 더 넣어주세요");
            }
        }else if(choiceNum == 3){
            // VITA
            System.out.println("투입구에 돈을 넣어주세요.");
            int inputMoney = scan.nextInt();
            if(inputMoney > VITA){
                // 잔액 반환
                int recharge = inputMoney - VITA;
                System.out.println("반환 금액 " + recharge);
                if(recharge < FIVEHUNDREAD){
                    // 500원 미만
                    // 100원짜리 여러개로 나누어서 게산
                    recharge = recharge/ONEHUNDREAD;         
                    System.out.println("100원짜리 " + recharge +"개 반환");

                }else if(recharge >= FIVEHUNDREAD && recharge < ONETHOUSAND){
                    // 500원이상 1000원 미만
                    // 500원짜리 하나 혹은 500원짜리 하나와 100원짜리 n개로 반환
                    if (recharge == FIVEHUNDREAD) {
                        // 500원만 반환하는 경우
                        recharge = recharge/FIVEHUNDREAD;
                        System.out.println("500원짜리 " + recharge +"개 반환");
                    }else{
                        // 500원과 n개의 100원짜리 반환의 경우
                        recharge = recharge - FIVEHUNDREAD;
                        recharge = recharge/ONEHUNDREAD;
                        System.out.println("500원짜리 1개와 100원짜리 " + recharge +"개 반환");
                    }
                }else if(recharge >= ONETHOUSAND){
                    // 1000원 이상
                    // 1000원으로 나누고 나머지가 존재할 때를 기준으로 작성
                    // 
                    if(recharge == ONETHOUSAND){
                        // 1000원만 반환하는 경우 -> test case 1800
                        recharge = recharge/ONETHOUSAND;
                        System.out.println("1000원짜리 " + recharge +"개 반환");
                    }else{
                        // 1000원과 n개의 500원 n개의 100원을 반환하는 경우 -> test case01 -> 1900 = 100/ test case02 -> 2400
                        int recharge02 = recharge%ONETHOUSAND;
                        recharge = recharge/ONETHOUSAND;
                        // 나머지 값을 정의할 변수 정의
                        
                        // System.out.println(recharge02);
                        if(recharge02 > FIVEHUNDREAD){
                            // 천원으로 나눈 나머지 값이 500원 이상일때
                            recharge02 = recharge02 - FIVEHUNDREAD;
                            recharge02 = recharge02/ONEHUNDREAD;
                            System.out.println("500원짜리 1개와 100원짜리 " + recharge02 +"개 반환");
                            System.out.println("1000원짜리 " + recharge +"개 반환");

                        }else if(recharge02 == FIVEHUNDREAD){
                            // 천원으로 나눈 나머지 값이 500원일때
                            recharge02 = recharge02/FIVEHUNDREAD;
                            System.out.println("500원짜리 " + recharge02 +"개 반환");
                            System.out.println("1000원짜리 " + recharge +"개 반환");

                        }else{
                            // 천원으로 나눈 나머지 값이 500원 미만일때
                            recharge02 = recharge02/ONEHUNDREAD;            
                            System.out.println("100원짜리 " + recharge02 +"개 반환");
                            System.out.println("1000원짜리 " + recharge +"개 반환");
                        }
                            
                    }
                }
            }
            else if(inputMoney == VITA){
                // 잔액 반환 x
                System.out.println("잔액 반환을 하지 않습니다");
            }
            else{
                // 추가 금액
                System.out.println(VITA-inputMoney + " 만큼 돈을 더 넣어주세요");
            }
        }else{
            System.out.println("정확한 음료번호를 입력하세요.. 프로그램을 종료합니다.");
            System.exit(0);
        }
        
        /*
         조건판단 및 잔액 반환을 고민해보자
         - 선택한 메뉴와 금액을 판단하여 조건처리
         - 잔액은 천원짜리, 오백원짜리, 백원짜리로 나누어서 생각.
         - 반환 금액 출력
        */
    }
    private int choiceNum;
    private int inputMoney;

    public void menu(){
        System.out.println("메뉴를 고르세요");
        System.out.println("1. 콜라(800), 2.생수(500), 3.비타민워터(1500)");

        Scanner scan = new Scanner(System.in);
        System.out.println("원하시는 음료번호를 입력해주세요");
        choiceNum = scan.nextInt();
        System.out.println("투입구에 돈을 넣어주세요.");
        inputMoney = scan.nextInt();
        
    }


    public void menuSwitch(){
        System.out.println("debug >> switch Ver Vending Menu");
        menu();
        int price = 0;
        switch (choiceNum) {
            case 1:
                price = COKE;
                break;
            case 2:
                price = WATER;
                break;
            case 3:
                price = VITA;
                break;
            default:
                System.out.println("정확한 음료번호를 입력하세요.. 프로그램을 종료합니다.");
                System.exit(0);
                break;
        }
        
        if (inputMoney < price) {
            System.out.println("금액을 더 넣어주세요");
        }else if(inputMoney == price){
            System.out.println("반환 금액이 없습니다.");
        }else{
            inputMoney = inputMoney - price;
            System.out.println("반환 금액은 " + inputMoney + "입니다.");
            System.out.printf("1000원 %d장 500원 %d개 100원 %d개", 
                            (inputMoney/1000),
                            ((inputMoney%1000)/500),
                            (((inputMoney)%1000)%500)/100);
        }
    }

}
