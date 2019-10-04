package pers.jyz.bootlaunch2.controller;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.*;
import pers.jyz.bootlaunch2.model.Article;
import pers.jyz.bootlaunch2.utils.AjaxResponse;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/api")
public class ArticleRestController {

    @PostMapping(value = "/articles", produces = "application/json")
    public AjaxResponse saveArticle(@RequestBody Article article) {
        log.info("save article: {}", article);

        return AjaxResponse.success();
    }

    @GetMapping(value = "/articles/{id}", produces = "application/json")
    public AjaxResponse getArticleById(@PathVariable Long id) {
        Article article = Article.builder()
                .id(id)
                .author("jyz")
                .content("内容")
                .createTime(new Date())
                .title("Spring Boot 入门")
                .build();
        return AjaxResponse.success(article);
    }

    @DeleteMapping(value = "/articles/{id}", produces = "application/json")
    public AjaxResponse deleteArticleById(@PathVariable Long id) {
        log.info("delete article: {}", id);

        return AjaxResponse.success();
    }

    @PutMapping(value = "/articles/{id}", produces = "application/json")
    public AjaxResponse updateArticleById(@PathVariable Long id, @NotNull @RequestBody Article article) {
        article.setId(id);
        log.info("update article: {}", id);
        log.info("update article: {}", article);
        return AjaxResponse.success();
    }
}
