package at.campus02;

import org.junit.Assert;
import org.junit.Test;

public class TestMeanValue {


    @Test
    public void checkIfTheMethodWorks(){
        //MeanValue.mean(4, 4);
        Assert.assertEquals(0, MeanValue.mean(-4, 4));
    }
    @Test
    public void checkIfOneNegativeNumberReturnsCorrectValue(){
        //MeanValue.mean(-4, 8);
        Assert.assertEquals(2, MeanValue.mean(-4, 8));
    }

    @Test
    public void checkIfBothNegativeNumbersReturnCorrectValue(){
        //MeanValue.mean(-4, -8);
        Assert.assertEquals(-6, MeanValue.mean(-4, -8));
    }
    @Test
    public void checkIfOneZeroReturnsCorrectValue(){
        //MeanValue.mean(0, 8);
        Assert.assertEquals(4, MeanValue.mean(0, 8));
    }
    @Test
    public void checkIfZeroAndNegativeNumberGiveCorrectValue(){
        //MeanValue.mean(0, -8);
        Assert.assertEquals(-5, MeanValue.mean(0, -10));
    }
    @Test
    public void checkIfDecimalCanBeCalculated(){
        //MeanValue.mean(0, -8);
        Assert.assertEquals(2, MeanValue.mean(2, 3));
    }











}
