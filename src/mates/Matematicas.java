
//	Copyright [2023] [Nicolas Lopez Pizza]
//	Licensed under the Apache License, Version 2.0 (the "License");
//	you may not use this file except in compliance with the License.
//	You may obtain a copy of the License at
//
//	http://www.apache.org/licenses/LICENSE-2.0
//
//	Unless required by applicable law or agreed to in writing,
//	software distributed under the License is distributed on an
//	"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
//	either express or implied. See the License for the specific
//	language governing permissions and limitations under the
//	License.

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
/** 
 * @author Nicolas Lopez 
 */ 

