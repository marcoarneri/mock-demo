package it.tasgroup.eu.mockdemo.controller.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FaultBean {

    private String faultCode;
    private String faultString;
    private String id;
    private String description;
    private Integer serial;
    private String originalFaultCode;
    private String originalFaultString;
    private String originalDescription;
}
