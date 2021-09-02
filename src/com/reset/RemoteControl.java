package com.reset;

public class RemoteControl implements Controller{ // A classe RemoteControl 'chama' a interface Controller para implementação
    private boolean on;
    private boolean playing;
    private int volume;

    public RemoteControl(){
        this.on = false;
        this.playing = false;
        this.volume = 50;
    }

    private boolean isPlaying() {
        return playing;
    }

    private void setPlaying(boolean playing) {
        this.playing = playing;
    }

    private boolean isOn() {
        return on;
    }

    private void setOn(boolean on) {
        this.on = on;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void turnOn() {
        if (!isOn()) {
            setOn(true);
        }
    }

    @Override
    public void turnOff() {
        if (isOn()) {
            setOn(false);
        }
    }

    @Override
    public void volumeUp() {
        if (getVolume()<100){
            setVolume(getVolume()+5);
        }
    }

    @Override
    public void volumeDown() {
        if (getVolume()>0){
            setVolume(getVolume()-5);
        }
    }

    @Override
    public void play() {
        if (!isPlaying()) {
            setPlaying(true);
        }
    }

    @Override
    public void pause() {
        if (isPlaying()){
            setPlaying(false);
        }
    }
}
