package cn.vinsonws.home.common.bean;

/**
 * @author Vinsonws
 */
public class ResultBean<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private T data;

    public ResultBean() {

    }

    public ResultBean(ResultInfoEnum resultInfoEnum) {
        this.code = resultInfoEnum.getCode();
        this.msg = resultInfoEnum.getMsg();
    }

    public ResultBean(ResultInfoEnum resultInfoEnum, T data) {
        this.code = resultInfoEnum.getCode();
        this.msg = resultInfoEnum.getMsg();
        this.data = data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public static <T> ResultBean<T> success() {
        return new ResultBean<>(ResultInfoEnum.SUCCESS);
    }

    public static <T> ResultBean<T> success(T data) {
        ResultBean<T> resultBean = new ResultBean<>(ResultInfoEnum.SUCCESS);
        resultBean.setData(data);
        return resultBean;
    }

    public static <T> ResultBean<T> error() {
        return new ResultBean<>(ResultInfoEnum.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResultBean<T> error(String msg) {
        ResultBean<T> resultBean = new ResultBean<>(ResultInfoEnum.CUSTOM_ERROR);
        resultBean.setMsg(msg);
        return resultBean;
    }

    public static <T> ResultBean<T> error(ResultInfoEnum resultInfoEnum) {
        return new ResultBean<>(resultInfoEnum);
    }

    public static <T> ResultBean<T> error(ResultInfoEnum resultInfoEnum, String msg) {
        ResultBean<T> resultBean = new ResultBean<>(resultInfoEnum);
        resultBean.setMsg(msg);
        return resultBean;
    }

    public static <T> ResultBean<T> error(Integer code, String msg) {
        ResultBean<T> resultBean = new ResultBean<>();
        resultBean.setCode(code);
        resultBean.setMsg(msg);
        return resultBean;
    }
}