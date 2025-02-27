package main.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {
	private List<State> states = new ArrayList<>();
	private State initialState;
	private Map<String, Integer> variables = new HashMap<>();

	public List<State> getStates() {
		// TODO Auto-generated method stub
		return states;
	}

	public State getInitialState() {
		// TODO Auto-generated method stub
		return initialState;
	}
	
	public void setInitialState(State state) {
        this.initialState = state;
    }

	public State getState(String string) {
		// TODO Auto-generated method stub
		for (State state : states) {
            if (state.getName().equals(string)) {
                return state;
            }
        }
        return null;
	}
	
	public void addState(State state) {
        states.add(state);
    }

	public int numberOfIntegers() {
		// TODO Auto-generated method stub
		return variables.size();
	}

	public boolean hasInteger(String string) {
		// TODO Auto-generated method stub
		return variables.containsKey(string);
	}
	
	public void setInteger(String string, int i) {
        variables.put(string, i);
    }
	
	public int getInteger(String string) {
        return variables.getOrDefault(string, 0);
    }
}

