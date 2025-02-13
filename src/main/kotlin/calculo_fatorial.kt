import java.util.Scanner
fun main(){

    var input = Scanner(System.`in`);

    println("Digite um número para calcular o fatorial: ");

    var numero = input.nextInt();
    var fatorial = 1;

    for(i in numero downTo 1){
        fatorial *= i
    }

    println("O fatorial de " + numero + " é " + fatorial)

}


