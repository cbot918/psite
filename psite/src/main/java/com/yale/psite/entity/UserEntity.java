package com.yale.psite.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserEntity {
    String uid;
    String username;
    String email;
    String password;
}
