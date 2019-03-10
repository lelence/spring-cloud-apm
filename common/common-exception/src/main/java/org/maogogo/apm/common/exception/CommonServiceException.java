package org.maogogo.apm.common.exception;

import lombok.Data;

@Data
public class CommonServiceException extends Exception {

    private String message;
    private String code;

    public CommonServiceException(String message) {
        this("", message);
    }


    public CommonServiceException(String code, String message) {
        super(message);
        this.message = message;
        this.code = code;
    }

}
