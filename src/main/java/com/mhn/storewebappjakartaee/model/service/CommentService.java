package com.mhn.storewebappjakartaee.model.service;

import com.mhn.storewebappjakartaee.model.entity.Admin;
import com.mhn.storewebappjakartaee.model.entity.Comment;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.base.ServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentService extends ServiceImpl<Comment , Long> {
    private static final CommentService commentService = new CommentService();

    private CommentService(){
    }

    public static CommentService getCommentService(){return commentService;}

    @Override
    public Comment save(Comment comment) throws Exception {
        try (CRUDRepository<Comment, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.insert(comment);
        }
    }

    @Override
    public Comment delete(Long id) throws Exception {
        try (CRUDRepository<Comment, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.delete(Comment.class,id);
        }
    }

    @Override
    public Comment update(Comment comment) throws Exception {
        try (CRUDRepository<Comment, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.update(comment);
        }
    }

    @Override
    public List<Comment> findAll() throws Exception {
        try (CRUDRepository<Comment , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectAll(Comment.class);
        }
    }

    @Override
    public Comment findById(Long id) throws Exception {
        try (CRUDRepository<Comment , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectById(Comment.class , id);
        }
    }

    public Comment findByCommentText(String text) throws Exception {
        try (CRUDRepository<Comment, Long> crudRepository = new CRUDRepository<>()) {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("text", text);
            List<Comment> commentList = crudRepository.executeQuery("Comment.findByCommentText", paramMap);
            return (commentList!=null)?commentList.get(0):null;
        }
    }
}
