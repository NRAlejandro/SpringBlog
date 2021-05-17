package com.nralejandro.springblog.dao;

import com.nralejandro.springblog.model.PostModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostDaoImpl implements IPostDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<PostModel> getPosts() {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<PostModel> currentQuery = currentSession.createQuery("from posts ", PostModel.class);

        return currentQuery.getResultList();
    }

    @Override
    public PostModel getPostById(long id) {
        Session currentSession = sessionFactory.getCurrentSession();

        return currentSession.get(PostModel.class, id);
    }

    @Override
    public void savePost(PostModel post) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(post);

    }

    @Override
    public void deletePost(PostModel post) {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<PostModel> currentQuery = currentSession.createQuery("delete from posts where id=:postId ", PostModel.class);
        currentQuery.setParameter("postId", post.getId());
        currentQuery.executeUpdate();

    }
}
