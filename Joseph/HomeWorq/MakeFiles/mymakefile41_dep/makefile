HEADERS :=$(wildcard header/*.hpp)
SOURCE :=$(wildcard src/*.cpp)
OBJECTS :=$(patsubst %.cpp,%.o,$(SOURCE))
DEPENDS :=$(patsubst %.cpp,%.dep,$(SOURCE))
EXE :=$(addprefix bin/,program)
CC := g++
BINDIR = bin
OBJDIR = obj
$(EXE) : $(OBJECTS) | $(BINDIR)
	ld $^ -o $@
%.o : %.cpp $(HEADERS) | $(OBJDIR)
	    $(CC) -c $< -o $@
%.dep : %.cpp
	$(CC) -MM $< -MT "$@ $(patsubst %.dep,%.o,$@)" -o $@
$(BINDIR):
	mkdir bin
$(OBJDIR):
	mkdir obj
.PHONY : clear
clear :
	rm -r obj bin
-include $(DEPENDS) 
