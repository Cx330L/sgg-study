package com.example.distributed.lock.service.impl;

import com.example.distributed.lock.pojo.Stock;
import com.example.distributed.lock.service.StockService;
import org.springframework.stereotype.Service;

/**
 * @author liujb
 * @description
 * @date 2022-09-14 22:11
 */
@Service
public class StockServiceImpl implements StockService {

    private final Stock stock = new Stock();

    @Override
    public void deduct(){
        stock.setStock(stock.getStock() - 1);
        System.out.println("库存余量：" + stock.getStock());
    }

}
