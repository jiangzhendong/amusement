/*
 * XiaoMi PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jzd.amusement.service.impl;

import java.util.UUID;

import com.jzd.amusement.service.UUIDProvider;
import org.springframework.stereotype.Component;

/**
 * 
 * @author huangjia
 * @since 1.0
 */
@Component
public class UUIDProviderImpl implements UUIDProvider {

	@Override
	public String get() {
		return UUID.randomUUID().toString();
	}

}
