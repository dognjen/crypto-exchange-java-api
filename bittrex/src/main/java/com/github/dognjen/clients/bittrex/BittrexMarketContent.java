package com.github.dognjen.clients.bittrex;

import java.math.BigDecimal;

public class BittrexMarketContent {

    private String marketCurrency;
    private String baseCurrency;
    private String marketCurrencyLong;
    private String baseCurrencyLong;
    private BigDecimal minTradeSize;
    private String marketName;
    private boolean isActive;
    private String created;

    public String getMarketCurrency() {
        return marketCurrency;
    }

    public void setMarketCurrency(String marketCurrency) {
        this.marketCurrency = marketCurrency;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getMarketCurrencyLong() {
        return marketCurrencyLong;
    }

    public void setMarketCurrencyLong(String marketCurrencyLong) {
        this.marketCurrencyLong = marketCurrencyLong;
    }

    public String getBaseCurrencyLong() {
        return baseCurrencyLong;
    }

    public void setBaseCurrencyLong(String baseCurrencyLong) {
        this.baseCurrencyLong = baseCurrencyLong;
    }

    public BigDecimal getMinTradeSize() {
        return minTradeSize;
    }

    public void setMinTradeSize(BigDecimal minTradeSize) {
        this.minTradeSize = minTradeSize;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
