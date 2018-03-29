package xyz.wongs;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**  defaultRollback = false 不回滚事务，如果需要测试后保留干净，建议开始
 * @author WCNGS@QQ.COm
 * @date 2018/1/15 9:05
 **/
@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/spring-context*.xml" })
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public abstract class BaseUnit {

//    ApplicationContext ctx = null;
//
//    @Before
//    public void init() {
//        ctx = new FileSystemXmlApplicationContext( "classpath*:/spring-context*.xml");
//    }

}
