package com.diditech.odin.pay.config;

import lombok.Data;

/**
 * @author diditech
 * @date 2019-06-19
 */
@Data
public class AliPayConfig {

	/**
	 * 订单过期时间
	 */
	private String expireTime;

	/**
	 * 前端回调地址
	 */
	private String returnUrl;

	/**
	 * 服务端回调地址
	 */
	private String notifyUrl;

}