# 4th Day - (December 14th, 2021)

## Java Prog.

1. Interfaces
    - [Example](src/javas/InterfaceEg.java): Program to demonstrate use of Interface.
    - [Example](src/javas/InterfaceEg2.java): Program to use two interfaces in one class.
    - [Example](src/javas/InterfaceEg3.java): Program of simple interface implemented in two classes.
    - [Example](src/javas/InterMainClass.java): Program to implement 3 interfaces in a class.
    - [Nested Interface](src/javas/NestedInterface.java): Program to implement inner interface with bind operator.
    - [Example](src/javas/DeclaringInterface.java): Program interfaces with variables and access variable main.

---

1. Abstract Class
    > An abstract class is a template definition of methods and variables of a class that contains one or more abstracted methods.
    - **Rules of Abstract Class**:
        - _Abstract class define by `abstract` keyword._
        - _Abstract class has some **declare method** and same **define methods**._
        - _Abstract class has at **least** one **abstract method(declare function)**_
        - _We can't create `instance(object)` of **abstract classes**_
        - _The class (Which will inherit abstract class) must implement all the **abstract method** of **abstract
          class**._
        - _Abstract class can have `constructors()` and **static methods**._
        - _We can have `final` method in abstract class_
    - **Syntax:** `abstract class ClassName { // body }`
    - [Example](src/abstracts/SimpleAbstract.java): Program to simple abstract class.
    - _Abstract class can be a base class of another abstract class via `extends` keyword._
        - `abstract class ClassName extends BaseClassName { // body }`
        - [Example](src/abstracts/AbstractOfAbstract.java): Program to extend abstract class.
    - _Abstract class can implement Interfaces._
        - `interface AbstractClassName extends InterfaceName { // body }`

2. Method Overriding
   > _When we have two or more method with same name, same parameter but different functionality in public of 
   > vase and derive class, then this is called method overriding. It's a kind of run time polymorphism._

3. Method Hiding
   > _When we have two static or private methods with same name, differ parameter and differ functionality in public 
   > of vase and public of derive class then this is call method hiding_

## Data Structure

1. Stack
   > _Stack is a data structure where elements add at one end, this end will be top of the stack. 
   > Stack follow **LIFO (Last in First Out)** concept._
   - **Operations of Stack:**
     - `push` - Adds a new element in stack
     - `pop` - Remove a element from stack
   - Stack with C Structure
   - Stack with pointer
   - Stack with Java Classes

2. Queue
    > _An queue is open at both its ends. One end is always used to insert data (enqueue) and the other is used to 
    > remove data (dequeue). Queue follows **FIFO (First in First Out)** concept._
    - **Operations of Queue:**
        - `enqueue` / `push` - Adds a new element at the `rear` side
        - `dequeue` / `pop` - Removes a element from `front` side