package com.zuiyu.transport.service;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.get.MultiGetRequest;

import java.util.List;
import java.util.Map;

/**
 * @author https://github.com/TianPuJun @醉鱼
 * @ClassName SearchService
 * @Date 16:20 2021/4/13
 **/
public interface SearchService {

    /**
     * 根据id获取文档 数据
     *
     * @param index 索引名
     * @param type  类型
     * @param id    主键id查询条件
     * @return
     */
    GetResponse getById(String index, String type, String id);

    /**
     * 根据id批量查询
     *
     * @param items 查询条件
     * @return 批量查询结果
     */
    List<Map<String, Object>> multiGetById(List<MultiGetRequest.Item> items);
}
