package com.bdi.sp.dao;

import java.util.List;

import com.bdi.sp.vo.AWSTEST;

public interface awsDAO {

	public List<AWSTEST> selectAWSList();
	public AWSTEST selectAWS(int atnum);
	public Integer insertAWS(AWSTEST aws);
	public Integer updateAWS(AWSTEST aws);
	public Integer deleteAWS(int atnum);
	
}
