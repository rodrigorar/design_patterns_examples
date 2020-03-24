## Intent

- Specify the kinds of objects to create using a prototypical instance, and create
new instances by copying this instance.
- Co-opt one instance of a class for use as a breeder of all future instances.
- The new operator considered harmfull.

## Problem

Application "hard wires" the class of object to create in each "new" expression.

## Discussion

Declare an abstract base class that specifies a pure virtual "clone" method, and,
maintains a dictionary of all "cloneable" concrete derived classes. Any class that 
needs a "polymorphic constructor" capability: derives itself from the abstract base class,
registers its prototypical instance, and implements the clone() operation.

The client then, instead of writing code that invokes the "new" operator on a hard-wired
class name, calls a "clone" operation on the abstract base class, supplying a string
or enumerated data type that designates the particular concrete derived class desired.

## Check List

1. Add a clone() method to the existing "product" hierarchy.
2. Design a "registry" that maintains a cache of prototypical objects. The registry
could be encapsulated in a new Factory class, or in the base class of the "product"
hirarchy.
3. Design a factory method that: may (or may not) accept arguments, finds the correct
prototype object, calls clone() on that object, and return the result.
4. The client replaces all references to the new operator with calls to the factory
method.