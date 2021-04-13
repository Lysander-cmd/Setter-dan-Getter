
package settergetter;




public class SetterGetter {
      //Menuliskan variabel dan tipe data 
      //Saya menggunakan tipe data string
      //Saya juga menggunakan modifier private dan protected
      //untuk modifier private saya menggunakan nama variabel username dan jenis kelamin
      //dan untuk modifier protected saya menggunakan nama variabel job dan 
      private String username ;
      protected String job;
      private String jeniskelamin;
      protected String skill;
      
      //pengaplikasian setter dan getter
      
      //Pada bagian awal saya menggunakan setter terlebih dahulu
      //settter berkaitan dengan method void
      //pada method void saya juga menggunakan konstruktor
      public void setUsername(String username){
          this.username = username;
      }
      public void setJob(String job){
          this.job = job;
      }
      public void setJenisKelamin(String jeniskelamin){
          this.jeniskelamin = jeniskelamin;
      }
      public void setSkill(String skill){
          this.skill = skill;
      }
      
      //pada bagian akhier saya menggunakan getter
      //getter berkaitan dengan method nonvoid dimana menggunakan return nilai
      public String getUsername(){
          return username;
      }
      public String getJob(){
          return job;
      }
      public String getJenisKelamin(){
          return jeniskelamin;
      }
      public String getSkill(){
          return skill;
      }
}
