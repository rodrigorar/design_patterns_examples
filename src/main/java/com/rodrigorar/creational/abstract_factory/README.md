*Intent*

- Provide an interface for creating families of related or dependent objects
without specifying their concrete class.
- A hierarchy that encapsulates: many possible "platforms", and the construction
of a suite of "products".
- The new operator considered harmful

*Problem*

If an application is to be portable, it needs to encapsulate platform dependencies.

*Discussion*

Provide a level of indirection that abstracts the creation of families of related
or dependent objects without directly specifying their concrete classes. The "factory"
object has the responsibility for providing creation services for the entire platform
family. Clients never create platform objects directly, they ask the factory to do that
for them.

This mechanism makes exchanging product families easy because the specific class of
the factory object appears only once in the application - where it is instantiate.
The application can wholesale replace the entire family of products simply by instantiating
a diferent concrete instance of the abstract factory.

Because the service provided by the factory object is so pervasive, it is routinely
implemented as a singleton.

*Check List*

1. Decide if "platform independence" and creation services are the current source
of pain.
2. Map out a matrix of "platforms" versus "products".
3. Define a factory interface that consists of a factory method per product.
4. Define a factory derived class for each platform that encapsulates all references
to the new operator.
5.  The client should retire all references to new, and use the factory methods
to create the product objects.
