package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

     @Test
   public void testRemain() {
        CashbackHackService bonus = new CashbackHackService();

        int actual = bonus.remain(800);
        int expected = 200;
        assertEquals(expected, actual);
    }
    @Test
    public void testRemainBonus() {
        CashbackHackService bonus = new CashbackHackService();

        int actual = bonus.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainError() {
        CashbackHackService bonus = new CashbackHackService();

        int actual = bonus.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    }
