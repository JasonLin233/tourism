package com.test.tourism.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.test.tourism.model.Scenery;
import lombok.Data;

import java.util.List;
@Data
public class SceneryVO<T> {

    private Integer code=0;

    private Integer count;

    private Integer status=200;

    private  String msg="success";

    @JsonProperty("data")
    private List<Scenery> sceneryList;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Scenery> getSceneryList() {
        return sceneryList;
    }

    public void setSceneryList(List<Scenery> sceneryList) {
        this.sceneryList = sceneryList;
    }
}
