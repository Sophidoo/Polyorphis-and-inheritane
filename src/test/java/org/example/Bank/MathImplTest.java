package org.example.Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathImplTest {
    @Test
    public void twoplutwomustbe4(){
        var mth = new MathImpl();
        assertEquals(4, mth.addTwo(2, 2));
    }

    @Test
    public void threeplus5mustbe8() {
        var mth = new MathImpl();
        assertEquals(8, mth.addTwo(5, 3));
    }

//    @Test
//    void force() {
//    }
//
//    @Test
//    void factorial() {
//    }
}