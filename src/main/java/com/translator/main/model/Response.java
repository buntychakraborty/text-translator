package com.translator.main.model;

import lombok.*;
import lombok.Data;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Response {
    private String convertFrom;
    private  String text;
    private  String convertedTo;
}
