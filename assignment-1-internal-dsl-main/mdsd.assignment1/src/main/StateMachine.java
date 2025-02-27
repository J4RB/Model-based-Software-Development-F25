package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {
	private Machine machine = new Machine();
    private State currentState;
    private Transition currentTransition;

	public Machine build() {
		// TODO Auto-generated method stub
		return machine;
	}

	public StateMachine state(String string) {
		// TODO Auto-generated method stub
		currentState = machine.getState(string);
        if (currentState == null) {
            currentState = new State(string);
            machine.addState(currentState);
        }
        return this;
	}

	public StateMachine initial() {
		// TODO Auto-generated method stub
		machine.setInitialState(currentState);
        return this;
	}

	public StateMachine when(String string) {
		// TODO Auto-generated method stub
		currentTransition = new Transition(string, null);
        return this;
	}

	public StateMachine to(String string) {
		// TODO Auto-generated method stub
		State target = machine.getState(string);
        if (target == null) {
            target = new State(string);
            machine.addState(target);
        }
        currentTransition = new Transition(currentTransition.getEvent(), target);
        currentState.addTransition(currentTransition);
        return this;
	}

	public StateMachine integer(String string) {
		// TODO Auto-generated method stub
		if (!machine.hasInteger(string)) {
            machine.setInteger(string, 0);
        }
        return this;
	}

	public StateMachine set(String string, int i) {
		// TODO Auto-generated method stub
		currentTransition.setOperation(string, i);
        return this;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		currentTransition.incrementOperation(string);
        return this;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		currentTransition.decrementOperation(string);
        return this;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		currentTransition.setCondition(string, i, true, false, false);
        return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		currentTransition.setCondition(string, i, false, true, false);
        return this;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		currentTransition.setCondition(string, i, false, false, true);
        return this;
	}

}
