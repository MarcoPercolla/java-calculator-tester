package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TTTest {

    @Test
    public void testZeroDistance() {
        assertThrows(IllegalArgumentException.class, () -> new TrainTicket(0, 50));
    }

    @Test
    public void testZeroAge() {
        assertThrows(IllegalArgumentException.class, () -> new TrainTicket(1000, 0));
    }

    @Test
    public void testNegativeDistance() {
        assertThrows(IllegalArgumentException.class, () -> new TrainTicket(-1000, 50));
    }

    @Test
    public void testNegativeAge() {
        assertThrows(IllegalArgumentException.class, () -> new TrainTicket(1000, -50));
    }

    @Test
    public void testCalculatePrice() {
        TrainTicket ticket = new TrainTicket(1000, 50);
        double expectedPrice = 1000 * 0.21;
        assertEquals(expectedPrice, ticket.findPrice(), 0.0001);
    }

    @Test
    public void testCalculatePriceMin() {
        TrainTicket ticket = new TrainTicket(1000, 10);
        double expectedPrice = 1000 * 0.21 * 0.8;
        assertEquals(expectedPrice, ticket.findPrice(), 0.0001);
    }

    @Test
    public void testCalculatePriceMag() {
        TrainTicket ticket = new TrainTicket(1000, 80);
        double expectedPrice = 1000 * 0.21 * 0.6;
        assertEquals(expectedPrice, ticket.findPrice(), 0.0001);
    }




}
