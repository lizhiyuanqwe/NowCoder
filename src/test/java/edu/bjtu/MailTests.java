package edu.bjtu;

import edu.bjtu.community.App;
import edu.bjtu.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = App.class)
public class MailTests {

    @Autowired
    private MailClient mailClient;


    @Test
    public void testTextMail() {
        mailClient.sendMail("zhiyuanli@bjtu.edu.cn", "TEST", "Welcome.");
    }



}
