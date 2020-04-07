# Command Pattern

## Intent

- Encapsulate a request as an object, thereby letting you parameterize clients 
with different requests, queue or log requests, and support undoable operations.
- Promote "invocation of a method on an object" to full object status.
- An object-oriented callback

## Problem

Need to issue requests to objects without knowing anything about the operation being
requested or the receiver of the request.

## Discussion

Command decouples the object that invokes the operation from the one that knows 
how to perform it. To achieve this separation, the designer creates an abstract
base class that maps a receiver (an object) with an action (a pointer to a member function).
The base class contains an execute() method that simply calls the action on the receiver.

All clients of the Command object treat each object as "black box" by simply invoking
the object's virtual execute() method whenever the client requires the object's "service".

A Command class holds come subset of the following; an object, a method to be applied
to the object, and the arguments to be passed when the method is applied. The Command's
"execute" method then causes the pieces to come together.

Sequences of Command objects can be assembled into composite (or macro) commands.

## Check List

1. Define a Command interface with a method signature like execute().
2. Create one or more derived classes that encapsulate a subset of the following:
a "receiver" object, the method to invoke, the arguments to pass.
3. Instantiate a Command object for each deferred execution request.
4. Pass the Command object from the creator (aka sender) to the invoker (aka receiver).
5. The receiver decides when to execute().