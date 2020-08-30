package com.web;

import com.Service.UserService;
import com.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/zk/api")
public class TestController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public void test() {
        User user = new User();
        user.setName("张康");
        user.setAddress("上海");
        user.setCreateTime(new Date());
        userService.add(user);

    }



}
