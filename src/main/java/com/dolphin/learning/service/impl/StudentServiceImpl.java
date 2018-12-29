package com.dolphin.learning.service.impl;

import com.dolphin.learning.domain.entity.StudentEntity;
import com.dolphin.learning.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public List<StudentEntity> getStudent() {
        List<StudentEntity> entityList = new ArrayList<>();
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName("wjc");
        studentEntity.setAge(29);
        studentEntity.setId(1L);
        entityList.add(studentEntity);

        StudentEntity studentEntity2 = new StudentEntity();
        studentEntity2.setName("jj");
        studentEntity2.setAge(30);
        studentEntity2.setId(2L);
        entityList.add(studentEntity2);
        return entityList;
    }
}
