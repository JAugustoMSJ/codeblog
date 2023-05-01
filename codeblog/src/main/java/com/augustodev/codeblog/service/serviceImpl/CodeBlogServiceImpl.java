/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.augustodev.codeblog.service.serviceImpl;

import com.augustodev.codeblog.model.Post;
import com.augustodev.codeblog.repository.CodeBlogRepository;
import com.augustodev.codeblog.service.CodeBlogService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author AUGUSTO
 */
@Service
public class CodeBlogServiceImpl implements CodeBlogService{
    @Autowired
    CodeBlogRepository codeBlogRepository;
    
    @Override
    public List<Post> findAll() {
        return codeBlogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeBlogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeBlogRepository.save(post);
    }
    
}
