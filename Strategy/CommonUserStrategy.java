package controller;


public class CommonUserStrategy implements Strategy {
    @Override
    public void showStatus(User user) {
        System.out.println("Normal user: " + user.getName());
    }
}
