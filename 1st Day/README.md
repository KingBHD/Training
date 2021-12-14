# 1st Day - (December 8th, 2021)

## C / C++ Programing

1. [Functions](functions.c)
   > _be in sequence_
   - **Types of functions**:
       - without carry, without return
       - without carry, with return
       - with carry, with return
       - with carry, without return
   
2. [Pointers](pointers.c)
   > *A variable which stores the address of another variable*
   - `*` Value at address
   - `&` Address of the node
   - **Declaration:** `data_type *variable_name`
   - Pointer-to-Pointer
        > A pointer to a pointer is a chain of pointers. Who points to an address of another pointer.
   
3. [Recursion](recursion.c)
   > *Recursion is the function that call's itself.*
   - Best example would be factorial's code
   
4. Array
   > *Array is the collection of same type of data*
   - **Syntax:** `data_type variable_name[size_of_array]`
   - **Types of Sorting**:
     - Bubble Sort
     - Selection Sort
   - Matrix || 2D Array
     - [Example](2d_array_diagonal_1.c): Program to display diagonal of a 2D Array 1 and rest 0.
     - [Example](2d_array_sort.c): Program to sort 2D Array without using temporary Array.
   - Array with Pointers
     - [Example](find_greatest_value_from_reference.c): Program to find greatest element of an array from 1st element's address.
     - [Example](finding_cube_of_array_elements.c): Program to display cubes of every element from address of 1st element.
     
5. Strings
   > *String is a collection of CHAR end by NULL character.*
   - Common string operations:
     - Length
     - Copy
     - Concatenate
   - [Example](scroll_text_with_graphic.c): Program to scroll text graphically using `graphic.h`
   
6. Structure
   > *Template of an object, by which we can copy similar data*
   - `.` operator used to bind data.
   - **Syntax:**
     ```
           struct structure_name {
               data_type variable_name;
               ...
           }
     ```
   - _topic continued next day.. [read here](../2nd%20Day/README.md)_
