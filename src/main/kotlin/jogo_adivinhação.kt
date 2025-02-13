import java.util.Scanner
import java.util.Random


fun main(){

    val input = Scanner(System.`in`)
    var random = Random().nextInt(1, 10)
    var tentativa: Int;
    var tentativas: Int = 0

    println("Tente acertar o número entre 1 e 100! ")
    while (true){
        println("Digite seu palpite: ")
        tentativa = input.nextInt()
        tentativas++

        if (tentativa == random){
            println("VOCE ACERTOU EM " + tentativas + " TENTATIVAS")
            break
        }else{

            if (tentativa > random){
                println("VOCE ERROU, VOCE JÁ TENTOU " + tentativas + " VEZES...")
                println("tente um número menor...")
            }else{
                println("VOCE ERROU, VOCE JÁ TENTOU " + tentativas + " VEZES...")
                println("tente um número maior...")

            }

        }
    }

}