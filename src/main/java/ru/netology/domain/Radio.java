package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;


    public void setNumberRadiostationChaning(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation || currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void selectingTheWrongRadioStationNumber() {
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = 0;

        } else {
            currentRadioStation += 1;
        }
    }

    public void changeTheStationByPrevButton() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = 9;

        } else {
            currentRadioStation -= 1;

        }

    }

    public void IncreaseVolume() {
        if (currentVolume == maxVolume) {
            currentVolume = 0;
        }

        currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = 0;

        } else {
            currentVolume -= 1;

        }
    }

    public int getCurrentVolume() {
        return currentVolume;

    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;

    }


    public int getCurrentRadioStation() {
        return currentRadioStation;

    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }
}










