package main.metamodel;

public class Transition{
	private String event;
    private State target;
    private String operationVariableName;
    private String conditionVariableName;
    private Integer conditionComparedValue;
    private Integer operationValue;
    private boolean setOperation;
    private boolean incrementOperation;
    private boolean decrementOperation;
    private boolean conditionEqual;
    private boolean conditionGreaterThan;
    private boolean conditionLessThan;
	
    public Transition(String event, State target) {
        this.event = event;
        this.target = target;
    }
    
	public String getEvent() {
		// TODO Auto-generated method stub
		return event;
	}

	public State getTarget() {
		// TODO Auto-generated method stub
		return target;
	}

	public boolean hasSetOperation() {
		// TODO Auto-generated method stub
		return setOperation;
	}

	public boolean hasIncrementOperation() {
		// TODO Auto-generated method stub
		return incrementOperation;
	}

	public boolean hasDecrementOperation() {
		// TODO Auto-generated method stub
		return decrementOperation;
	}

	public String getOperationVariableName() {
		// TODO Auto-generated method stub
		return operationVariableName;
	}

	public boolean isConditional() {
		// TODO Auto-generated method stub
		return conditionVariableName != null;
	}

	public String getConditionVariableName() {
		// TODO Auto-generated method stub
		return conditionVariableName;
	}

	public Integer getConditionComparedValue() {
		// TODO Auto-generated method stub
		return conditionComparedValue;
	}
	
	public Integer getOperationValue() {
		// TODO Auto-generated method stub
		return operationValue;
	}

	public boolean isConditionEqual() {
		// TODO Auto-generated method stub
		return conditionEqual;
	}

	public boolean isConditionGreaterThan() {
		// TODO Auto-generated method stub
		return conditionGreaterThan;
	}

	public boolean isConditionLessThan() {
		// TODO Auto-generated method stub
		return conditionLessThan;
	}

	public boolean hasOperation() {
		// TODO Auto-generated method stub
		return setOperation || incrementOperation || decrementOperation;
	}
	
	public void setOperation(String varName, int i) {
        this.operationVariableName = varName;
        this.operationValue = i;
        this.setOperation = true;
    }

    public void incrementOperation(String varName) {
        this.operationVariableName = varName;
        this.incrementOperation = true;
    }

    public void decrementOperation(String varName) {
        this.operationVariableName = varName;
        this.decrementOperation = true;
    }

    public void setCondition(String varName, Integer value, boolean eq, boolean gt, boolean lt) {
        this.conditionVariableName = varName;
        this.conditionComparedValue = value;
        this.conditionEqual = eq;
        this.conditionGreaterThan = gt;
        this.conditionLessThan = lt;
    }
    
}
