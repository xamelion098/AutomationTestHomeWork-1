package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void PurchaseEqualTo1001 () {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void PurchaseEqualTo999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void PurchaseEqualTo1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void PurchaseEqualTo600 () {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(600);
        int expected = 400;

        Assert.assertEquals(expected, actual);

    }
    }