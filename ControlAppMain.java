import siat.study.control.ControlApp;

public class ControlAppMain {
    public static void main(String[] args) {
        ControlApp demo = new ControlApp();
        // String msg = demo.woodMan2(3);
        // System.out.println(msg);
        String result = demo.PassOrNonpass(39, 39, 39);
        System.out.println(result);
    }
}
