package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationAmount;

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public Radio() {
        stationAmount = 10;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation > stationAmount - 1 || newStation < 0) {
            return;
        }
        currentStation = newStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume > 100 || newVolume < 0) {
            return;
        }
        currentVolume = newVolume;
    }

    public void next() {
        if (currentStation == stationAmount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationAmount - 1;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
