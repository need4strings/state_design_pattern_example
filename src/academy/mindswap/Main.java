package academy.mindswap;

import academy.mindswap.context.Context;
import academy.mindswap.states.StartState;
import academy.mindswap.states.StopState;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        //pausing the game
        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
