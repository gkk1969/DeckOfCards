package com.rp.deck;

import com.rp.card.Card;
import com.rp.card.Color;
import com.rp.card.Rank;
import org.junit.Assert;

/**
 * Created by gkk1969 on 9/19/2016.
 */
public class Standard52CardDeckTest {

    private final Standard52CardDeck s52dcFullOrdered = new Standard52CardDeck();

    private Standard52CardDeck s52dc;
    private DeckOfHearts doh;

    @org.junit.Before
    public void setUp() throws Exception {
        s52dc = new Standard52CardDeck();
        doh = new DeckOfHearts();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        s52dc = null;
        doh = null;
    }

    @org.junit.Test
    public void shuffle() throws Exception {
        s52dc.shuffle();
        Assert.assertNotEquals(s52dc, s52dcFullOrdered);
    }

    @org.junit.Test
    public void ensureDeckHasOneCardLessWhenOneCardDealt() throws Exception {
        Card dealtCard = s52dc.dealOneCard();
        Assert.assertEquals(s52dc.size(), 51);
    }

    @org.junit.Test
    public void ensureDealtCardIsOneOf52Possible() throws Exception {
        Card dealtCard = s52dc.dealOneCard();
        Assert.assertTrue(s52dcFullOrdered.indexOf(dealtCard) >= 0);
    }

    @org.junit.Test
    public void ensureDealtCardIsNotPresentInDeckThatDealtIt() throws Exception {
        Card dealtCard = s52dc.dealOneCard();
        Assert.assertFalse(s52dc.indexOf(dealtCard) >= 0);
    }

    @org.junit.Test
    public void ensureDealingCardFromEmptyDeckImpossible() throws Exception {
        for (int c = 0; c < 52; c++) {
            s52dc.dealOneCard();
        }
        boolean emptyDeckExceptionThrown = false;
        try {
            s52dc.dealOneCard();
        }
        catch (Exception e)
        {
            emptyDeckExceptionThrown = (e instanceof EmptyDeckException);
        }
        Assert.assertTrue(emptyDeckExceptionThrown);
    }

    @org.junit.Test
    public void ensureShufflingOfEmptyDeckImpossible() throws Exception {
        for (int c = 0; c < 52; c++) {
            s52dc.dealOneCard();
        }
        boolean emptyDeckExceptionThrown = false;
        try {
            s52dc.shuffle();
        }
        catch (Exception e)
        {
            emptyDeckExceptionThrown = (e instanceof EmptyDeckException);
        }
        Assert.assertTrue(emptyDeckExceptionThrown);
    }

    @org.junit.Test
    public void ensureSwapWorks() throws Exception {
        Card theAceOfSpades = new Card(Rank.Ace, Color.Spades);
        Card queenOfHearts = new Card(Rank.Queen, Color.Hearts);

        s52dc.swap(theAceOfSpades, queenOfHearts);

        Assert.assertEquals(theAceOfSpades.getRank(), Rank.Queen);
        Assert.assertEquals(theAceOfSpades.getColor(), Color.Hearts);
        Assert.assertEquals(queenOfHearts.getRank(), Rank.Ace);
        Assert.assertEquals(queenOfHearts.getColor(), Color.Spades);
    }

    @org.junit.Test
    public void ensureAllCardsInDeckOfHeartsAreOfColorHearts() throws Exception {
        for (int c = 0; c < 8; c++) {
            Card dealtCard = doh.dealOneCard();
            Assert.assertTrue(dealtCard.getColor().equals(Color.Hearts));
        }
    }

}