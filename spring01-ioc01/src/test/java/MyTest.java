import com.example.spring01_ioc01.dao.UserDaoImpl;
import com.example.spring01_ioc01.dao.UserDaoMysqlImpl;
import com.example.spring01_ioc01.service.UserService;
import com.example.spring01_ioc01.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        // 用户实际调用的是业务层, dao层他们不需要解除
        UserService userService = new UserServiceImpl();

        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
        userService.getUser();
    }
}
