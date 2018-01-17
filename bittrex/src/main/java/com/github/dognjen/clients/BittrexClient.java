package com.github.dognjen.clients;

import com.github.dognjen.clients.bittrex.BittrexMarketContent;
import com.github.dognjen.factories.Exchange;
import com.github.dognjen.clients.cred.ExchangeCredentials;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * Created by Dejan on 01/01/2018.
 */
public class BittrexClient extends Exchange {

    private String url = "https://bittrex.com/api/v1.1";

    private ExchangeCredentials credentials;

    private WebTarget target;

    private Client client;

    public BittrexClient(ExchangeCredentials credentials){
        this.credentials = credentials;

        client = ClientBuilder.newClient();

        target = client.target(url)
                .queryParam("apikey", credentials.getApiKey())
                .queryParam("nonce", credentials.getApiSecret());
    }

    @Override
    public String getUrl() {
        return url;
    }

    public void getMarkets() {
        BittrexMarketContent market = client.target("https://bittrex.com/api/v1.1/public/getmarkets").
                request(MediaType.APPLICATION_JSON_TYPE).get(BittrexMarketContent.class);


    }
/*
    public void getCurrencies() {

        List<MarketSummary> marketSummaries = client.target("https://bittrex.com/api/v1.1/public/getcurrencies").
                request(MediaType.APPLICATION_JSON_TYPE).get(MarketSummaryMsg.class).getResult();

    }

    public void getTicker() {


        List<MarketSummary> marketSummaries = client.target("https://bittrex.com/api/v1.1/public/getticker").
                request(MediaType.APPLICATION_JSON_TYPE).get(MarketSummaryMsg.class).getResult();

    }

    public List<MarketSummary> getMarketSummaries() {

        List<MarketSummary> marketSummaries = client.target("https://bittrex.com/api/v1.1/public/getmarketsummaries").
                request(MediaType.APPLICATION_JSON_TYPE).get(MarketSummaryMsg.class).getResult();

        return marketSummaries;

    }
*/
    public void getMarketSummary() {

    }

    public void getOrderBook() {

    }

    public void getMarketHistory() {

    }

    public void buyLimit() {

    }

    public void sellLimit() {

    }

    public void cancel() {

    }

    public void getOpenOrders() {

    }

    public void getBalances() {

    }

    public void getBalance() {

    }

    public void getDepositAddress() {

    }

    public void withdraw() {

    }

    public void getOrder() {

    }

    public void getOrderHistory() {

    }

    public void getWithdrawalHistory() {

    }

    public void getDepositHistory() {

    }
}
