package siat.study.lambda;

@FunctionalInterface // 어노테이션으로 functional interface를 붙이게 되면 
// 그 밑에 정의된 interface를 람다식으로 사용가능하다.
public interface SiatFunction {
    public int max(int x, int y);
    
} 
