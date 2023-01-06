import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.mhn.storewebappjakartaee.model.entity.User;
import com.mhn.storewebappjakartaee.model.service.UserService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UserServiceTest {

    private UserService userService = UserService.getUserService();

    @Test
    public void testSave() throws Exception {
        User user = User.builder().userName("testuser").password("testpassword").build();
        User savedUser = userService.save(user);
        assertEquals("testuser", savedUser.getUserName());
        assertEquals("testpassword", savedUser.getPassword());
    }

    @Test
    void testUpdate() throws Exception {
        User user = userService.save(User.builder().userName("test_user").password("test_password").build());
        user.setUserName("Mohsen");
        userService.update(user);
        assertEquals("Mohsen", userService.findById(user.getId()).getUserName());
    }

    @Test
    void testFindById() throws Exception {
        User user = userService.save(User.builder().userName("Mohsen").password("Mohsen123").build());
        assertEquals(user.getId(), userService.findById(user.getId()).getId());
    }

    @Test
    void testFindAll() throws Exception {
        userService.save(User.builder().userName("test_user_1").password("test_password_1").build());
        userService.save(User.builder().userName("test_user_2").password("test_password_2").build());
        List<User> users = userService.findAll();
        assertEquals(2, users.size());
    }

    @Test
    void testDelete() throws Exception {
        User user = userService.save(User.builder().userName("test_user").password("test_password").build());
        userService.delete(user.getId());
        assertNull(userService.findById(user.getId()));
    }

}
