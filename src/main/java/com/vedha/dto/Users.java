package com.vedha.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    private Long userId;

    private String userName;

    private String userEmail;

    private String userRole;
}
