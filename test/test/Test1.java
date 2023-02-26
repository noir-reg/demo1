/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import demo.Demo;

/**
 *
 * @author Admin
 */
public class Test1 {

    @Test()
    public void testGetPowerForIntFunctionGivenRightArguementRunsWell() {
        Assert.assertEquals(Demo.getPowerForInt(2, 3), 8);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetPowerForIntFunctionGivenWrongArguementThrowsException() {
        Demo.getPowerForInt(2, -1);
    }
}
