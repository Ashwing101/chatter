package com.social.media.service;


import com.social.media.models.SocialUser;
import com.social.media.respositories.SocialUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SocialService {
    @Autowired
    SocialUserRepository socialUserRepository;


    public List<SocialUser> getAllUsers(){

     return  socialUserRepository.findAll();
//        if(socialUsers.isEmpty()) return new ArrayList<>();
//        else return  socialUsers;

    }

    public SocialUser saveUser(SocialUser socialUser){
        return socialUserRepository.save(socialUser);
    }
}
