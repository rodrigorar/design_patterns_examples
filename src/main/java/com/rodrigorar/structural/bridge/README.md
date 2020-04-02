## Intent

- Decouple an abstraction from its implementation so that the two can vary independently.
- Publish interface in an inheritance hierarchy, and bury implementation in its own
inheritance hierarchy.
- Beyong encapsulation, to insulation.

## Problem

"Hardening the software arteries" has occurred by using subclassing of an abstract
base class to provide alternative implementations. This locks in compile-time binding
between interface and implementation. The abstraction and implementation cannot
be independently extended or composed.

##  Discussion

Decompose the component's interface and implementation into orthogonal class hierarchies.
The interface class contains a pointer to the abstract implementation class. 
This pointer is initialized with an instance of a concrete implementation class, 
but all subsequent interaction from the interface class to the implementation class is limited
to the asbtraction maintained in the implementation base class. The client interacts
with the interface class, and it in turn "delegates" all requests to the implementation
class.

The interface object is the "handle" known and used by the client; while the implementation
object, or "body", is safely encapsulated to ensure that it may continue to evolve,
or be entirely replaced (or shared at run-time).

Use the Bridge pattern when:
- you want run-time binding of the implementation
- you have a proliferation of classes resulting from a coupled interface and numerous
implementations
- you want to share an implementation among multiple objects
- you need to map orthogonal class hierarchies

Consequences include:
- decoupling the objects interface
- improved extensibility (you can extend (i.e subclass)) the abstraction and implementation
hierarchies independently),
- hiding details from clients

Bridge is a synonym for the "handle/body" idiom. This is a design mechanism that
encapsulates an implementation class inside of an interface class. The former is the 
body, and the latter is the handle. The handle is viewed by the user as the actual
class, but the work is done in the body. "The handle/body class idiom may be used 
to decompose a complex abstraction into smaller, more manageable classes. The idiom
may reflect the sharing of a single resource by multiple classes that control access to it
(e.g. reference counting)".

## Check List

1. Decide if two orthogonal dimensions exist in the domain. These independent 
concepts could be: abstraction/platform, or domain/infrastructure, or front-end/back-end,
or interface/implementation.
2. Design the separation of concerns: what does the client want, and what do the
platforms provide.
3. Design a platform-oriented interface that is minimal, necessary, and sufficient.
Its goal is to decouple the asbtraction from the platform.
4. Define a derived class of that interface for each platform.
5. Create the abstraction base class that "has a" platform object and delegates
the platform-oriented functionality to it.
6. Define specializations of the abstraction class if desired.