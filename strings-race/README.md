# String's Race
A project to understand how concatenation works in Java and which is the best option to use at which moment.

Idea from: [DevMedia](https://www.devmedia.com.br/diferencas-entre-string-stringbuilder-e-stringbuffer-em-java/29865)

### Build the executable jarfile
```
gradle build
```

### Run the application
```
cd build/libs
java -jar strings-race.jar
```

The output should look like this:
```
Tempo de concatenação com String (+): ----
Tempo de concatenação com String Builder: ----
Tempo de concatenação com String Buffer: ----

And the winner is....
```

But you will have to build and run this application to discover which is the more efficient way to concatenate a String.
