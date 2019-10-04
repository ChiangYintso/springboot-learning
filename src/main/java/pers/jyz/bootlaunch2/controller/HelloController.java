package pers.jyz.bootlaunch2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.jyz.bootlaunch2.model.Article;

import java.util.Date;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Article hello() {
        log.info("日志");

        return Article.builder()
                .id(2L)
                .author("杜甫")
                .createTime(new Date())
                .title("茅屋为秋风所破歌")
                .content("茅屋")
                .build();
    }
}
