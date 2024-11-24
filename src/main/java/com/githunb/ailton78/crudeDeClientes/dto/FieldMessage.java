package com.githunb.ailton78.crudeDeClientes.dto;

public class FieldMessage {

    private String filedName;
    private String message;

    public FieldMessage(String filedName, String message) {
        this.filedName = filedName;
        this.message = message;
    }

    public String getFiledName() {
        return filedName;
    }

    public String getMessage() {
        return message;
    }
}
