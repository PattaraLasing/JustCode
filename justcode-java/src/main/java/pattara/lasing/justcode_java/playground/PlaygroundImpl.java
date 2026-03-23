package pattara.lasing.justcode_java.playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

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
    public Set<Integer> doublons(List<Integer> listInput) {
        Set<Integer> seenInt = new HashSet<>();
        Set<Integer> duplicatedInt = new HashSet<>();

        for (int element : listInput) {
            if (! (seenInt.add(element))) {
                duplicatedInt.add(element);
            }
        }

        return duplicatedInt;
    }

    @Override
    public List<String> fizzBuzz(int startInt, int endInt) {
        List<String> fizzBuzzList = new ArrayList<>();

        for (Integer i = startInt; i <= endInt; i++) {
            if (i % 15 == 0) {
                fizzBuzzList.add("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                fizzBuzzList.add("Fizz");
            }
            else if (i % 5 == 0) {
                fizzBuzzList.add("Buzz");
            }
            else {
                fizzBuzzList.add(i.toString());
            }
        }
        
        return fizzBuzzList;
    }

    @Override
    public List<String> filtreNoms(List<String> listNoms) {
        listNoms.stream().filter(Objects::nonNull);

        return null;
    }
}
