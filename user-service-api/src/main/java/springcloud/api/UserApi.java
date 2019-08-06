package springcloud.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import springcloud.entity.Params;
import springcloud.entity.User;
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

  @GetMapping("/demo")
  String demoEndPoint(@SpringQueryMap Params params);

}