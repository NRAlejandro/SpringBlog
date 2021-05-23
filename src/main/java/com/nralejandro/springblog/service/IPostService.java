package com.nralejandro.springblog.service;

import com.nralejandro.springblog.model.PostModel;

import java.util.List;

public interface IPostService {

    public List<PostModel> getPosts();

    public PostModel getPostById(long id);

    public void savePost(PostModel post);

    public void deletePost(PostModel post);

    public void deletePost(long id);
}
