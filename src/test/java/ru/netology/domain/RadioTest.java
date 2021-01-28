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
        radio.setVolPlus(999);
        assertEquals(10,radio.getVolPlus());
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

//    @Test
//    public void shouldSetRemoteStation() {
//        Radio radio = new Radio();
//        radio.setRemoteStation(8);
//        assertEquals(8, radio.getRemoteStation());
//    }
//
//    @Test
//    public void shouldSetRemoteStation2() {
//        Radio radio = new Radio();
//        radio.setRemoteStation(80);
//        assertEquals(0, radio.getRemoteStation());
//    }
}
