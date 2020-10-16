package com.zucc.blog.common;

import java.io.Serializable;

/**
 * @author oyz
 * Controller 返回结果类
 *
 * @param <T>
 */
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 7808525685034448033L;

    private int code;
    private String message;
    private T body;

    public Result() {
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
        this.body = null;
    }

    public Result(int code, String message, T body) {
        this.code = code;
        this.message = message;
        this.body = body;
    }

    public static <T> Result<T> newInstance() {
        return new Result<T>();
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", body=" + body +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
