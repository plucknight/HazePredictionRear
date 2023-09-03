package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    //增删改 成功响应
    public static Result success(){
        return new Result(1,"success",null);
    }
    //查询 成功响应
    public static Result success(Integer code,Object data){
        return new Result(code,"success",data);
    }
    //失败响应
    public static Result error(Integer code,String msg){
        return new Result(code,msg,null);
    }
}
