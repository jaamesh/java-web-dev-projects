package org.launchcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void testBracketsNotBalanced1() {
        System.out.println("not balanced results in ... " + BalancedBrackets.hasBalancedBrackets("[blah)"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[blah)"));
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    void failureTests() {
        Executable assertion1 = ()  -> Assertions.assertEquals(BalancedBrackets.hasBalancedBrackets("[}"), false);
        Executable assertion2 = ()  -> Assertions.assertEquals(BalancedBrackets.hasBalancedBrackets("[}"), false);
        Executable assertion3 = ()  -> Assertions.assertEquals(BalancedBrackets.hasBalancedBrackets("[hey yah]}"), false);
        Executable assertion4 = ()  -> Assertions.assertEquals(BalancedBrackets.hasBalancedBrackets("[flip mode}]"), false);
        Assertions.assertAll(assertion1, assertion2, assertion3, assertion4);
    }

}