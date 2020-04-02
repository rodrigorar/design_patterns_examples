## Intent

- Compose objects into tree structures to represent whole-part hierarchies.
Composite lets client treat individual objects and compositions of objects uniformly.
- Recursive composition.
- "Directories contain entries, each of which could be a directory".
- 1-to-many "has a" up the "is a" hierarchy.

## Problem

Application needs to manipulate a hierarchical collection of "primitive" and
"composite" objects. Processing of a primitive object is handled one way, and processing
of composite object is handled differently. Having to query the "type" of each
object before processing it is not desirable.

## Discussion

Define an abstract base class (Component) that specifies the behavior that needs
to be exercised uniformly accross all primitive and composite objects. Subclass the
Composite and Primite classes off of the Component class. Each composite object
"couples" itself only to the abstract type Component as it manages its "children".

Use this pattern whenever you have "composites that contain components, each of
which could be a composite".

Child management methods [e.g addChild(), removeChild()] should normally be defined
in the Composite class. Unfortunately, the desire to treat Primitives and Composites
uniformly that the methods be moved to the abstract Component class.

## Check List

1. Ensure that your problem is about representing "whole-part" hierarchical relationships.
2. Consider the heuristic, "Containers that contain containees, each of which could
be a container". For example, "Assemblies that contain components, each of which 
could be an Assembly". Divide your domain concepts into container classes, and
containee classes.
3. Create a "lowest common denominator" interface that makes your containers and
containees interchangeable. It should specify the behavior that needs to be exercised
uniformly accross all containee and container classes.
4. All container and containee classes declare an "is a" relationship to the interface.
5. All container classes declare a one-to-many "has a" relationship to the interface.
6. Container classes levarege polymorphism to delegate to their containee objects.