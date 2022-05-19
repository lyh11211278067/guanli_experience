package com.test.service.impl;


import com.test.pojo.Supplier;
import com.test.service.SupplierService;
import com.test.mapper.SupplierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 蒙德犬
* @description 针对表【supplier】的数据库操作Service实现
* @createDate 2022-01-29 16:37:37
*/
@Service
public class SupplierServiceImpl implements SupplierService{
    @Autowired
    SupplierMapper supplierMapper;

    @Override
    public int addAll(Supplier supplier) {
        return supplierMapper.addAll(supplier);
    }
}
