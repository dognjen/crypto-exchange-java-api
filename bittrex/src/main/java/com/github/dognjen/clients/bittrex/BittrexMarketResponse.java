package com.github.dognjen.clients.bittrex;

import java.util.List;

/**
 * Created by Dejan on 02/01/2018.
 */
public class BittrexMarketResponse extends BittrexResponse{

    private List<BittrexMarketContent> result;

    public List<BittrexMarketContent> getResult() {
        return result;
    }

    public void setResult(List<BittrexMarketContent> result) {
        this.result = result;
    }

}
