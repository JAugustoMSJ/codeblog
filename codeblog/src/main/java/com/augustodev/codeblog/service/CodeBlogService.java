/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.augustodev.codeblog.service;

import com.augustodev.codeblog.model.Post;
import java.util.List;

/**
 *
 * @author AUGUSTO
 */
public interface CodeBlogService {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
