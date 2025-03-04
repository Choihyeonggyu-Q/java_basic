package java1Week;
public class OperatorMain {
    public static void main(String[] args) {
        OperatorApp operatorApp = new OperatorApp();
        operatorApp.example01();
        
        String str = operatorApp.example02("red", "green");
        System.out.println("result = " + str);

        String num = operatorApp.example03(1);
        System.out.println(num);

        boolean t = operatorApp.example04(100);
        System.out.println(t);
    }
}
