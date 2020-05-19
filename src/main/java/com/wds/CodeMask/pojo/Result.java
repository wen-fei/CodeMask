package com.wds.CodeMask.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : TenYun
 * @date : 2020-05-19 23:37
 * @description :
 **/

@Setter
@Getter
@NoArgsConstructor
public class Result {
    private boolean flag;

    private Integer code;

    private String message;

    private Object data;


    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
