/*
 *
 *      Copyright (c) 2018-2025, diditech All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the pig4cloud.com developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: diditech
 *
 */

package com.diditech.odin.auth;

import com.diditech.odin.common.feign.annotation.EnableMallFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author diditech
 * @date 2020-02-08 认证授权中心
 */
@SpringCloudApplication
@EnableMallFeignClients
public class OdinAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(OdinAuthApplication.class, args);
	}

}
