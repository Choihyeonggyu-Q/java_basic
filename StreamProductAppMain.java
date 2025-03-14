import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import siat.study.stream.ProductVO;

public class StreamProductAppMain {
    public static void main(String[] args) {
        /*
         요구 사항 명세서)
         1. 더미 데이터를 넣어서 ProductVO 10개의 객체를 생성
         2. Stream 복사
         3. 
         - 2025년에 생산한 모든 제품을 찾아 출력(오름차순 정렬, 가격ㅇ르 기준으로
         - 생산 지역이 부산인 곳을 출력
         - 제품 가격이 가장 높은 제품의 전보를 출력
         - 제품이름을 출력하라(오름차순 정렬)
         */

        ProductVO pVo1 = ProductVO.builder()
                                .prodName("a")
                                .location("부산")
                                .prodYear(2011)
                                .prodPrice(1)    
                                .build();
        
        ProductVO pVo2 = ProductVO.builder()
                                .prodName("ab")
                                .location("부산")
                                .prodYear(2025)
                                .prodPrice(2)    
                                .build();
                                
        ProductVO pVo3 = ProductVO.builder()
                                .prodName("abc")
                                .location("서울")
                                .prodYear(2025)
                                .prodPrice(3)    
                                .build();
                                
        ProductVO pVo4 = ProductVO.builder()
                                .prodName("abcd")
                                .location("광주")
                                .prodYear(2023)
                                .prodPrice(4)    
                                .build();
                                
        ProductVO pVo5 = ProductVO.builder()
                                .prodName("bcd")
                                .location("광명")
                                .prodYear(2022)
                                .prodPrice(5)    
                                .build();
    
        ProductVO pVo6 = ProductVO.builder()
                                .prodName("cde")
                                .location("부산")
                                .prodYear(2025)
                                .prodPrice(6)    
                                .build();
                                
        ProductVO pVo7 = ProductVO.builder()
                                .prodName("ad")
                                .location("대구")
                                .prodYear(2020)
                                .prodPrice(7)    
                                .build();
                                
        ProductVO pVo8 = ProductVO.builder()
                                .prodName("ad")
                                .location("울산")
                                .prodYear(2025)
                                .prodPrice(8)    
                                .build();
                    
        ProductVO pVo9 = ProductVO.builder()
                                .prodName("aaa")
                                .location("강원도")
                                .prodYear(2011)
                                .prodPrice(9)    
                                .build();
                    
        ProductVO pVo0 = ProductVO.builder()
                                .prodName("a")
                                .location("대전")
                                .prodYear(2010)
                                .prodPrice(10)    
                                .build();
        
        List<ProductVO> li = new ArrayList<>();
        li.add(pVo0);
        li.add(pVo1);
        li.add(pVo2);
        li.add(pVo3);
        li.add(pVo4);
        li.add(pVo5);
        li.add(pVo6);
        li.add(pVo7);
        li.add(pVo8);
        li.add(pVo9);

        System.out.println("부산");
        li.stream()
            .filter(lo -> lo.getLocation().equals("부산"))
            .forEach(System.out::println);
        
        System.out.println("2025");
        li.stream()
            .filter(ye -> ye.getProdYear() == 2025)
            .sorted(Comparator.comparingInt(ProductVO::getProdPrice))
            .forEach(System.out::println);

        System.out.println("price");
        li.stream()
            // .filter(pr -> pr.getProdPrice())
            .max(Comparator.comparingInt(ProductVO::getProdPrice))
            .ifPresent(System.out::println);
        
        System.out.println("name");
        li.stream()
            .map(ProductVO::getProdName)
            .sorted()
            .forEach(System.out::println);

    }
}
