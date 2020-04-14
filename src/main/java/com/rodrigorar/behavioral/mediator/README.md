# Mediator Pattern

## Intent

- Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling
by keeping objects from referring to each other explicitly, and it lets you vary their interaction
loosely.
- Design an intermidiary to decouple many peers.
- Promote the many-to-many relationships between interacting peers to "full object status".

## Problem

We want to design reusable components, but depedencies between potentially reusable pieces demonstrates
the "spaghetti code" phenomenon (trying to scoop a single serving results in an "all or nothing clump").

## Check List

1. Identify a collection of interacting objects that would benefit from mutual decoupling.
2. Encapsulate those interactions in the abstraction of a new class.
3. Create an instance of the new class and rework all "peer" objects to interact with the Mediator only.
4. Balance the principle of decoupling with the principle of distributing responsability evenly.
5. Be careful not to create a "controller" or "god" object.