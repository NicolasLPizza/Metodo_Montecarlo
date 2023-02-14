package mates; 

public class Matematicas{

public static double NumeroPi(long dardos){
	double dardos_que_pegan = 0;
	for(int i = 0; i <= dardos; i++){
		double x = Math.random();
		double y = Math.random(); 
		if((x*x + y*y)<=1) dardos_que_pegan++; 
	}

 	return (4*dardos_que_pegan)/dardos;
}
}
