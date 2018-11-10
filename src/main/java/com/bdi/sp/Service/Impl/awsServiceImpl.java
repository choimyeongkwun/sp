package com.bdi.sp.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.Service.awsService;
import com.bdi.sp.dao.awsDAO;
import com.bdi.sp.vo.AWSTEST;
@Service
public class awsServiceImpl implements awsService {

	@Autowired
	private awsDAO adao;
	
	@Override
	public List<AWSTEST> selectAWSList() {
		
		return adao.selectAWSList();
	}

	@Override
	public AWSTEST selectAWS(int atnum) {
		// TODO Auto-generated method stub
		return adao.selectAWS(atnum);
	}

	@Override
	public Integer insertAWS(AWSTEST aws) {
		// TODO Auto-generated method stub
		return adao.insertAWS(aws);
	}

	@Override
	public Integer updateAWS(AWSTEST aws) {
		// TODO Auto-generated method stub
		return adao.updateAWS(aws);
	}

	@Override
	public Integer deleteAWS(int atnum) {
		return adao.deleteAWS(atnum);
		
	}

}
