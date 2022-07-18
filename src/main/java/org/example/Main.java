package org.example;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setCurrentVolume(0);
        System.out.println(radio.getCurrentStation());
        System.out.println(radio.getCurrentVolume());
    }
}