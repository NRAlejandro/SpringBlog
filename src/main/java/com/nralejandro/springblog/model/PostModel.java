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
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @Column
    private String body;

    //@Column
    //private Date timestamp;

}
