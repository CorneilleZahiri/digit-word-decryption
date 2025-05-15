package src;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String decrypt = decryptage("hell4o th3ere");
        System.out.println(decrypt);
    }

    public static String decryptage(String message) {
        /*
         * Ce challenge consiste à transformer (décrypter) un message suivant les conditions ci-après :
         * Le message reçu est un ensemble de mots.
         * Parmi les mots, certains ou tous contiennent des chiffres [0, 9], pour décrypter le message, il faut
         * répéter la lettre qui précède immédiatement le chiffre. La lettre est répétée le nombre de chiffres fois
         * et le chiffre disparait.
         * Ensuite, renvoyer le message au complet à l'envers.
         * Exemple : message : world hel2o => après décryptage, on obtient hello world
         * NB: Aucun mot ne commence par un chiffre. Déjà contrôlé avant utilisation
         */

        // Ma logique
        /*
         * 1- Transformer le paramètre message en liste
         * 2- Parcourir la liste et appeler une fonction qui traite chaque mot
         * 3- Concernant la fonction qui traite chaque mot :
         *   a - Parcourir chaque caractère et appeler une fonction qui vérifie s'il existe de chiffre.
         *   b - Si le chiffre est trouvé, répéter le caractère qui le précède immédiatement le nombre du chiffre fois.
         *   c - Remplacer le nouveau mot par celui qui contenait le ou les chiffres
         */

        //Transformer le paramètre en liste
        List<String> myArray = Arrays.asList(message.strip().split(" "));

        //Créer une nouvelle liste sans chiffres
        List<String> newListWithOutDigit = new java.util.ArrayList<>(myArray.stream().map(Main::decompresseMot).toList());

        // Inverser les mots.
        Collections.reverse(newListWithOutDigit);

        return String.join((" "), newListWithOutDigit);
    }

    public static String decompresseMot(String mot) {
        String[] arrayCharacter = mot.strip().split("");

        for (int i = 0; i < arrayCharacter.length; i++) {
            if (Character.isDigit(arrayCharacter[i].charAt(0))) {

                //Répéter le caractère le nombre de fois (Formule => chaine.repeat(entier))
                arrayCharacter[i - 1] = String.valueOf(arrayCharacter[i - 1].charAt(0)).
                        repeat(Character.getNumericValue(arrayCharacter[i].charAt(0)));
                //Enlever le chiffre
                arrayCharacter[i] = "";
            }
        }

        return String.join((""), arrayCharacter);
    }
}