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
    public void shouldSetNextVol() {
        Radio radio = new Radio();
        radio.setCurrentVol(10);
        radio.nextVol();
        assertEquals(10, radio.getCurrentVol());
    }

    @Test
    public void shouldSetNextVol02() {
        Radio radio = new Radio();
        radio.setCurrentVol(7);
        radio.nextVol();
        assertEquals(8, radio.getCurrentVol());
    }

    @Test
    public void shouldSetPrevVol() {
        Radio radio = new Radio();
        radio.setCurrentVol(0);
        radio.prevVol();
        assertEquals(0, radio.getCurrentVol());
    }

    @Test
    public void shouldSetPrevVol02() {
        Radio radio = new Radio();
        radio.setCurrentVol(7);
        radio.prevVol();
        assertEquals(6, radio.getCurrentVol());
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.nextStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation02() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation02() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prevStation();
        assertEquals(1, radio.getCurrentStation());
    }
}
