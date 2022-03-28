/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.math.BigDecimal;
import javax.swing.JButton;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class CalculateTest {
    
    public CalculateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setOperator method, of class Calculate.
     */
    @Test
    public void testSetOperator() {
        System.out.println("setOperator");
        int operator = 0;
        Calculate instance = new Calculate();
        instance.setOperator(operator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pressNumber method, of class Calculate.
     */
    @Test
    public void testPressNumber() {
        System.out.println("pressNumber");
        JButton button = null;
        Calculate instance = new Calculate();
        instance.pressNumber(button);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pressDot method, of class Calculate.
     */
    @Test
    public void testPressDot() {
        System.out.println("pressDot");
        Calculate instance = new Calculate();
        instance.pressDot();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pressClear method, of class Calculate.
     */
    @Test
    public void testPressClear() {
        System.out.println("pressClear");
        Calculate instance = new Calculate();
        instance.pressClear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Calculate.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Calculate instance = new Calculate();
        BigDecimal expResult = null;
        BigDecimal result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculate method, of class Calculate.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        Calculate instance = new Calculate();
        instance.calculate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pressResult method, of class Calculate.
     */
    @Test
    public void testPressResult() {
        System.out.println("pressResult");
        Calculate instance = new Calculate();
        instance.pressResult();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pressSqrt method, of class Calculate.
     */
    @Test
    public void testPressSqrt() {
        System.out.println("pressSqrt");
        Calculate instance = new Calculate();
        instance.pressSqrt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pressNegate method, of class Calculate.
     */
    @Test
    public void testPressNegate() {
        System.out.println("pressNegate");
        Calculate instance = new Calculate();
        instance.pressNegate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pressPercent method, of class Calculate.
     */
    @Test
    public void testPressPercent() {
        System.out.println("pressPercent");
        Calculate instance = new Calculate();
        instance.pressPercent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pressInvert method, of class Calculate.
     */
    @Test
    public void testPressInvert() {
        System.out.println("pressInvert");
        Calculate instance = new Calculate();
        instance.pressInvert();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pressMR method, of class Calculate.
     */
    @Test
    public void testPressMR() {
        System.out.println("pressMR");
        Calculate instance = new Calculate();
        instance.pressMR();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pressMC method, of class Calculate.
     */
    @Test
    public void testPressMC() {
        System.out.println("pressMC");
        Calculate instance = new Calculate();
        instance.pressMC();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pressMAdd method, of class Calculate.
     */
    @Test
    public void testPressMAdd() {
        System.out.println("pressMAdd");
        Calculate instance = new Calculate();
        instance.pressMAdd();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pressMSub method, of class Calculate.
     */
    @Test
    public void testPressMSub() {
        System.out.println("pressMSub");
        Calculate instance = new Calculate();
        instance.pressMSub();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
