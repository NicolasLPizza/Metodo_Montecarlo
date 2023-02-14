limpiar: 
	rm -rf bin 
compilar:limpiar 
	mkdir bin 
	find . -name "*.java" | xargs javac -cp bin -d bin
ejecutar:compilar 
	java -cp bin aplicacion/Main 100000
