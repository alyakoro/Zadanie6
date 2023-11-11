fun main() {
    var Finish = true
    while (Finish){
        println("Шаг 1 - Создать направление:")
        val direction = direct().row
        println("Маршрут поезда: $direction")
        println()

        println("Шаг 2 - Продать билеты:")
        val ticets = ticket().ticket
        println("Проданно: $ticets билетов")
        println()

        println("Шаг 3 - Сформировать поезд:")
        trainn(ticets)
        println()

        println("Шаг 4 - Отправить поезд:")
        gogogo(direct().row,trainn().schet)
        println()

        println("Для завершения работы, введите: EXIT")
        val exit = readln().toString()
        if (exit == "EXIT"){
            Finish = false }
    }
}