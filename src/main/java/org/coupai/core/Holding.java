package org.coupai.core;

public class Holding {

    public Holding(int initialCoins, Deck deck) {
        this.numCoins = initialCoins;
        dealInitialHand(deck);
    }

    public void dealInitialHand(Deck deck) {
        cards[0] = deck.dealCard();
        cards[1] = deck.dealCard();
    }

    public String toString() {

    }

    public int getNumCoins() {
        return numCoins;
    }

    private int numCoins;
    private Card [] cards;
}
