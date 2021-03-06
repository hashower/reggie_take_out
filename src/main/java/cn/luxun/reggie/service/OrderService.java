package cn.luxun.reggie.service;

import cn.luxun.reggie.model.Result;
import cn.luxun.reggie.model.entity.Orders;
import com.baomidou.mybatisplus.extension.service.IService;

public interface OrderService extends IService<Orders> {
	/**
	 * 用户下单
	 *
	 * @param orders
	 * @return
	 */
	Result<String> submit(Orders orders);
}
