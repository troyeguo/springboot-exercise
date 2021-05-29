package vip.memberly;

import org.junit.runner.RunWith;
import vip.memberly.JavaApplication;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import vip.memberly.mapper.UserMapper;
import vip.memberly.pojo.User;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JavaApplication.class)
public class MybatisTest {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    public void test() {
        List<User> users = userMapper.getAllUser();
        System.out.println(users);
    }
}
