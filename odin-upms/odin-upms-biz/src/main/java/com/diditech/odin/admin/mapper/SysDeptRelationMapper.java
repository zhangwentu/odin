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

package com.diditech.odin.admin.mapper;

import com.diditech.odin.admin.api.entity.SysDeptRelation;
import com.diditech.odin.common.data.datascope.DiditechBaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author diditech
 * @since 2018-02-12
 */
@Mapper
public interface SysDeptRelationMapper extends DiditechBaseMapper<SysDeptRelation> {

	/**
	 * 删除部门关系表数据
	 * @param id 部门ID
	 */
	void deleteDeptRelationsById(Integer id);

	/**
	 * 更改部分关系表数据
	 * @param deptRelation
	 */
	void updateDeptRelations(SysDeptRelation deptRelation);

}
