package com.nralejandro.springblog.dao;

import com.nralejandro.springblog.model.PostModel;

import java.util.List;

public interface IPostDao {

    public List<PostModel> getPosts();

    public PostModel getPostById(long id);

    public void savePost(PostModel post);

    public void deletePost(PostModel post);


}
