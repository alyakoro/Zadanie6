class direct {

    val town = listOf("Абакан","Алапаевск","Алексеевка","",""
        ,"Архангельск","Астрахань","Барнаул","Брянск","Владикавказ",
        "Воронеж","Грозный","Екатеринбург","Заводоуковск","Заозёрск",
        "Ижевск","Казань","Калининград","Калуга",
        "Кемерово","Йошкар-Ола")

    val t1 = town.random()
    var t2 = town.random()
    constructor(){
        while (t1 == t2){
            t2 = town.random()
        }
    }
    var row = "$t1 - $t2"
}