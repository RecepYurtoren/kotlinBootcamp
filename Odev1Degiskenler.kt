fun main() {
    val sehir = "İstanbul"
    val ulke = "Türkiye"
    val telefon = "+905412345678"
    val postaKodu = "34520"
    val email = "recepyurtoren1@gmail.com"
    val meslek = "Öğrenci"
    val stokMiktari = 1
    val musteriAdi = "Recep Yurtören"
    val bakiye = 12578.50
    val dogumGunu = "29/01/2004"
    val maas = 45000
    val medeniDurum = "Bekar"
    val urunYorum = "Arada tekliyor ama iyi çalışıyor :)"
    val odemeTarihi = "1-5 Mayıs 2025"
    val odeme = 32500
    val siparisAdeti = 5
    val arabaModeli = "Opel Astra"
    val kitapAdi = "Karamazov Kardeşler"
    val yayinlamaTarihi = "Kasım 1880"
    val indirimMiktari = 10
    val odaSayisi = 1
    val enlem = 36.0150
    val boylam = 27.1728
    val urunAdi = "HP Victus 16-S0046NT"
    val yemekFiyati = 499.90
    val marka = "Samsung"
    val videoSuresi = 50
    val urunPuani = 4.7
    val resimAdi = "gorsel.png"
    val dosyaFormati = "WEBP"
    val renk = "Mavi"
    val renkKodu = "#FFF"
    val telefonModeli = "Samsung Galaxy S24"
    val ekranBoyutu = 6.5
    val agirlik = 71.3
    val ulusalGun = "Cumhuriyet Bayramı"
    val tatilGunu = "20 Temmuz - 1 Ağustos"
    val rezervasyonTarihi = "20 Temmuz 2025 11:00"
    val sokakAdi = "Selvi Sokak"
    val otobusHatti = "79E"
    val kalanDakika = 3
    val takipKodu = "KT274251800"
    val kuponSuresi = 60
    val kuponKodu = "27NİSAN"
    val faturaAdresi = "NO:30 D:30 Kadıköy/İstanbul"

    val degiskenler = listOf(
        "Şehir" to sehir,
        "Ülke" to ulke,
        "Telefon" to telefon,
        "Posta Kodu" to postaKodu,
        "E-mail" to email,
        "Meslek" to meslek,
        "Stok Miktarı" to stokMiktari,
        "Müşteri Adı" to musteriAdi,
        "Bakiye" to bakiye,
        "Doğum Günü" to dogumGunu,
        "Maaş" to maas,
        "Medeni Durum" to medeniDurum,
        "Ürün Yorum" to urunYorum,
        "Ödeme Tarihi" to odemeTarihi,
        "Ödeme" to odeme,
        "Sipariş Adeti" to siparisAdeti,
        "Araba Modeli" to arabaModeli,
        "Kitap Adı" to kitapAdi,
        "Yayınlama Tarihi" to yayinlamaTarihi,
        "İndirim Miktarı" to indirimMiktari,
        "Oda Sayısı" to odaSayisi,
        "Enlem" to enlem,
        "Boylam" to boylam,
        "Ürün Adı" to urunAdi,
        "Yemek Fiyatı" to yemekFiyati,
        "Marka" to marka,
        "Video Süresi (sn)" to videoSuresi,
        "Ürün Puanı" to urunPuani,
        "Resim Adı" to resimAdi,
        "Dosya Formatı" to dosyaFormati,
        "Renk" to renk,
        "Renk Kodu" to renkKodu,
        "Telefon Modeli" to telefonModeli,
        "Ekran Boyutu (inç)" to ekranBoyutu,
        "Ağırlık (gr)" to agirlik,
        "Ulusal Gün" to ulusalGun,
        "Tatil Günü" to tatilGunu,
        "Rezervasyon Tarihi" to rezervasyonTarihi,
        "Sokak Adı" to sokakAdi,
        "Otobüs Hattı" to otobusHatti,
        "Kalan Dakika" to kalanDakika,
        "Takip Kodu" to takipKodu,
        "Kupon Süresi (gün)" to kuponSuresi,
        "Kupon Kodu" to kuponKodu,
        "Fatura Adresi" to faturaAdresi
    )

    for ((baslik, bilgi) in degiskenler) {
        println("$baslik: $bilgi")
    }
}
