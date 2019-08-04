package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * FileName: SpringcloudApiApplication Description:
 *
 * @author caozhongyu
 * @create 19-8-3
 */
@Configuration
@EnableFeignClients
public class UserServiceApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(UserServiceApiApplication.class, args);
  }
}