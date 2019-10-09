package rook;

import org.junit.Assert;
import org.junit.Test;

public class RookMovesTest {

    @Test
    public void rookMovesTest(){
        Assert.assertEquals(1,RookMoves.findAnswer(8,8,"A1","B3"));
    }

}
