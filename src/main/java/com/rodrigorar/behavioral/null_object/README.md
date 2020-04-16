# Null Object Pattern

## Intent

The intent of a Null Object is to encapsulate the absence of an object by providing a substitutable
alternative that offers suitable default do nothing behavior. In short, a design where "nothing will
come out of nothing".

Use Null Object pattern when

- an object requires a collaborator. The Null Object pattern does not introduce this collaboration -
it makes use of a collaboration that already exists.
- some collaborator instances should do nothing.
- you want to abstract away the handling of null from the client.

## Problem

Given that an object reference may be optionally null, and the results of a null check is to do
nothing or use some default value, how can the absence of an object - the presence of a null
reference - be treated transparently?

## Discussion

Sometimes a class that requires a colaborator does not need the colaborator to do anything. However,
the class wishes to treat the collaborator that does nothing the same way it treats one that actually
provides behavior.

The key to the Null Object pattern is an abstract class that defines the interface for all objects
of this type. The Null Object is implemented as a subclass of this abstract class. Because it conforms
to the abstract class interface, it can be used in any place this type object is needed. As compared
to using a special "null" value which doesn't actually implement the abstract interface and which
must constantly be checked for with special code in any object which uses the abstract interface.

It is sometimes thought that Null Objects are over simple and "stupid" but in truth a Null Object
always knows exactly what needs to be done without interacting with any other objects. So in truth
it is very "smart".

