## Intent

- Attach additional responsabilities to an object dynamically. Decorators provide
a flexible alternative to subclassing for extending functionality.
- Client-specified embelishment of a core object by recursively wrapping it.
- Wrapping a gift, putting it in a box, and wrapping the box.

## Problem

You want to add behavior or state to individual objects at run-time. Inheritance
is not feasible because it is static and applies to and entire class.

## Check List

1. Ensure the context is: a single core (or non-optional) component, several optional
embellishments or wrappers, and an interface that is common to all.
2. Create a "lowest common denominator" interface that makes all classes intercangeable.
3. Create a second level base class (Decorator) to support the optional wrapper 
classes.
4. The Core class and Decorator class inherit from the LCD interface.
5. The Decorator class declares a composition relationship to the LCD interface, 
and this data member is initialized in its constructor.
6. The Decorator class delegates to the LCD object.
7. Define a Decorator derived class for each optional embellishment.
8. Decorator derived classes implement their wrapper functionality - and - delegate
to the Decorator base class.
9. The client configures the type and ordering of Core and Decorator objects.

