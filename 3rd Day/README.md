# 3rd Day - (December 13th, 2021)

## Java Programming

1. [Static Variable](statics/StaticV.java)
    - _Static variable are sharable to all objects._
    - **Syntax:** `static data_type variable_name`

2. [Static Method](statics/StaticM.java)
    - _Static method has one copy, these are resided in class._
    - **Syntax:** `static return_type method_name(parameter_list)`
    - **Callable:** `ClassName.method_name(parameter_list)`

3. [Class Object as Parameter](classes/ClassObjAsArgs.java)
    - _Class object can be passed as parameter._
    - **Syntax:** `method_name(ClassName obj)`
    - **Callable:** `obj.method_name(obj)`

4. [Returning Object](classes/ReturningObj.java)
    - _Returns object of class._

5. Polymorphism
    - _Polymorphism means *same name different functions*._
    - Types of Polymorphism
        - Compile time Polymorphism
        - Runtime Polymorphism
    - [Method Overloading](classes/MethodOverload.java)
        - _When we have two or more methods with same name, different parameter and differ functionality in same scope._

6. Constructor
    - _Constructor a function that is used to allocate memory for the object._
    - **Syntax:** `class_name(parameter_list) { // body }`
    - `this` - _Reference to current object of the class._
    - **Types of Constructor**
        1. Simple Constructor (no parameter)
            - `class_name() { // body }`
            - [Example](constructors/SimpleCons.java): Program of Simple Constructor with user.
        2. Parameterized Constructor
            - `class_name(parameter_list) { // body }`
            - [Example](constructors/ParamCons.java): Program of Parameterized Constructor.
        3. Constructor Overloading
            - ```
               class_name() { // body }
               class_name(parameter_list) { // body }
              ```
            - [Example](constructors/ConsOverload.java): Program of Constructor Overloading with user.
        4. Copy Constructor
            - `class_name(class_name obj) { // body }`
            - [Example](constructors/CopyCons.java): Program of Copy Constructor.
        5. Private Constructor
            - _If we have private constructor in a class, then we can't create the object of the class, outside the
              class._
            - `private class_name() { // body }`
            - [Example](constructors/PrivateCons.java): Program of Private Constructor.

---

## Inheritance in Java

1. Inheritance
    - _Reuse of class's functionality is called **INHERITANCE**. In this we have base class that's some functionality
      and some Data reuse in derive class._
    - **Syntax:** `class_name extends class_name`
    - **Types Of Inheritance**
        1. [Single](inheritances/SingleExtends.java) Inheritance
        2. [Multilevel](inheritances/MultilevelExtends.java) Inheritance
        3. Multiple Inheritance
            - _Java **does not support** Multiple Inheritance_
        4. [Hierarchical](inheritances/HierarchicalExtends.java) Inheritance
        5. [Hybrid](inheritances/HybridExtends.java) Inheritance

2. `super/super()` keyword - Constructor in drive class
    - _In inheritance constructor of base class executes first then constructor of derive class is executed_
    - `super` keyword
        - _Executes constructor of base class. If we have parameterized constructor in base class,
        - then parameterized constructor of base class executes first then constructor of derive class is executed._
        - [Program](inheritances/supers/SuperM.java): Method & Variable with super keyword in drive class
        - [Program](inheritances/supers/SuperWithArgs.java): Constructor in drive class with parameter

3. Access Modifier
    - _Access Modifier in Inheritance_
        1. Public
            - _Public class can be accessed by any other class in the same package._
        2. Protected
            - _Protected class can be accessed by any other class in the same package and sub-classes in the same
              package._
        3. Private
            - _Private class can be accessed only by the class in which it is declared._
        4. Default
            - _Default class can be accessed by any other class in the same package and sub-classes in the same
              package._
        5. Default Protected
            - _Default Protected class can be accessed by any other class in the same package and sub-classes in the
              same package and sub-classes of the same package._
    - [Example](inheritances/modifiers/AccessModifiers.java): Access Modifier in Inheritance

4. `final` keyword
    - _It can be used with variable, methods, and classes to restrict the user like following:_
        - Variables can't be changed, **they are constant**.
        - Methods can't be **overwritten**.
        - Class can't be **inherited**

5. Interface
    - _Interface is the collection of declare functions only, or we can say interface have collection of abstract functions._
      - **Rules of Interface:**
        - Interface can't have any constructor, static variables, instance variables, or instance methods.
    - **Syntax:** `interface interface_name { // body }`
    - **Syntax to implements interface**:
        - `class_name implements interface_name { // body }`

---

# Assignment

1. Given an unsorted interger array, write a function that returns the frequency of the highest value in the integer array.
    - **E.g Array**: `arr[] = {4, 8, 8, 6, 6, 6, 3}`
    - **Output**: `2 // Frequency of the Highest Value in the array`

2. Given a string S, write a function to reverse the words in the string but not the string itself.
    - **Input**: Hello this is a test
    - **Output**: `olleH siht si a tset`

3. Given an array, rotate the array by one position in Clock-wise direction.
    - **E.g Array**: `arr[] = {1, 2, 3, 4 , 5}`
    - **Output**: `arr[] = {5, 1, 2, 3, 4}`

4. Given an integer array `arr[]` and a number `N`, write a function that prints all pairs in the array `arr[]` 
   whose sum is equal to the number `N`.
    - **E.g Array**: `arr[] = {1, 2, 4, 3, 5, 0}`
    - **Input**: `N = 5`
    - **Output**: `3 // [1+4=5, 2+3=5, 5+0=5]`

5. Given an integer 2D array `arr[][]`, we need to search for a value in the sorted matrix. `arr[][]` sorted matrix 
   essentially means that the value at cell `arr[i][j]` will always be greater than the values of all cells preceding it.

6. Given a 2D array, it is filled with 0's and 1's. WAP that if it found 0 in the given matrix then its corresponding 
   row and column will be changed to 0.
    - | 0 | 1 | 0 | 0 |
      | --- | --- | --- | --- |
      | 0 | 0 | 1 | 1 |
      | 1 | 0 | 0 | 1 |
      | 0 | 0 | 0 | 1 |
    - **Note**: By converting the corresponding row and column to 0. Ultimately the whole matrix table will contain 0.

7. Write a program of 3D array. Is it 3D array or not. What is the position of element 10?
    - **Given Array**: `[[[4, 5, 6] [7, 8, 10] [12, 1, 15]]]`

8. Sort the array.
    - **Given Array:** `arr[] = {5, 4, 4, 3, 3, 3, 8, 0}`