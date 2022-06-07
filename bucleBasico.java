


public class bucleBasico {
	
	public static void main (String[] args) {
		String a="hola";
        int cantidad=0;
      //comienzo bucle do while  
    do {
        System.out.print("Cuantas veces quieres que te diga hola?");
        cantidad = Integer.parseInt(System.console().readLine());

     //acaba bucle do while y aqui comprueba que no entren negativos 
     //(cumple la condicion si no son menores que 0) y entra en el bucle  
    } while (cantidad<0);

    //bucle for independiente de while 
    //1º=inicializo las bueltas en 0
    //2º=le digo que i (que es 0) sea menor cantidad o cantidad mayor que i
    //3º=y si lo cumple la condicion ejecuta la instruccion dentro del bucle for en este caso
    for(int i=0; i<cantidad;i++){
        System.out.println(a+" "+(i+1)+" ");
        for (int j=0;j<cantidad;j++){
            System.out.println(a+" "+(i)+" ");
        }
                
    }
     

	
    } 
}
