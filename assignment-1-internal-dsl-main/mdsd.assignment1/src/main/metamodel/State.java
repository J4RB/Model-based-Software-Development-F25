package main.metamodel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class State {
	private String name;
	private List<Transition> transitions = new ArrayList<>();

	public State(String string) {
		this.name = string;
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public List<Transition> getTransitions() {
		// TODO Auto-generated method stub
		return transitions;
	}

	public List<Transition> getTransitionByEvent(String string) {
		// TODO Auto-generated method stub
		return transitions.stream()
                .filter(transition -> transition.getEvent().equals(string))
                .collect(Collectors.toList());
	}
	
	public void addTransition(Transition transition) {
        transitions.add(transition);
    }
}
