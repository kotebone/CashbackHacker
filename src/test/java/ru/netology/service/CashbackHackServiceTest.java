package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain(){

        CashbackHackService cashback = new CashbackHackService();
        int amount = 750;

        int actual = cashback.remain(amount);
        int expected = 250;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainAboveLimit(){

        CashbackHackService cashback = new CashbackHackService();
        int amount = 1100;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainLowLimitBorder(){

        CashbackHackService cashback = new CashbackHackService();
        int amount = 999;

        int actual = cashback.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainAboveLimitBorder(){

        CashbackHackService cashback = new CashbackHackService();
        int amount = 1001;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainLimitReached(){

        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}