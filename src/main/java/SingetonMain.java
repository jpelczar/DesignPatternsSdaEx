public class SingetonMain {
    public static void main(String[] args) {
       ConfigHelper.getInstance().getConfigValue("log.tag");
    }
}
