package com.translator.main.model;

import lombok.*;
import lombok.Data;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
public class TranslatedResponse {
    private String convertFrom;
    private  String text;
    private  String convertedTo;
    private  String translatedText;
    private  String pronunciation;
}
