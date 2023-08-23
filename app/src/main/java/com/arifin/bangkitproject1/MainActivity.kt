package com.arifin.bangkitproject1

import ItemAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arifin.bangkitproject1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemAdapter: ItemAdapter
    private lateinit var itemList: List<ItemModel>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        itemList = generateItemList()

        itemAdapter = ItemAdapter(this, itemList)
        recyclerView.adapter = itemAdapter

//        binding profile page
        binding.profile.setOnClickListener{
            val intent = Intent(this, ProfilePage::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun generateItemList(): List<ItemModel> {
        val items = mutableListOf<ItemModel>()

        // Menambahkan Data
        items.add(ItemModel(
            R.drawable.superman,
            "Superman",
            "Seorang alien dari planet Krypton dengan kekuatan super di Bumi. Dia memiliki kekuatan, kecepatan, dan daya tahan yang luar biasa.",
        "Pada suatu malam di kota New York, seorang remaja bernama Peter Parker sedang belajar di kamarnya. Dia adalah seorang siswa yang cerdas tetapi juga canggung di sekolah. Peter tinggal bersama bibinya dan pamannya setelah kehilangan orang tuanya dalam kecelakaan.\n" +
                "\n" +
                "Suatu hari, saat Peter sedang mengunjungi sebuah pameran ilmiah tentang genetika, dia digigit oleh laba-laba yang telah terpapar radiasi. Keesokan harinya, dia merasa aneh, dan seiring waktu, dia menyadari bahwa dia memiliki kekuatan luar biasa. Peter menemukan bahwa dia bisa merayap di dinding, memiliki kecepatan dan refleks yang lebih cepat dari manusia biasa, serta kemampuan untuk melepaskan jaring dari pergelangan tangannya.\n" +
                "\n" +
                "Awalnya, Peter menggunakannya untuk bersenang-senang dan tampil di sirkus lokal sebagai \"Spider-Man.\" Namun, saat dia mengabaikan tanggung jawabnya untuk mencegah kejahatan, kehidupannya berubah saat pencuri yang dia biarkan melarikan diri membunuh pamannya yang dicintainya.\n" +
                "\n" +
                "Menghadapi rasa bersalah yang mendalam, Peter menyadari bahwa dengan kekuatannya, dia memiliki tanggung jawab untuk melindungi warga kota. Dia menciptakan kostum merah dan biru dengan jaring laba-laba dan menjadi Spider-Man secara resmi. Peter memutuskan untuk menggunakan kekuatannya untuk melawan penjahat, menjaga kota tetap aman, dan menghormati ingatan pamannya.\n" +
                "\n" +
                "Spider-Man segera menjadi simbol keadilan di New York City. Dia berhadapan dengan berbagai penjahat, termasuk Green Goblin, Doctor Octopus, dan Venom. Meskipun dia menghadapi banyak kesulitan dan pengorbanan dalam hidupnya sebagai pahlawan super, Spider-Man terus melawan kejahatan dengan semangat dan kekuatan yang tak tergoyahkan.\n" +
                "\n" +
                "Cerita Spider-Man adalah kisah tentang perjuangan, tanggung jawab, dan kekuatan untuk melakukan kebaikan. Peter Parker menemukan bahwa dengan kekuatan datanglah tanggung jawab, dan dia berkomitmen untuk menggunakan kekuatannya demi kebaikan dan melindungi mereka yang tidak berdaya."))
        items.add(ItemModel(R.drawable.spiderman,
            "Spider-Man",
            "Seorang remaja yang mendapatkan kekuatan laba-laba setelah digigit laba-laba radioaktif. Dia memiliki kemampuan merayap di dinding dan indra yang tajam.",
        "Pada suatu malam di kota New York, seorang remaja bernama Peter Parker sedang belajar di kamarnya. Dia adalah seorang siswa yang cerdas tetapi juga canggung di sekolah. Peter tinggal bersama bibinya dan pamannya setelah kehilangan orang tuanya dalam kecelakaan.\n" +
                "\n" +
                "Suatu hari, saat Peter sedang mengunjungi sebuah pameran ilmiah tentang genetika, dia digigit oleh laba-laba yang telah terpapar radiasi. Keesokan harinya, dia merasa aneh, dan seiring waktu, dia menyadari bahwa dia memiliki kekuatan luar biasa. Peter menemukan bahwa dia bisa merayap di dinding, memiliki kecepatan dan refleks yang lebih cepat dari manusia biasa, serta kemampuan untuk melepaskan jaring dari pergelangan tangannya.\n" +
                "\n" +
                "Awalnya, Peter menggunakannya untuk bersenang-senang dan tampil di sirkus lokal sebagai \"Spider-Man.\" Namun, saat dia mengabaikan tanggung jawabnya untuk mencegah kejahatan, kehidupannya berubah saat pencuri yang dia biarkan melarikan diri membunuh pamannya yang dicintainya.\n" +
                "\n" +
                "Menghadapi rasa bersalah yang mendalam, Peter menyadari bahwa dengan kekuatannya, dia memiliki tanggung jawab untuk melindungi warga kota. Dia menciptakan kostum merah dan biru dengan jaring laba-laba dan menjadi Spider-Man secara resmi. Peter memutuskan untuk menggunakan kekuatannya untuk melawan penjahat, menjaga kota tetap aman, dan menghormati ingatan pamannya.\n" +
                "\n" +
                "Spider-Man segera menjadi simbol keadilan di New York City. Dia berhadapan dengan berbagai penjahat, termasuk Green Goblin, Doctor Octopus, dan Venom. Meskipun dia menghadapi banyak kesulitan dan pengorbanan dalam hidupnya sebagai pahlawan super, Spider-Man terus melawan kejahatan dengan semangat dan kekuatan yang tak tergoyahkan.\n" +
                "\n" +
                "Cerita Spider-Man adalah kisah tentang perjuangan, tanggung jawab, dan kekuatan untuk melakukan kebaikan. Peter Parker menemukan bahwa dengan kekuatan datanglah tanggung jawab, dan dia berkomitmen untuk menggunakan kekuatannya demi kebaikan dan melindungi mereka yang tidak berdaya."))
        items.add(ItemModel(R.drawable.wonder_woman,
            "Wonder Woman",
            "Seorang prajurit Amazon dengan kekuatan fisik yang luar biasa, senjata-senjata mitos, dan tali kebenaran yang tidak bisa putus.",
        "Di pulau tersembunyi bernama Themyscira, terletak suatu masyarakat Amazon yang dikenal sebagai Amazons. Mereka adalah bangsa pejuang yang hanya terdiri dari perempuan. Salah satu Amazon yang paling kuat dan terpilih adalah Diana, yang kemudian dikenal sebagai Wonder Woman.\n" +
                "\n" +
                "Themyscira tersembunyi dari dunia luar dan dilindungi oleh mitos dan kekuatan dewa-dewi Yunani. Diana tumbuh sebagai seorang pejuang yang tangguh dan memiliki ambisi besar untuk melindungi kebenaran dan keadilan. Ia dilatih dalam seni perang, bela diri, dan taktik tempur.\n" +
                "\n" +
                "Suatu hari, seorang penerbang bernama Steve Trevor jatuh ke dalam wilayah Themyscira setelah pesawatnya mengalami kecelakaan. Diana menolongnya dan mengetahui tentang perang besar yang berkecamuk di dunia manusia, yaitu Perang Dunia I. Tergerak oleh keinginannya untuk membantu manusia, Diana memutuskan untuk meninggalkan pulau dan pergi bersama Steve Trevor ke dunia luar.\n" +
                "\n" +
                "Setelah tiba di dunia manusia, Diana menggunakan nama \"Diana Prince\" dan mengenakan kostum luar biasa yang terinspirasi oleh mitos Amazons. Dia menggunakan kekuatannya yang luar biasa, termasuk kekuatan fisik, kecepatan, dan ketahanan yang diwarisi dari darah Amazon. Dia juga menggunakan Lasso of Truth, sebuah tali yang tak bisa berbohong, serta senjata-senjata mitos lainnya.\n" +
                "\n" +
                "Diana menjadi pahlawan yang dikenal dengan nama Wonder Woman. Dia berjuang melawan kejahatan, penindasan, dan ancaman global. Selama petualangannya, dia bertemu dengan berbagai sekutu, termasuk Batman dan Superman, untuk membentuk Justice League.\n" +
                "\n" +
                "Selain keahlian tempur dan kekuatannya, Wonder Woman juga menjadi simbol kekuatan, keberanian, dan keadilan bagi banyak orang. Dia tidak hanya melawan musuh fisik, tetapi juga memperjuangkan perdamaian dan kesetaraan di dunia manusia.\n" +
                "\n" +
                "Cerita Wonder Woman adalah tentang seorang pejuang yang mengatasi tantangan untuk membawa keadilan dan kebenaran di dunia yang kadang-kadang penuh kegelapan. Dia adalah contoh inspiratif tentang bagaimana seseorang dengan kekuatan luar biasa bisa menggunakan kekuatan itu untuk tujuan yang lebih besar."))
        items.add(ItemModel(R.drawable.batman,
            "Batman",
            "Seorang jagoan tanpa kekuatan super yang menggunakan kecerdasan, keterampilan bela diri, dan peralatan canggih untuk melawan kejahatan.",
        "Di kota Gotham City yang korup dan gelap, seorang anak bernama Bruce Wayne menjadi saksi pembunuhan orang tuanya oleh seorang perampok. Insiden tersebut mengguncang Bruce dengan sangat kuat dan menciptakan trauma dalam dirinya. Berjanji untuk memberantas kejahatan dan kecorupan yang merajalela, Bruce berkomitmen untuk mengubah dirinya menjadi pemburu kejahatan yang disebut \"Batman.\"\n" +
                "\n" +
                "Setelah bertahun-tahun meningkatkan kemampuan fisik, bela diri, dan dedikasi untuk keadilan, Bruce Wayne menciptakan identitas ganda. Siang hari, ia adalah sosok miliarder yang mengelola Wayne Enterprises, perusahaan keluarganya. Namun, malam hari, ia berubah menjadi vigilante yang bertopeng dan menggunakan kemampuan yang telah dia kembangkan untuk memerangi penjahat dan menghadapi kejahatan di Gotham City.\n" +
                "\n" +
                "Tanpa memiliki kekuatan super seperti kebanyakan pahlawan super lainnya, Batman mengandalkan keterampilan bela diri yang luar biasa, kecerdasan brilian, serta peralatan canggih yang dirancangnya sendiri. Dia dikenal sebagai detektif yang ulung dan strategi yang cerdas, yang sering kali dapat memprediksi dan mengatasi pergerakan musuhnya.\n" +
                "\n" +
                "Batman juga memiliki galeri penjahat yang ikonik, termasuk The Joker, Penguin, Two-Face, dan Catwoman. Selama perjuangannya melawan penjahat dan korupsi di Gotham City, dia juga bermitra dengan sekutu seperti Alfred Pennyworth (pengasuh dan penasehatnya), Robin (rekannya yang menjadi sahabat dan penerusnya), dan komisaris James Gordon (petugas polisi yang merupakan sekutu pentingnya).\n" +
                "\n" +
                "Cerita Batman adalah kisah tentang perjuangan pribadi dan penentangan terhadap kejahatan, bahkan dalam kondisi paling gelap sekalipun. Meskipun melalui pertempuran dan konflik batin, Batman mewakili semangat perubahan dan keadilan di tengah dunia yang penuh kegelapan. Ia merupakan inspirasi bagi banyak orang yang percaya pada kekuatan individu untuk mengatasi kesulitan dan membuat perbedaan yang besar dalam masyarakat."))
        items.add(ItemModel(R.drawable.iron_man,
            "Iron Man",
            "Seorang miliarder dengan baju perang canggih yang memberinya kekuatan luar biasa dan kemampuan terbang.",
        "Di dunia teknologi dan bisnis, Tony Stark adalah seorang jenius miliarder yang memiliki perusahaan teknologi bernama Stark Industries. Suatu hari, saat sedang dalam perjalanan untuk memamerkan senjata baru di luar negeri, Tony tertangkap dalam serangan bom yang dilakukan oleh kelompok teroris. Selama penangkapan tersebut, serpihan bom yang terperosok menyebabkan cedera serius pada dadanya.\n" +
                "\n" +
                "Tony dipaksa untuk menciptakan senjata pemusnah massal untuk kelompok teroris tersebut. Namun, alih-alih memenuhi permintaan mereka, Tony merancang baju besi canggih dengan teknologi mutakhir yang mampu membantu dirinya keluar dari tahanan dan melawan para teroris. Dengan bantuan penemuan ilmiahnya, Tony menjadi pahlawan yang dikenal sebagai \"Iron Man.\"\n" +
                "\n" +
                "Iron Man pertama kali menggunakan baju besi pertamanya, Mark I, untuk melarikan diri dari tempat tahanan. Setelah kembali ke Amerika Serikat, Tony memperbaiki baju besi dan mengembangkan berbagai versi baru yang semakin canggih. Dia merancang baju besi dengan kekuatan yang luar biasa, kemampuan terbang, senjata canggih, dan pelindung yang kokoh.\n" +
                "\n" +
                "Selain menjadi pahlawan super, Tony Stark juga menggunakan teknologi dan kekayaannya untuk memperbaiki dunia. Dia terkenal karena kebijakannya dalam mengembangkan teknologi energi bersih dan berkelanjutan. Meskipun masih memiliki sifat yang eksentrik dan egois, Tony berubah menjadi seseorang yang lebih peduli terhadap kebaikan dan kemanusiaan.\n" +
                "\n" +
                "Selama perjalanannya sebagai Iron Man, Tony Stark berhadapan dengan berbagai ancaman, termasuk penjahat super seperti Mandarin dan Whiplash, serta konflik global seperti Perang Saudara Super. Dia juga menjadi salah satu pendiri Avengers, tim pahlawan super yang berjuang untuk melindungi dunia.\n" +
                "\n" +
                "Cerita Iron Man adalah tentang evolusi seorang pria dari seorang pengusaha egois menjadi pahlawan yang menggunakan teknologi dan kekayaannya untuk tujuan yang lebih besar. Iron Man mewakili semangat inovasi, kepahlawanan, dan pengorbanan demi kebaikan umum."))
        items.add(ItemModel(R.drawable.captain_amerika,
            "Captain America",
            "Seorang prajurit yang ditingkatkan secara fisik dengan serum super-soldier, memakai perisai yang tahan lama dan memiliki kemampuan taktis yang hebat.",
        "Pada masa Perang Dunia II, Steve Rogers adalah seorang pemuda Amerika yang ingin sekali mendaftar untuk bergabung dalam angkatan bersenjata dan berperang melawan pasukan Nazi. Namun, Steve memiliki masalah kesehatan yang serius dan postur tubuh yang lemah, sehingga ia selalu ditolak.\n" +
                "\n" +
                "Suatu hari, Steve menjadi perhatian seorang ilmuwan bernama Dr. Abraham Erskine yang memimpin \"Proyek Super Soldier.\" Proyek ini bertujuan untuk menciptakan tentara super dengan kekuatan luar biasa melalui prosedur eksperimental. Steve bersedia menjadi sukarelawan dan menjalani prosedur tersebut.\n" +
                "\n" +
                "Prosedur tersebut berhasil, dan Steve Rogers berubah secara fisik menjadi pria yang berotot dan kuat. Namun, proyek ini juga melibatkan serangan dari mata-mata Nazi, yang menyebabkan kematian Dr. Erskine. Steve menjadi satu-satunya hasil sukses dari proyek ini dan dikenal dengan nama Captain America.\n" +
                "\n" +
                "Dengan seragam Amerika dan perisai berbentuk bintang, Captain America menjadi simbol kekuatan, keberanian, dan keadilan. Dia berperang di medan perang melawan pasukan Nazi dan membantu berbagai operasi militer Sekutu. Di medan perang, dia menjadi inspirasi bagi banyak tentara dan warga Amerika lainnya.\n" +
                "\n" +
                "Selama Perang Dunia II, Captain America bermitra dengan tim pahlawan super yang dikenal sebagai Howling Commandos dan berjuang melawan penjahat super seperti Red Skull. Namun, saat menghadapi bom yang dinyalakan untuk menghancurkan pesawat yang membawa Red Skull, Captain America terpaksa terjatuh ke Samudra Atlantik dan dianggap hilang.\n" +
                "\n" +
                "Dia kemudian ditemukan di es oleh organisasi S.H.I.E.L.D. beberapa puluh tahun kemudian, dan dia terbangun dalam zaman modern. Meskipun terjebak dalam zaman baru, semangat dan prinsip-prinsipnya yang tak berubah membuatnya terus berjuang sebagai pahlawan.\n" +
                "\n" +
                "Cerita Captain America adalah tentang patriotisme, keberanian, dan kejujuran dalam menghadapi ketidakadilan. Captain America mewakili semangat Amerika yang teguh dan keinginan untuk melindungi kebebasan dan nilai-nilai yang penting. Ia adalah contoh inspiratif tentang bagaimana karakter seseorang dan tekad untuk melakukan yang benar dapat membawa pengaruh positif yang besar."))
        items.add(ItemModel(R.drawable.thor,
            "Thor",
            "Seorang dewa petir Norse dengan palu yang dapat menghasilkan kekuatan petir. Dia memiliki kekuatan dan kekuatan bertarung yang luar biasa.",
        "Di dunia mitologi Norse, ada seorang dewa petir yang kuat bernama Thor, putra raja dewa Odin. Thor dikenal sebagai dewa pejuang yang perkasa dan memiliki palu ajaib bernama Mjolnir, yang memberinya kekuatan petir dan kekuatan yang luar biasa. Dia melindungi Asgard, kerajaan para dewa, dari ancaman dan berperang melawan makhluk-makhluk jahat.\n" +
                "\n" +
                "Namun, dalam dunia Marvel Comics, Thor juga ada sebagai karakter pahlawan super. Dalam versi ini, Thor adalah seorang pahlawan luar angkasa yang berasal dari planet Asgard. Dia adalah seorang Avenger, salah satu anggota tim pahlawan super yang berjuang untuk melindungi bumi dari ancaman.\n" +
                "\n" +
                "Dalam versi Marvel, Thor kehilangan kekuatannya karena diusir dari Asgard oleh ayahnya, Odin, dan dihukum menjadi seorang manusia dengan kekuatan yang terbatas. Dia menjadi seorang dokter bernama Donald Blake dan hidup di bumi tanpa ingatan tentang identitas aslinya sebagai dewa.\n" +
                "\n" +
                "Suatu hari, ketika di bumi, Donald Blake menemukan tongkat yang tersembunyi, dan ketika dia mengayunkannya, dia berubah kembali menjadi Thor yang kuat. Dia menggunakan kekuatannya untuk melindungi bumi dari berbagai ancaman, termasuk penjahat super dan musuh-musuh luar angkasa.\n" +
                "\n" +
                "Thor memiliki kemampuan untuk mengendalikan petir dan memiliki kekuatan fisik yang luar biasa. Mjolnir, palu ajaibnya, tidak hanya menjadi senjata tetapi juga memungkinkan Thor terbang dan memiliki kekuatan yang tak terhingga. Namun, hanya mereka yang layak secara moral yang dapat mengangkat Mjolnir.\n" +
                "\n" +
                "Selama petualangannya, Thor juga berhadapan dengan musuh-musuh kuat seperti Loki, saudaranya yang licik, serta berpartisipasi dalam berbagai pertempuran besar untuk melindungi alam semesta. Dia juga memiliki hubungan dekat dengan rekan-rekannya di Avengers, seperti Iron Man dan Captain America.\n" +
                "\n" +
                "Cerita Thor adalah tentang kekuatan dan pengorbanan untuk melindungi yang lemah dan melawan kejahatan. Dia adalah pahlawan dengan kemampuan luar biasa yang berjuang untuk keseimbangan dan keadilan dalam dunia yang penuh dengan ancaman."))
        items.add(ItemModel(R.drawable.black_widow,
            "Black Widow",
            "Seorang mata-mata terampil dengan keterampilan bela diri yang tinggi dan senjata-senjata canggih",
        "Black Widow adalah Natasha Romanoff, seorang agen rahasia dan mata-mata ulung dengan latar belakang yang kompleks. Dia lahir di Uni Soviet dan diambil oleh program mata-mata yang dikenal sebagai Red Room. Di sana, dia dilatih secara intensif dalam seni bela diri, spionase, dan keterampilan mengecoh. Dia juga menjalani prosedur yang meningkatkan kemampuan fisiknya.\n" +
                "\n" +
                "Natasha tumbuh menjadi seorang agen rahasia yang sangat terampil, beroperasi di bawah alias \"Black Widow.\" Dia memiliki reputasi sebagai mata-mata terampil yang dapat melawan musuh-musuhnya tanpa ragu-ragu. Meskipun awalnya bekerja untuk kepentingan Uni Soviet, Natasha akhirnya membela sisi yang benar dan membelot ke sisi pahlawan.\n" +
                "\n" +
                "Setelah peristiwa perubahan aliran politik, Natasha memilih untuk bergabung dengan S.H.I.E.L.D., organisasi rahasia internasional yang bertujuan melindungi dunia dari ancaman berbahaya. Di S.H.I.E.L.D., dia bekerja bersama dengan agen-agen lain seperti Nick Fury, Tony Stark (Iron Man), dan Steve Rogers (Captain America).\n" +
                "\n" +
                "Black Widow juga menjadi anggota Avengers, tim pahlawan super yang berjuang untuk melindungi bumi dari ancaman luar angkasa dan dalam negeri. Selama petualangannya, dia berjuang melawan penjahat super, mata-mata jahat, dan organisasi jahat seperti Hydra.\n" +
                "\n" +
                "Meskipun dia dikenal sebagai seorang spion yang canggih dan terampil dalam pertempuran, Black Widow juga memiliki sisi manusiawi yang rentan. Latar belakangnya yang penuh dengan manipulasi dan kesulitan membuatnya memiliki perasaan kompleks dan mencari makna dalam tindakannya.\n" +
                "\n" +
                "Cerita Black Widow adalah tentang pemberontakan, pengorbanan, dan perjuangan seseorang untuk mendapatkan kebebasan dan meraih identitasnya sendiri. Dia adalah pahlawan yang menggunakan keahliannya untuk membantu yang lemah dan melindungi dunia, meskipun harus menghadapi masa lalu yang kelam."))
        items.add(ItemModel(R.drawable.the_flash,
            "The Flash",
            "Seorang pahlawan dengan kecepatan luar biasa, mampu berlari dengan kecepatan cahaya dan melakukan perjalanan waktu.",
        "The Flash adalah identitas pahlawan dari Barry Allen, seorang ilmuwan forensik di Central City Police Department. Suatu malam, ketika sedang bekerja di laboratorium, sebuah ledakan akselerator partikel terjadi yang menghasilkan kilat petir yang menimpanya. Akibatnya, Barry terkena radiasi dan mendapatkan kekuatan super kecepatan.\n" +
                "\n" +
                "Barry Allen dengan cepat menyadari bahwa dia telah mendapatkan kemampuan untuk bergerak pada kecepatan yang luar biasa. Dia memutuskan untuk menggunakan kekuatan barunya untuk memerangi kejahatan dan menjadi pahlawan super yang dikenal sebagai The Flash. Dengan kostum merah yang mencolok dan logo kilat, The Flash menjadi salah satu pahlawan terkenal di DC Universe.\n" +
                "\n" +
                "The Flash menggunakan kecepatan super untuk melakukan berbagai tindakan heroik. Dia bisa berlari secepat kilat, menghindari peluru, dan berpikir dengan kecepatan luar biasa. Selain itu, dia juga dapat menciptakan kecepatan aliran waktu, yang memungkinkannya melakukan perjalanan waktu dan ruang.\n" +
                "\n" +
                "Barry Allen bukan hanya pahlawan sendirian, tetapi juga menjadi anggota Justice League, tim pahlawan super elit yang berusaha melindungi dunia dari ancaman besar. Dia bermitra dengan pahlawan lain seperti Superman, Batman, dan Wonder Woman dalam pertempuran melawan penjahat super, alien, dan bahaya dari multiverse.\n" +
                "\n" +
                "The Flash juga memiliki galeri penjahat yang khas, termasuk musuh bebuyutannya yang paling terkenal, yaitu Reverse-Flash. Hubungan antagonis ini menambahkan kedalaman pada karakter dan kisahnya.\n" +
                "\n" +
                "Cerita The Flash adalah tentang kecepatan, keberanian, dan kemampuan untuk membuat perbedaan dalam waktu singkat. The Flash mewakili semangat pantang menyerah dan hasrat untuk membantu orang lain. Dia adalah pahlawan yang berusaha memahami dan mengendalikan kekuatannya yang luar biasa untuk kebaikan umum."))
        items.add(ItemModel(R.drawable.hulk,
            "Hulk",
            "Seorang ilmuwan yang berubah menjadi monster raksasa hijau saat marah. Dia memiliki kekuatan dan ketahanan fisik yang tak terbatas.",
        "Dr. Bruce Banner adalah seorang ilmuwan jenius dalam bidang radiasi gamma. Suatu hari, saat sedang melakukan uji coba di laboratoriumnya, ia terkena radiasi gamma akibat ledakan bom gamma yang tidak terduga. Efek radiasi tersebut mengakibatkan Bruce mengalami transformasi fisik yang dramatis ketika dia marah atau stres emosional.\n" +
                "\n" +
                "Ketika emosinya memuncak, Bruce Banner berubah menjadi makhluk raksasa hijau yang dikenal sebagai Hulk. Hulk memiliki kekuatan fisik yang luar biasa, daya tahan yang tak terbatas, dan kemampuan untuk melompat jarak yang jauh. Namun, Hulk juga memiliki pikiran yang lebih sederhana dan cenderung bertindak secara impulsif.\n" +
                "\n" +
                "Bruce Banner merasa terjebak antara identitasnya sebagai ilmuwan yang tenang dan bijak, dan sebagai Hulk yang kuat dan tidak terkendali. Dia berjuang untuk mengendalikan perubahan ini dan mencegah Hulk muncul, karena transformasi ini bisa menjadi ancaman bagi orang-orang di sekitarnya.\n" +
                "\n" +
                "Sambil mencari obat untuk menghentikan transformasi Hulk, Banner juga menggunakan kekuatan Hulk untuk tujuan baik. Hulk menjadi anggota Avengers dan membantu tim pahlawan super ini dalam pertempuran melawan ancaman besar. Meskipun sulit diendalikan, Hulk sering kali menjadi kekuatan tak terduga yang sangat dibutuhkan dalam situasi berbahaya.\n" +
                "\n" +
                "Cerita Hulk adalah tentang pertempuran internal antara akal dan emosi, serta bagaimana seseorang menghadapi sisi gelap dan kekuatan yang sulit diatasi dalam dirinya. Hulk juga mewakili kekuatan merusak dan potensi untuk penghancuran, serta bagaimana mengelola dan mengarahkannya ke arah yang positif."))
        items.add(ItemModel(R.drawable.wonder_man,
            "Wonder Man",
            "Memiliki kekuatan fisik yang hebat dan daya tahan yang tinggi, serta kemampuan untuk mengubah energi fisiknya menjadi bentuk energi lain.",
        "Simon Williams adalah seorang pengusaha sukses dan playboy yang memiliki bisnis dalam bidang industri hiburan. Namun, ketika bisnisnya mulai merosot, Simon menjadi korban manipulasi dan kecurangan oleh penjahat jahat. Untuk menyelamatkan bisnisnya dan hidupnya, dia setuju untuk menjadi bagian dari eksperimen ilmiah yang melibatkan energi ionisasi.\n" +
                "\n" +
                "Eksperimen tersebut memberikan Simon kekuatan super yang luar biasa, termasuk kekuatan fisik yang hebat, daya tahan yang tak terbatas, dan kemampuan terbang. Dia juga memiliki kulit yang tahan terhadap sebagian besar serangan fisik dan energi. Namun, dampak sampingan dari eksperimen tersebut adalah bahwa tubuhnya berdenyut dengan energi ionisasi yang membuatnya tergantung pada energi tersebut untuk bertahan hidup.\n" +
                "\n" +
                "Dengan kekuatan barunya, Simon Williams mengambil identitas pahlawan super bernama \"Wonder Man.\" Dia menjadi anggota Avengers, tim pahlawan super yang berjuang untuk melindungi dunia dari ancaman besar. Wonder Man adalah anggota yang kuat dan berdedikasi dalam pertempuran melawan penjahat super, alien, dan bahaya lainnya.\n" +
                "\n" +
                "Salah satu aspek menarik tentang karakter Wonder Man adalah bahwa dia awalnya diciptakan oleh penjahat dalam rencana untuk menghancurkan Avengers. Namun, Simon Williams mengubah arah hidupnya dan memilih menjadi pahlawan yang berjuang untuk kebaikan.\n" +
                "\n" +
                "Cerita Wonder Man adalah tentang pembaharuan diri, pertobatan, dan mengambil tanggung jawab untuk melakukan yang benar. Meskipun awalnya mungkin memiliki motivasi yang salah, Wonder Man menjadi contoh bagaimana seseorang bisa mengubah jalan hidupnya dan menggunakan kekuatan yang dimilikinya untuk tujuan yang lebih besar dan bermanfaat."))
        items.add(ItemModel(R.drawable.storm,
            "Storm",
            "Seorang mutan dengan kemampuan mengendalikan cuaca, mampu menciptakan badai dan perubahan cuaca drastis.",
        "Storm, nama aslinya Ororo Munroe, adalah seorang mutan dengan kekuatan untuk mengendalikan cuaca. Dia lahir di Kenya, Afrika, dan sejak kecil dia tinggal di lingkungan yang keras. Saat remaja, Storm menemukan bahwa dia memiliki kemampuan untuk memanipulasi cuaca, termasuk memanggil petir, hujan, angin kencang, dan bahkan mengendalikan elemen cuaca lainnya.\n" +
                "\n" +
                "Kemampuan cuaca yang luar biasa ini membuatnya menjadi anggota kelompok mutan yang dikenal sebagai X-Men, yang dipimpin oleh Professor Charles Xavier. Storm menggunakan nama \"Storm\" karena kemampuannya untuk mengendalikan cuaca yang dahsyat dan kuat seperti badai.\n" +
                "\n" +
                "Sebagai anggota X-Men, Storm berjuang untuk perdamaian dan koeksistensi antara manusia dan mutan. Dia menggunakan kekuatannya untuk melindungi teman-temannya serta masyarakat luas dari ancaman. Dia juga memiliki pemahaman yang mendalam tentang alam dan lingkungan, serta berperan penting dalam dinamika tim dalam pertempuran.\n" +
                "\n" +
                "Selain menjadi anggota X-Men, Storm juga pernah menjadi pemimpin tim. Dia telah menghadapi berbagai ancaman mutan dan penjahat super, serta terlibat dalam konflik besar di alam semesta Marvel.\n" +
                "\n" +
                "Selain kekuatan fisik dan kekuatan cuaca yang luar biasa, Storm juga dikenal sebagai tokoh dengan kedewasaan dan bijaksana yang mendalam. Dia memiliki pandangan yang luas tentang dunia dan memainkan peran penting dalam upaya untuk mencapai perdamaian antara manusia dan mutan.\n" +
                "\n" +
                "Cerita Storm adalah tentang kekuatan alam dan kemampuan manusia untuk beradaptasi dengan lingkungan. Dia mewakili kekuatan, kepemimpinan, dan pengorbanan demi tujuan yang lebih besar. Storm juga mewakili keragaman dalam kelompok mutan dan merupakan contoh positif tentang bagaimana keunikan dan kemampuan dapat digunakan untuk tujuan positif."))
        items.add(ItemModel(R.drawable.green_latern,
            "Green Lantern",
            "Anggota dari Green Lantern Corps, memiliki cincin hijau mampu menciptakan konstruksi fisik dengan pikiran dan kehendaknya.",
        "Green Lantern adalah julukan yang digunakan oleh beberapa karakter dalam alam semesta DC Comics, yang memegang cincin kekuasaan yang ditenagai oleh energi hijau dari Lampu Kekuatan. Setiap anggota Green Lantern Corps adalah seorang penjaga perdamaian intergalaksi yang dipilih oleh cincin dan lampu tersebut.\n" +
                "\n" +
                "Salah satu Green Lantern yang paling terkenal adalah Hal Jordan. Dia adalah seorang pilot pesawat jet yang bekerja untuk perusahaan udara Ferris Aircraft. Suatu hari, Hal diberikan cincin Green Lantern oleh seorang alien yang sekarat bernama Abin Sur. Cincin tersebut memilih Hal Jordan sebagai penerusnya dan memberikan padanya kekuatan dan tanggung jawab untuk melindungi alam semesta dari ancaman.\n" +
                "\n" +
                "Cincin Green Lantern memberikan pemegangnya kemampuan untuk menciptakan benda-benda apa pun yang mereka bayangkan dengan kekuatan pikiran mereka. Selain itu, mereka juga memiliki kemampuan terbang dan daya tahan fisik yang ditingkatkan. Namun, cincin ini memiliki satu kelemahan: tidak dapat memengaruhi benda-benda berwarna kuning.\n" +
                "\n" +
                "Hal Jordan dan anggota Green Lantern Corps lainnya berjuang melawan berbagai ancaman, termasuk penjahat super, makhluk antariksa, dan ancaman multiverse. Mereka juga terlibat dalam konflik besar yang melibatkan berbagai karakter dan tim pahlawan super lainnya.\n" +
                "\n" +
                "Selain Hal Jordan, karakter lain yang juga memiliki gelar Green Lantern termasuk John Stewart, Guy Gardner, Kyle Rayner, dan banyak lagi. Setiap karakter membawa keunikannya sendiri ke dalam peran ini dan memiliki cerita dan petualangan yang khas.\n" +
                "\n" +
                "Cerita Green Lantern adalah tentang kekuatan kehendak, keberanian, dan tanggung jawab untuk melindungi alam semesta. Para Green Lantern berjuang untuk mempertahankan perdamaian dan keadilan, serta mewakili semangat kerjasama dan keberagaman dalam upaya untuk menjaga alam semesta tetap aman."))
        items.add(ItemModel(R.drawable.doctor_strange,
            "Doctor Strange",
            "Seorang ahli sihir yang melindungi dunia dari ancaman supernatural, menggunakan mantra, artefak, dan ilmu sihir.",
        "Doctor Strange, nama asli Stephen Strange, adalah seorang ahli bedah brilian yang dikenal karena keterampilannya yang luar biasa. Namun, saat mengalami kecelakaan mobil yang parah, tangannya mengalami kerusakan serius yang menghancurkan kariernya sebagai ahli bedah. Meskipun mencoba berbagai cara untuk menyembuhkan tangannya, Strange tidak berhasil menemukan penyembuhan yang efektif.\n" +
                "\n" +
                "Dalam pencariannya untuk menyembuhkan dirinya, Strange mempelajari tentang \"The Ancient One,\" seorang penyihir hebat yang tinggal di Kamar-Taj di Nepal. Dia datang ke Kamar-Taj dengan harapan mendapatkan penyembuhan untuk tangannya, tetapi malah menemukan dunia baru yang penuh dengan sihir, dimensi lain, dan ancaman gaib.\n" +
                "\n" +
                "Di bawah bimbingan Ancient One, Stephen Strange belajar seni sihir dan memahami cara-cara alam semesta yang lebih luas. Dia mengembangkan kemampuan untuk memanipulasi energi gaib, melihat dimensi-dimensi lain, dan melawan makhluk-makhluk supernatural. Dia menerima gelar \"Sorcerer Supreme,\" yang menjadikannya salah satu penyihir paling kuat di alam semesta Marvel.\n" +
                "\n" +
                "Doctor Strange menggunakan kekuatan sihirnya untuk melindungi alam semesta dari ancaman supernatural dan penjahat super. Dia berperan penting dalam pertempuran melawan entitas jahat seperti Dormammu dan Baron Mordo. Doctor Strange juga memiliki akses ke Artefak yang Kuat, seperti Eye of Agamotto, yang memberinya kemampuan untuk mengendalikan waktu.\n" +
                "\n" +
                "Meskipun awalnya adalah seorang ahli bedah pragmatis, Doctor Strange mengubah dirinya menjadi pelindung dimensi-dimensi lain dan penjaga kebenaran. Dia juga menjadi anggota Avengers dan berkolaborasi dengan pahlawan super lainnya dalam melawan ancaman global dan multiverse.\n" +
                "\n" +
                "Cerita Doctor Strange adalah tentang eksplorasi dunia sihir, pertumbuhan pribadi, dan menghadapi ancaman yang jauh lebih besar dari yang dapat diatasi oleh metode ilmiah biasa. Doctor Strange mewakili perpaduan antara pengetahuan dan spiritualitas, serta keberanian untuk berjuang melawan kekuatan jahat yang berada di luar pemahaman manusia."))
        items.add(ItemModel(R.drawable.black_panther,
            "Black Panther",
            "Raja Wakanda yang memiliki kemampuan fisik yang ditingkatkan oleh tanaman Heart-Shaped Herb dan menggunakan teknologi canggih Wakanda.",
        "Black Panther adalah gelar yang diberikan kepada penguasa Wakanda, sebuah kerajaan fiksi di Afrika yang kaya akan Vibranium, logam langka yang memiliki sifat unik. Penguasa Wakanda, yang juga memegang identitas pahlawan super Black Panther, adalah seorang pria yang memiliki kekuatan fisik luar biasa dan keahlian bertarung yang tinggi.\n" +
                "\n" +
                "Salah satu Black Panther yang paling terkenal adalah T'Challa. Setelah ayahnya, Raja T'Chaka, tewas dalam sebuah serangan, T'Challa mengambil alih takhta Wakanda dan menjadi penguasa baru. Dia juga memperoleh gelar Black Panther dan mengenakan kostum khas yang terbuat dari Vibranium.\n" +
                "\n" +
                "Kostum Black Panther memberikan T'Challa kemampuan seperti kekuatan fisik yang luar biasa, daya tahan tingkat tinggi, dan indra yang ditingkatkan. Dia juga memiliki kemampuan akrobatik dan kecepatan yang hebat. Selain itu, Black Panther juga merupakan petarung ulung yang menguasai berbagai teknik bertarung.\n" +
                "\n" +
                "Wakanda sendiri adalah sebuah negara maju yang menggabungkan teknologi tinggi dengan tradisi dan budaya Afrika yang kaya. Teknologi Wakanda didukung oleh sumber daya Vibranium, dan negara ini mampu mempertahankan keberadaan Vibranium sebagai rahasia negara.\n" +
                "\n" +
                "T'Challa juga adalah salah satu anggota Avengers, tim pahlawan super yang berjuang untuk melindungi bumi dari ancaman besar. Black Panther memiliki hubungan erat dengan rekan-rekan Avengers lainnya dan merupakan salah satu pahlawan super terkemuka dalam Marvel Universe.\n" +
                "\n" +
                "Cerita Black Panther adalah tentang tanggung jawab kepemimpinan, perlindungan terhadap budaya dan sumber daya yang penting, serta kekuatan yang dapat mengatasi konflik dan ancaman. Black Panther mewakili keterampilan, kebijaksanaan, dan keberanian seorang penguasa dan pahlawan yang berjuang untuk kesejahteraan Wakanda dan dunia luas."))

        return items
    }
}