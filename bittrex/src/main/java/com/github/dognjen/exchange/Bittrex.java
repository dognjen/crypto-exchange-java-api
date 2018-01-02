package com.github.dognjen.exchange;

import com.github.dognjen.Exchange;

/**
 * Created by Dejan on 01/01/2018.
 */
public class Bittrex extends Exchange {

    private String url = "https://bittrex.com/api/v1.1";

    @Override
    public String getUrl() {
        return url;
    }
}
