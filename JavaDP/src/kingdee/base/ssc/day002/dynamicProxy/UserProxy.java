package kingdee.base.ssc.day002.dynamicProxy;

public class UserProxy implements UserInfo{
    private UserInfo userImpl;
    public UserProxy(UserInfo userImpl) {
        this.userImpl = userImpl;
    }

    @Override
    public void queryUser() {
        System.out.println("UserProxy queryUser...");
        System.out.println("UserProxy queryUser doMyThings before...");
        userImpl.queryUser();
        System.out.println("UserProxy queryUser doMyThings after...");
    }

    @Override
    public void updateUser() {
        System.out.println("UserProxy updateUser...");
        System.out.println("UserProxy updateUser doMyThings before...");
        userImpl.updateUser();
        System.out.println("UserProxy updateUser doMyThings after...");
    }
}
