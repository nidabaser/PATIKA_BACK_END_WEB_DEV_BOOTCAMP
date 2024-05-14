## Elevator Simulation System

Try to use the principles of Object Oriented Programming and relationships between classes. (Encapsulation, Inheritance, Polymorphism, Abstraction)

We Code The Insurance Company wants to build a 12-story office building and equip it with the latest elevator technology. The company wants you to create a software simulator that models the operations of the building's elevators to see if they can meet traffic flow needs within the building.

The building will have five elevators, each capable of reaching the building's 12 floors. Each elevator has a capacity of approximately six adult passengers. Elevators are designed to be energy efficient, so they only move when necessary. Each elevator has its own door, floor indicator light and control panel. The control panel includes target buttons, door open and close buttons, and an emergency signal button.

Each floor in the building has a door for each of the five elevator shafts and an arrival bell for each door. The arrival bell indicates that the elevators have arrived at a floor. A signal light above each door indicates the arrival of the elevator and the direction in which the elevator is moving. Each floor also has three sets of elevator call buttons.

A person calls an elevator by pressing the appropriate call button (up or down). A scheduler assigns one of five elevators to the floor where the call begins. Once inside the elevator, a passenger typically presses one or more destination buttons. As the elevator moves from floor to floor, an indicator light inside the elevator informs passengers of the elevator's location. The arrival of an elevator to a floor is indicated by the indicator light on the outer elevator door turning on and the floor bell ringing. When an elevator stops on a floor, both sets of doors automatically open for a predetermined period of time, allowing passengers to enter and exit the elevator.

The simulator uses a "clock" to simulate the actual passage of time and timestamp and log events that occur in the simulation. A random number generator is used by the simulator to generate passengers and determine departure and arrival floors for each passenger.