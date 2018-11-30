# Class Diagram Notes

Since the class diagram for the entire system is messy and all four levels of the game are in a similar format, it is easier to illustrate the game modeling by the class diagram of level 4.

## Patterns

### Observer Pattern
Observer Pattern is used to implement the RedButton actor. When the Thief actor steps on the RedButton actor, the SwordDown actor and Key actor should begin falling.

### Command Pattern
Command Pattern is used to implement the PayGameButton actor as well as TryAgainButton actor.

### Strategy Pattern
Strategy Pattern is used to implement two different game modes which are easy mode and hard mode.

### State Pattern
State Pattern is used to implement two states of the Thief actor, which are moving forward state and moving backward state.

### Singleton Pattern
Singleton Pattern is used to implement the Thief actor.

## Classes

### WorldController Class
WorldController Class is a class to control the game flow. It keeps a reference of all gaming screens in its attributes.

### Thief Class
Thief Class is the main actor in the game. Thief acts based on the user's input. Thief Class is a singleton. Thief Class has a WordController reference in order to change the gaming screen when necessary.

### Other Classes
Other Classes are subclasses of World Class or Actor Class. Some are the Interface of the implemented Patterns.
