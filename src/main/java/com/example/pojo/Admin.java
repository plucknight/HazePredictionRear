package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("Admin")
public class Admin {


        private Integer id;
        private String username;
        private String password;
        @TableField(exist=false)
        private String name;
}
