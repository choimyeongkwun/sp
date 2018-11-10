package com.bdi.sp;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DBConTest {
	
	@Autowired
	private DataSource ds;
	
	@Test
	public void test() throws SQLException {
		Connection con = ds.getConnection();
		ResultSet rs = con.createStatement().executeQuery("select * from aws_test");
		while(rs.next()) {
			System.out.println(rs.getString("atname"));
		}
		assertNotNull(con);
	}
	

}
