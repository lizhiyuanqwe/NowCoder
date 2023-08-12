package edu.bjtu;
import edu.bjtu.community.App;
import edu.bjtu.community.dao.DiscussPostMapper;
import edu.bjtu.community.dao.UserMapper;
import edu.bjtu.community.entity.DiscussPost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Unit test for simple App.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = App.class)
public class AppTest 
{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;


    @Test
    public void hello(){
        System.out.println("hello");;
    }

    @Test
    public void testSelectPosts(){
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0,0,10,0);
        for (DiscussPost post : list){
            System.out.println(post);
        }
    }


}

