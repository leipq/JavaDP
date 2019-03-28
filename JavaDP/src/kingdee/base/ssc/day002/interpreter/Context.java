package kingdee.base.ssc.day002.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<Character, Double> variable;
    public Map<Character, Double> getVariable() {
        if (this.variable == null)
        {
            this.variable = new HashMap<>();
        }
        return this.variable;
    }
}
