public class Ejercicios {

    public Ejercicios() {
    }
    
    public int sumaConsecutivos(int num){
        
        // CASO BASE
        System.out.println("El num es "+ num);
        if (num == 1) {
            return 1;
        }
        // PARTE RECURSIVA
        return  num + sumaConsecutivos(num - 1); 
    }

    public int sumaConsecutivosPasos(int num){
        
        // CASO BASE
        System.out.println("El num es "+ num);
        if (num == 1) {
            return num;
        }
        // PARTE RECURSIVA
        int resultadoRecursivo = sumaConsecutivosPasos(num - 1);
        int resultadoOperacion = num + resultadoRecursivo;
        System.out.println("resultadoOp " + resultadoOperacion + " = "+ num + " + "+" sumaConsecutivosPasos("+ (num - 1) + ")");
        return  resultadoOperacion; 
    }
    
    /* Potencia de un número: Escribe una función RECURSIVA
       que calcula la potencia de un numero base elevado a 
       un exponente entero.
       Por ejemplo, si base es 2 y exponente es 3, 
       la función debe devolver 2^3 = 8.
    */
    
    public int getPotencia(int base, int exponente){

        if (exponente == 1){    
            return base; // base ^ 1 = base 
        }
        if (exponente == 0){
            return 1;
        }
        return base * getPotencia(base, exponente - 1);
        }

    public int sumaDigitos(int num){

        if (num < 10){    
            return num; // base ^ 1 = base 
        }
        return (num % 10) + sumaDigitos(num / 10);
    }
}
