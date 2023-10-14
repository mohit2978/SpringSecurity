package com.springSecurity.SpringSecurity.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    String userName;
    String password;
    String eMail;
}
