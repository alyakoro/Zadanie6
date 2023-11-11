class trainn () {
    var schet = 1
    constructor (tic: Int) : this() {
        var tic_kol = tic
        while (tic_kol != 0) {
            var vmess_vagon = (5..25).random()
            if (vmess_vagon <= tic_kol) {
                tic_kol -= vmess_vagon
                println("Вагон номер $schet вместимостью $vmess_vagon пассажиров")
                schet++
            }
            else if (tic_kol < 5){
                println("$tic_kol - количество пассажиров не уехало")
                tic_kol = 0
            }
        }
    }
}