package lambda;

public class Main {
    public static void main(String[] args) {
        // Java中的lambda表达式
        Thread thread = new Thread(() -> {

        });
        thread.start();
    }
}
