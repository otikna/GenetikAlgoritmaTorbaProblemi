import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class TorbaSorusu {

    Random random = new Random();
    int max_hacim = 150;
    int max_kütle = 150;

    public static void main(String[] args) {
        TorbaSorusu ts = new TorbaSorusu();
        //rasgele degerler ile oluşturulan ürünler
        ürün ürün1 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));
        ürün ürün2 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));
        ürün ürün3 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));
        ürün ürün4 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));
        ürün ürün5 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));
        ürün ürün6 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));
        ürün ürün7 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));
        ürün ürün8 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));
        ürün ürün9 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));
        ürün ürün10 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));
        ürün ürün11 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));
        ürün ürün12 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));
        ürün ürün13 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));
        ürün ürün14 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));
        ürün ürün15 = new ürün(ts.random.nextInt(250), ts.random.nextInt(25), ts.random.nextInt(25));

        //Rasgele oluşturacağımız ilk 4 ata
        ArrayList<ürün> liste1 = new ArrayList<>();
        ArrayList<ürün> liste2 = new ArrayList<>();
        ArrayList<ürün> liste3 = new ArrayList<>();
        ArrayList<ürün> liste4 = new ArrayList<>();

        ArrayList<ürün> ürünlerListesi = new ArrayList<>();
        ürünlerListesi.add(ürün1);  ürünlerListesi.add(ürün2);  ürünlerListesi.add(ürün3);
        ürünlerListesi.add(ürün4);  ürünlerListesi.add(ürün5);  ürünlerListesi.add(ürün6);
        ürünlerListesi.add(ürün7);  ürünlerListesi.add(ürün8);  ürünlerListesi.add(ürün9);
        ürünlerListesi.add(ürün10); ürünlerListesi.add(ürün11); ürünlerListesi.add(ürün12);
        ürünlerListesi.add(ürün13); ürünlerListesi.add(ürün14); ürünlerListesi.add(ürün15);

        //Max kütle ve hacimleri geçmeyecek şekilde ilk 4 atamızı oluşturalım

        //Listemizin içine 25 kere ürün atmayı denesin. Zaten max kilo ve hacimi geçmeyeceği için sorun olmaz.
        for(int i = 0 ; i<= 55; i++){
            ürün rasgele_ürün = ürünlerListesi.get(ts.random.nextInt(15));//rasgele seçilecek ürün
                //kütle ve hacimi kontrol ettikten sonra ise aynı ürünü daha önce koyup koymadığımızı kontrol etmemiz lazım
                //Rasgele seçim yaptığımız için aynı ürünü 2 kere koyma ihtimalimiz var.
            if (rasgele_ürün.getÜrünKilo()<ts.bosHacim(liste1) && rasgele_ürün.getÜrünKilo()<ts.bosKütle(liste1) && !ts.ürünVarMi(liste1, rasgele_ürün)){
                liste1.add(rasgele_ürün);
            }
        }

        for(int i = 0 ; i<= 55; i++){
            ürün rasgele_ürün = ürünlerListesi.get(ts.random.nextInt(15));//rasgele seçilecek ürün
            //kütle ve hacimi kontrol ettikten sonra ise aynı ürünü daha önce koyup koymadığımızı kontrol etmemiz lazım
            //Rasgele seçim yaptığımız için aynı ürünü 2 kere koyma ihtimalimiz var.
            if (rasgele_ürün.getÜrünKilo()<ts.bosHacim(liste2) && rasgele_ürün.getÜrünKilo()<ts.bosKütle(liste2) && !ts.ürünVarMi(liste2, rasgele_ürün)){
                liste2.add(rasgele_ürün);
            }
        }

        for(int i = 0 ; i<= 55; i++){
            ürün rasgele_ürün = ürünlerListesi.get(ts.random.nextInt(15));//rasgele seçilecek ürün
            //kütle ve hacimi kontrol ettikten sonra ise aynı ürünü daha önce koyup koymadığımızı kontrol etmemiz lazım
            //Rasgele seçim yaptığımız için aynı ürünü 2 kere koyma ihtimalimiz var.
            if (rasgele_ürün.getÜrünKilo()<ts.bosHacim(liste3) && rasgele_ürün.getÜrünKilo()<ts.bosKütle(liste3) && !ts.ürünVarMi(liste3, rasgele_ürün)){
                liste3.add(rasgele_ürün);
            }
        }

        for(int i = 0 ; i<= 55; i++){
            ürün rasgele_ürün = ürünlerListesi.get(ts.random.nextInt(15));//rasgele seçilecek ürün
            //kütle ve hacimi kontrol ettikten sonra ise aynı ürünü daha önce koyup koymadığımızı kontrol etmemiz lazım
            //Rasgele seçim yaptığımız için aynı ürünü 2 kere koyma ihtimalimiz var.
            if (rasgele_ürün.getÜrünKilo() < ts.bosHacim(liste4) && rasgele_ürün.getÜrünKilo()<ts.bosKütle(liste4) && !ts.ürünVarMi(liste4, rasgele_ürün)){
                liste4.add(rasgele_ürün);
            }
        }

        //Listelerimizi crossOver4 fonksiyonunun içine atabilmek için array'e çevirelim.

        ürün[] array1= new ürün[liste1.size()];
        ürün[] array2= new ürün[liste2.size()];
        ürün[] array3= new ürün[liste3.size()];
        ürün[] array4= new ürün[liste4.size()];

        for (int i = 0; i<= liste1.size()-1; i++){
            array1[i] = liste1.get(i);
        }

        for (int i = 0; i<= liste2.size()-1; i++){
            array2[i] = liste2.get(i);
        }

        for (int i = 0; i<= liste3.size()-1; i++){
            array3[i] = liste3.get(i);
        }

        for (int i = 0; i<= liste4.size()-1; i++){
            array4[i] = liste4.get(i);
        }

        //algoritma ile optimizasyon yapılmadan önceki değerler
        System.out.println(ts.degerBul(array1));
        System.out.println(ts.degerBul(array2));
        System.out.println(ts.degerBul(array3));
        System.out.println(ts.degerBul(array4));

        //1 Milyon kere çaprazlama ve her 1000 nesilde bir mutasyon
        for (int i = 0 ; i<1000000 ; i++){
            ArrayList<ürün[]> liste = ts.crossOver4(array1,array2,array3,array4);
            array1=liste.get(0);
            array2=liste.get(1);
            array3=liste.get(2);
            array4=liste.get(3);

            if (i%1000 == 0){
                array1 = ts.mutasyon(array1,ürünlerListesi);
                array2 = ts.mutasyon(array2,ürünlerListesi);

            }
        }

        //son değerler
        System.out.println("-----------Sonuç-------");
        System.out.println(ts.degerBul(array1));
        System.out.println(ts.degerBul(array2));
        System.out.println(ts.degerBul(array3));
        System.out.println(ts.degerBul(array4));






    }

    //verilen 4 arrayin tüm kombinasyonlarını 2 şer 2 şer caprazlayan fonksiyon
    public ArrayList<ürün[]> crossOver4(ürün [] array1, ürün[] array2, ürün[] array3, ürün[] array4){

        ürün [] crossover_sonuc1 = crossOver2(array1, array2).get(0);
        ürün [] crossover_sonuc2 = crossOver2(array1, array2).get(1);
        ürün [] crossover_sonuc3 = crossOver2(array1, array3).get(0);
        ürün [] crossover_sonuc4 = crossOver2(array1, array3).get(1);
        ürün [] crossover_sonuc5 = crossOver2(array1, array4).get(0);
        ürün [] crossover_sonuc6 = crossOver2(array1, array4).get(1);
        ürün [] crossover_sonuc7 = crossOver2(array2, array3).get(0);
        ürün [] crossover_sonuc8 = crossOver2(array2, array3).get(1);
        ürün [] crossover_sonuc9 = crossOver2(array2, array4).get(0);
        ürün [] crossover_sonuc10 = crossOver2(array2, array4).get(1);
        ürün [] crossover_sonuc11 = crossOver2(array3, array4).get(0);
        ürün [] crossover_sonuc12 = crossOver2(array3, array4).get(1);

        //Çıkan 12 sonucu ve 4 atanın degeri en yüksek 4 tanesini seçmek için secim fonksiyonuna gönderelim
        ArrayList<ürün[]> enIyi4lü = secim(crossover_sonuc1,crossover_sonuc2,crossover_sonuc3,crossover_sonuc4,crossover_sonuc5,crossover_sonuc6,crossover_sonuc7,
                crossover_sonuc8,crossover_sonuc9,crossover_sonuc10,crossover_sonuc11,crossover_sonuc12,array1,array2,array3,array4);

        return enIyi4lü;
    }

    //Verilen 2 array'i caprazlayan fonksiyon
    public ArrayList<ürün []> crossOver2(ürün [] array1, ürün [] array2){

        //array'lerdeki boş hacim ve kütlenin bulunması
        int bosHacim_array1 = bosHacim(array1);
        int bosHacim_array2 = bosHacim(array2);

        int bosKutle_array1 = bosKutle(array1);
        int bosKutle_array2 = bosKutle(array2);

        /*Rasgele alınan değerler maximum kütle ve hacimi geçtiğinde caprazla yapılamayacağı için
        eğer caprazlama yapılamaz ise bu işlemin kaç kere tekrar etmesini istediğimiz sayı*/

        int crossOverDeneme = 25;

        //Caprazlama olduğunda true'ya cevirip denemeyi bitireceğimiz boolean değer
        boolean caprazlamaOlduMu = false;

        for (int denemeSayisi = 0 ; denemeSayisi <= crossOverDeneme && !caprazlamaOlduMu ; denemeSayisi++) {

            //Çaprazlama için array1'den rasgele ürün seçimi
            int rasgele_deger1_array1 = random.nextInt(array1.length);
            int rasgele_deger2_array1 = random.nextInt(array1.length);

            ürün array1_rasgele_ürün1 = array1[rasgele_deger1_array1];
            ürün array1_rasgele_ürün2 = array1[rasgele_deger2_array1];

            //Çaprazlama için array2'den rasgele ürün seçimi
            int rasgele_deger1_array2 = random.nextInt(array2.length);
            int rasgele_deger2_array2 = random.nextInt(array2.length);

            ürün array2_rasgele_ürün1 = array2[rasgele_deger1_array2];
            ürün array2_rasgele_ürün2 = array2[rasgele_deger2_array2];

            //ürünlerin hacim ve kütleleri
            int array1_rasgele_ürün_hacim = array1_rasgele_ürün1.getÜrünHacim() + array1_rasgele_ürün2.getÜrünHacim();
            int array1_rasgele_ürün_kütle = array1_rasgele_ürün1.getÜrünKilo() + array1_rasgele_ürün2.getÜrünKilo();

            int array2_rasgele_ürün_hacim = array2_rasgele_ürün1.getÜrünHacim() + array2_rasgele_ürün2.getÜrünHacim();
            int array2_rasgele_ürün_kütle = array2_rasgele_ürün1.getÜrünKilo() + array2_rasgele_ürün2.getÜrünKilo();

            //Crossover'dan sonra kütle veya hacimin verilen sınırı geçip geçmediğinin kortolü

            //Crossover'da rasgele seçilen ürünlerin birbirinden farklı olduğunun kontrolü
            if (ikiUrunAyniMi(array1_rasgele_ürün1, array2_rasgele_ürün1) || ikiUrunAyniMi(array1_rasgele_ürün1, array2_rasgele_ürün2) ||
                    ikiUrunAyniMi(array1_rasgele_ürün2, array2_rasgele_ürün1) || ikiUrunAyniMi(array1_rasgele_ürün2, array2_rasgele_ürün2)){
                //Kütlenin kontrol edilmesi
                if ((bosKutle_array1 + array1_rasgele_ürün_kütle) > array2_rasgele_ürün_kütle) {

                    if ((bosKutle_array2 + array2_rasgele_ürün_kütle) > array1_rasgele_ürün_kütle) {

                        //Yeterli hacim de varsa array'lerin caprazlanması
                        if ((bosHacim_array1 + array1_rasgele_ürün_hacim) > array2_rasgele_ürün_hacim) {

                            if ((bosHacim_array2 + array2_rasgele_ürün_hacim) > array1_rasgele_ürün_hacim) {
                                caprazlamaOlduMu = true;
                                for (int i = 0; i <= array1.length - 1; i++) {
                                    if (i != rasgele_deger1_array1) {
                                        if (i != rasgele_deger2_array1) {
                                            array1[i] = array1[i];
                                        } else
                                            array1[i] = array2[rasgele_deger2_array2];
                                    } else
                                        array1[i] = array2[rasgele_deger1_array2];
                                }

                                for (int i = 0; i <= array2.length - 1; i++) {
                                    if (i != rasgele_deger1_array2) {
                                        if (i != rasgele_deger2_array2) {
                                            array2[i] = array2[i];
                                        } else
                                            array2[i] = array1[rasgele_deger2_array1];
                                    } else
                                        array2[i] = array1[rasgele_deger1_array1];
                                }

                            }

                        }

                    }
                }
            }
        }

        ArrayList<ürün []> sonuc = new ArrayList<>();
        sonuc.add(array1);
        sonuc.add(array2);

        return sonuc;
    }

    //Verilen degerin indexini bulan fonksiyon
    public int indexBul(int [] array, int aranan_deger){

        for (int i=0; i <=array.length-1; i++){
            if(array[i]==aranan_deger){
                return i;
            }
        }

        return -1;
    }

    //verilen arraydeki boş hacimi bulan fonksiyon
    public int bosHacim(ürün[] array){

        int toplam=0;

        for(ürün ü : array){
            toplam += ü.getÜrünHacim();
        }

        return max_hacim-toplam;
    }

    //verilen array'deki boş kütleyi bulan fonksiyon
    public int bosKutle(ürün[] array){

        int toplam=0;

        for(ürün ü : array){
            toplam += ü.getÜrünKilo();
        }

        return max_kütle-toplam;
    }

    //Gönderilen array'ler arasından en iyi 4 array'in seçimi
    public ArrayList<ürün []> secim(ürün[]...ürünlerListesi){

        ArrayList<ürün []> sonuc = new ArrayList<>();

        /*En iyi 4 ü bulmak istediğimiz için en iyisini bulduktan sonra
        degeri 0 olan temp ürününü yerine koyarak en iyi 2. yi arıyacağız.
        En iyi 2. ürünü bulunca onuda listeye ekledikten sonra yerine 0 degerinde
        bir temp ürününü koyarak en iyi 3. ürünümüzü arayacağız.
         */
        ürün [] temp = {new ürün(0,0,0)};


        for (int i = 0 ; i <= ürünlerListesi.length-1; i++){
            for (int j = 0; j<= ürünlerListesi.length-1; j++){
                for (int k = 0; k<= ürünlerListesi.length-1; k++){
                    if (degerBul(ürünlerListesi[j]) < degerBul(ürünlerListesi[k])){
                        break;
                    }else if (k == ürünlerListesi.length-1 && degerBul(ürünlerListesi[j]) >= degerBul(ürünlerListesi[k])){
                        sonuc.add(ürünlerListesi[j]);
                        ürünlerListesi[j]=temp;
                    }
                }
            }
        }
        return sonuc;
    }

    //Gönderilen array'in toplam 'Deger' degerinin bulunması
    public int degerBul(ürün [] array){
        int toplam = 0;

        for (int i = 0; i<= array.length-1; i++){
            toplam += array[i].getÜrünDeger();
        }

        return toplam;
    }

    public int bosHacim(ArrayList<ürün> liste){

        int toplam = 0;

        for (ürün ü:liste){
            toplam += ü.getÜrünHacim();
        }

        return max_hacim-toplam;
    }

    public int bosKütle(ArrayList<ürün> liste){

        int toplam = 0;

        for (ürün ü : liste){
            toplam += ü.getÜrünKilo();
        }

        return max_kütle-toplam;

    }

    public boolean ürünVarMi(ArrayList<ürün> list, ürün aranan_ürün){

        for (ürün ü : list){
            if (ü.getÜrünKilo() == aranan_ürün.getÜrünKilo() && ü.getÜrünDeger() == aranan_ürün.getÜrünDeger() && ü.getÜrünHacim() == aranan_ürün.getÜrünHacim())
            return true;
        }
        return false;
    }

    public boolean ürünVarMi(ürün[] array, ürün aranan_ürün){

        for (ürün ü : array){
            if (ü.getÜrünKilo() == aranan_ürün.getÜrünKilo() && ü.getÜrünDeger() == aranan_ürün.getÜrünDeger() && ü.getÜrünHacim() == aranan_ürün.getÜrünHacim())
                return true;
        }
        return false;
    }

    public boolean ikiUrunAyniMi(ürün ü1, ürün ü2){
        if(ü1.getÜrünHacim() == ü2.getÜrünHacim() && ü1.getÜrünDeger() == ü2.getÜrünDeger() && ü1.getÜrünKilo() == ü2.getÜrünKilo()){
            return true;
        }else
            return false;
    }

    public ürün[] mutasyon(ürün[] array, ArrayList<ürün> ürünListesi){

        int mutasyona_ugrucak_elamının_indexi = random.nextInt(array.length);
        int mutasyonla_getirelecek_ürün_indexi = random.nextInt(ürünListesi.size());

        //Array'i mutasyona uğrattığımızı anlyacağımız değer
        boolean mutasyonOlduMu = false;

        for (int i = 0; i<= 25 && !mutasyonOlduMu; i++){
            //Mutasyondan sonra kütle hacim ve mutasyonla gelcek ürünün tekrarlamıyor olmasının kontrolü
            if (bosKutle(array)+array[mutasyona_ugrucak_elamının_indexi].getÜrünKilo() > ürünListesi.get(mutasyonla_getirelecek_ürün_indexi).getÜrünKilo()
                    && bosHacim(array)+array[mutasyona_ugrucak_elamının_indexi].getÜrünHacim() > ürünListesi.get(mutasyonla_getirelecek_ürün_indexi).getÜrünHacim()
                    && !ürünVarMi(array, ürünListesi.get(mutasyona_ugrucak_elamının_indexi))){
                array[mutasyona_ugrucak_elamının_indexi] = ürünListesi.get(mutasyonla_getirelecek_ürün_indexi);
                mutasyonOlduMu=true;
            }
        }

        return array;
    }








}
