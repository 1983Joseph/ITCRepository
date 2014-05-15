SOURCE := $(wildcard *.java)
BAZE_NAME := $(notdir $(SOURCE))

SOURCE_C_W := $(wildcard Container/*.java)
SOURCE_C := $(notdir $(SOURCE_C_W))
BAZE_NAME_C := $(notdir $(SOURCE_c))

SOURCE_I_W := $(wildcard Iterator/*.java)
SOURCE_I := $(notdir $(SOURCE_I_W))
BAZE_NAME_I := $(notdir $(SOURCE_I))

SOURCE_N_I_W :=$(wildcard NameIterator/*.java)
SOURCE_N_I := $(notdir $(SOURCE_N_I_W))
BAZE_NAME_N_I := $(notdir $(SOURCE_N_I))

SOURCE_N_R_W :=$(wildcard NameRepository/*.java)
SOURCE_N_R := $(notdir $(SOURCE_N_R_W))
BAZE_NAME_N_R := $(notdir $(SOURCE_N_R))

BAZE_NAME: $(SOURCE) $(SOURCE_C).class $(SOURCE_I).class $(SOURCE_N_I).class $(SOURCE_N_R).class
	javac $(SOURCE)
$(SOURCE_C).class: $(SOURCE_C_W)
	javac $^
$(SOURCE_I).class: $(SOURCE_I_W)
	javac $^
$(SOURCE_N_I).class: $(SOURCE_N_I_W)
	javac $^
$(SOURCE_N_R).class: $(SOURCE_N_R_W)
	javac $^
clear:
	rm Main.class Container/Container.class Iterator/Iterator.class NameIterator/NameIterator.class NameRepository/NameRepository.class
