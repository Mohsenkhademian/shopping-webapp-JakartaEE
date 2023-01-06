package serviceTest;

import com.mhn.storewebappjakartaee.model.entity.Admin;
import com.mhn.storewebappjakartaee.model.service.AdminService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AdminServiceTest {
    private AdminService adminService = AdminService.getAdminService();

    @Test
     void testSave() throws Exception{
        Admin admin = Admin.builder().userName("admin").password("admin123").build();
        Admin savedAdmin = adminService.save(admin);
        assertEquals("admin" , savedAdmin.getUserName());
        assertEquals("admin123" , savedAdmin.getPassword());
    }

    @Test
    void testUpdate() throws Exception {
        Admin admin = adminService.save(Admin.builder().userName("Mohsen").password("Mohsen123").build());
        admin.setUserName("Hossein");
        adminService.update(admin);
        assertEquals("Hossein", adminService.findById(admin.getId()).getUserName());
    }

    @Test
    void testFindById() throws Exception{
        Admin admin = adminService.save(Admin.builder().userName("Mohsen").password("Mohsen123").build());
        assertEquals(admin.getId(),adminService.findById(admin.getId()).getId());
    }

    @Test
    void testFindAll() throws Exception{
        Admin admin1 = adminService.save(Admin.builder().userName("Mohsen").password("Mohsen12345678").build());
        Admin admin2 = adminService.save(Admin.builder().userName("Hossein").password("Hossein98765").build());
        List<Admin> adminList = adminService.findAll();
        assertEquals(2 , adminList.size());
    }

    @Test
    void testDelete() throws Exception{
        Admin admin = adminService.save(Admin.builder().userName("Ali").password("Ali123").build());
        adminService.delete(admin.getId());
        assertNull(adminService.findById(admin.getId()));
    }
}
