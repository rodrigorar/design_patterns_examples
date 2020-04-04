# Facade

## Intent

- Provide a unified interface to a set of interfaces in a subsystem. Facade defines a
higher-level interface that makes the subsystem easier to use.
- Wrap a complicated subsystem with a simpler interface.

## Problem

A segment of the client community needs a simplified interface to the overall
functionality of a complex subsystem.

## Discussion

Facade discusses encapsulating a complex subsystem withing a single interface
object. This reduces the learning curve necessary to successfully leverage the
subsystem. It also promotes decoupling the subsystem from its potentially many
clients. On the other hand, if the Facade is the only access point for the subsystem,
it will limit the features and flexibility that "power users" may need.

The Facade object should be a fairly simple advocate or facilitator. It should not
became an all-knowing oracle or "god" object.

## Check List

1. Identify a simpler, unified interface for the subsystem or component.
2. Design a "wrapper" class that encapsulates the subsystem.
3. The facade/wrapper captures the complexity and collaborations of the component,
and delegates to the appropriate methods.
4. The client uses (is coupled to) the Facade only.
5. Consider wether additional Facades would add value. 