package com.study.springcloud.api;

import com.study.springcloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * FileName: UserApi Description:
 *
 * @author caozhongyu
 * @create 19-8-3
 */
@FeignClient(name = "user-service")
@Configuration
public interface UserApi {

  @GetMapping("/user/{id}")
  User findUserById(@PathVariable("id") String userId);

}