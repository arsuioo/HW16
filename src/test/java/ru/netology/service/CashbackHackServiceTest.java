package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

     @Test
     public void testRemain() {
         CashbackHackService service = new CashbackHackService();

         int actual = service.remain(2000);
         int expected = 1000;
         assertEquals(actual, expected);

     }

    }