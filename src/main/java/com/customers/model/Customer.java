package com.customers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private Long idcustomer;
    private Long idtype;
    private String dni;
    private String customerName;
    private String contact;
    private String region;

    @Override
    public String toString() {
        return "com.customers.model.Customer[ idcustomer=" + idcustomer + " ]";
    }

}
