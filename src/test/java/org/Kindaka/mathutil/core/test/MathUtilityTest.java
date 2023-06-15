/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.Kindaka.mathutil.core.test;

import static org.Kindaka.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author COMPUTER
 */
public class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {

        //assertEquals(69, 69);
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
    }

}
//DDT   LÀ MỘT PHẦN MỞ RỘNG CỦA CÁC UNIT TEST FRAMEWORK
//DATA DRIVEN TESTING
//      KO NHẦM VỚI TDD: TEST DRIVEN DEVELOPMENT
//                          VIẾT CODE VÀ VIẾT TEST CASE SONG HÀNH
//                          VỚI NHAU , ĐÃ HC XONG

// NHƯNG CODE TEST BỐC MÙI (BAD SMELLS) TRÙNG CODE NHIỀU 
// NÊN NGƯỜI TA CHẾ RA CÁCH VIẾT CODE TEST ĐẸP HƠN, GỌN HƠN, DỄ BẢO TRÌ HƠN