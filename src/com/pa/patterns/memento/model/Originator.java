package com.pa.patterns.memento.model;

/**
 * @author André Sabino
 */
public interface Originator {
    public Memento createMemento();

    public void setMemento(Memento savedState);
}
