
package settergetter;


public class Main {
    //Pada class main ini saya gunakan untuk memanggil dan sedikit penjelasan
    
    public static void main(String[] args) {
        //saya menggunakan nama objek berupa user untuk memanggil method yang ada di class settergetter
        SetterGetter user = new SetterGetter();
        
        //Pada program ini saya membuat program pemilihan karakter di dalam game doto
        //sambutan awal
        System.out.println(" Welcome to doto ");
        
        System.out.println("\n");
        //Pemilihan jenis kelamin
        System.out.println(" Silakan pilih jenis kelamin karakter anda : ");
        System.out.println(" 1. Laki Laki ");
        System.out.println(" 2. Perempuan ");
        //Pemanggilan method dari class SetterGetter dan pengisian variabel
        user.setJenisKelamin(" Laki Laki ");
        System.out.println(" Jenis Kelamin : "+ user.getJenisKelamin());
        
        System.out.println("\n");
        //Pemilihan job
        //saya menggunakan metode array agar lebih mudah karena terdapat banyak job
        System.out.println(" Silakan pilih job karakter anda : ");
        String[] karakter = {" Sword "," Mage "," Archer "," Tank "," Assasin "};
        //Akan mengoutputkan semua yang ada di variabel karakter dan ditambahi dengan urutannya
         for( int i = 0; i < karakter.length; i++ ){
            System.out.print(" Karakter ke-" + i + ": " + karakter[i] + "\n");
        }
        System.out.println(" Pilih job karakter anda : ");
        //Pemanggilan method dari class SetterGetter dan pengisian variabel
        user.setJob(" Archer ");
        System.out.println(" Job : "+ user.getJob());
        
        System.out.println("\n");
        //Pemilihan skill karakter
        System.out.println(" Silakan Pilih Skill yang anda Inginkan Untuk Job Anda : ");
        System.out.println(" 1. DPS ");
        System.out.println(" 2. Support ");
        //Pemanggilan method dari class SetterGetter dan pengisian variabel
        user.setSkill("DPS");
        System.out.println(" Skill : "+ user.getSkill());
        
        System.out.println("\n");
        //User disuruh untuk memasukan nama dari karakter yang sudah dibuat
        System.out.println(" Masukan username karakter anda : ");
        //Pemanggilan method dari class SetterGetter dan pengisian variabel
        user.setUsername(" Adam ");
        System.out.println(" Username : " + user.getUsername());
        
        System.out.println("\n");
        //Mengoutputkan semua  yang telah diinputkan kedalam satu pemberitahuan (ringkasan)
        System.out.println(" Karakter selesai dibuat ");
        System.out.println(" Username : " + user.getUsername());
        System.out.println(" Jenis Kelamin : "+ user.getJenisKelamin());
        System.out.println(" Job : "+ user.getJob());
        System.out.println(" Skill : "+ user.getSkill());
        
    }
}
