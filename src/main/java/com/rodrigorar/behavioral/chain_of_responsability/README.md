# Chain of Responsability Pattern

## Intent

- Avoid coupling the sender of a request to its receiver by giving more than one
object a chance to handle the request. Chain the receiving objects and pass the
request along the chain until an object handles it.
- Launch-and-leave requests with a single processing pipeline that contains many
possible handlers.
- An object-oriented linked list with recursive traversal.

## Problem

There is a potentially variable number of "handler" or "processing element" or "node"
objects, and a stream of requests that must be handled. Need to efficiently process
the requests without hard-wiring handler relationships and precedence, or request-to-
handler mappings.

## Discussion

Encapsulate the processing elements inside a "pipeline" abstraction; and have clients
"launch and leave" their requests at the entrance of the pipeline. The pattern chains
the receiving objects together, and then passes any request messages from object
to object until it reaches an object capable of handling the message. The number
and type of handler objects isn't known a priori, they can be configured dinamicly.
The chaining mechanism uses recursive composition to allow an unlimited number of
handlers to be linked.

Chain of Responsability simplifies object interconnections. Instead of senders and
receivers maintaining references to all candidate receivers, each sender keeps a single
reference to the head of the chain, and each receiver keeps a single reference to
the successor in the chain. 

Make sure there exists a "safety net" to "catch" any requests which go unhandled.

Do not use Chain of Responsability when each request is only handled by one handler,
or, when the client object knows which service object should handle the request.

## Check List

1. The base class maintains a "next" pointer.
2. Each derived class implements its contribution for handling the request.
3. If the request needs to be "passed on", then the derived class "calls back" to the
base class, which delegates to the "next" pointer.
4. The client (or some third party) creates and links the chain (which may include
a link from the last node to the root node).
5. The client "launches and leaves" each request with the root of the chain.
6. Recursive delegation produces the illusion of magic.