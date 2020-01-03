package cn.segema.learn.springboot1.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.alibaba.fastjson.JSON;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户")
@Data
public class User implements Serializable {
    
    private static final long serialVersionUID = 6593063193607142801L;
    
    private BigInteger userId;
    
    @ApiModelProperty(value = "用户名")
    private String userName;
    
    @ApiModelProperty(value = "密码")
    private String password;
    
    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "手机号码")
    private String mobileNumber;

    @ApiModelProperty(value = "性别")
    private Integer gender;
    
    @ApiModelProperty(value = "年龄")
    private BigDecimal age;
    
    @Override
    public String toString() {
            return JSON.toJSONString(this,true);
    }
    
}
