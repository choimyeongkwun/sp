package com.bdi.sp.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.dao.awsDAO;
import com.bdi.sp.vo.AWSTEST;

@Repository
public class awsDAOImpl implements awsDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<AWSTEST> selectAWSList() {
		return ss.selectList("com.bdi.sp.AWS.selectAWSList");
	}

	@Override
	public AWSTEST selectAWS(int atnum) {
		return ss.selectOne("com.bdi.sp.AWS.selectAWS",atnum);
	}

	@Override
	public Integer insertAWS(AWSTEST aws) {
		return ss.insert("com.bdi.sp.AWS.insertAWS",aws);
	}

	@Override
	public Integer updateAWS(AWSTEST aws) {
		return ss.update("com.bdi.sp.AWS.updateAWS",aws);
	}

	@Override
	public Integer deleteAWS(int atnum) {
		return ss.delete("com.bdi.sp.AWS.deleteAWS",atnum);
	}

}
