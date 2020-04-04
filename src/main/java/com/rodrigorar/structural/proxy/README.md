# Proxy Pattern

## Intent

- Provide a surrogate of placeholder for another object to control access to it.
- Use an extra level of indirection to support distributed, controlled or
intelligent access.
- Add a wrapper and delegation to protect the real component from undue complexity.

## Problem

You need to support resource hundgry objects, and you do not want to instantiate
such objects unless and until they are really requested by the client.

## Discussion

Design a surrogate, or proxy, object that: instantiates the real object the first
time the client makes a request to the proxy, remembers the identity of this real 
object, and forwards the instigating request to this real object. Then all subsequent
requests are simply forwarded directly to the encapsulated real object.

There are four common stituations in which the Proxy pattern is applicable:

1. A virtual proxy is a placeholder for "expensive to create" objects. The real object
is only created when a client first requests/accesses the object.
2. A remote proxy provides a local representative for an object that resides in
a different address space. This is what the "stub" code in RPC and CORBA provides.
3. A protective proxy controls access to a sensitive master object. The "surrogate"
object checks that the caller has the access permissions required prior to forwarding
the request.
4. A smart proxy interposes additional actions when an object is acessed. Typical
uses include:
    - Counting the number of references to the real object so that it can be freed
    automaticly when there are no more references (aka smart pointer).
    - Loading persistent object into memory when it's first referenced.
    - Checking that the real object is locked before it is acessed to ensure that
    no other object can change it.
    
## Check List

1. Identify the leverage or "aspect" that is best implemented as a wrapper or surrogate.
2. Define an interface that will make the proxy and the original component interchangeable.
3. Consider defining a Factory  that can encapsulate the decision of whether a proxy
or original object is desirable.
4. The wrapper class holds a pointer to the real class and implements the interface.
5. The pointer may be initialized at construction, or on first use.
6. Each wrapper method contributes its leverage, and delegates to the wrappee object.