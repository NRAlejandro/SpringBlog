package com.nralejandro.springblog.service;


import com.nralejandro.springblog.dao.IPostDao;
import com.nralejandro.springblog.model.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostServiceImpl implements IPostService{

    @Autowired
    private IPostDao iPostDao;

    @Override
    @Transactional
    public List<PostModel> getPosts() {
        return iPostDao.getPosts();
    }

    @Override
    @Transactional
    public PostModel getPostById(long id) {
        return iPostDao.getPostById(id);
    }

    @Override
    @Transactional
    public void savePost(PostModel post) {
        iPostDao.savePost(post);
    }

    @Override
    @Transactional
    public void deletePost(PostModel post) {
        iPostDao.deletePost(post);
    }
}
