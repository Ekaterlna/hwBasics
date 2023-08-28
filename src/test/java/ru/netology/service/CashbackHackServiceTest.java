package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemain0IfAmount1000() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldRemain1000IfAmount0 () {
        assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldRemain1IfAmount999() {
        assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldRemain999IfAmount1() {
        assertEquals(999, service.remain(1));
    }
}