package pattara.lasing.justcode_java.playground;

import java.util.List;

public interface Playground {

    public String getMyWelcome();

    /** 
     * Manipulation de chaîne : Anagrammes
     * Écrire une méthode qui vérifie si deux chaînes sont des anagrammes (mêmes lettres, ordre différent) 
     */
    public boolean anagrammes(String chaine1, String chaine2);

    /**
     * Collections : Doublons
     * À partir d'une liste d'entiers, retourner les éléments en double
    */
    public List<String> doublons(List<String> listInput);

    /**
     * Algorithmique : FizzBuzz
     * Afficher les nombres de 1 à 100
     * Si multiple de 3 - afficher "Fizz", si mutiple de 5 - afficher "Buzz", si multiple 3 et 5 - afficher "FizzBuzz"
     */
    public List<String> fizzBuzz();

    /**
     * Streams Java - Filtrage d'information
     * À partir d'une liste de noms, retourner les noms en majuscules, triés, sans doublons
     */
    public List<String> filtreNoms(List<String> listNoms);

}
