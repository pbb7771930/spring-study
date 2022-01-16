package service;

import dao.UserDao;
import dao.UserDao2Impl;
import dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    //默认的UserDaoImpl对象
    //UserDao userDao = new UserDaoImpl();

    //新增了一个UserDao2Impl后，用户要调用他的方法，那么就要实例化UserDao2Impl，该处代码就要修改；特别是大量用到该方法的调用时。
    //UserDao userDao = new UserDao2Impl();

    //新增了一个UserDao3Impl后，用户要调用他的方法，那么就要实例化UserDao3Impl，该处代码就要修改，破坏程序的完整性。
    //UserDao userDao = new UserDao3Impl();

    //由于上面的这个缺点，我们利用set进行动态实现值的注入，这样实际使用时只要传入要使用的UserDao对象即可。
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
