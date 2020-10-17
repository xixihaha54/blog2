package com.zucc.blog.service.impl;

import com.sun.media.jfxmedia.logging.Logger;
import com.zucc.blog.dao.ArticleRepository;
import com.zucc.blog.entity.Article;
import com.zucc.blog.entity.UserArticle;
import com.zucc.blog.service.ArticleService;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.function.Predicate;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {this.articleRepository = articleRepository;}


//    @Transactional
    @Override
    public Article addArticle(Article article){
        Article article1 = articleRepository.save(article);
        return article1;
    }

    @Override
    public List<Article> findAllByTitleLike(String title){
        List<Article> article2 = articleRepository.findAllByTitleLike("%" + title + "%");
        return article2;
    }

    @Override
    public Article findAllByUid(Long uid){
        Article article6 = articleRepository.findById(uid).get();
        return article6;
    }


    @Override
    public List<Article> findAll(){
        List<Article> article3 = articleRepository.findAll();

        return article3;
    }

    @Override
    public  List<UserArticle> findAllUserArticle(){
        List<UserArticle> userArticles = articleRepository.findAllUserArticle();

        return userArticles;
    }

    @Override
    public Page<Article> findArticleByPage(String title,Integer pageNo,Integer pageSize){
        Sort sort = Sort.by(Sort.Direction.DESC,"uid");
        Pageable pageable = PageRequest.of(pageNo,pageSize,sort);
        if (!StringUtils.isEmpty(title)){
            ExampleMatcher matcher = ExampleMatcher.matching()
                    .withMatcher("title",ExampleMatcher.GenericPropertyMatchers.contains());
            Article article = new Article();
            article.setTitle(title);
            Example<Article> ex = Example.of(article,matcher);
            return articleRepository.findAll(ex,pageable);
        }else {
            return articleRepository.findAll(pageable);
        }
    }

//    @Override


}
