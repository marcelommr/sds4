package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.entities.Seller;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller, Double sum){
        super();
        this.sellerName = seller.getName();
        this.sum = sum;
    }

}
