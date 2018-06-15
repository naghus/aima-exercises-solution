# Chapter 2 - Intelligent Agents #

TODO: 1-13

## Question 2.1 ##
Let us examine the rationality of various vacuum-cleaner agent functions.

1. Show that the simple vacuum-cleaner agent function described in Figure 2.3 is indeed rational under the assumptions listed on page 38.
2. Describe a rational agent function for the case in which each movement costs one point.
  Does the corresponding agent program require an internal state?
3. Discuss possible agent designs for the cases in which clean squares can become dirty and the geography of the environment is unknown.
  Does it make sense for the agent to learn from its experience in these cases?
  If so, what should it learn? If not, why not?

### Solution ###
1. Let s(k) the agent's performance score at time step k.  
  With a case distinction, at time step k, we have:
  
   * (a) The environment is clean:  
   Independent of the agent's action, we have s(k+1) = s(k) + 2.  
   Any action would be rational.
   
   * (b) The agent is on a dirty square, and the other is clean:  
   If the agent cleans, we have s(k + 1) = s(k) + 2, and we go to situation (a).  
   If the agent moves, we have s(k + 1) = s(k) + 1, and we go to situation (c).  
   As the agent would get 2 points increase at each time step after cleaning, and at least 1 points less by moving, we can conclude that its rational to clean in this situation.
   
   * (c) The agent is on a clean square, and the other is dirty:  
   If the agent cleans, we have s(k+1) = s(k) + 1, and we stay in situation (c).  
   If the agent moves, we have s(k+1) = s(k) + 1, and we go to situation (b).  
   As the agent can get more points by going to situation (b), it is rational for it to move.
   
   * (d) Both squares are dirty:  
   If the agent cleans, we have s(k+1) = s(k) + 1 and we go to situation (c).  
   If the agent moves, we have s(k+1) = s(k) and we stay in situation (d).  
   As the agent always gets more point by cleaning and going to situation (c) it would be rational to clean.
   
   From our case distinction, we can see that the agent described in Figure 2.3 is always rational.

2. In this situation a rational agent would clean the first square if it is dirty, move, and then clean in each time step.
This agent requires an internal state to remember if it has already moved, else it wouldn't have enough information to know if it is allowed to move. 
 
3. A rational agent in this task environment would need to learn to the geography of the place, by exploring, and to look for patterns in how the dirt comes up.

   If the pattern is totally random it would be best to find a route through the environment which visits all squares exactly once, an use it to _patrol_ the environment.
   But finding such routes (Hamiltonian Circles) is a computationally hard problem, so it could maybe be more rational to find an approximation instead of searching the best route for hours.  
   If there is no such route, it would need to find a suboptimal route which allows it to still visit most squares efficiently, while ignoring the ones which are counterproductive to clean.  
   If there is a pattern, the agent should be able to exploit it to maximize its performance.
   
   To learn the geography, the agent could treat the environment as a graph and execute a depth first search.
   To find patterns it should try to analyze its percept sequence, while assuming the random pattern until it hasn't found a better pattern.
	

## Question 2.2 ##
Write an essay on the relationship between evolution and one or more of autonomy, intelligence and learning.

### Solution ###

Skipped

## Question 2.3 ##
For each of the following assertions, say whether it is true of false and support your answer with examples of counterexamples where appropriate.

1. An agent that senses only partial information about the state cannot be perfectly rational.
2. There exists task environments in which no pure reflex agent can behave normally.
3. The exists a task environment in which every agent is rational.
4. The input to an agent program is the same as the input to the agent function.
5. Every agent function is implementable by some program/machine combination.
6. Suppose an agent selects its action uniformly at random from the set of possible actions. There exist a deterministic task environment in which this agent is rational.
7. It is possible for a given agent to be perfectly rational in two distinct task environments.
8. Every agent is rational in an unobservable environment.
9. A perfectly rational poker-playing agent never loses.

### Solution ###

1. False, in exercise 2.1 we showed that the vacuum cleaner agent described in Figure 2.3 is perfectly rational for its task environment, albeit it has only partial information on the state.
2. True, we have given an example of this in exercise 2.1.2
3. True, if the performance measure is a constant function, or a function which isn't influenced by any actions an agent can perform, then all agents are rational.
4. False, an agent function takes a percept sequence as input, while the program only takes percepts.
5. False, only the agent functions we can describe with algorithm are implementable by an agent program.
For example we can't implement an agent program which solves the halting problem, when each percept is an instance of the problem. 
6. True, for example in a deterministic task environment with a performance score defined as in (3).
7. True, for two task environments like in (3).
8. False, if the task environment is at least partially known, we can use this knowledge to build a rational agent.  
   For example, if the vacuum-cleaner world described on page 38 were unobservable, it would still be rational for an agent to repeat the actions _Clean_, _Left_, _Clean_, _Right_ in loop, instead of only moving.
9. False, because in poker, a player's skill can only improve the probability he wins. But the win probability can never be 100% against any opponent, simply because there is luck involved.


## Question 2.4 ##
For each of the following activities, gives a PEAS description of the task environment and characterize it in terms of the properties listed in Section 2.3.2

1. Performing a gymnastics floor routine.
2. Exploring the subsurface oceans of Titan.
3. Playing soccer.
4. Shopping for used AI books on the Internet.
5. Practicing tennis against a wall.
6. Performing a high jump.
7. Bidding on an item at an auction.

### Solution ###
| Agent type | Performance Measure | Environment | Actuators | Sensors | Notes |
| ---------- | ------------------- | ----------- | --------- | ------- | ----- |
| Gymnast    | Judge score, accuracy | Gymnastic floor | Muscles | Touch sensors, accelerometer, eyes | We assume a human-like gymnast |
| Submarine  | Amount of ocean explored, number of discoveries, safety, energy consumption | Subsurface ocean of Titan, rocks, water, debris, lifeforms (improbable) | Motors, robotic arms, wireless data transmitter | Thermometer, pressure sensor, touch sensors, accelerometer | |
| Soccer player | Goals scored against opponent, goals against team prevented, time the ball, accuracy in kicks, ecc. | Soccer field, soccer players, referee, ball | Feet, legs, hands, arms, head | Touch sensors, accelerometer, eyes | We assume a human-like player |
| Shopper | Amount of books bought, duplicates, quality of books, classify correctly | Internet browser | Virtual keyboard, virtual mouse | Rendered web pages | |
| Tennis player | Amount of hits in a row, average speed of the ball, variance of hit positions | Wall, tennis ball, tennis racket | Arms, legs | Accelerometer, eyes | We assume a human-like player |
| High jumper | Jump height, landing | Horizontal bar | Legs, arms, head | Touch sensors, accelerometer, eyes | We assume a human-like player |
| Bidder | Amount of won objects, bid/value ratio | Auction, other bidders | Voice synthesizer | Microphone | |

## Question 2.5 ##
Define in your own words the following terms: agent, agent function, agent program, rationality, autonomy, reflex agent, model-based agent, goal-based agent, utility-based agent, learning agent.

### Solution ###
Skipped

## Question 2.6 ##
This exercise explores the differences between agent functions and agent programs.

1. Can there be more than one agent program that implements a given agent function.
  Give an example, or show why one is not possible.
2. Are there agent functions that cannot be implemented by any agent program?
3. Given a fixed machine architecture, does each agent agent program implement exactly one agent function?
4. Given an architecture with _n_ bits of of storage, how many different possible agent programs are there?
5. Suppose we keep the agent program fixed but speed up the machine by a factor of two.
  Does that change the agent function?

### Solution ###
Skipped

## Question 2.7 ##
Write pseudocode agent programs for the goal-based and utility-based agents.

### Solution ###
```
function GOAL-BASED-MODEL-BASED-AGENT(percept) returns an action
  persistent: state // The agent's current conception of the world state
              model // A description of how the next state depends on the current state and action
              goals // A set of goals 
              action // The most recent action, initially none

  state <- UPDATE-STATE(state, action, percept, model)
  actionEffectPairs <- GET-ACTION-EFFECT-PAIRS(state, model)
  goodActions <- GOAL-MATCH(actionEffectPairs, goals)
  action <- CHOOSE-ANY(goodActions)
```

```
function UTILITY-BASED-MODEL-BASED-AGENT(percept) returns an action
  persistent: state // The agent's current conception of the world state
              model // A description of how the next state depends on the current state and action
              utility // A utility function  
              action // The most recent action, initially none

  state <- UPDATE-STATE(state, action, percept, model)
  actionEffectPairs <- GET-ACTION-EFFECT-PAIRS(state, model)
  actionUtilityPairs <- COMPUTE-UTILITIES(actionEffectPairs, utilities)
  bestActionUtilityPair <- CHOOSE-BEST-UTILITY(actionUtilityPairs)
  action <- bestActionUtilityPair.action
```


## Question 2.8 ##
Consider a simple thermostat that turns on a furnace when the temperature is at least 3 degrees below the setting, and turns off a furnace when the temperature is at least 3 degrees above the setting.
Is a thermostat an instance of a simple reflex agent, a model-based reflex agent, or a goal based agent?

### Solution ###
The thermostat is an instance of a simple reflex agent, since it has no knowledge of its goal, and has no internal state.

***

The following exercises all concern the implementation of environments and agent for the vacuum-cleaner world.

## Question 2.9 ##
Implement a performance-measuring environment simulator for the vacuum-cleaner world depicted in Figure 2.2 and specified on page 38.
Your implementation should be modular so that the sensors, actuators, and environment characteristics (size, shape, dirt placement, etc.) can be changed easily. (_Note:_ for some choices of programming language and operating system there are already implementations in the online code repository.)

### Solution ###
Skipped

## Question 2.10 ##
Consider a modified version of the vacuum environment in Exercise 2.9, in which the agent is penalized one point for each movement.

1. Can a simple reflex agent be perfectly rational for this environment? Explain.
2. What about a reflex agent with state? Design such an agent.
3. How do your answers to **1** and **2** change if the agent's percepts give it the clean/dirty status of every square in the environment?

### Solution ###
1. No, such an agent needs to remember the state of the world to know if it should still look for dirt.
2. Yes, we'll implement it as described in the solution of exercise 2.1.2
3. The answer to **1** would change, since the agent will have the necessary informations to be perfectly rational, the answer of **2** would remain the same. 

## Question 2.11 ##
Consider a modified version of the vacuum environment in Exercise 2.9, in which the geography of the environment -is extent, boundaries, and obstacles- is unknown, as is the initial dirt configuration. (The agent can go _Up_ and _Down_ as well as _Left_ and _Right_.) 

1. Can a simple reflex agent be perfectly rational for this environment? Explain.
2. Can a simple reflex agent with a _randomized_ agent function outperform a simple reflex agent? Design such an agent and measure its performance on several environments.
3. Can you design an environment in which your randomized agent will perform poorly? Show your results.
4. Can a reflex agent with state outperform a simple reflex agent?
  Design such an agent and measure its performance on several environments.
  Can you design a rational agent of this type?

### Solution ###

## Question 2.12 ##
Repeat exercise 2.11 for the case in which the location sensor is replaced with a "bump" sensor that detects the agent's attempts to move into an obstacle or to cross the boundaries of the environment.
Suppose the bump sensor stops working; how should the agent behave?

### Solution ###

## Question 2.13 ##
The vacuum environments in the preceding exercises have all been deterministic.
Discuss possible agent programs for each of the following stochastic versions:

1. Murphy's law: twenty-five percent of the time, the _Suck_ action fails to clean the floor if it is dirty and deposits dirt onto the floor if the floor is clean.
  How is your agent program affected if the dirt sensor gives the wrong answer 10% of the time?
2. Small children: At each time step, each clean square has a 10% chance of becoming dirty.
  Can you come up with a rational agent design for this case?

### Solution ###

