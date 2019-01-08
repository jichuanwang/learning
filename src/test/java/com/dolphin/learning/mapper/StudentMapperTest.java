package com.dolphin.learning.mapper;

import com.dolphin.learning.BaseTest;
import com.dolphin.learning.domain.entity.StudentEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentMapperTest extends BaseTest {

    @Autowired(required = false)
    private StudentMapper studentMapper;
    @Test
    public void testInsert(){
        StudentEntity entity = new StudentEntity();
        entity.setId(3L);
        entity.setName("wangjichuan");
        studentMapper.insert(entity);
    }
}
