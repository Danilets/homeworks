package lambda.listener;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}