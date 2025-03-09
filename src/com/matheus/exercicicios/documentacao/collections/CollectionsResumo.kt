package com.matheus.exercicicios.documentacao.collections

fun main(){
    // Collections
    // Podem ser separadas em Lists, Sets e Maps.

    /*
        **Listas** são coleções de itens ordenados e podem conter elementos duplicados.
        Elas podem ser imutáveis ou mutáveis.

        - Comandos:
            "listOf()" -> Lista imutável
            "mutableListOf()" -> Lista mutável
    */

    val listaImutavel = listOf("Banana", "Maçã", "Morango")
    val listaMutavel = mutableListOf("Banana", "Maçã", "Morango")

    /*
        **Sets** são coleções desordenadas e somente guardam itens com valores únicos.
        Eles não permitem elementos duplicados.

        Exemplo:
            val setFrutas = setOf("Banana", "Maçã", "Morango", "Morango")
            print(setFrutas) // Output: [Banana, Maçã, Morango]

        - Comandos:
            "setOf()" -> Set imutável
            "mutableSetOf()" -> Set mutável
    */

    val setImutavel = setOf("Banana", "Maçã", "Morango")
    val setMutavel = mutableSetOf("Banana", "Maçã", "Morango")

    /*
        **Maps** são coleções de pares chave-valor, onde cada chave é única e está associada a um valor.
        Eles podem ser imutáveis ou mutáveis.

        - Comandos:
            "mapOf()" -> Map imutável
            "mutableMapOf()" -> Map mutável
    */

    val mapImutavel = mapOf("A" to 1, "B" to 2, "C" to 3)
    val mapMutavel = mutableMapOf("A" to 1, "B" to 2, "C" to 3)

}