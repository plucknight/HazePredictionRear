package com.example.service;

import com.example.pojo.Result;
import com.example.pojo.Shop;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IShopService extends IService<Shop> {

    Result queryById(Long id);

    Result update(Shop shop);

}
