package techproed.JdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc3DDL {
	/*her sorguda öncekileri yoruma al hata vermesin
	   A) CREATE TABLE, DROP TABLE, ALTER TABLE gibi DDL ifadeleri icin sonuc kümesi (ResultSet) 
	      dondurmeyen metotlar kullanilmalidir.(executeQuery kullanamayız) Bunun icin JDBC'de 2 alternatif bulunmaktadir.  
	       1) execute() metodu 
	       2) excuteUpdate() metodu.  
	       
	   B) - execute() metodu hertur SQL ifadesiyle kullanilabilen genel bir komuttur.
	      - execute(), Boolean bir deger dondurur. DDL islemlerin false dondururken, 
	        DML islemlerinde true deger dondurur. 
	      - Ozellikle, hangi tip SQL ifadesinin kullanilmasinin gerektiginin belli olmadigi 
	        durumlarda tercih edilmektedir.  
	        
	   C) - executeUpdate() metodu ise INSERT, Update gibi DML islemlerinde yaygin kullanilir.
	      - bu islemlerde islemden etkilenen satir sayisini dondurur.
	      - Ayrıca, DDL islemlerinde de kullanilabilir ve bu islemlerde 0 dondurur.
	*/

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
				
		Statement st= con.createStatement();
		
		//ORNEK1:isciler adinda bir tablo olusturunuz id NUMBER(3), 
		//birim VARCHAR2(10), maas NUMBER(5)
		
		/*st.execute("CREATE table isciler"
				+ " (id NUMBER(3),"
				+ " birim VARCHAR(10),"
				+ " maas NUMBER(5))");
		System.out.println("isciler tablosu olusturuldu");
		System.out.println("===============================");*/
		
		// kalıcı olarak isciler tablosunu sil
		
	//	st.executeUpdate("DROP table isciler PURGE");
		// System.out.println(" silindi");
		
		// soru 3 isciler tablosuna yeni bir stun ekleyiniz isim VARCHAR2(20).

		/*st.executeUpdate("alter table isciler ADD isim VARCHAR(20)");
		System.out.println("isim stunu eklendi");*/
		//System.out.println("==========================");
		
		// ornek 4 isciler tablosundaki maas sutununu siliniz
		//st.execute("alter table isciler drop COLUMN maas");
		//System.out.println("islem tamam");
		
		// ornek 5 isciler tablosunun adini calisanlar olarak degistir
		
		st.execute("ALTER TABLE isciler RENAME TO calisanlar1");
		System.out.println("islem tamam");
	}

}
