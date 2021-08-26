package com.customers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSystem {

    private Long iduser;
    private String login;
    private String password;
    
    @Override
    public String toString() {
        return "com.customers.model.UserSystem[ iduser=" + iduser + " ]";
    }

}
