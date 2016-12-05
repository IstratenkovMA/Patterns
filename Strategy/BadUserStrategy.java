package controller;


public class BadUserStrategy implements Strategy {
    @Override
    public void showStatus(User user) {
        System.out.println("Bad user: " + user.getName());
    }
}
