package com.github.dognjen.clients;

import com.github.dognjen.factories.Exchange;
import com.github.dognjen.clients.cred.ExchangeCredentials;

/**
 * Created by Dejan on 01/01/2018.
 */
public class BittrexClient extends Exchange {

    private String url = "https://bittrex.com/api/v1.1";

    private ExchangeCredentials credentials;

    public BittrexClient(ExchangeCredentials credentials){
        this.credentials = credentials;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
