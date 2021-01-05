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

package com.diditech.odin.act.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.diditech.odin.act.entity.LeaveBill;
import com.diditech.odin.act.service.LeaveBillService;
import com.diditech.odin.act.service.ProcessService;
import com.diditech.odin.common.core.constant.enums.TaskStatusEnum;
import com.diditech.odin.common.core.util.R;
import com.diditech.odin.common.security.util.SecurityUtils;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 请假流程
 *
 * @author 冷冷
 * @date 2018-09-27 15:20:44
 */
@RestController
@AllArgsConstructor
@RequestMapping("/leave-bill")
public class LeaveBillController {

	private final LeaveBillService leaveBillService;

	private final ProcessService processService;

	/**
	 * 请假审批单简单分页查询
	 * @param page 分页对象
	 * @param leaveBill 请假审批单
	 * @return
	 */
	@GetMapping("/page")
	public R getLeaveBillPage(Page page, LeaveBill leaveBill) {
		return R.ok(leaveBillService.page(page, Wrappers.query(leaveBill)));
	}

	/**
	 * 信息
	 * @param leaveId
	 * @return R
	 */
	@GetMapping("/{leaveId}")
	public R getById(@PathVariable("leaveId") Integer leaveId) {
		return R.ok(leaveBillService.getById(leaveId));
	}

	/**
	 * 保存
	 * @param leaveBill
	 * @return R
	 */
	@PostMapping
	public R save(@RequestBody LeaveBill leaveBill) {
		leaveBill.setUsername(SecurityUtils.getUser().getUsername());
		leaveBill.setState(TaskStatusEnum.UNSUBMIT.getStatus());
		return R.ok(leaveBillService.save(leaveBill));
	}

	/**
	 * 修改
	 * @param leaveBill
	 * @return R
	 */
	@PutMapping
	public R updateById(@RequestBody LeaveBill leaveBill) {
		return R.ok(leaveBillService.updateById(leaveBill));
	}

	/**
	 * 删除
	 * @param leaveId
	 * @return R
	 */
	@DeleteMapping("/{leaveId}")
	public R removeById(@PathVariable Integer leaveId) {
		return R.ok(leaveBillService.removeById(leaveId));
	}

	/**
	 * 提交请假流程
	 * @param leaveId
	 * @return R
	 */
	@GetMapping("/submit/{leaveId}")
	public R submit(@PathVariable("leaveId") Integer leaveId) {
		return R.ok(processService.saveStartProcess(leaveId));
	}

}
