package Tuvi;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Initization.Init_1;

public class TrangXemVanMenh extends Init_1{
	
	public static void main(String[] args) {
		Setup();
		run();			
	}
		
	public static void run() {
		driver.get("https://xemvanmenh.net/xem-la-so-tu-vi.html");
		driver.findElement(By.xpath("//input[@name='hovaten']")).sendKeys(hoten);
		new Select(driver.findElement(By.name("gioitinh"))).selectByVisibleText("Nữ giới");
		
		Calendar calendar = Calendar.getInstance();	
		calendar.set(1950, Calendar.DECEMBER, 30);	
		int date = calendar.get(Calendar.DAY_OF_MONTH );
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);
		
		List<String> all_cung1a = new ArrayList<>();
		List<String> all_cung1b = new ArrayList<>();
		List<String> all_congiap1a = new ArrayList<>();
		List<String> all_congiap1b = new ArrayList<>();
		List<String>all_daihan1a = new ArrayList<>();
		List<String>all_daihan1b = new ArrayList<>();		
		List<String> all_ct1a = new ArrayList<>();
		List<String> all_ct1b = new ArrayList<>();
		List<String > all_tieuhan1a = new ArrayList<>();
		List<String > all_tieuhan1b = new ArrayList<>();
		List<String > all_trangsinh1a = new ArrayList<>();
		List<String > all_trangsinh1b = new ArrayList<>();
		List<String > all_hanthang1a = new ArrayList<>();
		List<String > all_hanthang1b = new ArrayList<>();
		
		List<String> all_cung2a = new ArrayList<>();
		List<String> all_cung2b = new ArrayList<>();
		List<String> all_congiap2a = new ArrayList<>();
		List<String> all_congiap2b = new ArrayList<>();
		List<String>all_daihan2a = new ArrayList<>();
		List<String>all_daihan2b = new ArrayList<>();		
		List<String> all_ct2a = new ArrayList<>();
		List<String> all_ct2b = new ArrayList<>();
		List<String > all_tieuhan2a = new ArrayList<>();
		List<String > all_tieuhan2b = new ArrayList<>();
		List<String > all_trangsinh2a = new ArrayList<>();
		List<String > all_trangsinh2b = new ArrayList<>();
		List<String > all_hanthang2a = new ArrayList<>();
		List<String > all_hanthang2b = new ArrayList<>();
		
		List<String> all_cung3a = new ArrayList<>();
		List<String> all_cung3b = new ArrayList<>();
		List<String> all_congiap3a = new ArrayList<>();
		List<String> all_congiap3b = new ArrayList<>();
		List<String> all_daihan3a = new ArrayList<>();
		List<String> all_daihan3b = new ArrayList<>();		
		List<String> all_ct3a = new ArrayList<>();
		List<String> all_ct3b = new ArrayList<>();
		List<String> all_tieuhan3a = new ArrayList<>();
		List<String> all_tieuhan3b = new ArrayList<>();
		List<String> all_trangsinh3a = new ArrayList<>();
		List<String> all_trangsinh3b = new ArrayList<>();
		List<String> all_hanthang3a = new ArrayList<>();
		List<String> all_hanthang3b = new ArrayList<>();
		
		List<String> all_cung4a = new ArrayList<>();
		List<String> all_cung4b = new ArrayList<>();
		List<String> all_congiap4a = new ArrayList<>();
		List<String> all_congiap4b = new ArrayList<>();
		List<String> all_daihan4a = new ArrayList<>();
		List<String> all_daihan4b = new ArrayList<>();		
		List<String> all_ct4a = new ArrayList<>();
		List<String> all_ct4b = new ArrayList<>();
		List<String> all_tieuhan4a = new ArrayList<>();
		List<String> all_tieuhan4b = new ArrayList<>();
		List<String> all_trangsinh4a = new ArrayList<>();
		List<String> all_trangsinh4b = new ArrayList<>();
		List<String> all_hanthang4a = new ArrayList<>();
		List<String> all_hanthang4b = new ArrayList<>();
		
		List<String> all_cung5a = new ArrayList<>();
		List<String> all_cung5b = new ArrayList<>();
		List<String> all_congiap5a = new ArrayList<>();
		List<String> all_congiap5b = new ArrayList<>();
		List<String> all_daihan5a = new ArrayList<>();
		List<String> all_daihan5b = new ArrayList<>();		
		List<String> all_ct5a = new ArrayList<>();
		List<String> all_ct5b = new ArrayList<>();
		List<String> all_tieuhan5a = new ArrayList<>();
		List<String> all_tieuhan5b = new ArrayList<>();
		List<String> all_trangsinh5a = new ArrayList<>();
		List<String> all_trangsinh5b = new ArrayList<>();
		List<String> all_hanthang5a = new ArrayList<>();
		List<String> all_hanthang5b = new ArrayList<>();
		
		List<String> all_cung6a = new ArrayList<>();
		List<String> all_cung6b = new ArrayList<>();
		List<String> all_congiap6a = new ArrayList<>();
		List<String> all_congiap6b = new ArrayList<>();
		List<String> all_daihan6a = new ArrayList<>();
		List<String> all_daihan6b = new ArrayList<>();		
		List<String> all_ct6a = new ArrayList<>();
		List<String> all_ct6b = new ArrayList<>();
		List<String> all_tieuhan6a = new ArrayList<>();
		List<String> all_tieuhan6b = new ArrayList<>();
		List<String> all_trangsinh6a = new ArrayList<>();
		List<String> all_trangsinh6b = new ArrayList<>();
		List<String> all_hanthang6a = new ArrayList<>();
		List<String> all_hanthang6b = new ArrayList<>();
		
		List<String> all_cung7a = new ArrayList<>();
		List<String> all_cung7b = new ArrayList<>();
		List<String> all_congiap7a = new ArrayList<>();
		List<String> all_congiap7b = new ArrayList<>();
		List<String> all_daihan7a = new ArrayList<>();
		List<String> all_daihan7b = new ArrayList<>();		
		List<String> all_ct7a = new ArrayList<>();
		List<String> all_ct7b = new ArrayList<>();
		List<String> all_tieuhan7a = new ArrayList<>();
		List<String> all_tieuhan7b = new ArrayList<>();
		List<String> all_trangsinh7a = new ArrayList<>();
		List<String> all_trangsinh7b = new ArrayList<>();
		List<String> all_hanthang7a = new ArrayList<>();
		List<String> all_hanthang7b = new ArrayList<>();
		
		List<String> all_cung8a = new ArrayList<>();
		List<String> all_cung8b = new ArrayList<>();
		List<String> all_congiap8a = new ArrayList<>();
		List<String> all_congiap8b = new ArrayList<>();
		List<String> all_daihan8a = new ArrayList<>();
		List<String> all_daihan8b = new ArrayList<>();		
		List<String> all_ct8a = new ArrayList<>();
		List<String> all_ct8b = new ArrayList<>();
		List<String> all_tieuhan8a = new ArrayList<>();
		List<String> all_tieuhan8b = new ArrayList<>();
		List<String> all_trangsinh8a = new ArrayList<>();
		List<String> all_trangsinh8b = new ArrayList<>();
		List<String> all_hanthang8a = new ArrayList<>();
		List<String> all_hanthang8b = new ArrayList<>();
		
		List<String> all_cung9a = new ArrayList<>();
		List<String> all_cung9b = new ArrayList<>();
		List<String> all_congiap9a = new ArrayList<>();
		List<String> all_congiap9b = new ArrayList<>();
		List<String> all_daihan9a = new ArrayList<>();
		List<String> all_daihan9b = new ArrayList<>();		
		List<String> all_ct9a = new ArrayList<>();
		List<String> all_ct9b = new ArrayList<>();
		List<String> all_tieuhan9a = new ArrayList<>();
		List<String> all_tieuhan9b = new ArrayList<>();
		List<String> all_trangsinh9a = new ArrayList<>();
		List<String> all_trangsinh9b = new ArrayList<>();
		List<String> all_hanthang9a = new ArrayList<>();
		List<String> all_hanthang9b = new ArrayList<>();
		
		List<String> all_cung10a = new ArrayList<>();
		List<String> all_cung10b = new ArrayList<>();
		List<String> all_congiap10a = new ArrayList<>();
		List<String> all_congiap10b = new ArrayList<>();
		List<String> all_daihan10a = new ArrayList<>();
		List<String> all_daihan10b = new ArrayList<>();		
		List<String> all_ct10a = new ArrayList<>();
		List<String> all_ct10b = new ArrayList<>();
		List<String> all_tieuhan10a = new ArrayList<>();
		List<String> all_tieuhan10b = new ArrayList<>();
		List<String> all_trangsinh10a = new ArrayList<>();
		List<String> all_trangsinh10b = new ArrayList<>();
		List<String> all_hanthang10a = new ArrayList<>();
		List<String> all_hanthang10b = new ArrayList<>();
		
		List<String> all_cung11a = new ArrayList<>();
		List<String> all_cung11b = new ArrayList<>();
		List<String> all_congiap11a = new ArrayList<>();
		List<String> all_congiap11b = new ArrayList<>();
		List<String> all_daihan11a = new ArrayList<>();
		List<String> all_daihan11b = new ArrayList<>();		
		List<String> all_ct11a = new ArrayList<>();
		List<String> all_ct11b = new ArrayList<>();
		List<String> all_tieuhan11a = new ArrayList<>();
		List<String> all_tieuhan11b = new ArrayList<>();
		List<String> all_trangsinh11a = new ArrayList<>();
		List<String> all_trangsinh11b = new ArrayList<>();
		List<String> all_hanthang11a = new ArrayList<>();
		List<String> all_hanthang11b = new ArrayList<>();
		
		List<String> all_cung12a = new ArrayList<>();
		List<String> all_cung12b = new ArrayList<>();
		List<String> all_congiap12a = new ArrayList<>();
		List<String> all_congiap12b = new ArrayList<>();
		List<String> all_daihan12a = new ArrayList<>();
		List<String> all_daihan12b = new ArrayList<>();		
		List<String> all_ct12a = new ArrayList<>();
		List<String> all_ct12b = new ArrayList<>();
		List<String> all_tieuhan12a = new ArrayList<>();
		List<String> all_tieuhan12b = new ArrayList<>();
		List<String> all_trangsinh12a = new ArrayList<>();
		List<String> all_trangsinh12b = new ArrayList<>();
		List<String> all_hanthang12a = new ArrayList<>();
		List<String> all_hanthang12b = new ArrayList<>();
		
		for(int i=0; i<2; i++) {
		
			if(i==0) {
				date = date-1;
			}
			if(month == 11 && date==31) {
				year++;
			}
							
			if(date == calendar.getActualMaximum(Calendar.DAY_OF_MONTH)) {
				if(month!=11) {
					month=month+1;
				}else {
					month = 0;
				}
				date=0;			
			}
			
			new Select(driver.findElement(By.name("thang"))).selectByIndex(month+1);
			new Select(driver.findElement(By.name("ngay"))).selectByIndex(date+1);
			
			calendar.set(year, month, date);
					
			for(int j=1; j<=12; j++) {
	
				new Select(driver.findElement(By.name("gio"))).selectByIndex(j);	
				new Select(driver.findElement(By.name("nam"))).selectByIndex(year - 1950 + 1);	
				driver.findElement(By.cssSelector("button.button")).click();
				
				WebElement cungso1a = driver.findElement(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//span[@class='c_cung']"));
				cungso1aText = cungso1a.getText();
				all_cung1a.add(cungso1aText);
				
				WebElement conGiap1a = driver.findElement(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='c_giap']"));
				conGiap1aText = conGiap1a.getText();
				all_congiap1a.add(conGiap1aText);
				
				WebElement daiHan1a = driver.findElement(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='daihan']"));
				daiHan1aText = daiHan1a.getText();
				all_daihan1a.add(daiHan1aText);
				
				List<WebElement> chinhTinh1a = driver.findElements(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//p"));
				for (WebElement ct1a : chinhTinh1a) {
				
					String chinhTinh1aText = "";
					chinhTinh1aText =ct1a.getText().toLowerCase();
					if(!chinhTinh1aText.isEmpty()) {
						all_ct1a.add(chinhTinh1aText);
					}					
				}
				Collections.sort(all_ct1a);
				System.out.println(all_ct1a);
				
				WebElement tieuHan1a = driver.findElement(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='tieu_han']"));
				tieuHan1aText = tieuHan1a.getText();
				all_tieuhan1a.add(tieuHan1aText);

				WebElement trangSinh1a = driver.findElement(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='truong_sinh']"));
				trangSinh1aText = trangSinh1a.getText();
				all_trangsinh1a.add(trangSinh1aText);
				
				WebElement hanThang1a = driver.findElement(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='han_thang']"));
				hanThang1aText = hanThang1a.getText();
				all_hanthang1a.add(hanThang1aText);
				
      //==================================//=====================================
				
				WebElement cungso2a = driver.findElement(By.xpath("//div[@class='cung cung_2']//div[@class='cung_content']//span[@class='c_cung']"));
				cungso2aText = cungso2a.getText();
				all_cung2a.add(cungso2aText);
				
				WebElement conGiap2a = driver.findElement(By.xpath("//div[@class='cung cung_2']//div[@class='cung_content']//div[@class='c_giap']"));
				conGiap2aText = conGiap2a.getText();
				all_congiap2a.add(conGiap2aText);
				
				WebElement daiHan2a = driver.findElement(By.xpath("//div[@class='cung cung_2']//div[@class='cung_content']//div[@class='daihan']"));
				daiHan2aText = daiHan2a.getText();
				all_daihan2a.add(daiHan2aText);
				
				List<WebElement> chinhTinh2a = driver.findElements(By.xpath("//div[@class='cung cung_2']//div[@class='cung_content']//p"));
				for (WebElement ct2a : chinhTinh2a) {
					String chinhTinh2aText="";
					chinhTinh2aText =ct2a.getText().toLowerCase();
					if(!chinhTinh2aText.isEmpty()) {
						
						all_ct2a.add(chinhTinh2aText);
					}
				}
				Collections.sort(all_ct2a);
				
				WebElement tieuHan2a = driver.findElement(By.xpath("//div[@class='cung cung_2']//div[@class='cung_content']//div[@class='tieu_han']"));
				tieuHan2aText = tieuHan2a.getText();
				all_tieuhan2a.add(tieuHan2aText);
				
				WebElement trangSinh2a = driver.findElement(By.xpath("//div[@class='cung cung_2']//div[@class='cung_content']//div[@class='truong_sinh']"));
				trangSinh2aText = trangSinh2a.getText();
				all_trangsinh2a.add(trangSinh2aText);
				
				WebElement hanThang2a = driver.findElement(By.xpath("//div[@class='cung cung_2']//div[@class='cung_content']//div[@class='han_thang']"));
				hanThang2aText = hanThang2a.getText();
				all_hanthang2a.add(hanThang2aText);
				
//==================================//=====================================
				
				WebElement cungso3a = driver.findElement(By.xpath("//div[@class='cung cung_3']//div[@class='cung_content']//span[@class='c_cung']"));
				cungso3aText = cungso3a.getText();
				all_cung3a.add(cungso3aText);
				
				WebElement conGiap3a = driver.findElement(By.xpath("//div[@class='cung cung_3']//div[@class='cung_content']//div[@class='c_giap']"));
				conGiap3aText = conGiap3a.getText();
				all_congiap3a.add(conGiap3aText);
				
				WebElement daiHan3a = driver.findElement(By.xpath("//div[@class='cung cung_3']//div[@class='cung_content']//div[@class='daihan']"));
				daiHan3aText = daiHan3a.getText();
				all_daihan3a.add(daiHan3aText);

				List<WebElement> chinhTinh3a = driver.findElements(By.xpath("//div[@class='cung cung_3']//div[@class='cung_content']//p"));
				for (WebElement ct3a : chinhTinh3a) {
					String chinhTinh3aText ="";
					chinhTinh3aText=ct3a.getText().toLowerCase();
					if(!chinhTinh3aText.isEmpty()) {
						all_ct3a.add(chinhTinh3aText);
					}			
				}
				Collections.sort(all_ct3a);
				// 
				WebElement tieuHan3a = driver.findElement(By.xpath("//div[@class='cung cung_3']//div[@class='cung_content']//div[@class='tieu_han']"));
				tieuHan3aText = tieuHan3a.getText();
				all_tieuhan3a.add(tieuHan3aText);
				
				WebElement trangSinh3a = driver.findElement(By.xpath("//div[@class='cung cung_3']//div[@class='cung_content']//div[@class='truong_sinh']"));
				trangSinh3aText = trangSinh3a.getText();
				all_trangsinh3a.add(trangSinh3aText);
				
				WebElement hanThang3a = driver.findElement(By.xpath("//div[@class='cung cung_3']//div[@class='cung_content']//div[@class='han_thang']"));
				hanThang3aText = hanThang3a.getText();
				all_hanthang3a.add(hanThang3aText);
				
//==================================//=====================================
				
				WebElement cungso4a = driver.findElement(By.xpath("//div[@class='cung cung_4']//div[@class='cung_content']//span[@class='c_cung']"));
				cungso4aText = cungso4a.getText();
				all_cung4a.add(cungso4aText);
				
				WebElement conGiap4a = driver.findElement(By.xpath("//div[@class='cung cung_4']//div[@class='cung_content']//div[@class='c_giap']"));
				conGiap4aText = conGiap4a.getText();
				all_congiap4a.add(conGiap4aText);
				
				WebElement daiHan4a = driver.findElement(By.xpath("//div[@class='cung cung_4']//div[@class='cung_content']//div[@class='daihan']"));
				daiHan4aText = daiHan4a.getText();
				all_daihan4a.add(daiHan4aText);
				
				List<WebElement> chinhTinh4a = driver.findElements(By.xpath("//div[@class='cung cung_4']//div[@class='cung_content']//p"));
				for (WebElement ct4a : chinhTinh4a) {
					String chinhTinh4atext ="";
					chinhTinh4atext = ct4a.getText().toLowerCase();
					if(!chinhTinh4atext.isEmpty()) {
						all_ct4a.add(chinhTinh4atext);
					}
				}
				Collections.sort(all_ct4a);
				
				WebElement tieuHan4a = driver.findElement(By.xpath("//div[@class='cung cung_4']//div[@class='cung_content']//div[@class='tieu_han']"));
				tieuHan4aText = tieuHan4a.getText();
				all_tieuhan4a.add(tieuHan4aText);
				
				WebElement trangSinh4a = driver.findElement(By.xpath("//div[@class='cung cung_4']//div[@class='cung_content']//div[@class='truong_sinh']"));
				trangSinh4aText = trangSinh4a.getText();
				all_trangsinh4a.add(trangSinh4aText);
				
				WebElement hanThang4a = driver.findElement(By.xpath("//div[@class='cung cung_4']//div[@class='cung_content']//div[@class='han_thang']"));
				hanThang4aText = hanThang4a.getText();
				all_hanthang4a.add(hanThang4aText);
				
//==================================//=====================================
				
				WebElement cungso5a = driver.findElement(By.xpath("//div[@class='cung cung_5']//div[@class='cung_content']//span[@class='c_cung']"));
				cungso5aText = cungso5a.getText();
				all_cung5a.add(cungso5bText);
				System.out.println(cungso5bText);
				
				WebElement conGiap5a = driver.findElement(By.xpath("//div[@class='cung cung_5']//div[@class='cung_content']//div[@class='c_giap']"));
				conGiap5aText = conGiap5a.getText();
				all_congiap5a.add(conGiap5aText);
				
				WebElement daiHan5a = driver.findElement(By.xpath("//div[@class='cung cung_5']//div[@class='cung_content']//div[@class='daihan']"));
				daiHan5aText = daiHan5a.getText();
				all_daihan5a.add(daiHan5aText);
				
				List<WebElement> chinhTinh5a = driver.findElements(By.xpath("//div[@class='cung cung_5']//div[@class='cung_content']//p"));
				for (WebElement ct5a : chinhTinh5a) {
					String chinhTinh5aText = "";
					chinhTinh5aText = ct5a.getText().toLowerCase();
					if(!chinhTinh5aText.isEmpty()) {
						all_ct5a.add(chinhTinh5aText);
					}
				}
				Collections.sort(all_ct5a);
				
				WebElement tieuHan5a = driver.findElement(By.xpath("//div[@class='cung cung_5']//div[@class='cung_content']//div[@class='tieu_han']"));
				tieuHan5aText = tieuHan5a.getText();
				all_tieuhan5a.add(tieuHan5aText);
				
				WebElement trangSinh5a = driver.findElement(By.xpath("//div[@class='cung cung_5']//div[@class='cung_content']//div[@class='truong_sinh']"));
				trangSinh5aText = trangSinh5a.getText();
				all_trangsinh5a.add(trangSinh5aText);
				
				WebElement hanThang5a = driver.findElement(By.xpath("//div[@class='cung cung_5']//div[@class='cung_content']//div[@class='han_thang']"));
				hanThang5aText = hanThang5a.getText();
				all_hanthang5a.add(hanThang5aText);
				
//==================================//=====================================
				WebElement cungso6a = driver.findElement(By.xpath("//div[@class='cung cung_6']//div[@class='cung_content']//span[@class='c_cung']"));
				cungso6aText = cungso6a.getText();
				all_cung6a.add(cungso6aText);
				
				WebElement conGiap6a = driver.findElement(By.xpath("//div[@class='cung cung_6']//div[@class='cung_content']//div[@class='c_giap']"));
				conGiap6aText = conGiap6a.getText();
				all_congiap6a.add(conGiap6aText);
				
				WebElement daiHan6a = driver.findElement(By.xpath("//div[@class='cung cung_6']//div[@class='cung_content']//div[@class='daihan']"));
				daiHan6aText = daiHan6a.getText();
				all_daihan6a.add(daiHan6aText);
				
				List<WebElement> chinhTinh6a = driver.findElements(By.xpath("//div[@class='cung cung_6']//div[@class='cung_content']//p"));
				for (WebElement ct6a : chinhTinh6a) {
					String chinhTinh6aText="";
					chinhTinh6aText=ct6a.getText().toLowerCase();
					if(!chinhTinh6aText.isEmpty()) {
						all_ct6a.add(chinhTinh6aText);
					}
				}
				Collections.sort(all_ct6a);

				WebElement tieuHan6a = driver.findElement(By.xpath("//div[@class='cung cung_6']//div[@class='cung_content']//div[@class='tieu_han']"));
				tieuHan6aText = tieuHan6a.getText();
				all_tieuhan6a.add(tieuHan6aText);
				
				WebElement trangSinh6a = driver.findElement(By.xpath("//div[@class='cung cung_6']//div[@class='cung_content']//div[@class='truong_sinh']"));
				trangSinh6aText = trangSinh6a.getText();
				all_trangsinh6a.add(trangSinh6aText);
				
				WebElement hanThang6a = driver.findElement(By.xpath("//div[@class='cung cung_6']//div[@class='cung_content']//div[@class='han_thang']"));
				hanThang6aText = hanThang6a.getText();
				all_hanthang6a.add(hanThang6aText);
//==================================//Cung SO 7=====================================		
				
				WebElement cungso7a = driver.findElement(By.xpath("//div[@class='cung cung_7']//div[@class='cung_content']//span[@class='c_cung']"));
				cungso7aText = cungso7a.getText();
				all_cung7a.add(cungso7aText);
				
				WebElement conGiap7a = driver.findElement(By.xpath("//div[@class='cung cung_7']//div[@class='cung_content']//div[@class='c_giap']"));
				conGiap7aText = conGiap7a.getText();
				all_congiap7a.add(conGiap7aText);
				
				WebElement daiHan7a = driver.findElement(By.xpath("//div[@class='cung cung_7']//div[@class='cung_content']//div[@class='daihan']"));
				daiHan7aText = daiHan7a.getText();
				all_daihan7a.add(daiHan7aText);
				
				List<WebElement> chinhTinh7a = driver.findElements(By.xpath("//div[@class='cung cung_7']//div[@class='cung_content']//p"));
				for (WebElement ct7a : chinhTinh7a) {
					String chinhTinh7aText ="";
					chinhTinh7aText = ct7a.getText().toLowerCase();
					if(!chinhTinh7aText.isEmpty()) {
						all_ct7a.add(chinhTinh7aText);
					}
				}
				Collections.sort(all_ct7a);
				
				WebElement tieuHan7a = driver.findElement(By.xpath("//div[@class='cung cung_7']//div[@class='cung_content']//div[@class='tieu_han']"));
				tieuHan7aText = tieuHan7a.getText();
				all_tieuhan7a.add(tieuHan7aText);
				
				WebElement trangSinh7a = driver.findElement(By.xpath("//div[@class='cung cung_7']//div[@class='cung_content']//div[@class='truong_sinh']"));
				trangSinh7aText = trangSinh7a.getText();
				all_trangsinh7a.add(trangSinh7aText);
				
				WebElement hanThang7a = driver.findElement(By.xpath("//div[@class='cung cung_7']//div[@class='cung_content']//div[@class='han_thang']"));
				hanThang7aText = hanThang7a.getText();
				all_hanthang7a.add(hanThang7aText);
				
//==================================//Cung SO 8=====================================
				WebElement cungso8a = driver.findElement(By.xpath("//div[@class='cung cung_8']//div[@class='cung_content']//span[@class='c_cung']"));
				cungso8aText = cungso8a.getText();
				all_cung8a.add(cungso8aText);
				
				WebElement conGiap8a = driver.findElement(By.xpath("//div[@class='cung cung_8']//div[@class='cung_content']//div[@class='c_giap']"));
				conGiap8aText = conGiap8a.getText();
				all_congiap8a.add(conGiap8aText);
				
				WebElement daiHan8a = driver.findElement(By.xpath("//div[@class='cung cung_8']//div[@class='cung_content']//div[@class='daihan']"));
				daiHan8aText = daiHan8a.getText();
				all_daihan8a.add(daiHan8aText);
				
				List<WebElement> chinhTinh8a = driver.findElements(By.xpath("//div[@class='cung cung_8']//div[@class='cung_content']//p"));
				for (WebElement ct8a : chinhTinh8a) {
					String chinhTinh8aText ="";
					chinhTinh8aText= ct8a.getText().toLowerCase();
					if(!chinhTinh8aText.isEmpty()) {
						all_ct8a.add(chinhTinh8aText);
					}
				}
				Collections.sort(all_ct8a);
				
				WebElement tieuHan8a = driver.findElement(By.xpath("//div[@class='cung cung_8']//div[@class='cung_content']//div[@class='tieu_han']"));
				tieuHan8aText = tieuHan8a.getText();
				all_tieuhan8a.add(tieuHan8aText);
				
				WebElement trangSinh8a = driver.findElement(By.xpath("//div[@class='cung cung_8']//div[@class='cung_content']//div[@class='truong_sinh']"));
				trangSinh8aText = trangSinh8a.getText();
				all_trangsinh8a.add(trangSinh8aText);
				
				WebElement hanThang8a = driver.findElement(By.xpath("//div[@class='cung cung_8']//div[@class='cung_content']//div[@class='han_thang']"));
				hanThang8aText = hanThang8a.getText();
				all_hanthang8a.add(hanThang8aText);
				
//==================================//Cung SO 9=====================================
				
				WebElement cungso9a = driver.findElement(By.xpath("//div[@class='cung cung_9']//div[@class='cung_content']//span[@class='c_cung']"));
				cungso9aText = cungso9a.getText();
				all_cung9a.add(cungso9aText);
				
				WebElement conGiap9a = driver.findElement(By.xpath("//div[@class='cung cung_9']//div[@class='cung_content']//div[@class='c_giap']"));
				conGiap9aText = conGiap9a.getText();
				all_congiap9a.add(conGiap9aText);
				
				WebElement daiHan9a = driver.findElement(By.xpath("//div[@class='cung cung_9']//div[@class='cung_content']//div[@class='daihan']"));
				daiHan9aText = daiHan9a.getText();
				all_daihan9a.add(daiHan9aText);
				
				List<WebElement> chinhTinh9a = driver.findElements(By.xpath("//div[@class='cung cung_9']//div[@class='cung_content']//p"));
				for (WebElement ct9a : chinhTinh9a) {
					String chinhTinh9aText = "";
					chinhTinh9aText = ct9a.getText().toLowerCase();
					if(!chinhTinh9aText.isEmpty()) {
						all_ct9a.add(chinhTinh9aText);
					}
				}
				Collections.sort(all_ct9a);
				
				WebElement tieuHan9a = driver.findElement(By.xpath("//div[@class='cung cung_9']//div[@class='cung_content']//div[@class='tieu_han']"));
				tieuHan9aText = tieuHan9a.getText();
				all_tieuhan9a.add(tieuHan9aText);
				
				WebElement trangSinh9a = driver.findElement(By.xpath("//div[@class='cung cung_9']//div[@class='cung_content']//div[@class='truong_sinh']"));
				trangSinh9aText = trangSinh9a.getText();
				all_trangsinh9a.add(trangSinh9aText);
				
				WebElement hanThang9a = driver.findElement(By.xpath("//div[@class='cung cung_9']//div[@class='cung_content']//div[@class='han_thang']"));
				hanThang9aText = hanThang9a.getText();
				all_hanthang9a.add(hanThang9aText);
				
//==================================//Cung SO 10 =====================================				
				
				WebElement cungso10a = driver.findElement(By.xpath("//div[@class='cung cung_10']//div[@class='cung_content']//span[@class='c_cung']"));
				cungso10aText = cungso10a.getText();
				all_cung10a.add(cungso10aText);
				
				WebElement conGiap10a = driver.findElement(By.xpath("//div[@class='cung cung_10']//div[@class='cung_content']//div[@class='c_giap']"));
				conGiap10aText = conGiap10a.getText();
				all_congiap10a.add(conGiap10aText);
				
				WebElement daiHan10a = driver.findElement(By.xpath("//div[@class='cung cung_10']//div[@class='cung_content']//div[@class='daihan']"));
				daiHan10aText = daiHan10a.getText();
				all_daihan10a.add(daiHan10aText);
				
				List<WebElement> chinhTinh10a = driver.findElements(By.xpath("//div[@class='cung cung_10']//div[@class='cung_content']//p"));
				for (WebElement ct10a : chinhTinh10a) {
					String chinhTinh10aText ="";
					chinhTinh10aText = ct10a.getText().toLowerCase();
					if(!chinhTinh10aText.isEmpty()) {
						all_ct10a.add(chinhTinh10aText);
					}
				}
				Collections.sort(all_ct10a);
				
				WebElement tieuHan10a = driver.findElement(By.xpath("//div[@class='cung cung_10']//div[@class='cung_content']//div[@class='tieu_han']"));
				tieuHan10aText = tieuHan10a.getText();
				all_tieuhan10a.add(tieuHan10aText);
				
				WebElement trangSinh10a = driver.findElement(By.xpath("//div[@class='cung cung_10']//div[@class='cung_content']//div[@class='truong_sinh']"));
				trangSinh10aText = trangSinh10a.getText();
				all_trangsinh10a.add(trangSinh10aText);
				
				WebElement hanThang10a = driver.findElement(By.xpath("//div[@class='cung cung_10']//div[@class='cung_content']//div[@class='han_thang']"));
				hanThang10aText = hanThang10a.getText();
				all_hanthang10a.add(hanThang10aText);
				
//==================================//Cung SO 11 =====================================
				
				WebElement cungso11a = driver.findElement(By.xpath("//div[@class='cung cung_11']//div[@class='cung_content']//span[@class='c_cung']"));
				cungso11aText = cungso11a.getText();
				all_cung11a.add(cungso11aText);
				
				WebElement conGiap11a = driver.findElement(By.xpath("//div[@class='cung cung_11']//div[@class='cung_content']//div[@class='c_giap']"));
				conGiap11aText = conGiap11a.getText();
				all_congiap11a.add(conGiap11aText);
				
				WebElement daiHan11a = driver.findElement(By.xpath("//div[@class='cung cung_11']//div[@class='cung_content']//div[@class='daihan']"));
				daiHan11aText = daiHan11a.getText();
				all_daihan11a.add(daiHan11aText);
				
				List<WebElement> chinhTinh11a = driver.findElements(By.xpath("//div[@class='cung cung_11']//div[@class='cung_content']//p"));
				for (WebElement ct11a : chinhTinh11a) {
					String chinhTinh11aText = "";
					chinhTinh11aText = ct11a.getText().toLowerCase();
					if(!chinhTinh11aText.isEmpty()) {
						all_ct11a.add(chinhTinh11aText);
					}
				}
				Collections.sort(all_ct11a);
				
				WebElement tieuHan11a = driver.findElement(By.xpath("//div[@class='cung cung_11']//div[@class='cung_content']//div[@class='tieu_han']"));
				tieuHan11aText = tieuHan11a.getText();
				all_tieuhan11a.add(tieuHan11aText);
				
				WebElement trangSinh11a = driver.findElement(By.xpath("//div[@class='cung cung_11']//div[@class='cung_content']//div[@class='truong_sinh']"));
				trangSinh11aText = trangSinh11a.getText();
				all_trangsinh11a.add(trangSinh11aText);
				
				WebElement hanThang11a = driver.findElement(By.xpath("//div[@class='cung cung_11']//div[@class='cung_content']//div[@class='han_thang']"));
				hanThang11aText = hanThang11a.getText();
				all_hanthang11a.add(hanThang11aText);
				
//==================================//Cung SO 12 =====================================
				
				WebElement cungso12a = driver.findElement(By.xpath("//div[@class='cung cung_12']//div[@class='cung_content']//span[@class='c_cung']"));
				cungso12aText = cungso12a.getText();
				all_cung12a.add(cungso12aText);
				
				WebElement conGiap12a = driver.findElement(By.xpath("//div[@class='cung cung_12']//div[@class='cung_content']//div[@class='c_giap']"));
				conGiap12aText = conGiap12a.getText();
				all_congiap12a.add(conGiap12aText);
				
				WebElement daiHan12a = driver.findElement(By.xpath("//div[@class='cung cung_12']//div[@class='cung_content']//div[@class='daihan']"));
				daiHan12aText = daiHan12a.getText();
				all_daihan12a.add(daiHan12aText);
				
				List<WebElement> chinhTinh12a = driver.findElements(By.xpath("//div[@class='cung cung_12']//div[@class='cung_content']//p"));
				for (WebElement ct12a : chinhTinh12a) {
					String chinhTinh12aText = "";
					chinhTinh12aText = ct12a.getText().toLowerCase();
					if(!chinhTinh12aText.isEmpty()) {
						all_ct12a.add(chinhTinh12aText);
					}
				}
				Collections.sort(all_ct12a);
				
				WebElement tieuHan12a = driver.findElement(By.xpath("//div[@class='cung cung_12']//div[@class='cung_content']//div[@class='tieu_han']"));
				tieuHan12aText = tieuHan12a.getText();
				all_tieuhan12a.add(tieuHan12aText);
				
				WebElement trangSinh12a = driver.findElement(By.xpath("//div[@class='cung cung_12']//div[@class='cung_content']//div[@class='truong_sinh']"));
				trangSinh12aText = trangSinh12a.getText();
				all_trangsinh12a.add(trangSinh12aText);
				
				WebElement hanThang12a = driver.findElement(By.xpath("//div[@class='cung cung_12']//div[@class='cung_content']//div[@class='han_thang']"));
				hanThang12aText = hanThang12a.getText();
				all_hanthang12a.add(hanThang12aText);
				
			}
			date++;
		}
	
//////-----------------------------------////-------------------/////--------------------------------
		System.out.println("chinh tinh trang web 2");
		driver.get("http://134.209.106.223:7790/horoscope");
		sleepInSecond(1);
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(1950, Calendar.DECEMBER, 30);
		int date2 = calendar2.get(Calendar.DAY_OF_MONTH );
		
		int month2 = calendar2.get(Calendar.MONTH);
	
		int year2 = calendar2.get(Calendar.YEAR);
		for(int i=0; i<2; i++) {
			
			for (int j=0; j<=23; j++) {
				if(j%2==0) {
					driver.findElement(By.id("full_name")).sendKeys(hoten);
					JavascriptExecutor jsExcutor1 = (JavascriptExecutor) driver;
					jsExcutor1.executeScript("document.getElementById('female').checked=true");
					
					new Select(driver.findElement(By.name("hour"))).selectByIndex(j);
					new Select(driver.findElement(By.name("year"))).selectByIndex(2023 - year2);
					new Select(driver.findElement(By.name("month"))).selectByIndex(month2);
					new Select(driver.findElement(By.name("day"))).selectByIndex(date2-1);
					sleepInSecond(2);
					
					driver.findElement(By.xpath("//a[@class='btn btn-warning text-white']")).click();
					sleepInSecond(1);
					
					WebElement cungso1b = driver.findElement(By.xpath("//tbody/tr[4]/td[3]/div/div[1]/div/div[2]/div"));
					cungso1bText = cungso1b.getText();
					all_cung1b.add(cungso1bText);
					
					WebElement conGiapSo1b = driver.findElement(By.xpath("//tbody/tr[4]/td[3]/div/div[1]/div/div[1]"));
					conGiapSo1bText = conGiapSo1b.getText();
					all_congiap1b.add(conGiapSo1bText);
					
					WebElement soDaiHan1b = driver.findElement(By.xpath("//tbody/tr[4]/td[3]/div/div[1]/div/div[3]"));
					daiHan1bText = soDaiHan1b.getText();
					all_daihan1b.add(daiHan1bText);// add vào danh list mảng
					
					List<WebElement> chinhTinh1b = driver.findElements(By.xpath("//tbody/tr[4]/td[3]/div/div[1]/div/div[2]/p"));
					
					for (WebElement ct1b : chinhTinh1b) {
						String chinhTinh1bText =ct1b.getText().toLowerCase();
						all_ct1b.add(chinhTinh1bText);
					}
					Collections.sort(all_ct1b);
					
					System.out.println(all_ct1b);
					WebElement tieuHan1b = driver.findElement(By.xpath("//tbody/tr[4]/td[3]/div/div[3]/div[1]"));
					tieuHan1bText = tieuHan1b.getText();
					all_tieuhan1b.add(tieuHan1bText);
					
					WebElement trangSinh1b = driver.findElement(By.xpath("//tbody/tr[4]/td[3]/div/div[3]/div[2]"));
					trangSinh1bText = trangSinh1b.getText();
					all_trangsinh1b.add(trangSinh1bText);
					
					WebElement hanThang1b = driver.findElement(By.xpath("//tbody/tr[4]/td[3]/div/div[3]/div[3]"));
					hanThang1bText = hanThang1b.getText();
					all_hanthang1b.add(hanThang1bText);
					
//--------------------------------'CUNG 2'=====================================//////////////////////////					
					
					WebElement cungso2b = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div/div[1]/div/div[2]/div"));
					cungso2bText = cungso2b.getText();
					all_cung2b.add(cungso2bText);
					
					WebElement conGiapSo2b = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div/div[1]/div/div[1]"));
					conGiapSo2bText = conGiapSo2b.getText();
					all_congiap2b.add(conGiapSo2bText);
					
					WebElement soDaiHan2b = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div/div[1]/div/div[3]"));
					daiHan2bText = soDaiHan2b.getText();
					all_daihan2b.add(daiHan2bText);
					
					List<WebElement> chinhTinh2b = driver.findElements(By.xpath("//tbody/tr[4]/td[2]/div/div[1]/div/div[2]/p"));
					for (WebElement ct2b : chinhTinh2b) {
						String chinhTinh2bText =ct2b.getText().toLowerCase();
						all_ct2b.add(chinhTinh2bText);						
					}
					Collections.sort(all_ct2b);
					
					WebElement tieuHan2b = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div/div[3]/div[1]"));
					tieuHan2bText = tieuHan2b.getText();
					all_tieuhan2b.add(tieuHan2bText);
					
					WebElement trangSinh2b = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div/div[3]/div[2]"));
					trangSinh2bText = trangSinh2b.getText();
					all_trangsinh2b.add(trangSinh2bText);
					
					WebElement hanThang2b = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div/div[3]/div[3]"));
					hanThang2bText = hanThang2b.getText();
					all_hanthang2b.add(hanThang2bText);
					
//--------------------------------'Cung 3'=====================================//////////////////////////	
					
					WebElement cungso3b = driver.findElement(By.xpath("//tbody/tr[4]/td[1]/div/div[1]/div/div[2]/div"));
					cungso3bText = cungso3b.getText();
					all_cung3b.add(cungso3bText);
					
					WebElement conGiapSo3b = driver.findElement(By.xpath("//tbody/tr[4]/td[1]/div/div[1]/div/div[1]"));
					conGiapSo3bText = conGiapSo3b.getText();
					all_congiap3b.add(conGiapSo3bText);
					
					WebElement soDaiHan3b = driver.findElement(By.xpath("//tbody/tr[4]/td[1]/div/div[1]/div/div[3]"));
					daiHan3bText = soDaiHan3b.getText();
					all_daihan3b.add(daiHan3bText);
					
					List<WebElement> chinhTinh3b = driver.findElements(By.xpath("//tbody/tr[4]/td[1]/div/div[1]/div/div[2]/p"));
					for (WebElement ct3b : chinhTinh3b) {
						String chinhTinh3btext=ct3b.getText().toLowerCase();
						all_ct3b.add(chinhTinh3btext);
					}
					Collections.sort(all_ct3b);
					
					WebElement tieuHan3b = driver.findElement(By.xpath("//tbody/tr[4]/td[1]/div/div[3]/div[1]"));
					tieuHan3bText = tieuHan3b.getText();
					all_tieuhan3b.add(tieuHan3bText);
					
					WebElement trangSinh3b = driver.findElement(By.xpath("//tbody/tr[4]/td[1]/div/div[3]/div[2]"));
					trangSinh3bText = trangSinh3b.getText();
					all_trangsinh3b.add(trangSinh3bText);
					
					WebElement hanThang3b = driver.findElement(By.xpath("//tbody/tr[4]/td[1]/div/div[3]/div[3]"));
					hanThang3bText = hanThang3b.getText();
					all_hanthang3b.add(hanThang3bText);
					
//--------------------------------'Cung 4'=====================================//////////////////////////	
					
					WebElement cungso4b = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div/div[1]/div/div[2]/div"));
					cungso4bText = cungso4b.getText();
					all_cung4b.add(cungso4bText);
					
					WebElement conGiapSo4b = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div/div[1]/div/div[1]"));
					conGiapSo4bText = conGiapSo4b.getText();
					all_congiap4b.add(conGiapSo4bText);
					
					WebElement soDaiHan4b = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div/div[1]/div/div[3]"));
					daiHan4bText = soDaiHan4b.getText();
					all_daihan4b.add(daiHan4bText);
					
					List<WebElement> chinhTinh4b = driver.findElements(By.xpath("//tbody/tr[3]/td[1]/div/div[1]/div/div[2]/p"));
					for (WebElement ct4b : chinhTinh4b) {
						String chinhTinh4bText=ct4b.getText().toLowerCase();
						all_ct4b.add(chinhTinh4bText);
					}
					Collections.sort(all_ct4b);
					
					WebElement tieuHan4b = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div/div[3]/div[1]"));
					tieuHan4bText = tieuHan4b.getText();
					all_tieuhan4b.add(tieuHan4bText);
					
					WebElement trangSinh4b = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div/div[3]/div[2]"));
					trangSinh4bText = trangSinh4b.getText();
					all_trangsinh4b.add(trangSinh4bText);
					
					WebElement hanThang4b = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div/div[3]/div[3]"));
					hanThang4bText = hanThang4b.getText();
					all_hanthang4b.add(hanThang4bText);
					
//--------------------------------'Cung 5'=====================================//////////////////////////			
					
					WebElement cungso5b = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/div[1]/div/div[2]/div"));
					cungso5bText = cungso5b.getText();
					all_cung5b.add(cungso5bText);
					
					WebElement conGiapSo5b = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/div[1]/div/div[1]"));
					conGiapSo5bText = conGiapSo5b.getText();
					all_congiap5b.add(conGiapSo5bText);
					
					WebElement soDaiHan5b = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/div[1]/div/div[3]"));
					daiHan5bText = soDaiHan5b.getText();
					all_daihan5b.add(daiHan5bText);
					
					List<WebElement> chinhTinh5b = driver.findElements(By.xpath("//tbody/tr[2]/td[1]/div/div[1]/div/div[2]/p"));
					for (WebElement ct5b : chinhTinh5b) {
						String chinhTinh5bText = ct5b.getText().toLowerCase();
						all_ct5b.add(chinhTinh5bText);
					}
					Collections.sort(all_ct5b);
					
					WebElement tieuHan5b = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/div[3]/div[1]"));
					tieuHan5bText = tieuHan5b.getText();
					all_tieuhan5b.add(tieuHan5bText);
					
					WebElement trangSinh5b = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/div[3]/div[2]"));
					trangSinh5bText = trangSinh5b.getText();
					all_trangsinh5b.add(trangSinh5bText);
					
					WebElement hanThang5b = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/div[3]/div[3]"));
					hanThang5bText = hanThang5b.getText();
					all_hanthang5b.add(hanThang5bText);
//--------------------------------'Cung 6'=====================================//////////////////////////	
					WebElement cungso6b = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/div[1]/div/div[2]/div"));
					cungso6bText = cungso6b.getText();
					all_cung6b.add(cungso6bText);
					
					WebElement conGiapSo6b = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/div[1]/div/div[1]"));
					conGiapSo6bText = conGiapSo6b.getText();
					all_congiap6b.add(conGiapSo6bText);
					
					WebElement soDaiHan6b = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/div[1]/div/div[3]"));
					daiHan6bText = soDaiHan6b.getText();
					all_daihan6b.add(daiHan6bText);
					
					List<WebElement> chinhTinh6b = driver.findElements(By.xpath("//tbody/tr[1]/td[1]/div/div[1]/div/div[2]/p"));
					for (WebElement ct6b : chinhTinh6b) {
						String chinhTinh6bText = ct6b.getText().toLowerCase();
						all_ct6b.add(chinhTinh6bText);
					}
					Collections.sort(all_ct6b);
					
					WebElement tieuHan6b = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/div[3]/div[1]"));
					tieuHan6bText = tieuHan6b.getText();
					all_tieuhan6b.add(tieuHan6bText);
					
					WebElement trangSinh6b = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/div[3]/div[2]"));
					trangSinh6bText = trangSinh6b.getText();
					all_trangsinh6b.add(trangSinh6bText);
					
					WebElement hanThang6b = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/div[3]/div[3]"));
					hanThang6bText = hanThang6b.getText();
					all_hanthang6b.add(hanThang6bText);
					
//--------------------------------'Cung 7'=====================================//////////////////////////			
					
					WebElement cungso7b = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/div[1]/div/div[2]/div"));
					cungso7bText = cungso7b.getText();
					all_cung7b.add(cungso7bText);
					
					WebElement conGiapSo7b = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/div[1]/div/div[1]"));
					conGiapSo7bText = conGiapSo7b.getText();
					all_congiap7b.add(conGiap7aText);
					
					WebElement soDaiHan7b = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/div[1]/div/div[3]"));
					daiHan7bText = soDaiHan7b.getText();
					all_daihan7b.add(daiHan7bText);
					
					List<WebElement> chinhTinh7b = driver.findElements(By.xpath("//tbody/tr[1]/td[2]/div/div[1]/div/div[2]/p"));
					for (WebElement ct7b : chinhTinh7b) {
						String chinhTinh7bText = ct7b.getText().toLowerCase();
						all_ct7b.add(chinhTinh7bText);
					}
					Collections.sort(all_ct7b);
					
					WebElement tieuHan7b = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/div[3]/div[1]"));
					tieuHan7bText = tieuHan7b.getText();
					all_tieuhan7b.add(tieuHan7bText);
					
					WebElement trangSinh7b = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/div[3]/div[2]"));
					trangSinh7bText = trangSinh7b.getText();
					all_trangsinh7b.add(trangSinh7bText);
					
					WebElement hanThang7b = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/div[3]/div[3]"));
					hanThang7bText = hanThang7b.getText();
					all_hanthang7b.add(hanThang7bText);
					
//--------------------------------'Cung 8'=====================================//////////////////////////
					
					WebElement cungso8b = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div/div[1]/div/div[2]/div"));
					cungso8bText = cungso8b.getText();
					all_cung8b.add(cungso8bText);
					
					WebElement conGiapSo8b = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div/div[1]/div/div[1]"));
					conGiapSo8bText = conGiapSo8b.getText();
					all_congiap8b.add(conGiapSo8bText);
					
					WebElement soDaiHan8b = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div/div[1]/div/div[3]"));
					daiHan8bText = soDaiHan8b.getText();
					all_daihan8b.add(daiHan8bText);
					
					List<WebElement> chinhTinh8b = driver.findElements(By.xpath("//tbody/tr[1]/td[3]/div/div[1]/div/div[2]/p"));
					for (WebElement ct8b : chinhTinh8b) {
						String chinhTinh8bText = ct8b.getText().toLowerCase();
						all_ct8b.add(chinhTinh8bText);
					}
					Collections.sort(all_ct8b);
					
					WebElement tieuHan8b = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div/div[3]/div[1]"));
					tieuHan8bText = tieuHan8b.getText();
					all_tieuhan8b.add(tieuHan8bText);
					
					WebElement trangSinh8b = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div/div[3]/div[2]"));
					trangSinh8bText = trangSinh8b.getText();
					all_trangsinh8b.add(trangSinh8bText);
					
					WebElement hanThang8b = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div/div[3]/div[3]"));
					hanThang8bText = hanThang8b.getText();
					all_hanthang8b.add(hanThang8bText);
					
//--------------------------------'Cung 9'=====================================//////////////////////////				
					
					WebElement cungso9b = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div/div[1]/div/div[2]/div"));
					cungso9bText = cungso9b.getText();
					all_cung9a.add(cungso9aText);
					
					WebElement conGiapSo9b = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div/div[1]/div/div[1]"));
					conGiapSo9bText = conGiapSo9b.getText();
					all_congiap9b.add(conGiapSo9bText);
					
					WebElement soDaiHan9b = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div/div[1]/div/div[3]"));
					daiHan9bText = soDaiHan9b.getText();
					all_daihan9b.add(daiHan9bText);
					
					List<WebElement> chinhTinh9b = driver.findElements(By.xpath("//tbody/tr[1]/td[4]/div/div[1]/div/div[2]/p"));
					for (WebElement ct9b : chinhTinh9b) {
						String chinhTinh9bText = ct9b.getText().toLowerCase();
						all_ct9a.add(chinhTinh9bText);
					}
					
					WebElement tieuHan9b = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div/div[3]/div[1]"));
					tieuHan9bText = tieuHan9b.getText();
					all_tieuhan9b.add(tieuHan9bText);
					
					WebElement trangSinh9b = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div/div[3]/div[2]"));
					trangSinh9bText = trangSinh9b.getText();
					all_trangsinh9b.add(trangSinh9bText);
					
					WebElement hanThang9b = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div/div[3]/div[3]"));
					hanThang9bText = hanThang9b.getText();
					all_hanthang9b.add(hanThang9bText); 
					
//--------------------------------'Cung 10'=====================================//////////////////////////					
					
					WebElement cungso10b = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div/div[1]/div/div[2]/div"));
					cungso10bText = cungso10b.getText();
					all_cung10b.add(cungso10bText);
					
					WebElement conGiapSo10b = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div/div[1]/div/div[1]"));
					conGiapSo10bText = conGiapSo10b.getText();
					all_congiap10b.add(conGiapSo10bText);
					
					WebElement soDaiHan10b = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div/div[1]/div/div[3]"));
					daiHan10bText = soDaiHan10b.getText();
					all_daihan10b.add(daiHan10bText);
					
					List<WebElement> chinhTinh10b = driver.findElements(By.xpath("//tbody/tr[2]/td[3]/div/div[1]/div/div[2]/p"));
					for (WebElement ct10b : chinhTinh10b) {
						String chinhTinh10bText = ct10b.getText().toLowerCase();
						all_ct10b.add(chinhTinh10bText);
					}
					Collections.sort(all_ct10b);
					
					WebElement tieuHan10b = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div/div[3]/div[1]"));
					tieuHan10bText = tieuHan10b.getText();
					all_tieuhan10b.add(tieuHan10bText);
					
					WebElement trangSinh10b = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div/div[3]/div[2]"));
					trangSinh10bText = trangSinh10b.getText();
					all_trangsinh10b.add(trangSinh10bText);
					
					WebElement hanThang10b = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div/div[3]/div[3]"));
					hanThang10bText = hanThang10b.getText();
					all_hanthang10b.add(hanThang10bText);
					
//--------------------------------'Cung 11'=====================================//////////////////////////
					
					WebElement cungso11b = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div/div[1]/div/div[2]/div"));
					cungso11bText = cungso11b.getText();
					all_cung11b.add(cungso11bText);
					
					WebElement conGiapSo11b = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div/div[1]/div/div[1]"));
					conGiapSo11bText = conGiapSo11b.getText();
					all_congiap11b.add(conGiapSo11bText);
					
					WebElement soDaiHan11b = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div/div[1]/div/div[3]"));
					daiHan11bText = soDaiHan11b.getText();
					all_daihan11b.add(daiHan11bText);
					
					List<WebElement> chinhTinh11b = driver.findElements(By.xpath("//tbody/tr[3]/td[2]/div/div[1]/div/div[2]/p"));
					for (WebElement ct11b : chinhTinh11b) {
						String chinhTinh11bText = ct11b.getText().toLowerCase();
						all_ct11b.add(chinhTinh11bText);
					}
					Collections.sort(all_ct11b);
					
					WebElement tieuHan11b = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div/div[3]/div[1]"));
					tieuHan11bText = tieuHan11b.getText();
					all_tieuhan11b.add(tieuHan11bText);
					
					WebElement trangSinh11b = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div/div[3]/div[2]"));
					trangSinh11bText = trangSinh11b.getText();
					all_trangsinh11b.add(trangSinh11bText);
					
					WebElement hanThang11b = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div/div[3]/div[3]"));
					hanThang11bText = hanThang11b.getText();
					all_hanthang11b.add(hanThang11bText);
					
//--------------------------------'CUNG 12'=====================================//////////////////////////					
					
					WebElement cungso12b = driver.findElement(By.xpath("//tbody/tr[4]/td[4]/div/div[1]/div/div[2]/div"));
					cungso12bText = cungso12b.getText();
					all_cung12b.add(cungso12bText);
					
					WebElement conGiapSo12b = driver.findElement(By.xpath("//tbody/tr[4]/td[4]/div/div[1]/div/div[1]"));
					conGiapSo12bText = conGiapSo12b.getText();
					all_congiap12b.add(conGiapSo12bText);
					
					WebElement soDaiHan12b = driver.findElement(By.xpath("//tbody/tr[4]/td[4]/div/div[1]/div/div[3]"));
					daiHan12bText = soDaiHan12b.getText();
					all_daihan12b.add(daiHan12bText);
					
					List<WebElement> chinhTinh12b = driver.findElements(By.xpath("//tbody/tr[4]/td[4]/div/div[1]/div/div[2]/p"));
					for (WebElement ct12b : chinhTinh12b) {
						String chinhTinh12bText = ct12b.getText().toLowerCase();
						all_ct12b.add(chinhTinh12bText);
					}
					Collections.sort(all_ct12b);
					
					WebElement tieuHan12b = driver.findElement(By.xpath("//tbody/tr[4]/td[4]/div/div[3]/div[1]"));
					tieuHan12bText = tieuHan12b.getText();
					all_tieuhan12b.add(tieuHan12bText);
					
					WebElement trangSinh12b = driver.findElement(By.xpath("//tbody/tr[4]/td[4]/div/div[3]/div[2]"));
					trangSinh12bText = trangSinh12b.getText();
					all_trangsinh12b.add(trangSinh12bText);
					
					WebElement hanThang12b = driver.findElement(By.xpath("//tbody/tr[4]/td[4]/div/div[3]/div[3]"));
					hanThang12bText = hanThang12b.getText();
					all_hanthang12b.add(hanThang12bText);
					
				}
				else {
					continue;
				}
			}
			
			if(month2 == 11 && date2==31) {
				year2++;
			}
							
			if(date2 == calendar2.getActualMaximum(Calendar.DAY_OF_MONTH)) {
				if(month2!=11) {
					month2=month2+1;
				}else {
					month2 = 0;
				}
				date2=0;			
			}
			sleepInSecond(2);
			calendar2.set(year2, month2, date2);
			
						
			date2++;
		}
		
		for(int k = 0; k <all_cung1b.size() ;k++) {
			if (all_cung1a.get(k).toLowerCase().contains(all_cung1b.get(k).toLowerCase())) {	
//			System.out.println(all_cung2.get(k).toLowerCase() +","+all_cung1.get(k).toLowerCase());		
			System.out.println("Đúng dữ liệu cung số 1");
		} 
		else {	
			System.out.println("không đúng dữ liệu");
			}
		}
		
		
		for(int k=0; k<all_congiap1b.size(); k++) {
			if (all_congiap1a.get(k).equalsIgnoreCase(all_congiap1b.get(k))) {
				System.out.println("Đúng dữ liệu con giáp cung số 1");
			} else {
				System.out.println("không đúng dữ liệu cung số 1");
			}
		}
		
		for(int k=0; k<all_daihan1b.size(); k++) {
			if (all_daihan1a.get(k).equalsIgnoreCase(all_daihan1b.get(k))) {
				System.out.println("Đúng dữ liệu số Đại Hạn tại cung số 1");
			} else {
				System.out.println("Không đúng dữ liệu số Đại Hạn cung số 1");
			}
		}
		
		for(int k=0; k<all_ct1b.size(); k++) {
			if (all_ct1a.get(k).equalsIgnoreCase(all_ct1b.get(k))) {
				System.out.println("Đúng dữ liệu chính tinh tại cung 1");
			} else {
				System.out.println("Không đúng dữ liệu Chính Tinh tại cung 1");
			}
		}
		
		for(int k=0; k<all_tieuhan1b.size(); k++) {
			if (all_tieuhan1a.get(k).equalsIgnoreCase(all_tieuhan1b.get(k))) {
				System.out.println("Đúng dữ liệu tiểu hạn tại cung số 1");
			} else {
				System.out.println("Không đúng dữ liệu tiểu hạn tại cung số 1");
			}
		}
		
		for(int k=0; k<all_trangsinh1b.size(); k++) {
			if (all_trangsinh1a.get(k).contains(all_trangsinh1b.get(k))) {
				System.out.println("Đúng dữ liệu tràng sinh tại cung số 1");
			} else {
				System.out.println("Không đúng dữ liệu tràng sinh tại cung số 1");
			}
		}
		
		for(int k=0; k<all_hanthang1b.size();k++) {
			if (all_hanthang1a.get(k).equalsIgnoreCase(all_hanthang1b.get(k))) {
				System.out.println("Đúng dữ liệu hạn tháng tại cung số 1");
			}else {
				System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 1");
			}
		}			
//==============================================CUNG SỐ 2===============================///
		System.out.println("============KẾT QUẢ CUNG SỐ 2==========");
		
		for(int k=0; k<all_cung2b.size(); k++) {
			if (all_cung2a.get(k).contains(all_cung2b.get(k))) {
				System.out.println("Đúng dữ liệu cung số 2");
			} else {
				System.out.println("không đúng dữ liệu cung số 2");
			}
		}
		
		for(int k=0; k<all_congiap2b.size(); k++) {
			if (all_congiap2a.get(k).equalsIgnoreCase(all_congiap2b.get(k))) {
				System.out.println("Đúng dữ liệu con giáp tại cung số 2");
			} else {
				System.out.println("không đúng dữ liệu con giáp tại cung số 2");
			}
		}
		
		for(int k=0; k<all_daihan2b.size(); k++) {
			if (all_daihan2a.get(k).equalsIgnoreCase(all_daihan2b.get(k))) {
				System.out.println("Đúng dữ liệu số Đại Hạn tại cung số 2");
			} else {
				System.out.println("Không đúng dữ liệu số Đại Hạn cung số 2");
			}
		}
		
		for(int k=0; k<all_ct2b.size(); k++) {
			if (all_ct2a.get(k).equalsIgnoreCase(all_ct2b.get(k))) {
				System.out.println("Đúng dữ liệu chính tinh tại cung 2");
			} else {
				System.out.println("Không đúng dữ liệu Chính Tinh tại cung 2");
			}
		}
		
		for(int k=0; k<all_tieuhan2b.size(); k++) {
			if (all_tieuhan2a.get(k).equalsIgnoreCase(all_tieuhan2b.get(k))) {
				System.out.println("Đúng dữ liệu tiểu hạn tại cung số 2");
			} else {
				System.out.println("Không đúng dữ liệu tiểu hạn tại cung số 2");
			}
		}
		
		for(int k=0; k<all_trangsinh2b.size(); k++) {
			if (all_trangsinh2a.get(k).contains(all_trangsinh2b.get(k))) {
				System.out.println("Đúng dữ liệu tràng sinh tại cung số 2");
			} else {
				System.out.println("Không đúng dữ liệu tràng sinh tại cung số 2");
			}
		}
		
		for(int k=0; k<all_hanthang2b.size();k++) {
			if (all_hanthang2a.get(k).equalsIgnoreCase(all_hanthang2b.get(k))) {
				System.out.println("Đúng dữ liệu hạn tháng tại cung số 2");
			}else {
				System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 2");
			}
		}
//==============================================CUNG SỐ 3===============================///
					System.out.println("============KẾT QUẢ CUNG SỐ 3==========");
					
					for(int k=0; k<all_cung3b.size(); k++) {
						if (all_cung3a.get(k).contains(all_cung3b.get(k))) {
							System.out.println("Đúng dữ liệu cung số 3");
						} else {
							System.out.println("không đúng dữ liệu cung số 3");
						}
					}
					
					for(int k=0; k<all_congiap3b.size(); k++) {
						if (all_congiap3a.get(k).equalsIgnoreCase(all_congiap3b.get(k))) {
							System.out.println("Đúng dữ liệu con giáp tại cung số 3");
						} else {
							System.out.println("không đúng dữ liệu con giáp tại cung số 3");
						}
					}
					
					for(int k=0; k<all_daihan3b.size(); k++) {
						if (all_daihan3a.get(k).equalsIgnoreCase(all_daihan3b.get(k))) {
							System.out.println("Đúng dữ liệu số Đại Hạn tại cung số 3");
						} else {
							System.out.println("Không đúng dữ liệu số Đại Hạn cung số 3");
						}
					}
					
					for(int k=0; k<all_ct3b.size(); k++) {
						if (all_ct3a.get(k).equalsIgnoreCase(all_ct3b.get(k))) {
							System.out.println("Đúng dữ liệu chính tinh tại cung 3");
						} else {
							System.out.println("Không đúng dữ liệu Chính Tinh tại cung 3");
						}
					}
					
					for(int k=0; k<all_tieuhan3b.size(); k++) {
						if (all_tieuhan3a.get(k).equalsIgnoreCase(all_tieuhan3b.get(k))) {
							System.out.println("Đúng dữ liệu tiểu hạn tại cung số 3");
						} else {
							System.out.println("Không đúng dữ liệu tiểu hạn tại cung số 3");
						}
					}
					
					for(int k=0; k<all_trangsinh3b.size(); k++) {
						if (all_trangsinh2a.get(k).contains(all_trangsinh3b.get(k))) {
							System.out.println("Đúng dữ liệu tràng sinh tại cung số 3");
						} else {
							System.out.println("Không đúng dữ liệu tràng sinh tại cung số 3");
						}
					}
					
					for(int k=0; k<all_hanthang3b.size();k++) {
						if (all_hanthang3a.get(k).equalsIgnoreCase(all_hanthang3b.get(k))) {
							System.out.println("Đúng dữ liệu hạn tháng tại cung số 3");
						}else {
							System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 3");
						}
					}					
//==============================================CUNG SỐ 4===============================///
					System.out.println("============KẾT QUẢ CUNG SỐ 4==========");
					
					for(int k=0; k<all_cung4b.size(); k++) {
						if (all_cung4a.get(k).contains(all_cung4b.get(k))) {
							System.out.println("Đúng dữ liệu cung số 4");
						} else {
							System.out.println("không đúng dữ liệu cung số 4");
						}
					}
					
					for(int k=0; k<all_congiap4b.size(); k++) {
						if (all_congiap4a.get(k).equalsIgnoreCase(all_congiap4b.get(k))) {
							System.out.println("Đúng dữ liệu con giáp tại cung số 4");
						} else {
							System.out.println("không đúng dữ liệu con giáp tại cung số 4");
						}
					}
					
					for(int k=0; k<all_daihan4b.size(); k++) {
						if (all_daihan4a.get(k).equalsIgnoreCase(all_daihan4b.get(k))) {
							System.out.println("Đúng dữ liệu số Đại Hạn tại cung số 4");
						} else {
							System.out.println("Không đúng dữ liệu số Đại Hạn cung số 4");
						}
					}
					
					for(int k=0; k<all_ct4b.size(); k++) {
						if (all_ct4a.get(k).equalsIgnoreCase(all_ct4b.get(k))) {
							System.out.println("Đúng dữ liệu chính tinh tại cung 4");
						} else {
							System.out.println("Không đúng dữ liệu Chính Tinh tại cung 4");
						}
					}
					
					for(int k=0; k<all_tieuhan4b.size(); k++) {
						if (all_tieuhan4a.get(k).equalsIgnoreCase(all_tieuhan4b.get(k))) {
							System.out.println("Đúng dữ liệu tiểu hạn tại cung số 4");
						} else {
							System.out.println("Không đúng dữ liệu tiểu hạn tại cung số 4");
						}
					}
					
					for(int k=0; k<all_trangsinh4b.size(); k++) {
						if (all_trangsinh4a.get(k).contains(all_trangsinh4b.get(k))) {
							System.out.println("Đúng dữ liệu tràng sinh tại cung số 4");
						} else {
							System.out.println("Không đúng dữ liệu tràng sinh tại cung số 4");
						}
					}
					
					for(int k=0; k<all_hanthang4b.size();k++) {
						if (all_hanthang4a.get(k).equalsIgnoreCase(all_hanthang4b.get(k))) {
							System.out.println("Đúng dữ liệu hạn tháng tại cung số 4");
						}else {
							System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 4");
						}
					}
					
//==============================================CUNG SỐ 5===============================///
					System.out.println("============KẾT QUẢ CUNG SỐ 5==========");
					
					for(int k=0; k<all_cung5b.size(); k++) {
						if (all_cung5a.get(k).contains(all_cung5b.get(k))) {
							System.out.println("Đúng dữ liệu cung số 5");
						} else {
							System.out.println("không đúng dữ liệu cung số 5");
						}
					}
					
					for(int k=0; k<all_congiap5b.size(); k++) {
						if (all_congiap5a.get(k).equalsIgnoreCase(all_congiap5b.get(k))) {
							System.out.println("Đúng dữ liệu con giáp tại cung số 5");
						} else {
							System.out.println("không đúng dữ liệu con giáp tại cung số 5");
						}
					}
					
					for(int k=0; k<all_daihan5b.size(); k++) {
						if (all_daihan5a.get(k).equalsIgnoreCase(all_daihan5b.get(k))) {
							System.out.println("Đúng dữ liệu số Đại Hạn tại cung số 5");
						} else {
							System.out.println("Không đúng dữ liệu số Đại Hạn cung số 5");
						}
					}
					
					for(int k=0; k<all_ct5b.size(); k++) {
						if (all_ct5a.get(k).equalsIgnoreCase(all_ct5b.get(k))) {
							System.out.println("Đúng dữ liệu chính tinh tại cung 5");
						} else {
							System.out.println("Không đúng dữ liệu Chính Tinh tại cung 5");
						}
					}
					
					for(int k=0; k<all_tieuhan5b.size(); k++) {
						if (all_tieuhan5a.get(k).equalsIgnoreCase(all_tieuhan5b.get(k))) {
							System.out.println("Đúng dữ liệu tiểu hạn tại cung số 5");
						} else {
							System.out.println("Không đúng dữ liệu tiểu hạn tại cung số 5");
						}
					}
					
					for(int k=0; k<all_trangsinh5b.size(); k++) {
						if (all_trangsinh5a.get(k).contains(all_trangsinh5b.get(k))) {
							System.out.println("Đúng dữ liệu tràng sinh tại cung số 5");
						} else {
							System.out.println("Không đúng dữ liệu tràng sinh tại cung số 5");
						}
					}
					
					for(int k=0; k<all_hanthang5b.size();k++) {
						if (all_hanthang5a.get(k).equalsIgnoreCase(all_hanthang5b.get(k))) {
							System.out.println("Đúng dữ liệu hạn tháng tại cung số 5");
						}else {
							System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 5");
						}
					}				
//==============================================CUNG SỐ 6===============================///
					System.out.println("============KẾT QUẢ CUNG SỐ 6==========");
					
					for(int k=0; k<all_cung6b.size(); k++) {
						if (all_cung6a.get(k).contains(all_cung6b.get(k))) {
							System.out.println("Đúng dữ liệu cung số 6");
						} else {
							System.out.println("không đúng dữ liệu cung số 6");
						}
					}
					
					for(int k=0; k<all_congiap6b.size(); k++) {
						if (all_congiap6a.get(k).equalsIgnoreCase(all_congiap6b.get(k))) {
							System.out.println("Đúng dữ liệu con giáp tại cung số 6");
						} else {
							System.out.println("không đúng dữ liệu con giáp tại cung số 6");
						}
					}
					
					for(int k=0; k<all_daihan6b.size(); k++) {
						if (all_daihan6a.get(k).equalsIgnoreCase(all_daihan6b.get(k))) {
							System.out.println("Đúng dữ liệu số Đại Hạn tại cung số 6");
						} else {
							System.out.println("Không đúng dữ liệu số Đại Hạn cung số 6");
						}
					}
					
					for(int k=0; k<all_ct6b.size(); k++) {
						if (all_ct6a.get(k).equalsIgnoreCase(all_ct6b.get(k))) {
							System.out.println("Đúng dữ liệu chính tinh tại cung 6");
						} else {
							System.out.println("Không đúng dữ liệu Chính Tinh tại cung 6");
						}
					}
					
					for(int k=0; k<all_tieuhan6b.size(); k++) {
						if (all_tieuhan6a.get(k).equalsIgnoreCase(all_tieuhan6b.get(k))) {
							System.out.println("Đúng dữ liệu tiểu hạn tại cung số 6");
						} else {
							System.out.println("Không đúng dữ liệu tiểu hạn tại cung số 6");
						}
					}
					
					for(int k=0; k<all_trangsinh6b.size(); k++) {
						if (all_trangsinh6a.get(k).contains(all_trangsinh6b.get(k))) {
							System.out.println("Đúng dữ liệu tràng sinh tại cung số 5");
						} else {
							System.out.println("Không đúng dữ liệu tràng sinh tại cung số 5");
						}
					}
					
					for(int k=0; k<all_hanthang6b.size();k++) {
						if (all_hanthang6a.get(k).equalsIgnoreCase(all_hanthang6b.get(k))) {
							System.out.println("Đúng dữ liệu hạn tháng tại cung số 6");
						}else {
							System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 6");
						}
					}
					
//==============================================CUNG SỐ 7===============================///
					System.out.println("============KẾT QUẢ CUNG SỐ 7==========");
					
					for(int k=0; k<all_cung7b.size(); k++) {
						if (all_cung7a.get(k).contains(all_cung7b.get(k))) {
							System.out.println("Đúng dữ liệu cung số 7");
						} else {
							System.out.println("không đúng dữ liệu cung số 7");
						}
					}
					
					for(int k=0; k<all_congiap7b.size(); k++) {
						if (all_congiap7a.get(k).equalsIgnoreCase(all_congiap7b.get(k))) {
							System.out.println("Đúng dữ liệu con giáp tại cung số 7");
						} else {
							System.out.println("không đúng dữ liệu con giáp tại cung số 7");
						}
					}
					
					for(int k=0; k<all_daihan7b.size(); k++) {
						if (all_daihan7a.get(k).equalsIgnoreCase(all_daihan7b.get(k))) {
							System.out.println("Đúng dữ liệu số Đại Hạn tại cung số 7");
						} else {
							System.out.println("Không đúng dữ liệu số Đại Hạn cung số 7");
						}
					}
					
					for(int k=0; k<all_ct7b.size(); k++) {
						if (all_ct7a.get(k).equalsIgnoreCase(all_ct7b.get(k))) {
							System.out.println("Đúng dữ liệu chính tinh tại cung 7");
						} else {
							System.out.println("Không đúng dữ liệu Chính Tinh tại cung 7");
						}
					}
					
					for(int k=0; k<all_tieuhan7b.size(); k++) {
						if (all_tieuhan7a.get(k).equalsIgnoreCase(all_tieuhan7b.get(k))) {
							System.out.println("Đúng dữ liệu tiểu hạn tại cung số 7");
						} else {
							System.out.println("Không đúng dữ liệu tiểu hạn tại cung số 7");
						}
					}
					
					for(int k=0; k<all_trangsinh7b.size(); k++) {
						if (all_trangsinh7a.get(k).contains(all_trangsinh7b.get(k))) {
							System.out.println("Đúng dữ liệu tràng sinh tại cung số 7");
						} else {
							System.out.println("Không đúng dữ liệu tràng sinh tại cung số 7");
						}
					}
					
					for(int k=0; k<all_hanthang7b.size();k++) {
						if (all_hanthang7a.get(k).equalsIgnoreCase(all_hanthang7b.get(k))) {
							System.out.println("Đúng dữ liệu hạn tháng tại cung số 7");
						}else {
							System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 7");
						}
					}
					
//==============================================CUNG SỐ 8===============================///
					System.out.println("============KẾT QUẢ CUNG SỐ 8==========");
					
					for(int k=0; k<all_cung8b.size(); k++) {
						if (all_cung8a.get(k).contains(all_cung8b.get(k))) {
							System.out.println("Đúng dữ liệu cung số 8");
						} else {
							System.out.println("không đúng dữ liệu cung số 8");
						}
					}
					
					for(int k=0; k<all_congiap8b.size(); k++) {
						if (all_congiap8a.get(k).equalsIgnoreCase(all_congiap8b.get(k))) {
							System.out.println("Đúng dữ liệu con giáp tại cung số 8");
						} else {
							System.out.println("không đúng dữ liệu con giáp tại cung số 8");
						}
					}
					
					for(int k=0; k<all_daihan8b.size(); k++) {
						if (all_daihan8a.get(k).equalsIgnoreCase(all_daihan8b.get(k))) {
							System.out.println("Đúng dữ liệu số Đại Hạn tại cung số 8");
						} else {
							System.out.println("Không đúng dữ liệu số Đại Hạn cung số 8");
						}
					}
					
					for(int k=0; k<all_ct8b.size(); k++) {
						if (all_ct8a.get(k).equalsIgnoreCase(all_ct8b.get(k))) {
							System.out.println("Đúng dữ liệu chính tinh tại cung 8");
						} else {
							System.out.println("Không đúng dữ liệu Chính Tinh tại cung 8");
						}
					}
					
					for(int k=0; k<all_tieuhan8b.size(); k++) {
						if (all_tieuhan8a.get(k).equalsIgnoreCase(all_tieuhan8b.get(k))) {
							System.out.println("Đúng dữ liệu tiểu hạn tại cung số 8");
						} else {
							System.out.println("Không đúng dữ liệu tiểu hạn tại cung số 8");
						}
					}
					
					for(int k=0; k<all_trangsinh8b.size(); k++) {
						if (all_trangsinh8a.get(k).contains(all_trangsinh8b.get(k))) {
							System.out.println("Đúng dữ liệu tràng sinh tại cung số 8");
						} else {
							System.out.println("Không đúng dữ liệu tràng sinh tại cung số 8");
						}
					}
					
					for(int k=0; k<all_hanthang8b.size();k++) {
						if (all_hanthang8a.get(k).equalsIgnoreCase(all_hanthang8b.get(k))) {
							System.out.println("Đúng dữ liệu hạn tháng tại cung số 7");
						}else {
							System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 7");
						}
					}
					
//==============================================CUNG SỐ 9===============================///
					System.out.println("============KẾT QUẢ CUNG SỐ 9==========");
					
					for(int k=0; k<all_cung9b.size(); k++) {
						if (all_cung9a.get(k).contains(all_cung9b.get(k))) {
							System.out.println("Đúng dữ liệu cung số 9");
						} else {
							System.out.println("không đúng dữ liệu cung số 9");
						}
					}
					
					for(int k=0; k<all_congiap9b.size(); k++) {
						if (all_congiap9a.get(k).equalsIgnoreCase(all_congiap9b.get(k))) {
							System.out.println("Đúng dữ liệu con giáp tại cung số 9");
						} else {
							System.out.println("không đúng dữ liệu con giáp tại cung số 9");
						}
					}
					
					for(int k=0; k<all_daihan9b.size(); k++) {
						if (all_daihan9a.get(k).equalsIgnoreCase(all_daihan9b.get(k))) {
							System.out.println("Đúng dữ liệu số Đại Hạn tại cung số 9");
						} else {
							System.out.println("Không đúng dữ liệu số Đại Hạn cung số 9");
						}
					}
					
					for(int k=0; k<all_ct9b.size(); k++) {
						if (all_ct9a.get(k).equalsIgnoreCase(all_ct9b.get(k))) {
							System.out.println("Đúng dữ liệu chính tinh tại cung 9");
						} else {
							System.out.println("Không đúng dữ liệu Chính Tinh tại cung 9");
						}
					}
					
					for(int k=0; k<all_tieuhan9b.size(); k++) {
						if (all_tieuhan9a.get(k).equalsIgnoreCase(all_tieuhan9b.get(k))) {
							System.out.println("Đúng dữ liệu tiểu hạn tại cung số 9");
						} else {
							System.out.println("Không đúng dữ liệu tiểu hạn tại cung số 9");
						}
					}
					
					for(int k=0; k<all_trangsinh9b.size(); k++) {
						if (all_trangsinh9a.get(k).contains(all_trangsinh9b.get(k))) {
							System.out.println("Đúng dữ liệu tràng sinh tại cung số 9");
						} else {
							System.out.println("Không đúng dữ liệu tràng sinh tại cung số 9");
						}
					}
					
					for(int k=0; k<all_hanthang9b.size();k++) {
						if (all_hanthang9a.get(k).equalsIgnoreCase(all_hanthang9b.get(k))) {
							System.out.println("Đúng dữ liệu hạn tháng tại cung số 9");
						}else {
							System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 9");
						}
					}
					
// ==============================================CUNG SỐ 10===============================///
					System.out.println("============KẾT QUẢ CUNG SỐ 10==========");
					
					for(int k=0; k<all_cung10b.size(); k++) {
						if (all_cung10a.get(k).contains(all_cung10b.get(k))) {
							System.out.println("Đúng dữ liệu cung số 10");
						} else {
							System.out.println("không đúng dữ liệu cung số 10");
						}
					}
					
					for(int k=0; k<all_congiap10b.size(); k++) {
						if (all_congiap10a.get(k).equalsIgnoreCase(all_congiap10b.get(k))) {
							System.out.println("Đúng dữ liệu con giáp tại cung số 10");
						} else {
							System.out.println("không đúng dữ liệu con giáp tại cung số 10");
						}
					}
					
					for(int k=0; k<all_daihan10b.size(); k++) {
						if (all_daihan10a.get(k).equalsIgnoreCase(all_daihan10b.get(k))) {
							System.out.println("Đúng dữ liệu số Đại Hạn tại cung số 10");
						} else {
							System.out.println("Không đúng dữ liệu số Đại Hạn cung số 10");
						}
					}
					
					for(int k=0; k<all_ct10b.size(); k++) {
						if (all_ct10a.get(k).equalsIgnoreCase(all_ct10b.get(k))) {
							System.out.println("Đúng dữ liệu chính tinh tại cung 10");
						} else {
							System.out.println("Không đúng dữ liệu Chính Tinh tại cung 10");
						}
					}
					
					for(int k=0; k<all_tieuhan10b.size(); k++) {
						if (all_tieuhan10a.get(k).equalsIgnoreCase(all_tieuhan10b.get(k))) {
							System.out.println("Đúng dữ liệu tiểu hạn tại cung số 10");
						} else {
							System.out.println("Không đúng dữ liệu tiểu hạn tại cung số 10");
						}
					}
					
					for(int k=0; k<all_trangsinh10b.size(); k++) {
						if (all_trangsinh10a.get(k).contains(all_trangsinh10b.get(k))) {
							System.out.println("Đúng dữ liệu tràng sinh tại cung số 10");
						} else {
							System.out.println("Không đúng dữ liệu tràng sinh tại cung số 10");
						}
					}
					
					for(int k=0; k<all_hanthang10b.size();k++) {
						if (all_hanthang10a.get(k).equalsIgnoreCase(all_hanthang10b.get(k))) {
							System.out.println("Đúng dữ liệu hạn tháng tại cung số 10");
						}else {
							System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 10");
						}
					}
					
//==============================================CUNG SỐ 11===============================///
					System.out.println("============KẾT QUẢ CUNG SỐ 11==========");
					
					for(int k=0; k<all_cung11b.size(); k++) {
						if (all_cung11a.get(k).contains(all_cung11b.get(k))) {
							System.out.println("Đúng dữ liệu cung số 11");
						} else {
							System.out.println("không đúng dữ liệu cung số 11");
						}
					}
					
					for(int k=0; k<all_congiap11b.size(); k++) {
						if (all_congiap11a.get(k).equalsIgnoreCase(all_congiap11b.get(k))) {
							System.out.println("Đúng dữ liệu con giáp tại cung số 11");
						} else {
							System.out.println("không đúng dữ liệu con giáp tại cung số 11");
						}
					}
					
					for(int k=0; k<all_daihan11b.size(); k++) {
						if (all_daihan11a.get(k).equalsIgnoreCase(all_daihan11b.get(k))) {
							System.out.println("Đúng dữ liệu số Đại Hạn tại cung số 11");
						} else {
							System.out.println("Không đúng dữ liệu số Đại Hạn cung số 11");
						}
					}
					
					for(int k=0; k<all_ct11b.size(); k++) {
						if (all_ct11a.get(k).equalsIgnoreCase(all_ct11b.get(k))) {
							System.out.println("Đúng dữ liệu chính tinh tại cung 11");
						} else {
							System.out.println("Không đúng dữ liệu Chính Tinh tại cung 11");
						}
					}
					
					for(int k=0; k<all_tieuhan11b.size(); k++) {
						if (all_tieuhan11a.get(k).equalsIgnoreCase(all_tieuhan11b.get(k))) {
							System.out.println("Đúng dữ liệu tiểu hạn tại cung số 11");
						} else {
							System.out.println("Không đúng dữ liệu tiểu hạn tại cung số 11");
						}
					}
					
					for(int k=0; k<all_trangsinh11b.size(); k++) {
						if (all_trangsinh11a.get(k).contains(all_trangsinh11b.get(k))) {
							System.out.println("Đúng dữ liệu tràng sinh tại cung số 11");
						} else {
							System.out.println("Không đúng dữ liệu tràng sinh tại cung số 11");
						}
					}
					
					for(int k=0; k<all_hanthang11b.size();k++) {
						if (all_hanthang11a.get(k).equalsIgnoreCase(all_hanthang11b.get(k))) {
							System.out.println("Đúng dữ liệu hạn tháng tại cung số 11");
						}else {
							System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 11");
						}
					}
					
//==============================================CUNG SỐ 12===============================///
					System.out.println("============KẾT QUẢ CUNG SỐ 12==========");
					
					for(int k=0; k<all_cung12b.size(); k++) {
						if (all_cung12a.get(k).contains(all_cung12b.get(k))) {
							System.out.println("Đúng dữ liệu cung số 12");
						} else {
							System.out.println("không đúng dữ liệu cung số 12");
						}
					}
					
					for(int k=0; k<all_congiap12b.size(); k++) {
						if (all_congiap12a.get(k).equalsIgnoreCase(all_congiap12b.get(k))) {
							System.out.println("Đúng dữ liệu con giáp tại cung số 12");
						} else {
							System.out.println("không đúng dữ liệu con giáp tại cung số 12");
						}
					}
					
					for(int k=0; k<all_daihan12b.size(); k++) {
						if (all_daihan12a.get(k).equalsIgnoreCase(all_daihan12b.get(k))) {
							System.out.println("Đúng dữ liệu số Đại Hạn tại cung số 12");
						} else {
							System.out.println("Không đúng dữ liệu số Đại Hạn cung số 12");
						}
					}
					//String all_ct12a_string = all_ct12a.stream().collect(Collectors.joining(","));// nối mảng lại với nhau thành chuỗi
					//String all_ct12b_string = all_ct12b.stream().collect(Collectors.joining(","));
					for(int k=0; k<all_ct12b.size(); k++) {
						if (all_ct12a.get(k).equalsIgnoreCase(all_ct12b.get(k))) {
							System.out.println("Đúng dữ liệu chính tinh tại cung 12");
						} else {
							System.out.println("Không đúng dữ liệu Chính Tinh tại cung 12");
						}
					}
					
					for(int k=0; k<all_tieuhan12b.size(); k++) {
						if (all_tieuhan12a.get(k).equalsIgnoreCase(all_tieuhan12b.get(k))) {
							System.out.println("Đúng dữ liệu tiểu hạn tại cung số 12");
						} else {
							System.out.println("Không đúng dữ liệu tiểu hạn tại cung số 12");
						}
					}
					
					for(int k=0; k<all_trangsinh12b.size(); k++) {
						if (all_trangsinh12a.get(k).contains(all_trangsinh12b.get(k))) {
							System.out.println("Đúng dữ liệu tràng sinh tại cung số 12");
						} else {
							System.out.println("Không đúng dữ liệu tràng sinh tại cung số 12");
						}
					}
					
					for(int k=0; k<all_hanthang12b.size();k++) {
						if (all_hanthang12a.get(k).equalsIgnoreCase(all_hanthang12b.get(k))) {
							System.out.println("Đúng dữ liệu hạn tháng tại cung số 12");
						}else {
							System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 12");
						}
					}
	}
	
	public static void run2() {
		Setup();
		
		driver.get("http://134.209.106.223:7790/horoscope");
		driver.findElement(By.id("full_name")).sendKeys(hoten);
		sleepInSecond(1);
		
		JavascriptExecutor jsExcutor = (JavascriptExecutor) driver;
		jsExcutor.executeScript("document.getElementById('female').checked=true");
		
		Calendar calendar = Calendar.getInstance(); 
		calendar.set(1950, Calendar.DECEMBER, 30);
		int date = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH);
	
		int year = calendar.get(Calendar.YEAR);

		for(int i=0; i<4; i++) {	
		
			for (int j=0; j<=23; j++) {
				if(j%2==0) {
					new Select(driver.findElement(By.name("hour"))).selectByIndex(j);
					sleepInSecond(1);
					new Select(driver.findElement(By.name("year"))).selectByIndex(2023 - year);
					new Select(driver.findElement(By.name("month"))).selectByIndex(month);
					new Select(driver.findElement(By.name("day"))).selectByIndex(date-1);
					sleepInSecond(1);
					driver.findElement(By.xpath("//a[@class='btn btn-warning text-white']")).click();
					sleepInSecond(1);
				}else {
					continue;
				}
			}			

			if( month == 11 && date==31) {
				year++;
			}
							
			if(date == calendar.getActualMaximum(Calendar.DAY_OF_MONTH)) {
				if(month!=11) {
					month=month+1;
				}else {
					month = 0;
				}
				date = 0;			
			}

			calendar.set(year, month, date);
			
			date++;
		}	
	}
}
