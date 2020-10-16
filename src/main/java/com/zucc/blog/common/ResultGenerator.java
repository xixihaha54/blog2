package com.zucc.blog.common;

/**
 * @author oyz
 * Controller 返回结果生成类
 *
 */
public class ResultGenerator {

    public static <T> Result<T> genResult(int code, String message, T body) {
        Result<T> r = Result.newInstance();
        r.setCode(code);
        r.setMessage(message);
        r.setBody(body);
        return r;
    }

    public static <T> Result<T> genSuccess(String message, T body) {
        return genResult(200, message, body);
    }

    public static <T> Result<T> genSuccess(T body) {
        return genSuccess(null, body);
    }

    public static <T> Result<T> genSuccess() {
        return genSuccess(null);
    }
}
