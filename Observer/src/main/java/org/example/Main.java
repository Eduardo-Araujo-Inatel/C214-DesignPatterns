package org.example;

import org.example.impl.Observable;
import org.example.impl.Observer;

public class Main {
    public static void main(String[] args) {
        String phrase = "Isto é uma frase de teste para verificar o padrão Observer";
        String[] words = phrase.split("\\s+");

        Observable system = new Observable();

        Observer obs1 = new Observer(1);
        Observer obs2 = new Observer(2);

        system.addObserver(obs1);
        system.addObserver(obs2);

        for (String word : words) {
            system.addWord(word);
        }

        system.notificaObserveres();
        system.removeObserver(obs2);

        Observer obs3 = new Observer(3);
        String phrase2 = "Teste frase";

        system.addObserver(obs3);
        String[] words2 = phrase2.split("\\s+");

        for (String word : words2) {
            system.addWord(word);
        }

        system.notificaObserveres();
    }
}