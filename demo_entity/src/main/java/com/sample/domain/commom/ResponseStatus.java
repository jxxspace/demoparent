//package com.sample.domain.commom;
//
//import io.swagger.annotations.ApiModelProperty;
//
//import java.io.Serializable;
//
//public class ResponseStatus<T> implements Serializable {
//
//    @ApiModelProperty("报文状态： 0 失败，1 成功，-1 未登录，-2 无权限")
//    private Integer status = 1;
//
//    @ApiModelProperty("报文: 成功响应报文，失败响应错误信息")
//    private T msg = (T) "ok";
//
//
//    public static ResponseStatus ok() {
//        return new ResponseStatus();
//    }
//
//    public static ResponseStatus list(Integer totalPages, Object content) {
//        return new ResponseStatus(totalPages, content);
//    }
//
//    public static ResponseStatus object(Object content) {
//        return new ResponseStatus(content);
//    }
//
//    public static ResponseStatus exception(Integer status, String errMsg) {
//        return new ResponseStatus(status, errMsg);
//    }
//
//
//    public ResponseStatus(T content) {
//        this.msg = content;
//    }
//
//    public ResponseStatus(Integer totalPages, T content) {
//        ResponseMsgVO<T> responseMsgVO = new ResponseMsgVO<>();
//        responseMsgVO.setTotalPages(totalPages);
//        responseMsgVO.setContent(content);
//        this.msg = (T) responseMsgVO;
//    }
//
//    public ResponseStatus(Integer status, String msg) {
//        this.status = status;
//        this.msg = (T) msg;
//    }
//
//    public ResponseStatus() {
//    }
//
//    public Integer getStatus() {
//        return status;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
//    }
//
//    public T getMsg() {
//        return msg;
//    }
//
//    public void setMsg(T msg) {
//        this.msg = msg;
//    }
//
//    @Override
//    public String toString() {
//        return "MsgStatus{" +
//                "status=" + status +
//                ", msg=" + msg +
//                '}';
//    }
//}
//
//
//
