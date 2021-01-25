package ru.netology.domain;

public class Radio {
    private String name;
    private int minVol = 0;
    private int maxVol = 10;
    private int currentVol;
//    int volPlus = currentVol + 1;
//    int volMinus = currentVol - 1;

    private int minStation = 0;
    private int maxStation = 9;

    private int remoteStation;
    private int currentStation = remoteStation;
//    int nextStation = currentStation + 1;
//    int prevStation = currentStation - 1;

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

    public int getRemoteStation() {
        return remoteStation;
    }

    public void setRemoteStation(int remoteStation) {
        if (remoteStation > maxStation) {
            return;
        }

        this.remoteStation = remoteStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
//            return minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
//            return maxStation;
        }

        this.currentStation = currentStation;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

}
