package com.example.controller;

import com.example.pojo.Admin;
import com.example.pojo.Result;
import com.example.service.AdminService;
import com.example.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import static com.example.controller.Code.GET_OK;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/login")
public class loginController {

        @Autowired
        private AdminService adminService;
        public static class Admindata{
                private String username;
                private String password;

                public String getUsername() {
                        return username;
                }

                public void setUsername(String username) {
                        this.username = username;
                }

                public String getPassword() {
                        return password;
                }

                public void setPassword(String password) {
                        this.password = password;
                }
        }
        @PostMapping
        public Result getByDate(@RequestBody Admindata admindata) {
                log.info("根据date，date: {}", admindata.getUsername());

                Admin admin=adminService.login(admindata.getUsername(),admindata.getPassword());
                String jwt=null;
                if(admin!=null) {
                        JwtUtils jwtUtils = new JwtUtils();
                        Map<String, Object> claims = new HashMap<>();
                        claims.put("admin", "myh");
                        jwt = jwtUtils.generateJwt(claims);
                }
                return Result.success(GET_OK,jwt);
        }
}
