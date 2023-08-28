package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemain0IfAmount1000() {
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldRemain1000IfAmount0 () {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldRemain1IfAmount999() {
        assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldRemain999IfAmount1() {
        assertEquals(service.remain(1), 999);
    }
}