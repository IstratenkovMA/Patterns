package controller;


public class Context {
    Strategy strategy;

    public Context() {
    }

    private void setStrategy(User user) {
        if(user.getCarma() >= 200){
            strategy = new GoodUserStrategy();
        }
        else if(user.getCarma() < 0) {
            strategy = new BadUserStrategy();
        }
        else {
            strategy = new CommonUserStrategy();
        }
    }

    public void executeStrategy(User user){
        setStrategy(user);
        strategy.showStatus(user);
    }
}
