package com.mapper;
import  com.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {

    @Select("select * from tb_brand")
    @ResultMap("BrandMap")
    List<Brand> selectAll();



    @Insert("insert into tb_brand (brand_name, company_name, ordered, description, status) VALUES " +
            "(#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void insertBrand(Brand brand);
}
