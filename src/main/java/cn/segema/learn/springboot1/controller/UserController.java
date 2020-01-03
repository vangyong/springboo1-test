package cn.segema.learn.springboot1.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.segema.learn.springboot1.domain.User;
import cn.segema.learn.springboot1.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {


    @ApiOperation(value = "获取全部用户", notes = "获取全部用户")
    @GetMapping("/all")
    public List<User> getAllUsers() {
        System.out.println("只有第一次才会打印sql语句");
        List<User> list = new ArrayList<User>();
        User user = new User();
    	user.setNickName("hahah");
        list.add(user);
        return list;
    }

    @ApiOperation(value = "根据id获取用户", notes = "根据id获取用户")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "用户id", required = true, paramType = "path")})
    @GetMapping("/find/{id}")
    public ResponseEntity findUser(@PathVariable BigInteger id) {
    	User user = new User();
    	user.setNickName("hahah");
        return new ResponseEntity(user, HttpStatus.OK);
    }
    
}
