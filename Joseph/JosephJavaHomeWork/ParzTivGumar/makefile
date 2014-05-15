SOURCE=./parzTivGumar/ParzTivGumar.java Main.java
compiler=javac
output=*.class ./parzTivGumar/*.class
classfile=Main.class
exefile=Main
interpretator=java

compile: $(SOURCE)
	$(compiler) $(SOURCE)
clean: $(output)
	rm -f $(output)
run: $(classfile)
	$(interpretator) $(exefile)


