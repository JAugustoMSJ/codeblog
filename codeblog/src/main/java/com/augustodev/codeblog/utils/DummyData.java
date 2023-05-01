/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.augustodev.codeblog.utils;

import com.augustodev.codeblog.model.Post;
import com.augustodev.codeblog.repository.CodeBlogRepository;
import com.augustodev.codeblog.utils.utilsDetails.DummyDataDetails;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author AUGUSTO
 */
@Component
public class DummyData {
    
    @Autowired
    CodeBlogRepository codeblogrepository;
    
//  Anotation que executa o método sempre que o projeto é executado
    @PostConstruct
    private void savePosts(){
        List<Post> postList = new ArrayList<Post>();
        Post post1 = new Post();
        post1.setAutor("José Augusto");
        post1.setData(LocalDate.now());
        post1.setTitulo("Operações em C");
        post1.setTexto(DummyDataDetails.POST_DESCRICAO_C);
        
        Post post2 = new Post();
        post2.setAutor("José Augusto");
        post2.setData(LocalDate.now());
        post2.setTitulo("PHP: Inserindo dados no banco");
        post2.setTexto(DummyDataDetails.POST_DESCRICAO_PHP);
        
        postList.add(post1);
        postList.add(post2);
        
        for(Post post : postList){
            Post postSaved = codeblogrepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
