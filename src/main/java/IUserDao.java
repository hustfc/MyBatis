import java.util.*;

public interface IUserDao {
    //用户的持久层接口

    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();
}
