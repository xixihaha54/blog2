package com.zucc.blog.dao;

import com.zucc.blog.entity.Comment;
import com.zucc.blog.entity.UserComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByArticleId(Long articleid);

    @Query(value = "select t.account,t.head_picture,t.name,d.uid,d.article_id,d.comment_num,d.content,d.create_date,d.like_num from t_user t left join t_comment d on t.uid=d.account_id where d.article_id = ?", nativeQuery = true)
    List<Map<Long, Object>> findUserCommentByArticleIdLikeSql2(@Param(value = "articleId") Long articleId);

//    @Transactional
//    @Modifying
//    @Query("delete from Comment where uid = ?1")
//    void deleteByUidTrue(Long id);
}
