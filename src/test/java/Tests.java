import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.evshou.entity.BlogOptions;
import com.evshou.entity.BlogPosts;
import com.evshou.entity.BlogPostsCategory;
import com.evshou.entity.BlogUsers;
import com.evshou.mapper.BlogOptionsMapper;
import com.evshou.mapper.BlogPostsCategoryMapper;
import com.evshou.mapper.BlogPostsMapper;
import com.evshou.mapper.BlogUsersMapper;
import com.evshou.util.DruidUtils;
import com.evshou.util.MybatisUtils;
import com.github.pagehelper.PageHelper;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

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
        QueryRunner qr=new QueryRunner(DruidUtils.getDataSource());
        Object o=null;
        try{
            o=qr.query("select count(category_id) from blog_posts_category",new ScalarHandler<>());
        }catch (Exception e){}
        System.out.println(o);
        System.out.println(o.getClass());
    }
    @Test
    public void test4(){
        SqlSession ss = MybatisUtils.getSqlSession();
        BlogPostsCategoryMapper mapper = ss.getMapper(BlogPostsCategoryMapper.class);
        List<BlogPostsCategory> allCategory = mapper.getAllCategory();
        String s = JSON.toJSONString(allCategory, SerializerFeature.PrettyFormat);
        String str="{\n" +
                "  \"code\": 0,\n" +
                "  \"msg\": \"\",\n" +
                "  \"count\": 1000,\n" +
                "  \"data\": "+s+"\n" +
                "} ";
        System.out.println(str);
    }
    @Test
    public void test5(){
        SqlSession ss = MybatisUtils.getSqlSession();
        BlogPostsMapper mapper = ss.getMapper(BlogPostsMapper.class);
        List<BlogPosts> allPosts = mapper.getAllPosts();
        String s = JSON.toJSONString(allPosts, SerializerFeature.PrettyFormat);
        String str="{\n" +
                "  \"code\": 0,\n" +
                "  \"msg\": \"\",\n" +
                "  \"count\": 1000,\n" +
                "  \"data\": "+s+"\n" +
                "} ";
        System.out.println(str);
    }
    @Test
    public void test6(){
        SqlSession ss = MybatisUtils.getSqlSession();
        BlogPostsCategoryMapper mapper = ss.getMapper(BlogPostsCategoryMapper.class);
        BigInteger size = mapper.getAllPostsByCategory();
        System.out.println(size);
    }
    @Test
    public void test7(){
        SqlSession ss = MybatisUtils.getSqlSession();
        BlogPostsCategoryMapper mapper = ss.getMapper(BlogPostsCategoryMapper.class);
        PageHelper.startPage(1,3);
        List<BlogPostsCategory> allCategory = mapper.getAllCategory();
        for (BlogPostsCategory category : allCategory) {
            System.out.println(category);
        }
    }
    @Test
    public void test8() throws Exception {
        Properties pro=new Properties();
        pro.load(new InputStreamReader(new FileInputStream(
                new File("target/testBlog/WEB-INF/webConfig.properties"))));
        System.out.println("网站标题:"+pro.getProperty("webTitle"));
        System.out.println("网站副标题:"+pro.getProperty("webTitle2"));
        System.out.println("网站地址:"+pro.getProperty("webUrl"));
        System.out.println("电子邮箱:"+pro.getProperty("web_email"));
    }
    @Test
    public void test9(){
        SqlSession ss = MybatisUtils.getSqlSession();
        BlogOptionsMapper mapper = ss.getMapper(BlogOptionsMapper.class);
        BlogOptions blogOptions = mapper.selectByPrimaryKey(1);
        System.out.println(blogOptions.getOptionsId());
    }
}
