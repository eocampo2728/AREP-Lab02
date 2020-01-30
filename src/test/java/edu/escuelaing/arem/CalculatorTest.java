package edu.escuelaing.arem;

import static org.junit.Assert.*;

import edu.escuelaing.arem.designprimer.Calculator;
import edu.escuelaing.arem.designprimer.LinkedList;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for the calculator class.
 * @author eduardo.ocampo
 */

public class CalculatorTest {
    
    
    @Test
    public void shouldCalculateMeanEx1() {
        Double target = 550.6;
        LinkedList list = new LinkedList();
        list.add(160);
        list.add(591);
        list.add(114);
        list.add(229);
        list.add(230);
        list.add(270);
        list.add(128);
        list.add(1657);
        list.add(624);
        list.add(1503);

        assertTrue(target == Calculator.mean(list));
    }

    @Test
    public void shouldCalculateMeanEx2() {
        Double target = 60.32;
        LinkedList list = new LinkedList();
        list.add(15.0);
        list.add(69.9);
        list.add(6.5);
        list.add(22.4);
        list.add(28.4);
        list.add(65.9);
        list.add(19.4);
        list.add(198.7);
        list.add(38.8);
        list.add(138.2);

        assertTrue(target == Calculator.mean(list));
    }
    
    @Test
    public void shouldCalculateStandardDeviation1() {
        Double target = 572.03;
        LinkedList list = new LinkedList();
        list.add(160);
        list.add(591);
        list.add(114);
        list.add(229);
        list.add(230);
        list.add(270);
        list.add(128);
        list.add(1657);
        list.add(624);
        list.add(1503);

        assertTrue(target == Calculator.standardDeviation(list));
    }
    
    @Test
    public void shouldCalculateStandardDeviation2() {
        Double target = 62.26;
        LinkedList list = new LinkedList();
        list.add(15.0);
        list.add(69.9);
        list.add(6.5);
        list.add(22.4);
        list.add(28.4);
        list.add(65.9);
        list.add(19.4);
        list.add(198.7);
        list.add(38.8);
        list.add(138.2);

        assertTrue(target == Calculator.standardDeviation(list));
    }
}
