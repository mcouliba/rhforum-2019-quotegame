package com.redhat.quotegame.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Model definition of a Portfolio
 * @author laurent
 */
public class Portfolio {
    private String username;
    private Double money = 1000D;
    private Map<String, Long> quotes = new HashMap<>();

    public Portfolio() {}

    public Portfolio(String username, Double money) {
        this.username = username;
        this.money = money;
    }

    public Portfolio(String username, Double money, List<Portfolio.QuotesMapEntry> quotes) {
        this.username = username;
        this.money = money;
        quotes.stream().forEach(entry -> this.quotes.put(entry.getKey(), entry.getValue()));
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public Double getMoney() {
        return money;
    }
    public void setMoney(Double money) {
        this.money = money;
    }

    public Map<String, Long> getQuotes() {
        return quotes;
    }
    public void setQuotes(Map<String, Long> quotes) {
        this.quotes = quotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
        return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Portfolio portfolio = (Portfolio) o;
        return username == portfolio.username;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    public static class QuotesMapEntry {
        private String key;
        private Long value;

        public QuotesMapEntry(String key, Long value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }
        public void setKey(String key) {
            this.key = key;
        }

        public Long getValue() {
            return value;
        }
        public void setValue(Long value) {
            this.value = value;
        }
    }
}