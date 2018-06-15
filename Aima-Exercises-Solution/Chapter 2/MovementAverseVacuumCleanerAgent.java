import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import aima.core.agent.Action;
import aima.core.agent.Model;
import aima.core.agent.Percept;
import aima.core.agent.impl.AbstractAgent;
import aima.core.agent.impl.DynamicState;
import aima.core.agent.impl.aprog.ModelBasedReflexAgentProgram;
import aima.core.agent.impl.aprog.simplerule.EQUALCondition;
import aima.core.agent.impl.aprog.simplerule.ORCondition;
import aima.core.agent.impl.aprog.simplerule.Rule;
import aima.core.environment.vacuum.LocalVacuumEnvironmentPercept;
import aima.core.environment.vacuum.VacuumEnvironment;

/**
 * This class implements a rational agent for the situation described in exercise 2.10.
 * The agent is model based and uses the state to make sure that agent only moves once in its lifetime.
 * 
 * @author Sven Gregorio
 *
 */
public class MovementAverseVacuumCleanerAgent extends AbstractAgent {
	private static final String ATTRIBUTE_CURRENT_LOCATION = "currentLocation";
	private static final String ATTRIBUTE_CURRENT_STATE = "currentState";
	private static final String ATTRIBUTE_HAS_MOVED = "hasMoved";
	private static final String TRUE = "TRUE";
	private static final String FALSE = "FALSE";
	
	public MovementAverseVacuumCleanerAgent() {
		super(new ModelBasedReflexAgentProgram() {
			@Override
			protected void init() {
				DynamicState state = new DynamicState();
				state.setAttribute(ATTRIBUTE_HAS_MOVED, FALSE);
				setState(state);
				setRules(getRuleSet());
			}

			@Override
			protected DynamicState updateState(DynamicState state, Action action, Percept percept, Model model) {
				LocalVacuumEnvironmentPercept vep = (LocalVacuumEnvironmentPercept) percept;
				
				state.setAttribute(ATTRIBUTE_CURRENT_LOCATION, vep.getAgentLocation());
				state.setAttribute(ATTRIBUTE_CURRENT_STATE, vep.getLocationState());
				if(Objects.equals(VacuumEnvironment.ACTION_MOVE_LEFT, action) ||
						Objects.equals(VacuumEnvironment.ACTION_MOVE_RIGHT, action)) {
					state.setAttribute(ATTRIBUTE_HAS_MOVED, TRUE);
				}
				return state;
			}
		});
	}

	private static Set<Rule> getRuleSet() {
		// Note: Using a LinkedHashSet so that the iteration order (i.e. implied
		// precedence) of rules can be guaranteed.
		Set<Rule> rules = new LinkedHashSet<Rule>();

		rules.add(new Rule(new ORCondition(
				new EQUALCondition(ATTRIBUTE_HAS_MOVED,	TRUE),
				new EQUALCondition(ATTRIBUTE_CURRENT_STATE,	VacuumEnvironment.LocationState.Dirty)),
				VacuumEnvironment.ACTION_SUCK));
		rules.add(new Rule(new EQUALCondition(ATTRIBUTE_CURRENT_LOCATION, VacuumEnvironment.LOCATION_A),
				VacuumEnvironment.ACTION_MOVE_RIGHT));
		rules.add(new Rule(new EQUALCondition(ATTRIBUTE_CURRENT_LOCATION, VacuumEnvironment.LOCATION_B),
				VacuumEnvironment.ACTION_MOVE_LEFT));

		return rules;
	}

}
