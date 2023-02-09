// quiz tebak angka


// angka randomnya
var ulang = true
while (ulang) {
var Kesempatan = 3
alert ("Tebak angka 1 - 10 \n"+  "Kesempatan anda 3 kali")
while (Kesempatan !=0){
  var comp = Math.floor(Math.random() * 10) + 1
  var comp2 = comp
  console.log (comp2)
  
  var user = prompt("Tebak Angka! \nMasukkan angka 1-10\nkesempatan anda Tersisa " + Kesempatan )   
  user = parseInt(user)
  var hasil =""
  user = ( isNaN(user) ) ? 0 : user ;

    if (user == comp2){
      hasil = ("KAMU MENANG")
      Kesempatan = Kesempatan = 0
    }else if (user != comp2) {
      hasil = user > comp ? "TERLALU BESAR " : " TERLALU KECIL"
      Kesempatan = Kesempatan - 1
    }
    alert (hasil)
  }
  ulang = confirm (" Ingin coba lagi?")
}
