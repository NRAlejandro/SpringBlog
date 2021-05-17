package com.nralejandro.springblog.dao;

import com.nralejandro.springblog.model.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostDao extends JpaRepository<PostModel, Long> {

}
