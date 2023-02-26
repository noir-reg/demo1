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
public class Test2 {
    @Test()
    public void testIsPrimeFunctionGivenRightArguementRunsWell(){
        Assert.assertEquals(Demo.isPrime(5),true);
    }
    
}
