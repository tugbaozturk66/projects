package techproed.JdbcExamples;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
// import java.sql.* yazacagiz hepsini import edecek.

public class Jdbc1Query01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1)ilgili driveri yukle(tv nin fisini tak)
		
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		
		// 2)baglanti olusturmaliyiz(netflix bagla)
		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		//3) SQL komutlari icin bir Statement nesnesi olustur.(alan olusturuldu. kumanda da kanal ayarlama)

		Statement st= con.createStatement();
		
		// 4)SQL ifadeleri yazabilir ve calistirabiliriz (kumanda da istedigimiz komuta basma. ses acma kanal degistirme)
		//(personel tablosundaki personel_id si 7369 olan personelin maasini sorgula)
		
		ResultSet isim = st.executeQuery("SELECT personel_isim, maas from personel WHERE personel_id=7369");
		
		// 5) sonuclari aldik ama daha goremiyoruz. bunu gorecegiz
		
		while(isim.next()) {
			System.out.print("Personel isim: "+isim.getString("personel_isim")+"- maas: "+isim.getInt("maas"));
		}
		
		//6) simdi actiklarimizi kapatma zamani olusturlulan nesneleri bellekten kaldiralim
		
		con.close();
		st.close();
		isim.close();
		
		
		
	}

}
