package com.andyadc.mybatis;

/**
 * @author andy.an
 * @since 2018/10/25
 */
public class UserTest {

    public static void main(String[] args) {
        MapperProxy proxy = new MapperProxy();

        UserMapper mapper = proxy.newInstance(UserMapper.class);
        User user = mapper.getUserById(1);

        System.out.println(user);
        System.out.println(mapper);
    }
}
