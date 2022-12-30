package com.hhparser.util;

import com.hhparser.models.Card;
import com.hhparser.models.Rank;
import com.hhparser.models.Suit;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CardsMapper {
    private final Map<String, Card> cards;

    public CardsMapper() {
        cards = initCards();
    }

    private Map<String, Card> initCards() {
        Map<String, Card> cardsDeck = new HashMap<>();

        cardsDeck.put("6c", new Card(Rank.SIX, Suit.CLUB));
        cardsDeck.put("6h", new Card(Rank.SIX, Suit.HEART));
        cardsDeck.put("6d", new Card(Rank.SIX, Suit.DIAMOND));
        cardsDeck.put("6s", new Card(Rank.SIX, Suit.SPADE));

        cardsDeck.put("7c", new Card(Rank.SEVEN, Suit.CLUB));
        cardsDeck.put("7h", new Card(Rank.SEVEN, Suit.HEART));
        cardsDeck.put("7d", new Card(Rank.SEVEN, Suit.DIAMOND));
        cardsDeck.put("7s", new Card(Rank.SEVEN, Suit.SPADE));

        cardsDeck.put("8c", new Card(Rank.EIGHT, Suit.CLUB));
        cardsDeck.put("8h", new Card(Rank.EIGHT, Suit.HEART));
        cardsDeck.put("8d", new Card(Rank.EIGHT, Suit.DIAMOND));
        cardsDeck.put("8s", new Card(Rank.EIGHT, Suit.SPADE));

        cardsDeck.put("9c", new Card(Rank.NINE, Suit.CLUB));
        cardsDeck.put("9h", new Card(Rank.NINE, Suit.HEART));
        cardsDeck.put("9d", new Card(Rank.NINE, Suit.DIAMOND));
        cardsDeck.put("9s", new Card(Rank.NINE, Suit.SPADE));

        cardsDeck.put("Tc", new Card(Rank.TEN, Suit.CLUB));
        cardsDeck.put("Th", new Card(Rank.TEN, Suit.HEART));
        cardsDeck.put("Td", new Card(Rank.TEN, Suit.DIAMOND));
        cardsDeck.put("Ts", new Card(Rank.TEN, Suit.SPADE));

        cardsDeck.put("Jc", new Card(Rank.JACK, Suit.CLUB));
        cardsDeck.put("Jh", new Card(Rank.JACK, Suit.HEART));
        cardsDeck.put("Jd", new Card(Rank.JACK, Suit.DIAMOND));
        cardsDeck.put("Js", new Card(Rank.JACK, Suit.SPADE));

        cardsDeck.put("Qc", new Card(Rank.QUEEN, Suit.CLUB));
        cardsDeck.put("Qh", new Card(Rank.QUEEN, Suit.HEART));
        cardsDeck.put("Qd", new Card(Rank.QUEEN, Suit.DIAMOND));
        cardsDeck.put("Qs", new Card(Rank.QUEEN, Suit.SPADE));

        cardsDeck.put("Kc", new Card(Rank.KING, Suit.CLUB));
        cardsDeck.put("Kh", new Card(Rank.KING, Suit.HEART));
        cardsDeck.put("Kd", new Card(Rank.KING, Suit.DIAMOND));
        cardsDeck.put("Ks", new Card(Rank.KING, Suit.SPADE));

        cardsDeck.put("Ac", new Card(Rank.ACE, Suit.CLUB));
        cardsDeck.put("Ah", new Card(Rank.ACE, Suit.HEART));
        cardsDeck.put("Ad", new Card(Rank.ACE, Suit.DIAMOND));
        cardsDeck.put("As", new Card(Rank.ACE, Suit.SPADE));

        return cardsDeck;
    }

    public Card getCard(String card) {
        if (cards.containsKey(card)) {
            return cards.get(card);
        }
        throw new IllegalArgumentException("unknown card string: " + card);
    }

    public List<Card> getCards(String cardsSource) {
        return Arrays
                .stream(cardsSource.split(" "))
                .map(this::getCard)
                .toList();
    }
}
