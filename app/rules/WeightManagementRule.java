package rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

@Rule(name = "Weight Management rule", description = "to gain or to lose.")
public class WeightManagementRule {

    /**
     * The user input which represents the data that the rule will operate on.
     */
    private String goal;
    private String result;

    @Condition
    public boolean checkInput() {
        //The rule should be applied only if the user's response is yes (duke friend)
        return (goal.equalsIgnoreCase("gain") | goal.equalsIgnoreCase("lose"));
    }

    @Action(order = 1)
    public void checkGain() throws Exception {
        if (goal.equalsIgnoreCase("gain")){
        	result = String.format("You need to workout");
        }
    }
    
    @Action(order = 2)
    public void checkLose() throws Exception {
        if (goal.equalsIgnoreCase("lose")){
        	result = String.format("You need to cardio and Workout");
        }
    }

    public void setInput(String goal) {
        this.goal = goal;
    }
    public String getResult() {
        return result;
    }
}
