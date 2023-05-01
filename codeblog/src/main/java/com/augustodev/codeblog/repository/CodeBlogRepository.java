/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.augustodev.codeblog.repository;

import com.augustodev.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AUGUSTO
 */
public interface CodeBlogRepository extends JpaRepository<Post, Long>{
    
}
