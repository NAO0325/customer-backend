package com.customers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerType {

    private Long idtype;
    private String typeName;
    
    @Override
    public String toString() {
        return "com.customers.model.CustomerType[ idtype=" + idtype + " ]";
    }

}
