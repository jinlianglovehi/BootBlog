package userinfo;

/**
 * Created by jinliang on 16-10-20.
 */


import com.huadou.cn.BootBlogApplication;
import com.huadou.cn.plateform.mapper.UserMapper;
import com.huadou.cn.plateform.model.User;
import com.huadou.cn.utils.PrintUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BootBlogApplication.class)
@WebAppConfiguration //
public class ApplicationTests {

    private static final String TAG = ApplicationTests.class.getSimpleName();
    @Autowired
    private UserMapper userMapper;
    @Test
    @Rollback
    public void findByName() throws Exception {
        userMapper.insert("AAA", 20);
        User u = userMapper.findByName("jinliang");

        PrintUtils.printData(TAG," findByName" ,"  username:"+ u.getUsername() +",age:"+ u.getAge() );
        Assert.assertEquals(30, u.getAge());
    }


}
