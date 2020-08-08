# String's Race
A project to understand how concatenation works in Java and which is the best option to use at which moment.

### Build the executable jarfile
```
gradle build
```

### Run the application
```
cd build/libs
java -jar strings-race-1.0-SNAPSHOT.jar
```

The output should look like this:
```
Tempo de concatenação com String (+): ----
Tempo de concatenação com String Builder: ----
Tempo de concatenação com String Buffer: ----

And the winner is....
```

But you will have to build and run this application to discover which is the more efficient way to concatenate a String.