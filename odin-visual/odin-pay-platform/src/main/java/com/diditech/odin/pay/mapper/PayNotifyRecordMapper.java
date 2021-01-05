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

package com.diditech.odin.pay.mapper;

import com.diditech.odin.common.data.datascope.DiditechBaseMapper;
import com.diditech.odin.pay.entity.PayNotifyRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * 异步通知记录
 *
 * @author diditech
 * @date 2019-05-28 23:57:23
 */
@Mapper
public interface PayNotifyRecordMapper extends DiditechBaseMapper<PayNotifyRecord> {

}
