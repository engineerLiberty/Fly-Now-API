package com.ikenna.FlyNow.enums;

import lombok.Data;
import lombok.Getter;

@Getter
public enum ResponseEnum {
    SUCCESS(1, "Successful"),
    ERROR(-1, "An Error has Occured"),
    USER_NOT_FOUND(-2, "Customer not found");


    private final int code;
    private final String description;
    ResponseEnum(int code, String description){
        this.code = code;
        this.description = description;
    }

}
