package test;

import com.journaldev.beanservice.ClientAnnotationApp;
import com.journaldev.beanservice.DIConfiguration;
import com.journaldev.beanservice.EmailAnnotationApp;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by thangnguyen-imac on 10/22/16.
 */

public class AppTest {

    private AnnotationConfigApplicationContext context = null;

    @Before
    public void setUp() throws Exception{
        context = new AnnotationConfigApplicationContext(DIConfiguration.class);
    }

    @After
    public void tearDown() throws Exception{
        context.close();
    }

    @Test
    public void Test(){
        EmailAnnotationApp annotationApp = context.getBean(EmailAnnotationApp.class);
        Assert.assertTrue(annotationApp.processMessage("Thang", "test"));
    }
}
