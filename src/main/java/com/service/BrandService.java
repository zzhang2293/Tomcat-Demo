package com.service;

import com.pojo.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> selectAll();
    void insertElement(Brand brand);
}
