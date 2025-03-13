package siat.study.stream;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProductVO {
    private String prodName;
    private String location;
    private int prodYear;
    private int prodPrice;
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ProductVO [name=" + prodName + ", year=" + prodYear + ", price=" + prodPrice + ", location=" + location + "]";
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return this.hashCode();
    }
}
