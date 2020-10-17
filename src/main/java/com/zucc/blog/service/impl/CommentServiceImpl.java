package com.zucc.blog.service.impl;

import com.zucc.blog.dao.CommentRepository;
import com.zucc.blog.entity.Comment;
import com.zucc.blog.service.CommentService;
import org.springframework.stereotype.Service;


@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public  CommentServiceImpl(CommentRepository commentRepository) {this.commentRepository=commentRepository;}

    @Override
    public Comment addComment(Comment comment){
        Comment comment1=commentRepository.save(comment);
        return comment1;
    }
}
