# Flyweight Patter

## Intent

- Use sharing to support large numbers of fine-grained objects efficiently.
- The Motif GUI strategy of replacing heavy-weight widgets with light-weight gadgets.

## Problem

Designing objects down to the lowest levels of system "granularity" provides optimal
flexibility, but can be unacceptably expensive in terms of performance and memory usage.

## Discussion

The Flyweight pattern describes how to share objects to allow their use at fine 
granularity without prohibitive cost. Each "flyweight" object is divided into two pieces:
the state dependent (extrinsic) part, and the state independent (intrinsic) part.
Intrinsic state is stored (shared) in the Flyweight object. Extrinsic state is stored
or computed by client objects, and passed to the Flyweight when its operatons are invoked.

An illustration of this approach would be the Motif widgets that have been re-engineered
as light-weight gadgets. Where as widgets are "intelligent" enough to stand on their
own; gadgets exist in a dependent relationship with their parent layout manager widget.
Each layout manager provides context-dependent event handling, real estate management,
and resource services to its Flyweight gadgets, and each gadget is only responsible
for context-idependent state and behavior.

## Check List

1. Ensure that object overhead is an issue needing attention, and, the client of
the class is able and willing to absorb responsability realignment.
2. Divide the tartget class's state into: shreable (intrinsic) state, and non-shareable
(extrinsic) state.
3. Remove the non-shareable state from the classes attributes, and add it the calling
argument list of affected methods. 
4. Create a Factory that can cache and reuse existing class instances.
5. The client must use the Factory instead of the new operator to request objects.
6. The client (or third party) must look-up or compute the non-shareable state, and
supply that state to class methods. 