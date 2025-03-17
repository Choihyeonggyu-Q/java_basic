package java3Week;
import siat.study.oop.abstraction.TV;
import siat.study.oop.factory.TVFactory;

public class TVAppMain {
    public static void main(String[] args) {
        TVFactory factory = TVFactory.getInstance();
        
        TV tv = factory.getBrand("samsung");
        tv.powerOn();
    }
}
