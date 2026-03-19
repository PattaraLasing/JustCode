package pattara.lasing.justcode_java.playground;

import java.util.Arrays;
import java.util.List;

public class PlaygroundImpl implements Playground {

    private final String WELCOME = "Welcome to the Playground follow me !";

    @Override
    public String getMyWelcome() {
        return this.WELCOME;
    }

    @Override
    public boolean anagrammes(String chaine1, String chaine2) {
        if (chaine1.length() != chaine2.length()) {
            return false;
        }
        
        char[] charsChaine1 = chaine1.toCharArray();
        char[] charsChaine2 = chaine2.toCharArray();
        
        Arrays.sort(charsChaine1);
        Arrays.sort(charsChaine2);
        
        return Arrays.equals(charsChaine1, charsChaine2);
    }

    @Override
    public List<String> doublons(List<String> listInput) {
        return null;
    }

    @Override
    public List<String> fizzBuzz() {
        return null;
    }

    @Override
    public List<String> filtreNoms(List<String> listNoms) {
        return null;
    }
}
