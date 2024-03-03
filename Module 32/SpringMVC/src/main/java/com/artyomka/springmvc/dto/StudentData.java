package com.artyomka.springmvc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class StudentData implements Serializable {
    @JsonProperty("firstName")
    @ApiModelProperty(value = "Student Name")
    private String firstName;

    @JsonProperty("lastName")
    @ApiModelProperty(value = "Student Surname")
    private String lastName;

    @JsonProperty("grade")
    @ApiModelProperty(value = "Student Grade")
    private int grade;
}
