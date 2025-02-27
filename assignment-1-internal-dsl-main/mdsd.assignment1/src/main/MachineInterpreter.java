package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {
	private Machine machine;
    private State currentState;
    private Map<String, Integer> variables = new HashMap<>();
    
    public void run(Machine m) {
        // TODO Auto-generated method stub
    	this.machine = m;
        this.currentState = m.getInitialState();
    }

    public State getCurrentState() {
        // TODO Auto-generated method stub
    	return currentState;
    }

    public void processEvent(String string) {
        // TODO Auto-generated method stub
    	List<Transition> transitions  = currentState.getTransitionByEvent(string);
    	for (Transition transition : transitions) {
            if (transition.isConditional()) {
                int value = variables.getOrDefault(transition.getConditionVariableName(), 0);
                if (transition.isConditionEqual() && value != transition.getConditionComparedValue()) continue;
                if (transition.isConditionGreaterThan() && value <= transition.getConditionComparedValue()) continue;
                if (transition.isConditionLessThan() && value >= transition.getConditionComparedValue()) continue;
            }

            if (transition.hasSetOperation()) {
                variables.put(transition.getOperationVariableName(), transition.getOperationValue());
            }
            if (transition.hasIncrementOperation()) {
                variables.put(transition.getOperationVariableName(), variables.getOrDefault(transition.getOperationVariableName(), 0) + 1);
            }
            if (transition.hasDecrementOperation()) {
                variables.put(transition.getOperationVariableName(), variables.getOrDefault(transition.getOperationVariableName(), 0) - 1);
            }
            currentState = transition.getTarget();
            return;
        }
    }

    public int getInteger(String string) {
        // TODO Auto-generated method stub
    	return variables.getOrDefault(string, 0);
    }

}
