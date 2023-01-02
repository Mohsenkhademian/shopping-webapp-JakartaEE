package com.mhn.storewebappjakartaee;

import com.mhn.storewebappjakartaee.model.entity.User;
import com.mhn.storewebappjakartaee.model.service.UserService;

public class Main {
    public static void main(String[] args) throws Exception {
        User user = User.builder().userName("moshen").password("moshen123").build();
        UserService.getUserService().save(user);
        //////sfnjnfsf

    }
}
