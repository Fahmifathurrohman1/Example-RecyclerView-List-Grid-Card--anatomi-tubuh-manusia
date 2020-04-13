package com.example.project3;

import java.util.ArrayList;

 class Anatomidata {
    private static String[] Anatominames = {
        "Sistem Rangka",
            "Sistem Otak",
            "Sitem Peredaran",
            "Sistem Pencernaan",
            "Sistem Endokrin",
            "Sistem Saraf",
            "Sistem Pernafasan",
            "Sistem Kekebalan"
    };
    private static String[] anatomiDetails={
      "Sistem rangka manusia tersusun dari 206 tulang yang dihubungkan oleh tendon, ligamen, dan tulang rawan.",
            "Sistem otot manusia terdiri dari sekitar 600 otot. Sistem otot memiliki fungsi membantu pergerakan tubuh, aliran darah, dan fungsi tubuh lainnya.",
            "Sistem peredaran darah manusia adalah jantung. Sistem peredaran darah atau sirkulasi memiliki tiga fungsi utama yaitu Mengedarkan darah ke seluruh tubuh Melindungi tubuh melalui sel darah putih dengan melawan patogen (kuman) yang telah masuk ke dalam tubuh. Mempertahankan homeostasis (keseimbangan kondisi tubuh) pada beberapa kondisi internal.",
            "Sistem pencernaan merupakan kumpulan beberapa organ yang bekerja menerima makanan, memproses makanan menjadi energi, menyerap zat gizi dari makanan ke aliran darah, serta membuang sisa makanan yang tidak dapat dicerna oleh tubuh. ",
            "Sistem pencernaan terdiri dari rongga mulut, faring (tenggorokan), laring (kerongkongan), lambung, usus halus, usus besar, dan anus. Selain organ utama di atas, dalam sistem pencernaan juga terdapat organ pelengkap dalam tubuh manusia yang bekerja membantu mencerna makanan. Organ tersebut adalah gigi, lidah, kelenjar ludah, hati, kantong empedu, dan pankreas.",
            "Sistem endokrin merupakan sistem yang bekerja mengeluarkan hormon ke dalam tubuh. Sistem endokrin terdiri dari berbagai kelenjar seperti hipotalamus, kelenjar pituitari, kelenjar pineal, kelenjar tiroid, kelenjar paratiroid, kelenjar adrenal, pankreas, dan kelenjar kelamin (gonad).",
            "Sistem saraf memiliki fungsi mengumpulkan, mengirimkan, serta memproses informasi dalam otak dan saraf. Sistem saraf manusia terdiri atas saraf pusat dan saraf tepi. Sistem saraf pusat terdiri atas otak dan sumsum tulang belakang. Sedangkan sistem saraf tepi terdiri dari saraf otonom dan somatis. Sistem saraf bertanggung jawab menyampaikan rangsangan atau pesan dari reseptor untuk direspon oleh tubuh manusia.",
            "Sistem pernapasan pada tubuh manusia berfungsi menyediakan oksigen ke seluruh tubuh, mengeluarkan karbon dioksida serta produk limbah lain yang dapat mematikan jika dibiarkan menumpuk.",
            "Sistem kekebalan tubuh atau sistem imun merupakan sistem yang berfungsi mempertahankan tubuh dari serangan bakteri, virus, dan patogen lainnya yang mungkin berbahaya bagi tubuh. Sistem imun terdapat diseluruh tubuh terutama dilimpa."
    };
    private static int[] anatomiimages = new int[]{
            R.drawable.sistemendorsi,
            R.drawable.pernafasan,
            R.drawable.sistemotak,
            R.drawable.pencernaan,
            R.drawable.peredarandarahm,
            R.drawable.saraf,
            R.drawable.kekebalantubuh,
            R.drawable.sistemrangka
    };
    static ArrayList<Anatomi> getListData(){
        ArrayList<Anatomi> list = new ArrayList<>();
        for (int position= 0; position <Anatominames.length; position++) {
            Anatomi anatomi = new Anatomi();
            anatomi.setName(Anatominames[position]);
            anatomi.getDetail(anatomiDetails[position]);
            anatomi.getPhoto(anatomiimages[position]);
            list.add(anatomi);
        }
        return list;
    }
}
