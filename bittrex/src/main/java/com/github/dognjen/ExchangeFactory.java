package com.github.dognjen;

import com.github.dognjen.exchange.Bittrex;

/**
 * Created by Dejan on 02/01/2018.
 */
public class ExchangeFactory {

    public static Exchange create(CryptoExchange exchange, ExchangeCredentials credentials) {

        switch (exchange){
            case BITTREX:
                return new Bittrex(credentials);
            case BITFINEX:
                return null;
            case COINBASE:
                return null;
            default:
                return null;
        }

    }
}
