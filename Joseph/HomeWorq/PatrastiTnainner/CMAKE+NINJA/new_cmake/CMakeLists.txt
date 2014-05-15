#cmake_minimum_reguired(VERSION 2.8) 
project(our_project)
set(sources filecpp.cpp)
add_executable(our_project ${sources})
BUILD_COMMAND(
	"make"
	)
 
