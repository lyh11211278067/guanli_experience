package com.test.mapper;
import org.apache.ibatis.annotations.Param;

import com.test.pojo.Supplier;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 蒙德犬
* @description 针对表【supplier】的数据库操作Mapper
* @createDate 2022-01-29 16:37:37
* @Entity com.test.pojo.Supplier
*/
@Mapper
public interface SupplierMapper{
    int addAll(Supplier supplier);

}
