package com.github.dognjen.factories;

import com.github.dognjen.clients.cred.ExchangeCredentials;
import com.github.dognjen.enums.CryptoExchange;
import com.github.dognjen.clients.BittrexClient;

/**
 * Created by Dejan on 02/01/2018.
 */
public class ExchangeFactory {

    public static Exchange create(CryptoExchange exchange, ExchangeCredentials credentials) {

        switch (exchange){
            case BITTREX:
                return new BittrexClient(credentials);
            case BITFINEX:
                return null;
            case COINBASE:
                return null;
            default:
                return null;
        }

    }
}
