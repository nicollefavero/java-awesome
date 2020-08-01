#Funny Main
A project with java 8 to understand how to pass parameters to a main method both through IDE and command line.

This project "checks" vehicles and "sends" an email after it. This could be used by a company that rents vehicles, for example.

Idea from: [DevMedia](https://www.devmedia.com.br/entendendo-o-parametro-string-args-em-java/29245)

It is possible to pass anyone of the following parameters to the main method:
* I10, that means it is ok ignore vehicles that have more than 10 years.
* IEXT, that means it is ok ignore vehicles that are already on the road.
* EMAIL:example@email.com.br, where the final report will be sent.

##Build
```shell
gradle build
```

##Run with Parameters
```shell
cd build/libs
java -jar funny-main-1.0-SNAPSHOT.jar I10 IEXT EMAIL:example@email.com.br
```









