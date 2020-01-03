package cn.segema.learn.springboot1.controller;

import java.util.Vector;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.segema.learn.springboot1.vo.StackTest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "测试接口")
@RestController
@RequestMapping("/test")
public class TestController {

	@ApiOperation(value = "栈内存溢出", notes = "栈内存溢出")
	@GetMapping("/memory/stack")
	public ResponseEntity stackOut() {
		StackTest stackTest = new StackTest();
		try {
			stackTest.caculateTest(10);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("调用栈的深度（次数）：" + stackTest.getDepth());
			return new ResponseEntity("error", HttpStatus.OK);
		}
		return new ResponseEntity("success", HttpStatus.OK);
	}

	@ApiOperation(value = "堆内存溢出", notes = "堆内存溢出")
	@GetMapping("/memory/heap")
	public ResponseEntity heapOut() {
		Vector v = new Vector();
		for (int i = 0; i < 2500; i++) {
			v.add(new byte[1 * 1024 * 1024*1024]);
		}

		return new ResponseEntity(null, HttpStatus.OK);
	}

}
