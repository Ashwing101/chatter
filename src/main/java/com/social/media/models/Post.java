package com.social.media.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long Id;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private SocialUser socialUser;
}
