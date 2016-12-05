package controller;

/**
 * Created by IstratenkovMA on 05.12.2016.
 */
public class GoodUserStrategy implements Strategy {
    @Override
    public void showStatus(User user) {
        System.out.println("Good user: " + user.getName());
    }
}
