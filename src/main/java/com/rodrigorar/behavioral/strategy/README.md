# Strategy Design Pattern

## Intent

- Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets
the algorithm vary idependently from the clients that use it.
- Capture the abstraction in an interface, bury implementation details in derived class.

## Problem

One of the dominant strategies of object-oriented design is the "open-closed principle".

Encapsulate interface details in a base class, and bury implementation details in derived class. Clients
can then couple themselves to an interface, and not have to experience the upheavel associated with
change: no impact when the number of derived classes changes, and no impact when the implementation
of a derived class changes.

A generic value of the software community for years has been, "maximise cohesion and minimize coupling".
Since the client is coupled only to an abstraction (i.e useful fiction), and not a particular realization
of that abstraction, the client could be said to be practicing "abstract coupling", an object-oriented
variant of the more generic exhortation "minimize coupling".

A more popular characterization of this "abstract coupling" principle is "Program to an interface,
not an implementation".

Clients should prefer the "additional level of indirection" that an interface (or an abstract base class)
affords. The interface captures the asbtraction (i.e the "useful fiction") the client wants to exercise,
and the implementations of that interface are effectively hidden.

## Check List

1. Identify an algorithm (i.e a behavior) that the client would prefer to access through a "flex point".
2. Specify the signature for that algorithm in an interface.
3. Bury the alternative implementation details in a derived class.
4. Clients of the algorithm couple themselves to the interface. 