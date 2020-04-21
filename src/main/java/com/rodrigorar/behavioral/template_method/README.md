# Template Method Pattern

## Intent

- Define the skeleton of an algorithm in an operation, deferring some steps to
client subclasses. Template Method lets subclasses redefine certain steps of an algorithm
without changing the algorithm structure.

- Base class declares algorithm "placeholders", and derived classes implement the
placeholders.

## Problem

Two different components have significant similarities, but demonstrate no reuse
of common interface or implementation. If a change common to both components becomes
necessary, duplicate effort must be expended.

## Discussion

The component deisgner decides which steps of an algorithm are invariant (or standard),
and which are variant (or customizable). The invariant steps are implemented in an
abstract base class, while the variant steps are either given a default implementation,
or no implementation at all. The variant steps represent "hooks", or "placeholders", that
can, or must, be supplied by the component's client in a concrete derived class.

The component designer mandates the required steps of an algorithm, and the ordering
of the steps, but allows the component client to extend or replace some number of these steps.

Template Method is used prominently in frameworks. Each framework implements the
invariant pieces of a domain's architecture, and defines "placeholders" for all
necessary or interesting client customization options. In so doing, the framework
becomes the "center of the universe", and the client customizations are simply 
"the third rock from the sun". This inverted control structure has been affectionatly
labelled "the Hollywood principle" - "don't call us, we'll call you".

## Check List

1. Examine the algorithm, and decide which steps are standard and which steps are
peculiar to each of the current classes.
2. Define a new abstract base class to host the "don't call us, we'll call you" framework.
3. Move the shell of the algorithm (now called the "template method") and the definition
of all standard steps to the new base class.
4. Define a placeholder or "hook" method in the base class for each step that
requires many different implementations. This method can host a default implementation - or
- it can be defined as abstract.
5. Invoke the hook method(s) form the template method.
6. Each of the existing classes declares an "is-a" relationship to the new abstract base
class.
7. Remove from the existing classes all the implementation details that have been 
moved to the base class.
8. The only details that will remain in the existing classes will be the implementation
details peculiar to each derived class.