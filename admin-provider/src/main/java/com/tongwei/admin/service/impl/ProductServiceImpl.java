package com.tongwei.admin.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.tongwei.admin.enums.ResultEnum;
import com.tongwei.admin.service.ProductService;
import com.tongwei.admin.domain.eo.Product;
import com.tongwei.admin.mapper.ProductMapper;
import com.deepexi.util.extension.ApplicationException;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by donh on 2018/11/6.
 */
@Service
public class ProductServiceImpl implements ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductMapper productMapper;

    public PageBean getProductList(Integer page, Integer size, Integer age) {
        PageHelper.startPage(page, size);
        List<Product> userTasks =