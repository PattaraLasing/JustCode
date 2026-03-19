package pattara.lasing.justcode_java.playground;

public class PlaygroundImpl implements Playground {

    private final String WELCOME = "Welcome to the Playground follow me !";

    @Override
    public String getMyWelcome() {
        return this.WELCOME;
    }
}
