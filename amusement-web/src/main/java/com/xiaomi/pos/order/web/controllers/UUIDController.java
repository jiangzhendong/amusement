/*
 * XiaoMi PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.xiaomi.pos.order.web.controllers;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jzd.amusement.service.UUIDProvider;

/**
 * 
 * @author huangjia
 * @since 1.0
 */
@Controller
public class UUIDController {
	@Resource
	private UUIDProvider	uuidProvider;

	@RequestMapping(value = "/test/uuid", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public String getUUID(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return uuidProvider.get();

	}
}
