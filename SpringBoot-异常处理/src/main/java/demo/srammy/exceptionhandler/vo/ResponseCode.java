package demo.srammy.exceptionhandler.vo;

public enum ResponseCode {

    NOT_FOUND(404),//接口不存在
    NOT_SUPPORT(405),//请求方法不正确
    MISS_PARAM(400);//参数缺失

    private final int code;

    ResponseCode(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}