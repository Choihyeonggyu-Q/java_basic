package java3Week;
import java.io.IOException;

public class ExceptionAppMain {
    public static void main(String[] args) throws Exception{
        ExceptionApp app = new ExceptionApp();
        // app.printAry(new String []{"jslim", " dff"});
        // ////////
        // String str = null;
        // try {
        //     str = app.inputStr();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } finally {
        //     System.out.println(" >>>> 예외 발생 여부와 상관없이 실행되는 블럭");
        // }
        // System.out.println( str );
    
        app.first(-1);
    }
}
