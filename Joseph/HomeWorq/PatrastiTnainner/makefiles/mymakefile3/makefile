HEADERS :=$(wildcard header/*.hpp)
SOURCE :=$(wildcard src/*.cpp)
#TARGET :=barev.o
OBJECTS :=$(patsubst src/%.cpp,obj/%.o,$(SOURCE))
EXE :=$(addprefix bin/,program)
CC := g++
$(EXE) : $(OBJECTS)
	$(CC) $(OBJECTS) -o $(EXE)
$(OBJECTS) : $(SOURCE) $(HEADERS)
	    $(CC) -c $(SOURCE) -o $(OBJECTS)
clear:
	rm $(OBJECTS) $(EXE)
