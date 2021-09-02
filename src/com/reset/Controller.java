package com.reset;

/*
‘Interface’ de um controle remoto. Os métodos são definidos como abstratos e codificados quando implementados na classe
que demanda a implementação dessa ‘interface’.
 */

public interface Controller { // Declaração de uma ‘interface’.
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void volumeUp();
    public abstract void volumeDown();
    public abstract void play();
    public abstract void pause();
}
