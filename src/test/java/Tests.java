import com.evshou.entity.BlogUsers;
import com.evshou.mapper.BlogUsersMapper;
import com.evshou.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class Tests {
    @Test
    public void test1(){
        SqlSession ss = MybatisUtils.getSqlSession();
        BlogUsersMapper um = ss.getMapper(BlogUsersMapper.class);
        List<BlogUsers> allUsers = um.getAllUsers();
        for (BlogUsers allUser : allUsers) {
            System.out.println(allUser);
        }
    }
    @Test
    public void test2() throws ParseException {
        SqlSession ss = MybatisUtils.getSqlSession();
        BlogUsersMapper mapper = ss.getMapper(BlogUsersMapper.class);
        Date date;
        date=new Date(System.currentTimeMillis());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date parse = sdf.parse(sdf.format(date));
        BlogUsers users=new BlogUsers();
        users.setUsername("admin1");
        users.setPassword("admin1");
        users.setRolename("admin1");
        users.setSex("男");
        users.setEmail("admin1@qq.com");
        users.setMobile("111");
        users.setRegistered(parse);
        int i;
        try{
            i=mapper.insertSelective(users);
            if(i>0) System.out.println("注册成功");
            ss.commit();
        }catch (Exception e){
            System.out.println("注册失败,事务回滚");
            ss.rollback();
        }finally {
            ss.close();
        }
        System.out.println(parse);
    }
    @Test
    public void test3(){
        Object o = null;
        SqlSession ss = MybatisUtils.getSqlSession();
        BlogUsersMapper um = ss.getMapper(BlogUsersMapper.class);
        List<BlogUsers> allUsers = um.getAllUsers();
        for (BlogUsers allUser : allUsers) {
            o=allUser.getRegistered();
        }
        System.out.println(o.getClass());
    }
}
