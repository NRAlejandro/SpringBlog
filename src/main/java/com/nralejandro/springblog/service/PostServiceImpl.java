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
        return iPostDao.findAll();
    }

    @Override
    @Transactional
    public PostModel getPostById(long id) {
        return iPostDao.getOne(id);
    }

    @Override
    @Transactional
    public void savePost(PostModel post) {
        iPostDao.save(post);
    }

    @Override
    @Transactional
    public void deletePost(PostModel post) {
        iPostDao.delete(post);
    }
}
