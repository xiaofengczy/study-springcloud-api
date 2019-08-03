package com.study.springcloud.entity;

import lombok.Data;

/**
 * FileName: User Description:
 *
 * @author caozhongyu
 * @create 19-8-3
 */
@Data
public class User {
  /**用户id*/
  private String userId;

  /**用户名*/
  private String userName;

  /**电话号码*/
  private String phone;

  /**地址*/
  private String address;
}