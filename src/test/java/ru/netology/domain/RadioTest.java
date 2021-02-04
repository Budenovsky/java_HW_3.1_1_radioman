package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio(
                13,
                "01",
                0,
                100,
                0,
                0,
                208,
                0
        );
        assertEquals(208, radio.getMaxStation());
    }

    @Test
    public void shouldGenerateDefault() {
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxStation());
    }


    @Test
    public void shouldSetCurrentVol() {
        Radio radio = new Radio();
        radio.setCurrentVol(-1);
        assertEquals(0,radio.getCurrentVol());
    }

    @Test
    public void shouldSetCurrentVol02() {
        Radio radio = new Radio();
        radio.setCurrentVol(151);
        assertEquals(100,radio.getCurrentVol());
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStation02() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationIf18() {
        Radio radio = new Radio(
                101,
                "18 stations",
                0,
                100,
                0,
                0,
                18,
                0
        );
        radio.setCurrentStation(-1);
        assertEquals(18, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextVol() {
        Radio radio = new Radio();
        radio.setCurrentVol(100);
        radio.nextVol();
        assertEquals(100, radio.getCurrentVol());
    }

    @Test
    public void shouldSetNextVol02() {
        Radio radio = new Radio();
        radio.setCurrentVol(15);
        radio.nextVol();
        assertEquals(16, radio.getCurrentVol());
    }

    @Test
    public void shouldSetPrevVol() {
        Radio radio = new Radio();
        radio.setCurrentVol(59);
        radio.prevVol();
        assertEquals(58, radio.getCurrentVol());
    }

    @Test
    public void shouldSetPrevVol02() {
        Radio radio = new Radio();
        radio.setCurrentVol(0);
        radio.prevVol();
        assertEquals(0, radio.getCurrentVol());
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation02() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationIf15() {
        Radio radio = new Radio(
                123,
                "08",
                0,
                100,
                0,
                0,
                15,
                0
        );
        radio.setCurrentStation(15);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStationIf30() {
        Radio radio = new Radio(
                124,
                "30 stations",
                0,
                100,
                0,
                0,
                30,
                0
        );
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(30, radio.getCurrentStation());
    }
}
