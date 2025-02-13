import java.util.Scanner

fun main(){

    val input = Scanner(System.`in`)

    println("Digite um número: ")
    var numero = input.nextInt()

    var ehPrimo: Boolean = true

    if(numero <= 1){
        ehPrimo = false
    }else{
        for (i in 2 until numero){
            if (numero % i==0){
                ehPrimo = false
                break
            }
        }
    }

    if (ehPrimo){
        println("É PRIMO")
    }else{
        println("NÃO É PRIMO")
    }

}