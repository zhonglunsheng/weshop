package com.mmall.dao;

import com.mmall.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    Order selectByUserIdAndOrderNo(@Param(value = "userId") Integer userId, @Param(value = "orderNo") Long orderNo);

    Order selectByOrderNo(Long orderNo);

    List<Order> getOrderListByUserId(@Param(value = "userId") Integer userId);

    List<Order> getOrderStatusByCreatetime(@Param(value = "status") Integer status, @Param(value = "date")String date);

    int closeOrderByOrderId(Integer id);
}