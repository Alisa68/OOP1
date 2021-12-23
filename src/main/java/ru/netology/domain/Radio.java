package ru.netology.domain;

public class Radio {
    private int currentVolume;
    int maxVolume = 10;
    int minVolume = 0;

    private int currentRadioStation;
    int maxRadioStation = 9;
    int minRadioStation = 0;
    int selectedRadioChannel;


    public int NumberRadiostationChanging(int selectedRadioChannel) {
        if (selectedRadioChannel <= maxRadioStation && selectedRadioChannel >= minRadioStation) {
            currentRadioStation = selectedRadioChannel;

        }

        return currentRadioStation;
    }

    public void selectingTheWrongRadioStationNumber() {
        if (currentRadioStation == maxRadioStation) {
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


    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;

        } else {
            currentVolume += 1;

        }

    }


    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;

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

    public void SetTheRadioChannelToIndicateItsNumber(int selectedRadioChannel) {
        this.selectedRadioChannel = currentRadioStation;

        if (selectedRadioChannel <= maxRadioStation && selectedRadioChannel >= minRadioStation) {

            currentRadioStation = selectedRadioChannel;
        } else if (selectedRadioChannel == currentRadioStation) {
            return;
        }

    }

}





