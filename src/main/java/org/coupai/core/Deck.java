package org.coupai.core;

import java.util.Random;

public class Deck {
    public Deck(Random random) {
        this.random = random;
        cards = new Card [15];
        numLeft = 0;
        shuffle();
    }

    public Deck(Deck rhs) {
        this.cards = rhs.cards.clone();
        this.random = rhs.random;
        this.numLeft = rhs.numLeft;
    }

    public void shuffle() {
        int j = 0;
        for (int i = 0; i < 3; i++) {
            cards[j++] = new Card(Card.Type.AMBASSADOR);
            cards[j++] = new Card(Card.Type.ASSASSIN);
            cards[j++] = new Card(Card.Type.CAPTAIN);
            cards[j++] = new Card(Card.Type.CONTESSA);
            cards[j++] = new Card(Card.Type.DUKE);
        }
        numLeft = 15;
    }

    Card dealCard() {
        if (numLeft == 0) {
            throw new RuntimeException("Tried to deal from empty deck!");
        }
        int i = random.nextInt(numLeft);
        Card c = cards[i];
        cards[i] = cards[numLeft - 1];
        numLeft--;
        return c;
    }

    private Card cards[];
    private int numLeft;
    private Random random;
}
