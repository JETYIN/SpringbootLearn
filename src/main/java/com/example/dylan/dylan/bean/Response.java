package com.example.dylan.dylan.bean;

/**
 * Created by Administrator on 2018/3/9.
 */
public class Response {


    private String status = null;

    private Object result = null;

    public Response status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResult(Object obj) {
        this.result = obj;
    }

    public String getStatus() {
        return status;
    }

    public Object getObject() {
        return result;
    }

}
