package cn.geminiplanet.vueblog.controller;


import cn.geminiplanet.vueblog.common.lang.Result;
import cn.geminiplanet.vueblog.entity.User;
import cn.geminiplanet.vueblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Gemini-Lin
 * @since 2020-08-01
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public Result test(@PathVariable("id") Long id){
        User user = userService.getById(id);
        return Result.success(200,"Run Successfully!",user);
    }
}
