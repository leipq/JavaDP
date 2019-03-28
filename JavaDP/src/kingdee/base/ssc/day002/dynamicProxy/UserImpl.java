package kingdee.base.ssc.day002.dynamicProxy;

public class UserImpl implements UserInfo {
    @Override
    public void queryUser() {
        System.out.println("UserInfo queryUser...");
    }

    @Override
    public void updateUser() {
        System.out.println("UserInfo updateUser...");
    }
}
