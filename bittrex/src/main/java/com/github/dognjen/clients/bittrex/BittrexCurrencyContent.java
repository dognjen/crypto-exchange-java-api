package com.github.dognjen.clients.bittrex;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class BittrexCurrencyContent {

    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("CurrencyLong")
    private String currencyLong;

    @JsonProperty("MinConfirmation")
    private short minConfirmation;

    @JsonProperty("TxFee")
    private double txFee;

    @JsonProperty("IsActive")
    private boolean isActive;

    @JsonProperty("CoinType")
    private String coinType;

    @JsonProperty("BaseAddress")
    private String baseAddress;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyLong() {
        return currencyLong;
    }

    public void setCurrencyLong(String currencyLong) {
        this.currencyLong = currencyLong;
    }

    public short getMinConfirmation() {
        return minConfirmation;
    }

    public void setMinConfirmation(short minConfirmation) {
        this.minConfirmation = minConfirmation;
    }

    public double getTxFee() {
        return txFee;
    }

    public void setTxFee(double txFee) {
        this.txFee = txFee;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    public String getBaseAddress() {
        return baseAddress;
    }

    public void setBaseAddress(String baseAddress) {
        this.baseAddress = baseAddress;
    }
}
