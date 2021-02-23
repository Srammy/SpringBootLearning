package demo.srammy.exceptionhandler.exception;


import demo.srammy.exceptionhandler.vo.ResponseVo;

public class CustomException extends RuntimeException{
    private ResponseVo responseVo;

    public CustomException(ResponseVo responseVo) {
        this.responseVo = responseVo;
    }

    public ResponseVo getResponseVo() {
        return responseVo;
    }

    public void setResponseVo(ResponseVo responseVo) {
        this.responseVo = responseVo;
    }
}