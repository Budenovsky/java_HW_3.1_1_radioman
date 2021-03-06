package ru.netology.domain;

public class Radio {
    private String name;
    private int minVol = 0;
    private int maxVol = 10;
    private int currentVol;

    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;

    private boolean on;

    public Radio() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinVol() {
        return minVol;
    }

    public void setMinVol(int minVol) {
        this.minVol = minVol;
    }

    public int getMaxVol() {
        return maxVol;
    }

    public void setMaxVol(int maxVol) {
        this.maxVol = maxVol;
    }

    public int getCurrentVol() {
        return currentVol;
    }

    public void setCurrentVol(int currentVol) {
        if (currentVol > maxVol) {
            currentVol = maxVol;
        }
        if (currentVol < minVol) {
            currentVol = minVol;
        }

        this.currentVol = currentVol;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }

        this.currentStation = currentStation;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void nextVol() {
        if (currentVol < maxVol) {
            currentVol++;
        }
    }

    public void prevVol() {
        if (currentVol > minVol) {
            currentVol--;
        }
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }
}
