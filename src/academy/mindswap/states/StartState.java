package academy.mindswap.states;

import academy.mindswap.context.Context;

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Game is in start mode!!!");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
