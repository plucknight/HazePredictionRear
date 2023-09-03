package com.example;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.example.pojo.pastMonth;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.mapper.pastMonthMapper;
@SpringBootTest
class SciApplicationTests {
	@Autowired
	private  pastMonthMapper pastMonthMapper;
	@Test
	void contextLoads() {
	}
	@Test
	void testSelectPage(){
	//1 创建IPage分页对象,设置分页参数,1为当前页码，3为每页显示的记录数
		IPage<pastMonth> page = new Page<>(1, 3);

	//2 执行分页查询
		pastMonthMapper.selectPage(page,null);
	//3 获取分页结果
		System.out.println("当前页码值："+page.getCurrent());
		System.out.println("每页显示数："+page.getSize());
		System.out.println("一共多少页："+page.getPages());
		System.out.println("一共多少条数据："+page.getTotal());
		System.out.println("数据："+page.getRecords());
	}
}
