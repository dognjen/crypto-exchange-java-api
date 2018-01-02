package com.github.dognjen.clients.cred;

/**
 * Created by Dejan on 02/01/2018.
 */
public class ExchangeCredentials {

    public String apiKey;

    public String apiSecret;

    public ExchangeCredentials(String apiKey, String apiSecret) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }
}
