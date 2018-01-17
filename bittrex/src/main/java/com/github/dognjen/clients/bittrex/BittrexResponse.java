package com.github.dognjen.clients.bittrex;

import java.util.List;

/**
 * Created by Dejan on 02/01/2018.
 */
public abstract class BittrexResponse {

    private boolean success;

    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
