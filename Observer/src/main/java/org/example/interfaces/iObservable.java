package org.example.interfaces;

import org.example.impl.Observer;

public interface iObservable {

    void addObserver(Observer obs);

    void removeObserver(Observer obs);

    void notificaObserveres();
}
