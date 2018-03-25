package com.security.exam.user;

import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Component;

@Component
public class AuthentcationEventHandlers {

    //시큐리티 이벤트 리스너 등록
    @EventListener
    public void handleBadCredential(AuthenticationFailureBadCredentialsEvent event){
        System.out.println(event.getAuthentication().getPrincipal() + "인증 시도중....");
        System.out.println("비번잘못되었습니다..");
    }
}
