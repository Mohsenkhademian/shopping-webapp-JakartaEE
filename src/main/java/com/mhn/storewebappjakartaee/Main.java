package com.mhn.storewebappjakartaee;

import com.mhn.storewebappjakartaee.model.entity.Admin;
import com.mhn.storewebappjakartaee.model.entity.User;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.UserService;

public class Main {
    public static void main(String[] args) throws Exception {
        /*         Test For User                                                  */
        User user = User.builder().userName("moshen").password("moshen123").build();
        User user1 = User.builder().userName("mamad").password("mamad123").build();
        UserService.getUserService().save(user);
        user.setUserName("ali");
        user.setId(3L);
        user.setPassword("ali123");
        UserService.getUserService().update(user);
        System.out.println(UserService.getUserService().findById(1L).toString());
        UserService.getUserService().delete(1L);
        System.out.println(UserService.getUserService().findAll().toString());

        /* ---------------------------------------------------------------------- */

//        Admin admin = Admin.builder().userName("mohsenAdmin").password("admin123").build();

    }
}
