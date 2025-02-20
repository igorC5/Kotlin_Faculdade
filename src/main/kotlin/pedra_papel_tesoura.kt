fun main(){

    val escolhas = listOf("1", "2", "3")
    val escolha_da_maquina = escolhas.random()

    println("=====================")
    println("Vamos jogar pedra papel tesoura")
    println("1 - PEDRA")
    println("2 - PAPEL")
    println("3 - TESOURA")
    println("=====================")
    println(" escolha sua opção: ")

    val escolhas_validas = listOf("1", "2", "3")
    var escolha_player = readLine()
    while ( escolha_player !in escolhas_validas ){

        println("SELECIONE UMA OPÇÃO VÁLIDA")
        println("=====================")
        println("Vamos jogar pedra papel tesoura")
        println("1 - PEDRA")
        println("2 - PAPEL")
        println("3 - TESOURA")
        println("=====================")
        println(" escolha sua opção: ")
        escolha_player = readLine()
    }

    fun resultado(resultado: String){

        if (resultado == "vitoria"){
            println("você venceu! eu escolhi $escolha_da_maquina")
        }
        if (resultado == "derrota"){
            println("você perdeu!, eu escolhi $escolha_da_maquina")
        }

    }

    if (escolha_player == escolha_da_maquina){

        println("Eu também escolhi $escolha_player, nós empatamos!")
    }else{
        if (escolha_player == "1"){
            when{
                escolha_da_maquina == "2" -> resultado("derrota")
                escolha_da_maquina == "3" -> resultado("vitoria")
            }
        }
        if (escolha_player == "2"){
            when{
                escolha_da_maquina == "1" -> resultado("vitoria")
                escolha_da_maquina == "3" -> resultado("derrota")
            }
        }
        if (escolha_player == "3"){
            when{
                escolha_da_maquina == "2" -> resultado("vitoria")
                escolha_da_maquina == "1" -> resultado("derrota")
            }
        }
    }

}