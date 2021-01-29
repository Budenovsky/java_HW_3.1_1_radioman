package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSetCurrentVol() {
        Radio radio = new Radio();
        radio.setCurrentVol(11);
        assertEquals(10,radio.getCurrentVol());
    }

    @Test
    public void shouldSetCurrentVol2() {
        Radio radio = new Radio();
        radio.setCurrentVol(-4);
        assertEquals(0,radio.getCurrentVol());
    }

    @Test
    public void shouldSetVolPlus() {
        Radio radio = new Radio();
        radio.setCurrentVol(10);
        radio.setVolPlus(807);
        assertEquals(10,radio.getVolPlus());
    }

    @Test
    public void shouldSetVolPlus02() {
        Radio radio = new Radio();
        radio.setCurrentVol(7);
        radio.setVolPlus(0);
        assertEquals(8,radio.getVolPlus());
    }

    @Test
    public void shouldSetVolMinus() {
        Radio radio = new Radio();
        radio.setCurrentVol(10);
        radio.setVolMinus(0);
        assertEquals(9,radio.getVolMinus());
    }

    @Test
    public void shouldSetVolMinus2() {
        Radio radio = new Radio();
        radio.setCurrentVol(0);
        radio.setVolMinus(0);
        assertEquals(0,radio.getVolMinus());
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setNextStation(0);
        assertEquals(6,radio.getNextStation());
    }

    @Test
    public void shouldSetNextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation(0);
        assertEquals(0,radio.getNextStation());
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation(0);
        assertEquals(9,radio.getPrevStation());
    }

    @Test
    public void shouldSetPrevStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.setPrevStation(0);
        assertEquals(6,radio.getPrevStation());
    }
}
