//package com.sample.domain.commom;
//
//import io.swagger.annotations.ApiModelProperty;
//
//import java.io.Serializable;
//
//public class  ResponseMsgVO<T> implements Serializable {
//
//@ApiModelProperty("总页数")
//private Integer totalPages = 0;
//
//@ApiModelProperty("内容")
//private T content = (T) "ok";
//
//public ResponseMsgVO(Integer totalPages, T content) {
//        this.totalPages = totalPages;
//        this.content = content;
//        }
//
//public ResponseMsgVO(T content) {
//        this.content = content;
//        }
//
//public ResponseMsgVO() {
//        }
//
//public Integer getTotalPages() {
//        return totalPages;
//        }
//
//public void setTotalPages(Integer totalPages) {
//        this.totalPages = totalPages;
//        }
//
//public T getContent() {
//        return content;
//        }
//
//public void setContent(T content) {
//        this.content = content;
//        }
//
//@Override
//public String toString() {
//        return "ResponseMsg0VO{" +
//        "totalPages=" + totalPages +
//        ", content=" + content +
//        '}';
//        }
//        }