# Observer Pattern

## Intent

- Define a one to many dependency between objects so that when one object changes state, all its
dependents are notified and updated automaticly.
- Encapsulate the core (or common or engine) components in a Subject abstraction, and the variable
(optional or user interface) components in an Observer hierarchy.
- The "View" part of Model-View-Controller

## Problem

A large monolithic design does not scale well as new graphic or monitoring requirements are levied.

## Discussion

Define an object that is the "keeper" of the data model and/or business logic (the Subject). Delegate
all "view" functionality to decoupled and distinct Observer objects. Observers register themselves
with the Subject has they are created. Whenever the Subject changes, it broadcasts to all registered
Observers that is has changed, and each Observer queries the Subject for that subset of the Subject's
state that is responsible for monitoring.

The allows the number and "type" of "view" objects to be configured dynamicly, instead of being 
staticly specified at compile-time.

The protocol described above specifies a "pull" interaction model. Instead of the Subject "pushing"
what has changed to all Observers, each Observer is responsible for "pulling" its particular "window
of interest" from the Subject. The "push" model compromises reuse, while the "pull" model is less efficient.

Issues that are discussed, but left to the discretion of the designer, include:
implementing event compression (only sending a single change broadcast after a series of consecutive
changes has occurred), having a single Observer monitoring multiple Subjects, and ensuring that a Subject
notify its Observer when it is about to go away.

The Observer pattern captures the lion's share of the Model-View-Controller architecture that has been
a part of the Smalltalk comunity for years.

## Check List

1. Diferentiate between the core (or independent) functionality and the optional (or dependent) functionality.
2. Model the independent functionality with a "subject" abstraction.
3. Model the dependent functionality with an "Observer" hierarchy.
4. The Subject is coupled only to the Observer base class.
5. The client configures the number and type of Observers.
6. Observers register themselves with the subject.
7. The Subject broadcasts events to all registered Observers.
8. The Subject may "push" information at the Observers, or, the Observers may "pull" the information
they need from the subject.
