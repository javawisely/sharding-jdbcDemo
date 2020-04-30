package com.wisely.shardingjdbc.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

public interface UserMapper {
    @INs
    public  void  saveUser();
}
