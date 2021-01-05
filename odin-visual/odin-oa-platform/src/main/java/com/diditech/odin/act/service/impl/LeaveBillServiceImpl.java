/*
 *    Copyright (c) 2018-2025, diditech All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: diditech
 */

package com.diditech.odin.act.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.diditech.odin.act.entity.LeaveBill;
import com.diditech.odin.act.mapper.LeaveBillMapper;
import com.diditech.odin.act.service.LeaveBillService;
import org.springframework.stereotype.Service;

/**
 * @author diditech
 * @date 2018-09-27
 */
@Service("leaveBillService")
public class LeaveBillServiceImpl extends ServiceImpl<LeaveBillMapper, LeaveBill> implements LeaveBillService {

}
