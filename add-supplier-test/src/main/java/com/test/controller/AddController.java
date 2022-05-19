package com.test.controller;

import com.test.pojo.Supplier;
import com.test.service.SupplierService;
import com.test.service.impl.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
    @Autowired
    SupplierServiceImpl supplierServiceImpl;

    @PostMapping("addAll")
    public int addAll(
            String name,
            int discount,
            int sorting
    ){
        Supplier sup=new Supplier();
        sup
                .setName(name)
                .setDiscount(discount)
                .setSorting(sorting);

         return supplierServiceImpl.addAll(sup);
    }
}
