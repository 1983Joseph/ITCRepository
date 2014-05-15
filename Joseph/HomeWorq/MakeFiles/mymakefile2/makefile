HEADERS :=barev.hpp
SOURCE :=barev.cpp
TARGET :=barev.o
EXE :=program
CC := g++
$(EXE) : $(TARGET)
	$(CC) $(TARGET) -o $(EXE)
$(TARGET) : $(SOURCE) $(HEADERS)
	    $(CC) -c $(SOURCE) -o $(TARGET)
clear:
	rm $(TARGET) $(EXE)
