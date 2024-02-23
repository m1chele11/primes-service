package edu.iu.mbarrant.primesservice.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeServiceTest {

    PrimeService primeService = new PrimeService();

    @Test
    void isPrime() {
        int n = 45;
        boolean expected = false;
        boolean actual = primeService.isPrime(n);
        assertEquals(expected, actual);
    }

    @Test
    void isPrime2() {
        int n = 69;
        boolean expected = false;
        boolean actual = primeService.isPrime(n);
        assertEquals(expected, actual);
    }

    @Test
    void isPrime3() {
        int n = 2;
        boolean expected = true;
        boolean actual = primeService.isPrime(n);
        assertEquals(expected, actual);
    }

}