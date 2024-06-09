package com.example.newMock.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ResponseDTO {
    private String rqUID;
    private String clientId;
    private String account;
    private String currency;
    private double balance;
    private double maxLimit;
}
