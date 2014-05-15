HEADERS :=$(wildcard header/*.hpp)
SOURCE :=$(wildcard src/*.cpp)
OBJECTS :=$(patsubst src/%.cpp,obj/%.o,$(SOURCE))
EXE :=$(addprefix bin/,program)
CC := g++
#DEP
BINDIR = bin
OBJDIR = obj
$(EXE) : $(OBJECTS) | $(BINDIR)
	$(CC) $(OBJECTS) -o $(EXE)
$(OBJECTS) : $(SOURCE) $(HEADERS) | $(OBJDIR)
	    $(CC) -c $(SOURCE) -o $(OBJECTS)
file.dep : $(SOURCE)
	$(CC) -MM $(SOURCE) -MT "file.dep $(OBJECTS)" -o file.dep
$(BINDIR):
	mkdir bin
$(OBJDIR):
	mkdir obj
.PHONY : clear
clear :
	rm -r obj bin
	rm file.dep
-include file.dep 
