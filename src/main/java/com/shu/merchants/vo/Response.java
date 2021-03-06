package com.shu.merchants.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>通用响应对象</h1>
 *
 * @author yang
 * @date 2019/6/10 14:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    /**
     * 错误码,正确返回0
     */
    private Integer errorCode;
    /**
     * 错误信息
     */
    private String errorMsg;
    /**
     * 返回值对象
     */
    private Object data;

    /**
     * <h2>正确的响应构造函数</h2>
     *
     * @param data 返回对象
     */
    public Response(Object data) {
        this.data = data;
    }

//    public Response() {
//    }
}
