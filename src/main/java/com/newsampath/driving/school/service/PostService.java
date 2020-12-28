package com.newsampath.driving.school.service;

import com.newsampath.driving.school.dto.PostDto;
import com.newsampath.driving.school.model.Post;
import com.newsampath.driving.school.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class PostService {

    @Autowired
    private AuthService authService;

    @Autowired
    private PostRepository postRepository;

    public void createPost(PostDto postDto){
        Post post = new Post();
        post.setTitle(postDto.getContent());
        User userName = authService.getCurrentUser().orElseThrow(() ->
                new IllegalArgumentException("No user logged in"));
        post.setUsername(userName.getUsername());
        post.setUpdateOn(Instant.now());
        postRepository.save(post);
    }
}
