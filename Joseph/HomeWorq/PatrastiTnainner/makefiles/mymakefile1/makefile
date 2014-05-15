HEADERS := barev.hpp
SOURCE := barev.cpp
TARGET := barev.o
EXE : program
CC := g++
program : barev.o
	g++ barev.o -o program
barev.o : barev.cpp barev.hpp
	    g++ -c barev.cpp -o barev.o
clear:
	rm barev.o program
