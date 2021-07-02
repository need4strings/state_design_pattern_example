package academy.mindswap.states;

import academy.mindswap.context.Context;

public interface State {
    void doAction(Context context);
}
