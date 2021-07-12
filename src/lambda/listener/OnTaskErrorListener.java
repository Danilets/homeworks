package lambda.listener;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}