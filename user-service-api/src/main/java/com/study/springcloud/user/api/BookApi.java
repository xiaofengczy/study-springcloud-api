package com.study.springcloud.user.api;

import com.study.springcloud.user.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * FileName: BookApi Description:
 *
 * @author caozhongyu
 * @create 19-8-7
 */
@FeignClient(contextId = "book-api", name = "user-service")
public interface BookApi {

  @GetMapping("/book/{id}")
  Book getBook(@PathVariable("id") String bookId);
}