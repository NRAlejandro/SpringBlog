package com.nralejandro.springblog.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="posts")
@Getter
@Setter
@NoArgsConstructor
public class PostModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    //@Column
    //private Date timestamp;

}
