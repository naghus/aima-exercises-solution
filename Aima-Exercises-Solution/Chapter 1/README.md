# Chapter 1 - Introduction #

## Question 1.1 ##
Define in your own words:
(1) intelligence, (2) artificial intelligence, (3) agent, (4) rationality, (5) logical reasoning.

### Solution ###
1. Intelligence is the ability to choose between different strategies according to any desired outcome (e.g. eating, learning, explaining something).
2. An artificial intelligence is an intelligent program.
3. An agent is entity which acts upon its environment. 
4. Rationality is the quality of an intelligence, to choose the best possible strategy according to its constraints.
5. Logic reasoning is a kind of reasoning which uses rules (e.g. syllogism) to infer new knowledge from the current knowledge.

## Question 1.2 ##
Every year the Loebner Prize is awarded to the program that comes closest to passing a version of the Turing Test.
Research and report on the latest winner of the Loebner prize.
What techniques does it use?
How does it advance the state of the art in AI?

### Solution ###
The last winner of the Loebner Prize (as of 8 June 2018) is [Mitsuku](http://www.aisb.org.uk/events/loebner-prize#finals2017), created by Steve Worswick. 
It is based on the AIML technology, developed by Dr. Richard S. Wallace between 1995 and 2002.

The winner is a so-called Alicebot clone, the first chatterbot based on AIML. 
Alicebot won the Loebner prize in 2000, 2001, and 2004.

Mitsuku uses an extensive knowledge base to define its behavior, like all AIML chatterbots.
It can learn new entries for its knowledge base, but [asks for approval for each change to its creator](https://venturebeat.com/2016/12/07/4chan-trolls-failed-to-corrupt-the-mitsuku-bot/).

The chatterbot was able to win the last the last Loebner Prize thanks to its extensive knowledge base, built from [a lot of user interaction](https://twitter.com/MitsukuChatbot/status/671095095287029761).

Mitsuku doesn't advance the state of the art in AI since it is based on a 17 year old technology.
But it shows how much data in more important than algorithms, in our current approach to AI.

## Question 1.3 ##
Are reflex actions (such as flinching from a hot stove) rational?
Are they intelligent?

### Solution ###
Reflex actions aren't rational, as they aren't based on reasoning, if they were, we would be too slow to react to situation which require reflex actions.

Reflex actions aren't intelligent either, since they are determined by our genetic code, thus by the process of natural selection.

We cannot consider _natural selection_ intelligent, as it doesn't _chose_ who survives and who doesn't.

## Question 1.4 ##
There are well-known classes of problems that are intractably difficult for computers, and other classes that are provably undecidable.
Does this mean that AI is impossible?

### Solution ###
The premise of the question doesn't tell us if AI is in one of those classes, only that an AI would probably have difficulties with them too.

From the premise follows that if we can build an AI, we shouldn't expect it to be able to magically solve those problems for us. 

## Question 1.5 ##
The neural structure of the sea slug _Aplysia_ has been widely studied (first by Nobel Laureate Eric Kandek) because is has only about 20,000 neurons, most of them large and easily manipulated.
Assuming that the cycle time for an _Aplysia_ neuron is roughly the same as for a human neuron, how does the computational power, in terms of memory updates per second, compare with the high-end computer described in Figure 1.3?

### Solution ###
Memory Updates/sec of _Alypsia_ =
(Memory Updates/sec of Human) \* (Neurons of _Alypsia_) / (Neurons of Human) =
10<sup>14</sup> \* 2 \* 10<sup>4</sup> / 10<sup>11</sup> =
2 * 10<sup>7</sup>

The Blue Gene supercomputer is able to do 10<sup>7</sup> times more operation per second.

## Question 1.6 ##
How could introspection -reporting on one's inner thoughts ' be inaccurate?
Could I be wrong about what I'm thinking?
Discuss

### Solution ###
We aren't conscious of all of our thoughts, and as split-brain patient show, we tend to confabulate when asked about thoughts we aren't consciously aware of.

Because of these two problems, introspection is highly unreliable.

Extra note: The accounts of eye witnesses in tribunals are considered highly unreliable because of confabulation.

## Question 1.7 ##
To what extent are the following computer systems instances of artificial intelligence:
* Supermarket bar code scanners.
* Voice-activated telephones menus.
* Spelling and grammar correction features in Microsoft Word.
* Internet routing algorithms that respond dynamically to the state of the network.

### Solution ###
* Supermarket bar code scanner: Narrowly intelligent, it use intelligence only for one task.
* Voice-activated telephones menus: Narrowly intelligent, it can understand human input and choose an answer. But nothing more.
* Spelling and grammar correction features in Microsoft Word: again narrowly intelligent.
* Internet routing algorithms that respond dynamically to the state of the network: again narrowly intelligent.

## Question 1.8 ##
Many of the computational models of cognitive activities that have proposed involve quite complex mathematical operations, such as convolving an image with a Gaussian or finding a minimum of the entropy function.
Most humans (and certainly all animals) never lean this kind of mathematics at all, almost no one learns if before college, and almost no one can compute the convolution of a function with a Gaussian in their head.
What sense does it make to say that the "vision system" is doing this kind of mathematics, whereas the actual person has no idea how to do it?

### Solution ###
From pragmatic standpoint, it makes sense to talk about systems of the brain doing mathematics the person cannot do.
As understanding of these systems is essential to model our brain.

## Question 1.9 ##
Some authors have claimed that perception and motor skills are the most important part of intelligence, and that "higher level" capacities are necessarily parasitic -simple add-ons to there underlying facilities.
Certainly, most of evolution and a large part of the brain have been devoted to perception and motor skills, whereas AI has found tasks such as game playing and logical inference to be easier, in many ways, than perceiving and acting on the real world.
Do you thin that AI's traditional focus on higher-level cognitive abilities is misplaced?

### Solution ###
It could be possible that focus on more primitive skills could help us achieve human level intelligence faster.

But it's impossible to say anything for sure until we truly have understanding of intelligence.

## Question 1.10 ##
Is AI a science, or is it engineering?
Or neither or both?
Explain

### Solution ###
AI is both:
* A _science_ which studies intelligence through an effort to synthesize it.
* _Engineering_ as the development of solution to problems which require the automation of intelligence.

## Question 1.11 ##
"Surely computers cannot be intelligent -they cab do only what their programmers tell them."
Is the latter statement true, and does it imply the former?

### Solution ###
The latter statement is true, but it doesn't imply the former.
Having a defined behavior doesn't contrast with our definition of intelligence.

## Question 1.12 ##
"Surely animals cannot be intelligent -they can only do what their genes tell them."
Is the latter statement true, and does it imply the former?

### Solution ###
The latter statement mostly true, genes define most of the animal behavior.
But again, the latter statement doesn't imply the former, having an _instruction book_ for the behavior doesn't conflict with our definition of intelligence.

## Question 1.13 ##
"Surely animals, humans, and computers cannot be intelligent -they can do only what their constituent atoms are told to do by the laws of physics."
Is the latter statement true, and does it imply the former?

### Solution ###
The latter statement is true, but still, the concept of determinism doesn't conflict with our definition of intelligence.

## Question 1.14 ##
Examine the AI literature to discover whether the following tasks can currently be solved by computers:
1. Playing a decent game of table tennis (Ping-Pong).
2. Driving in the center of Cairo, Egypt.
3. Driving in Victorville, California.
4. Buying a week's worth of groceries at the market.
5. Buying a week's worth of groceries on the Web.
6. Playing a decent game of bridge at a competitive level
7. Discovering and proving new mathematical theorems.
8. Writing an intentionally funny story.
9. Giving a competent legal advice in a specialized area of law.

For the currently infeasible tasks, try to find out what the difficulties are and predict, when, if ever, they will be overcome.

### Solution ###
1. [Forpheus](https://www.omron.com/innovation/forpheus.html) is an AI table tennis tutor. It is strong enough to beat every human, according to many sources \[[1](https://www.geek.com/tech/record-breaking-robot-will-beat-you-at-ping-pong-1690704/)]\[[2](https://inventionaday.com/invention-day-episode-339-unstoppable-ping-pong-player/)], but I couldn't find an authoritative source..

2. I wasn't able to find anything on self driving cars in Cairo, Egypt.

3. The [DARPA Grand Challenge of 2007](http://archive.darpa.mil/grandchallenge/) was a competition between 53 autonomous vehicles, which took place in Victorsville, California, US.

4. I didn't find anything on this.

5. Amazon's Alexa can shop a week worth of groceries through [Ocado's app](https://techcrunch.com/2017/08/29/ocado-launches-alexa-app-for-grocery-shopping-by-voice/). 

6. Jack is an AI which was more or less on par with the human champions, when they [challenged him in 2006](http://www.jackbridge.com/eperhum4.htm).  
  There were no other matches between Jack and human champions, but it has since gone from version [3.0](https://web.archive.org/web/20060406153539/http://www.jackbridge.com/ehomad.htm) to [6.0](http://www.jackbridge.com/eindex.htm).
  Could Jack be able to beat them all now?
  
7. AIs are able to prove mathematical theorems in many domains.
But from what I found there is no AI which is able to prove theorems from any given domain, nor discover theorems.

8. [Botnik](http://about.botnik.org/) is able to write some intentionally funny stories, although [not well enough to be confused for human writing](http://digg.com/2017/scrubs-predictive-keyboard-script).

9. AI lawyers already beat humans in speed and accuracy in [some domains](https://www.geek.com/tech/ai-beats-human-lawyers-at-their-own-game-1732154/).

## Question 1.15 ##
Various subfield of AI have held contests by defining a standard task and inviting researchers to do their best.
Examples include the DARPA Grand Challenge for robotic cars, the International Planning Competition, the Robocup robotic soccer league, the TREC information retrieval event, and contests in machine translation and speech recognition.
Investigate five of these contests and describe the progress made over the years.
To what degree have the contests advanced the state of the art in AI?
To what degree do they hurt the field by drawing energy away from new ideas?

### Solution ###
I will just express my thoughts on the competition since I have no intention do dig further into the topic.

* I think that constraints to creativity, like those given by the challenges, help a lot to produce better work.
Even better than what could be obtained in the absence of constraints.
* I think that having some results which are more appreciable by the general public directly benefits research, as they can get better funding and use opportunity to inform the general public.
* I think that having competitions helps to attract more researchers in the field, this could possibly speed up the work done in AI.

So I think that competitions are great for AI, as they can channel the researchers' creativity, attract the general public and attract future researchers.

It is true that these challenges distract from the higher goals of AI research, but on the other side, I think that the listed benefit greatly outweigh the drawbacks of competition.