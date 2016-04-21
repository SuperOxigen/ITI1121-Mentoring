

all: build-polygon build-integertree build-minstack

clean:
	@echo "Deleting all .class files"
	@rm -vf cls/*.class src/*.class

build-polygon:
	javac -d cls src/PolygonExample.java

run-polygon:
	@echo "Running Polygon Example"
	@java -cp cls Shape2D
	@echo "Test Complete"

build-integertree:
	javac -d cls src/IntegerTree.java

run-integertree:
	java -cp cls IntegerTree

build-minstack:
	javac -d cls src/Stack.java src/SimpleLinkedStack.java src/MinStack.java

run-minstack:
	java -cp cls MinStack

test-stack:
	java -cp cls SimpleLinkedStack

build-bst:
	javac -d cls src/LinkedBST.java

run-bst:
	java -cp cls LinkedBST
