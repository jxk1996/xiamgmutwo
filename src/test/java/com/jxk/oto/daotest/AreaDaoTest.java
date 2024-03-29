package com.jxk.oto.daotest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jxk.oto.dao.AreaDao;
import com.jxk.oto.entity.Area;




@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

	@Autowired
	private AreaDao areaDao;

	@Test
	public void testQueryArea() {
		List<Area> arealist = areaDao.queryArea();
		System.out.println(arealist.get(1).getAreaName());
		assertEquals(2, arealist.size());
	}
}
