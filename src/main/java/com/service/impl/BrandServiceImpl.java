package com.service.impl;

import com.mapper.BrandMapper;
import com.pojo.Brand;
import com.service.BrandService;
import com.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BrandServiceImpl implements BrandService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Brand> selectAll() {
        SqlSession session = factory.openSession(true);
        BrandMapper mapper = session.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();
        session.close();
        return brands;
    }

    @Override
    public void insertElement(Brand brand) {
        SqlSession session = factory.openSession(true);
        BrandMapper mapper = session.getMapper(BrandMapper.class);
        mapper.insertBrand(brand);
        session.close();
    }
}
