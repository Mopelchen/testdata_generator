# Testdata Generator 

A code kata to explore the Java Reflection API

Imagine you are working on a project where you have to serialize your model into a string with a very, 
very specific format. Imagine further that your model classes are quite large, and the model in itself rather complex.
To make matters worse, imagine that you are aiming at a moving target with that model, i.e. it still changes wildly 
while you are trying to get the serialisation up and running.

Yeah, you are right. The project does not run quite smoothly. And yes, none of what is going on is well planned, much less 
well understood. But such is life for you at the moment, and you still have to test your code!

Since the model is so large and complex and ever-changing, initializing classes manually and inventing test data is a 
real chore, that becomes repetitive and boring quite fast. In addition, there is not much business logic to be found 
here. You just need some data in your model, in order to test the serialisation. Any data will do!

So, how about writing a test data generator tool, that grabs any of your model classes and initializes it with dummy 
data? Something like the following:


| Type of field                 | Value of field                            |
|-------------------------------| ------------------------------------------|
| int/Integer                   | MAX_INT or MIN_INT randomly               |
| long/Long                     | MAX_LONG or MIN_LONG randomly             |
| byte/Byte                     | MAX_BYTE or MIN_BYTE randomly             |
| short/Short                   | MAX_SHORT / MIN_SHORT                     |
| boolean/Boolean               | true / false                              |
| double/Double                 | MAX_DOUBLE / MIN_DOUBLE                   |
| float/Float                   | MAX_FLOAT / MIN_FLOAT                     |
| char/Character                | '\u0000' / '\uffff'                       |
| String                        | The fully qualifying name of the field    |
| Enum                          | First value of that enum                  |
| Collection                    | A collection of the specified type with a single item of the correct type initialized as detailed in this table (have fun with this one!) | 
| other objects of your model   | A correctly initialized instance of that type |

To make things a little bit more interesting, make sure, that the test data generator only operates on your model classes. 
Any other classes you either by ignored or cause a Runtime Exception of your choosing.

To top it off, imagine that some fields may have some restrictions on them regarding
- minimal lengths
- maximal lengths
- allowed characters
- number ranges

Try to adapt the generator in such a way that the test data fits those restrictions.