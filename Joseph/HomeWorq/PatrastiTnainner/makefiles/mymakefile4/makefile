HEADERS :=$(wildcard header/*.hpp)
SOURCE :=$(wildcard src/*.cpp)
OBJECTS :=$(patsubst src/%.cpp,obj/%.o,$(SOURCE))
EXE :=$(addprefix bin/,program)
CC := g++
BINDIR = bin
OBJDIR = obj
$(EXE) : $(OBJECTS) | $(BINDIR)
	$(CC) $(OBJECTS) -o $(EXE)
$(OBJECTS) : $(SOURCE) $(HEADERS) | $(OBJDIR)
	    $(CC) -c $(SOURCE) -o $(OBJECTS)
$(BINDIR):
	mkdir bin
$(OBJDIR):
	mkdir obj
.PHONY : clear
clear :
	rm -r obj bin
