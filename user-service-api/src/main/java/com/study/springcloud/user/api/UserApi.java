package com.study.springcloud.user.api;

import com.study.springcloud.user.entity.Params;
import com.study.springcloud.user.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * FileName: UserApi Description:
 *
 * @author caozhongyu
 * @create 19-8-3
 */
@FeignClient(contextId = "user-api",name = "user-service")
@Configuration
public interface UserApi {

  @GetMapping("/user/{id}")
  User findUserById(@PathVariable("id") String userId);

  @GetMapping("/demo")
  String demoEndPoint(@SpringQueryMap Params params);

}