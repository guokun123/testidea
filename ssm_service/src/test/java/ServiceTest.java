

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsSerivce;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ServiceTest {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsSerivce itemsSerivce =  (ItemsSerivce)ap.getBean("itemsSerivceImpl");
        List<Items> list = itemsSerivce.list();
        for (Items items : list) {
            System.out.println(items);
        }

    }
}
