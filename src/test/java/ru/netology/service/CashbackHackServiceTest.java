package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {
    @Test
    public void PurchaseEqualTo1001 () {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void PurchaseEqualTo999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void PurchaseEqualTo1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void PurchaseEqualTo600 () {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(600);
        int expected = 400;

        Assert.assertEquals(actual, expected);

    }
    }