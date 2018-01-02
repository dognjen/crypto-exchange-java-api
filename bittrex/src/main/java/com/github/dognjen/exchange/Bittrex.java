package com.github.dognjen.exchange;

import com.github.dognjen.Exchange;
import com.github.dognjen.ExchangeCredentials;

/**
 * Created by Dejan on 01/01/2018.
 */
public class Bittrex extends Exchange {

    private String url = "https://bittrex.com/api/v1.1";

    private ExchangeCredentials credentials;

    public Bittrex(ExchangeCredentials credentials){
        this.credentials = credentials;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
