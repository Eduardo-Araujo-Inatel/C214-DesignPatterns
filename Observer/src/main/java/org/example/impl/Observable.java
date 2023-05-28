package org.example.impl;

import java.util.ArrayList;
import java.util.List;
import org.example.interfaces.iObservable;


public class Observable implements iObservable {
    private List<String> words;
    private int totalWords, evenLengthWords, capitalizedWords;
    private List<Observer> clientes;

    public Observable() {
        clientes = new ArrayList<>();
        words = new ArrayList<>();
        totalWords = 0;
        evenLengthWords = 0;
        capitalizedWords = 0;
    }

    @Override
    public void addObserver(Observer obs) {
        clientes.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        if(clientes.contains(obs))
            clientes.remove(obs);
    }

    @Override
    public void notificaObserveres() {
        for (Observer Observer : clientes) {
            Observer.update(this);
        }
    }

    public void addWord(String word) {
        words.add(word);
        totalWords++;

        if (word.length() % 2 == 0) {
            evenLengthWords++;
        }

        if (Character.isUpperCase(word.charAt(0))) {
            capitalizedWords++;
        }
    }

    public int getTotalWords() {
        return totalWords;
    }

    public int getEvenLengthWords() {
        return evenLengthWords;
    }

    public int getCapitalizedWords() {
        return capitalizedWords;
    }

    public List<String> getWords() {
        return words;
    }

    public List<Observer> getClientes() {
        return clientes;
    }
}
