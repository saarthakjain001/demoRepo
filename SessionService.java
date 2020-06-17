package com.example.sessionservice.service;

import java.util.Map;

import com.example.sessionservice.domain.Sessions;

public interface SessionService {

    Sessions generateSession(String userName);

    Sessions validateSession(Long sessionId);

    //TODO Add the method to end the Session using sessionId 

}