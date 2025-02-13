import java.util.Scanner


fun main(){

    val input = Scanner(System.`in`)

    var media: Double;
    var soma: Double = 0.0;

    fun teste(notas: Array<Int>){
        var i = 0
        for(nota in notas){
            //println(i)
            i++
            println("Digite a nota " + i + ": ")
            soma += input.nextDouble()
        }

        println("===================================")
        media = soma / notas.size
        println("Média: " + media)

        when{
            media >= 7 -> println("Aprovado")
            media < 7 && media > 5 -> println("Recuperação")
            media < 5 -> println("Reprovado")
        }
    }

    teste(arrayOf(1,2,3))
}