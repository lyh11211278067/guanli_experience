package com.test.pojo;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 
 * @TableName supplier
 */
@Data
@Accessors(chain = true)
public class Supplier implements Serializable {
    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String hander;

    /**
     * 
     */
    private String enable;

    /**
     * 
     */
    private Integer discount;

    /**
     * 
     */
    private String cellphone;

    /**
     * 
     */
    private String telephone;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String fax;

    /**
     * 
     */
    private String url;

    /**
     * 
     */
    private String region;

    /**
     * 
     */
    private String detailedaddress;

    /**
     * 
     */
    private String bank;

    /**
     * 
     */
    private String bankaccount;

    /**
     * 
     */
    private String banknumber;

    /**
     * 
     */
    private Integer sorting;

    /**
     * 
     */
    private String note;

    private static final long serialVersionUID = 1L;
}