SOURCE=./fibonaccis/*.java *.java
compiler=javac
output=./fibonaccis/*.class *.class
classfile=Main.class
exefile=Main
interpretator=java

compile: $(SOURCE)
	$(compiler) $(SOURCE)
clean: $(output)
	rm -f $(output)
run: $(classfile)
	$(interpretator) $(exefile)


