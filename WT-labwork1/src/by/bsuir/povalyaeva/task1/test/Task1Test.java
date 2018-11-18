package by.bsuir.povalyaeva.task1.test;

import by.bsuir.povalyaeva.task1.util.Util;
import org.junit.Assert;
import org.junit.Test;

public class Task1Test {
    @Test
    public void CountExpression() {
        Assert.assertEquals(1.569, Util.findExpressionValue(1,0),0.001);
        Assert.assertEquals(1.913, Util.findExpressionValue(1,1),0.001);
        Assert.assertEquals(-0.334,Util.findExpressionValue(-1,100),0.001);
    }
}
