package com.github.dognjen.clients.bittrex;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown=true)
public class BittrexMarketContent {

    @JsonProperty("MarketCurrency")
    private String marketCurrency;

    @JsonProperty("BaseCurrency")
    private String baseCurrency;

    @JsonProperty("MarketCurrencyLong")
    private String marketCurrencyLong;

    @JsonProperty("BaseCurrencyLong")
    private String baseCurrencyLong;

    @JsonProperty("MinTradeSize")
    private BigDecimal minTradeSize;

    @JsonProperty("MarketName")
    private String marketName;

    @JsonProperty("IsActive")
    private boolean isActive;

    @JsonProperty("Created")
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
