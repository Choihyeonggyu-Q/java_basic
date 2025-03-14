package siat.study.generic;

public class MoldApp<T> {
    // 외부에서 객체 생성을 할 때 타입을 지정해달라는 의미
    private T value;

    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
}
