package com.huadou.cn.plateform.controller;

import com.huadou.cn.plateform.mapper.UserMapper;
import com.huadou.cn.plateform.model.User;
import com.huadou.cn.utils.PrintUtils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * Created by jinliang on 16/10/17.
 */

@Controller
@RequestMapping("/user")
public class UserController {


     private static final String TAG  =UserController.class.getSimpleName();
//    @RequestMapping("test")
//    public String test(Model model){
//        model.addAttribute("username","jinliang");
//        return "userinfo/user_add" ;
//    }
//
//    @RequestMapping("json")
//    @ResponseBody
//    public UserInfo getJson(){
//
//        return new UserInfo("jinliang","123");
//
//    }
//
//    @ApiOperation(notes="添加用户",value="添加一个用户",httpMethod="POST")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name="username",paramType="query",dataType="string"),
//            @ApiImplicitParam(name="password",paramType="query",dataType="string")
//    })
//    @RequestMapping("add")
//    @ResponseBody
//    public UserInfo add(UserInfo userInfo){
//
//        return userInfo;
//    }



    @Autowired
    private UserMapper userMapper;
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());
    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value={""}, method= RequestMethod.GET)
    public List<User> getUserList() {
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }
    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name="username",paramType="query",dataType="string"),
            @ApiImplicitParam(name="psw",paramType="query",dataType="string")
    })

    @RequestMapping(value="", method=RequestMethod.POST)
    @ResponseBody
    public String postUser( User user) {
        users.put(user.getId(), user);
        int result = userMapper.insert(user.getUsername(),30);
        PrintUtils.printData(TAG ,"postUser " ,"Result:"+result);
        return "success";
    }
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }
    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUser(@PathVariable Long id,  User user) {
        User u = users.get(id);
        u.setUsername(user.getUsername());
        users.put(id, u);
        return "success";
    }
    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }

}
