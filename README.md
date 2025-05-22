# CSC-262-Discussion-3-RG
Array

An Array in JavaScript is a collection of values with the same data type. It is essentially a storage location with values given or written to it. The benefit of an array is that, instead of collecting and storing values within a new variable for many inputs, you can add them to an array and summon the specific input easily. Opting to use an Array saves time and code length, but most importantly, avoids repetitive code. You cannot store strings, integers, and doubles into one array, so use the proper organization and make a separate array depending on your specific needs. The downside of an array (depending on how you look at it) is that Arrays are size-limited, so once declared, you cannot extend the boundary.

ArrayList

An ArrayList is nearly identical to a Vector in C++ (if anyone is familiar with those) and almost shares the same basis as an Array, but with some more beneficial aspects. Identical to an Array, an ArrayList holds values read from or given by a user and stores those within itself. Unlike its counterpart, it can grow and shrink, regardless of its size during declaration. Which makes it more flexible and user-friendly, but does involve having to manage it a bit more. Unfortunately, an ArrayList cannot be declared as an int or a double type due to those being primitive types. However, it can be an Integer or Double type since those are from the wrapper class (which is seen as an object).

Difference between Array and ArrayList

There are a handful of differences between an Array and an ArrayList, but the biggest is flexibility. When an array is declared as ten, it only holds ten values, cannot be adjusted, or will be out of bounds. A workaround could be adjusting the boundary at the declaration, but it's insufficient and can lead to problems in larger code. An ArrayList helps keep the code clean and easier to manage over time since it can grow and shrink as needed. Another difference is that an Array can store primitive type values such as int, double, char, etc, and objects. However, an ArrayList is limited only to objects, so to hold primitive types in an ArrayList, the programmer must convert the objects to receive the same workflow as an Array. Doing this does lead to extra work.
