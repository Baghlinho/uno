package org.example.model.rules;

import org.example.model.card.Card;

public class MatchSymbolRule extends OrRuleDecorator {
    private final String symbol;

    public MatchSymbolRule(PlayCardRule rule, String symbol) {
        super(rule);
        this.symbol = symbol;
    }

    @Override
    public boolean check(Card card) {
        return super.check(card) || symbol.equals(card.getSymbol());
    }
}
