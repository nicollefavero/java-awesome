#!/bin/bash

cd src &&
jar xf lib/jfugue-5.0.9.jar org &&
javac Main.java &&
java Main
