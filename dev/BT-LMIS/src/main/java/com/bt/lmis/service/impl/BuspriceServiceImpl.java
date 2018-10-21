package com.bt.lmis.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bt.lmis.code.ServiceSupport;
import com.bt.lmis.dao.BuspriceMapper;
import com.bt.lmis.service.BuspriceService;
@Service
public class BuspriceServiceImpl<T> extends ServiceSupport<T> implements BuspriceService<T> {

	@Autowired
    private BuspriceMapper<T> mapper;

	public BuspriceMapper<T> getMapper() {
		return mapper;
	}

	@Override
	public Long selectCount(Map<String, Object> param) throws Exception {
		return mapper.selectCount(param);
	}
		
	
}
