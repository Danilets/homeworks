package lambda.listener;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorlistener = System.out::println;

        Worker worker = new Worker(listener, errorlistener);
        worker.start();
    }
}
