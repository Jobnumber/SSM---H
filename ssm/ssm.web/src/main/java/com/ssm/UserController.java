package com.ssm;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层查询方法被调用");
        List<User> list=userService.findAllUser();
        model.addAttribute("list",list);
        return "all";
    }
    @RequestMapping("/save")
    public  void save(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
        userService.saveUser(user);
        response.sendRedirect(request.getContextPath()+"/user/findAll");
        return;
    }
}
