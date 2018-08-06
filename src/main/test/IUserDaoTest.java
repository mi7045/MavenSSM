import com.mjb.user.dao.UserDao;
import com.mjb.user.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: MavenSSM
 * @description: ${description}
 * @author: mijiabin
 * @create: 2018-07-26 19:17
 **/
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/db/spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private UserDao dao;

    @Test
    public void testSelectUser() throws Exception {
        long id = 1;
        User user = dao.selectUser(id);
        System.out.println(user.getUsername());
    }
}
