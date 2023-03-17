package com.web;

import com.alibaba.fastjson.JSON;
import com.pojo.Brand;
import com.service.BrandService;
import com.service.impl.BrandServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

@WebServlet("/insertNewElementServlet")
public class insertNewElementServlet extends HttpServlet {
    private final BrandService service = new BrandServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader reader = request.getReader();
        request.setCharacterEncoding("utf-8");
        String json = reader.readLine();
        Brand brand = JSON.parseObject(json, Brand.class);
        service.insertElement(brand);
        response.sendRedirect("/JavaWeb_Final/brand.html");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
