package cn.vinsonws.home.common.bean;

/**
 * http请求结果提示信息
 */
public enum ResultInfoEnum {
    /* 自定义 start */
    SUCCESS(200, "执行成功"),
    INVALID_PARAM(300, "参数校验失败"),
    SERVICE_ERROR(301, "业务流程执行异常"),
    UNAUTHORIZED(401, "未登录或登录已过期"),
    CUSTOM_ERROR(407,"后台自定义错误消息"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误");

    private int code;
    private String msg;

    ResultInfoEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
