package com.dolphin.learning.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("student")
public class StudentEntity {

    private Long id;
    private String name;
}
