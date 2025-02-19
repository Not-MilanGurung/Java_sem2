package week5.breo;

public class Logger {
    public static Logger inst = new Logger();

    public static Logger getInstance(){
        return inst;
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Logger l1 = new Logger();
        Logger l2 = new Logger();
        Logger l3 = new Logger();
        System.out.println(l1.getInstance());
        System.out.println(l2.getInstance());
        System.out.println(l3.getInstance());
    }
}
