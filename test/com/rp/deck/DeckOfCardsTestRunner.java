package com.rp.deck;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by gkk1969 on 9/20/2016.
 */
public class DeckOfCardsTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Standard52CardDeckTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful())
        {
            System.out.println("All tests passed!");
        }
    }
}
