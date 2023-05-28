package org.example.impl;


import org.example.interfaces.iObserver;

public class Observer implements iObserver {

    int id;

    public Observer(int id) {
        this.id = id;
    }

    @Override
    public void update(Observable system) {
        System.out.println("ID: " + this.id);
        System.out.println("Total words: " + system.getTotalWords());
        System.out.println("Even length words: " + system.getEvenLengthWords());
        System.out.println("Capitalized words: " + system.getCapitalizedWords());
        System.out.println("-----");
    }
}