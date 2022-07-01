package com.survivingcodingbootcamp.blog.model;

import javax.persistence.*;
import javax.print.attribute.standard.Destination;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Hashtag {

    @Id
    @GeneratedValue
    private long id;
    private String hashtag;

    @ManyToMany(mappedBy = "hashtags")
    private Collection<Post> posts;

    public Hashtag(String hashtag){
        this.hashtag = hashtag;
        this.posts = new ArrayList<Post>();
    }
    public Hashtag(){
    }

    public long getId() {
        return id;
    }

    public String getHashtag() {
        return hashtag;
    }

    public Collection<Post> getPosts() {
        return posts;
    }
}
