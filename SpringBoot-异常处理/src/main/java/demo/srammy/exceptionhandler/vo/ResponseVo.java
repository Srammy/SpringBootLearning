package demo.srammy.exceptionhandler.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

public class ResponseVo {

    private int responseCode;
    private String responseMessage;

    public int getResponseCode() {
        return responseCode;
    }

    public ResponseVo setResponseCode(int responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public ResponseVo setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
        return this;
    }

}
