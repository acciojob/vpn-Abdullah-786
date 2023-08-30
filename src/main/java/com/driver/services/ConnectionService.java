package com.driver.services;


import com.driver.model.User;
import org.springframework.stereotype.Service;

@Service
public interface ConnectionService {

    User connect(int userId, String countryName) throws Exception;

    User disconnect(int userId) throws Exception;

    User communicate(int senderId, int receiverId) throws Exception;
}
