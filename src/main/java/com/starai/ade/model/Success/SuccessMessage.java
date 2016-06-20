package com.starai.ade.model.Success;

import org.springframework.stereotype.Service;

/**
 * Created by niranjan on 6/1/16.
 */

@Service
public class SuccessMessage {


    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


    @Override
    public String toString() {
        return "SuccessMessage{" +
                "success=" + success +
                '}';
    }
}
