package com.tlong.uaa.service;


import com.tlong.uaa.domain.jpa.User;
import com.tlong.uaa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.Objects;
import static com.tlong.uaa.domain.jpa.QUser.user;

@Component
@Transactional
public class UserService {

 @Autowired
 private UserRepository userRepository;

 @Autowired
 private EntityManager entityManager;

 /**
  * 登录业务处理
  */
 public Boolean login() {
  System.out.println("我是测试的哟");
  User one = userRepository.findOne(user.id.eq(1L));
  if (Objects.isNull(one)){
     return Boolean.FALSE;
  }else {
   System.out.println(one.getId());
     return Boolean.TRUE;
  }
 }

}
