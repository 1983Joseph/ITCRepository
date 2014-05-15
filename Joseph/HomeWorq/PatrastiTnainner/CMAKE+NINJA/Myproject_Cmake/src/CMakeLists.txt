cmake_minimum_required(VERSION 2.8)

PROJECT ( myproject )
set ( SRC_DIR ./src )
file(GLOB src "myproject.cpp")
set ( APP_NAME myproject-program )
set ( BUILD_TYPE RELEASE )
message (${BUILD_TYPE})
#add_executable ( ${APP_NAME} ${SRC} )
 
