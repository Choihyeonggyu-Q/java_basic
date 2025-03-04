package java1Week;
public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.maker = "Benz";
        car1.model = "C_class";
        car1.price = 100;

        Car car2 = new Car();
        car2.maker = "Audi";
        car2.model = "A8";
        car2.price = 200;

        System.out.println("첫번째 두번째 차의 메이커는 : "+ car1.maker +" "+ car2.maker);
        System.out.println("첫번째 두번째 차의 모델은 : "+ car1.model +" "+ car2.model);
        System.out.println("첫번째 두번째 차의 가격은 : "+ car1.price +" "+ car2.price);
        // 인스턴스 소유의 메서드 호출하기
        car1.drive();
        String result = car1.repaire();
        System.out.println("반환값 출력 : "+ result);
        car1.perfomence("고급휘발유");
        String result1 = car1.speed(200);
        System.out.println(result1);
    }
}
