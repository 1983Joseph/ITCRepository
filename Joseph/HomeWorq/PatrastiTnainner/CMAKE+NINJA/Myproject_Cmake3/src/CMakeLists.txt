set ("${PROJECT}_VERSION_MAJ" 0)
set ("${PROJECT}_VERSION_MIN" 1)
set ("${PROJECT}_VERSION_A" 1)
set ("${PROJECT}_VERSION_B" 1)
set ("${PROJECT}_VERSION" ${${PROJECT}_VERSION_MAJ}0${${PROJECT}_VERSION_MIN}0${${PROJECT}_VERSION_A}0${${PROJECT}_VERSION_B})

message(STATUS ${${PROJECT}_VERSION})
#cragri himnakan file
set (MAIN_SOURCES
    myproject.cpp
    )
#cragrum ogtagorcvox gradaranner
set (ADDITIONAL_LIBRARIES
    stdc++
    fstream
    iostream
    )
add_executable ( ${PROJECT} ${MAIN_SOURCES} )

