package academy.mindswap.states;

import academy.mindswap.context.Context;

public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("The Game is in stop mode now!!");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "PAUSE";
    }
}
