package com.zc.web.exception;

/**
 * @author wangjiangtao
 */
public class WapNoLoginException extends Exception{
    private static final long serialVersionUID = 1L;
    public String message;

    public WapNoLoginException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
