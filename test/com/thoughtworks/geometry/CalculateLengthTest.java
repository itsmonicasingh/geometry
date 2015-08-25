package com.thoughtworks.geometry;

import junit.framework.Assert;
import org.junit.Test;

public class CalculateLengthTest {
    @Test
    public void test_for_calculating_distance(){
        CalculateLength length=new CalculateLength();
        double actual=length.calculate(1,2,3,4);
        Assert.assertEquals(actual,2.82884);
    }

}


