package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int id;
    private String name = "noname";
    private int minVol;
    private int maxVol = 100;
    private int currentVol;

    private int minStation;
    private int maxStation = 10;
    private int currentStation;

    public void setCurrentVol(int currentVol) {
        if (currentVol > maxVol) {
            currentVol = maxVol;
        }
        if (currentVol < minVol) {
            currentVol = minVol;
        }

        this.currentVol = currentVol;
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