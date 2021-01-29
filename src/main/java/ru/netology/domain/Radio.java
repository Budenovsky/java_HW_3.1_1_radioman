package ru.netology.domain;

public class Radio {
    private String name;
    private int minVol = 0;
    private int maxVol = 10;
    private int currentVol;
    private int volPlus;
    private int volMinus;

    private int minStation = 0;
    private int maxStation = 9;

    private int currentStation;
    private int nextStation;
    private int prevStation;

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

    public int getVolPlus() {
        return volPlus;
    }

    public void setVolPlus(int volPlus) {
        if (currentVol == maxVol) {
            this.volPlus = 10;
        } else {
            this.volPlus = currentVol + 1;
        }
    }

    public int getVolMinus() {
        return volMinus;
    }

    public void setVolMinus(int volMinus) {
        if (currentVol == minVol) {
            this.volMinus = 0;
        } else {
            this.volMinus = currentVol - 1;
        }
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

    public int getNextStation() {
        return nextStation;
    }

    public void setNextStation(int nextStation) {
        if (currentStation == maxStation) {
            this.nextStation = 0;
        } else {
            this.nextStation = currentStation + 1;
        }
    }

    public int getPrevStation() {
        return prevStation;
    }

    public void setPrevStation(int prevStation) {
        if (currentStation == minStation) {
            this.prevStation = 9;
        } else {
            this.prevStation = currentStation - 1;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

}
