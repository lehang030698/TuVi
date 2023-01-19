package Tuvi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Initization.Init_1;

public class SosanhDulieu extends Init_1 {

	
	private static String ct2aText;
	private static String ct2bText;
	private static String ct3aText;
	private static String ct3bText;
	private static String ct4aText;
	private static String ct4bText;
	private static String ct5aText;
	private static String ct5bText;
	private static String ct6aText;
	private static String ct6bText;
	private static String ct7aText;
	private static String ct7bText;
	private static String ct8aText;
	private static String ct8bText;
	private static String ct9aText;
	private static String ct9bText;
	private static String ct10aText;
	private static String ct10bText;
	private static String ct11aText;
	private static String ct11bText;
	private static String ct12aText;
	private static String ct12bText;

	// public static String amDuongText;

	public static void main(String[] args) {
		Setup();
		Dulieutrungtam();
		dulieucung1();
//		dulieucung2();
//		dulieucung3();
//		dulieucung4();
//		dulieucung5();
//		dulieucung6();
//		dulieucung7();
//		dulieucung8();
//		dulieucung9();
//		dulieucung10();
//		dulieucung11();
//		dulieucung12();
	}
	
	public static void Dulieutrungtam() {
		nhapDataXemVanMenh();	
		WebElement ten = driver.findElement(By.xpath("//tr[@class='mb_color_hoten']/td[2]"));
		if (ten.getText().equals(hoten)) {
			System.out.println("Hiển thị đúng tên so với lúc tên nhập");
		} else {
			System.out.println("Tên hiển thị không đúng so với lúc nhập tên");
		}

		WebElement amDuong = driver
				.findElement(By.xpath("//label[contains(text(),'Âm dương')]/parent::td/following-sibling::td"));
		String amDuongText = amDuong.getText();
		System.out.println("Âm dương: " + amDuongText);

		WebElement menh = driver
				.findElement(By.xpath("//label[contains(text(),'Mệnh')]/parent::td/following-sibling::td"));
		String menhText = menh.getText();

		WebElement cuc = driver
				.findElement(By.xpath("//label[contains(text(),'Cục')]/parent::td/following-sibling::td"));
		String cucText = cuc.getText();

		WebElement chuMenh = driver
				.findElement(By.xpath("//label[contains(text(),'Chủ mệnh')]/parent::td/following-sibling::td"));
		String chuMenhText = chuMenh.getText();

		WebElement chuThan = driver
				.findElement(By.xpath("//label[contains(text(),'Chủ thân')]/parent::td/following-sibling::td"));
		String chuThanText = chuThan.getText();

		WebElement heSoAmDuong = driver.findElement(By.xpath("//section[@class='trungtam_bot']//h6[1]//b"));
		String heSoAmDuongText = heSoAmDuong.getText();

		WebElement menhCuc = driver.findElement(By.xpath("//section[@class='trungtam_bot']//h6[2]//b"));
		String menhCucText = menhCuc.getText();

		WebElement than = driver.findElement(By.xpath("//section[@class='trungtam_bot']//h6[3]//b"));
		String thanText = than.getText();

		// ------------------------WEB TỬ VI CHÂN CỔ-------------//
		nhapDataTuViChanCo();
		WebElement amDuong2 = driver.findElement(By.xpath("//th[text()='Âm dương']/parent::tr/td"));
		String amDuong2Text = amDuong2.getText();
//		System.out.println(amDuong2Text);
		if (amDuong2Text.equalsIgnoreCase(amDuongText)) {
			System.out.println("Dữ liệu Âm dương đã lấy đúng");
		} else {
			System.out.println("lấy k đúng");
		}

		WebElement menh2 = driver.findElement(By.xpath("//th[text()='Mệnh']/parent::tr/td"));
		String menh2Text = menh2.getText();

		if (menh2Text.equalsIgnoreCase(menhText)) {
			System.out.println("Dữ liệu Mệnh đã lấy đúng");
		} else {
			System.out.println("lấy k đúng");
		}

		WebElement cuc2 = driver.findElement(By.xpath("//th[text()='Cục']/parent::tr/td"));
		String cuc2Text = cuc2.getText();

		if (cuc2Text.equalsIgnoreCase(cucText)) {
			System.out.println("Dữ liệu Cục lấy đúng");
		} else {
			System.out.println("lấy k đúng");
		}

		WebElement chumenh2 = driver.findElement(By.xpath("//th[text()='Chủ Mệnh']/parent::tr/td"));
		String chumenh2Text = chumenh2.getText();

		if (chumenh2Text.equalsIgnoreCase(chuMenhText)) {
			System.out.println("Dữ liệu chủ mệnh đã lấy đúng");
		} else {
			System.out.println("lấy k đúng");
		}

		WebElement chuThan2 = driver.findElement(By.xpath("//th[text()='Chủ Thân']/parent::tr/td"));
		String chuThan2Text = chuThan2.getText();

		if (chuThan2Text.equalsIgnoreCase(chuThanText)) {
			System.out.println("Dữ liệu Chủ Thân đã giống nhau");
		} else {
			System.out.println("lấy k đúng");
		}

		WebElement heSoAmDuong2 = driver.findElement(By.xpath("//table[@class='sub-table-center']//tbody//tr[12]/th"));
		String heSoAmDuong2Text = heSoAmDuong2.getText();

		if (heSoAmDuong2Text.equalsIgnoreCase(heSoAmDuongText)) {
			System.out.println("Hệ số âm dương đã lấy đúng");
		} else {
			System.out.println("lấy k đúng");
		}

		WebElement menhCuc2 = driver.findElement(By.xpath("//table[@class='sub-table-center']//tbody//tr[13]/th"));
		String menhCuc2Text = menhCuc2.getText();

		if (menhCuc2Text.equalsIgnoreCase(menhCucText)) {
			System.out.println("Mệnh cục lấy đúng");
		} else {
			System.out.println("lấy k đúng");
		}

		WebElement than2 = driver.findElement(By.xpath("//table[@class='sub-table-center']//tbody//tr[14]/td"));
		String than2Text = than2.getText();

		if (than2Text.equalsIgnoreCase(thanText)) {
			System.out.println("Thân cư lấy đúng");
		} else {
			System.out.println("lấy k đúng");
		}
	}

	public static void dulieucung1() {
		nhapDataXemVanMenh();

		WebElement cungso1a = driver.findElement(
				By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//span[@class='c_cung']"));
		String cungso1aText = cungso1a.getText();

		WebElement conGiap1a = driver
				.findElement(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='c_giap']"));
		String conGiap1aText = conGiap1a.getText();

		WebElement daiHan1a = driver
				.findElement(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='daihan']"));
		String daiHan1aText = daiHan1a.getText();
		

		List<WebElement> chinhTinh1a = driver.findElements(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//p"));
		
		List<String> all_ct1a = new ArrayList<>();
		for (int i=0; i<chinhTinh1a.size(); i++) {
			all_ct1a.add(chinhTinh1a.get(i).getText().toLowerCase());
		}
		
		Collections.sort(all_ct1a);
		

		WebElement tieuHan1a = driver.findElement(
				By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='tieu_han']"));
		String tieuhan1aText = tieuHan1a.getText();

		WebElement trangSinh1a = driver.findElement(
				By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='truong_sinh']"));
		String Trangsinh1aText = trangSinh1a.getText();

		WebElement hanThang1a = driver.findElement(
				By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//div[@class='han_thang']"));

		String hanThang1aText = hanThang1a.getText();

//		List <WebElement> saotot1 = driver.findElements(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//ul[@class='sao_left']//li//span"));
//		for (WebElement st1 : saotot1) {	
//			System.out.println(st1.getText());
//		}
//		
//		System.out.println("Danh sách sao xấu: ");
//		List <WebElement> saoxau1 = driver.findElements(By.xpath("//div[@class='cung cung_1']//div[@class='cung_content']//ul[@class='sao_right ul_saoright']//li//span"));
//		for (WebElement sx1 : saoxau1) {
//				
//		}

//----------------------------------------//---------------------------//
		nhapDataTuViChanCo();

		WebElement cungso1b = driver.findElement(By.xpath("//tbody/tr[4]/td[3]/div/div[1]/div/div[2]/div"));
		String cungso1bText = cungso1b.getText();

		if (cungso1aText.contains(cungso1bText)) {
			System.out.println("Đúng dữ liệu lấy cung");
		} else {
			System.out.println("không đúng dữ liệu");
		}

		WebElement conGiapSo1b = driver.findElement(By.xpath("//tbody/tr[4]/td[3]/div/div[1]/div/div[1]"));
		String conGiapSo1bText = conGiapSo1b.getText();
		if (conGiap1aText.equalsIgnoreCase(conGiapSo1bText)) {
			System.out.println("Đúng dữ liệu con giáp");
		} else {
			System.out.println("không đúng dữ liệu");
		}

		WebElement soDaiHan1b = driver.findElement(By.xpath("//tbody/tr[4]/td[3]/div/div[1]/div/div[3]"));
		String soDaiHan1bText = soDaiHan1b.getText();
		if (daiHan1aText.equalsIgnoreCase(soDaiHan1bText)) {
			System.out.println("Đúng dữ liệu số đại hạn");
		} else {
			System.out.println("không đúng dữ liệu");
		}

		List<WebElement> chinhTinh1b = driver.findElements(By.xpath("//tbody/tr[4]/td[3]/div/div[1]/div/div[2]/p"));
		
		List<String> all_ct1b = new ArrayList<>();
		for (int i=0; i<chinhTinh1b.size(); i++) {
			all_ct1b.add(chinhTinh1b.get(i).getText().toLowerCase());
		}
		 
		Collections.sort(all_ct1b);
		
		String all_ct1a_string = all_ct1a.stream().collect(Collectors.joining(","));
		String all_ct1b_string = all_ct1b.stream().collect(Collectors.joining(","));
		System.out.println("============================================");
		if(all_ct1a_string.equals(all_ct1b_string)) {
			System.out.println("Dữ liệu chính tinh đúng");
		}
		
		
		// toLowerCase() chuyển chữ hoa về chữ thường
//		if (ct1bText.toLowerCase().contains(ct1aText.toLowerCase())) {
//			System.out.println("Đúng dữ liệu chính tinh");
//		} else {
//			System.out.println("không đúng dữ liệu");
//		}
		WebElement tieuHan1b = driver.findElement(By.xpath("//tbody/tr[4]/td[3]/div/div[3]/div[1]"));
		String tieuHan1bText = tieuHan1b.getText();

		if (tieuHan1bText.equalsIgnoreCase(tieuhan1aText)) {
			System.out.println("Đúng dữ liệu tiểu hạn");
		} else {
			System.out.println("Không Đúng dữ liệu tiểu hạn");
		}

		WebElement trangSinh1b = driver.findElement(By.xpath("//tbody/tr[4]/td[3]/div/div[3]/div[2]"));
		String trangSinh1bText = trangSinh1b.getText();

		if (trangSinh1bText.equalsIgnoreCase(Trangsinh1aText)) {
			System.out.println("Đúng dữ liệu vòng tràng Sinh");
		} else {
			System.out.println("Không Đúng dữ liệu vòng tràng Sinh");
		}

		WebElement hanThang1b = driver.findElement(By.xpath("//tbody/tr[4]/td[3]/div/div[3]/div[3]"));
		String hanThang1bText = hanThang1b.getText();

		if (hanThang1aText.equalsIgnoreCase(hanThang1bText)) {
			System.out.println("Đúng dữ liệu hạn tháng");
		} else {
			System.out.println(" Không Đúng dữ liệu hạn tháng");
		}

	}

	public static void dulieucung2() {
		nhapDataXemVanMenh();

		WebElement cungso2a = driver.findElement(
				By.xpath("//div[@class='cung cung_2']//div[@class='cung_content']//span[@class='c_cung']"));
		String cungso2aText = cungso2a.getText();

		WebElement conGiap2a = driver
				.findElement(By.xpath("//div[@class='cung cung_2']//div[@class='cung_content']//div[@class='c_giap']"));
		String conGiap2aText = conGiap2a.getText();

		WebElement daiHan2a = driver
				.findElement(By.xpath("//div[@class='cung cung_2']//div[@class='cung_content']//div[@class='daihan']"));
		String daiHan2aText = daiHan2a.getText();

		List<WebElement> chinhTinh2a = driver
				.findElements(By.xpath("//div[@class='cung cung_2']//div[@class='cung_content']//p"));
		for (WebElement ct2a : chinhTinh2a) {
			ct2aText = ct2a.getText();
		}

		WebElement tieuHan2a = driver.findElement(
				By.xpath("//div[@class='cung cung_2']//div[@class='cung_content']//div[@class='tieu_han']"));
		String tieuhan2aText = tieuHan2a.getText();

		WebElement trangSinh2a = driver.findElement(
				By.xpath("//div[@class='cung cung_2']//div[@class='cung_content']//div[@class='truong_sinh']"));
		String Trangsinh2aText = trangSinh2a.getText();

		WebElement hanThang2a = driver.findElement(
				By.xpath("//div[@class='cung cung_2']//div[@class='cung_content']//div[@class='han_thang']"));

		String hanThang2aText = hanThang2a.getText();

//----------------------------------------//---------------------------//
		nhapDataTuViChanCo();

		WebElement cungso2b = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div/div[1]/div/div[2]/div"));
		String cungso2bText = cungso2b.getText();

		if (cungso2aText.contains(cungso2bText)) {
			System.out.println("Đúng dữ liệu lấy cung tại cung số 2");
		} else {
			System.out.println("không đúng dữ liệu");
		}

		WebElement conGiapSo2b = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div/div[1]/div/div[1]"));
		String conGiapSo2bText = conGiapSo2b.getText();
		if (conGiap2aText.equalsIgnoreCase(conGiapSo2bText)) {
			System.out.println("Đúng dữ liệu con giáp cung số 2");
		} else {
			System.out.println("không đúng dữ liệu");
		}

		WebElement soDaiHan2b = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div/div[1]/div/div[3]"));
		String soDaiHan2bText = soDaiHan2b.getText();
		if (daiHan2aText.equalsIgnoreCase(soDaiHan2bText)) {
			System.out.println("Đúng dữ liệu số đại hạn ở cung số 2");
		} else {
			System.out.println("không đúng dữ liệu");
		}

		List<WebElement> chinhTinh2b = driver.findElements(By.xpath("//tbody/tr[4]/td[2]/div/div[1]/div/div[2]/p"));
		for (WebElement ct1b : chinhTinh2b) {
			ct2bText = ct1b.getText();
		}

		// toLowerCase() chuyển chữ hoa về chữ thường
		if (ct2bText.toLowerCase().contains(ct2aText.toLowerCase())) {
			System.out.println("Đúng dữ liệu chính tinh ở cung số 2");
		} else {
			System.out.println("không đúng dữ liệu");
		}
		WebElement tieuHan2b = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div/div[3]/div[1]"));
		String tieuHan2bText = tieuHan2b.getText();

		if (tieuHan2bText.equalsIgnoreCase(tieuhan2aText)) {
			System.out.println("Đúng dữ liệu tiểu hạn tại sung số 2");
		} else {
			System.out.println("Không Đúng dữ liệu tiểu hạn");
		}

		WebElement trangSinh2b = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div/div[3]/div[2]"));
		String trangSinh2bText = trangSinh2b.getText();

		if (trangSinh2bText.equalsIgnoreCase(Trangsinh2aText)) {
			System.out.println("Đúng dữ liệu vòng tràng Sinh ở cung số 2");
		} else {
			System.out.println("Không Đúng dữ liệu vòng tràng Sinh");
		}

		WebElement hanThang2b = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div/div[3]/div[3]"));
		String hanThang2bText = hanThang2b.getText();

		if (hanThang2aText.equalsIgnoreCase(hanThang2bText)) {
			System.out.println("Đúng dữ liệu hạn tháng cung số 2");
		} else {
			System.out.println(" Không Đúng dữ liệu hạn tháng");
		}

	}

	public static void dulieucung3() {
		nhapDataXemVanMenh();

		WebElement cungso3a = driver.findElement(
				By.xpath("//div[@class='cung cung_3']//div[@class='cung_content']//span[@class='c_cung']"));
		String cungso3aText = cungso3a.getText();

		WebElement conGiap3a = driver
				.findElement(By.xpath("//div[@class='cung cung_3']//div[@class='cung_content']//div[@class='c_giap']"));
		String conGiap3aText = conGiap3a.getText();

		WebElement daiHan3a = driver
				.findElement(By.xpath("//div[@class='cung cung_3']//div[@class='cung_content']//div[@class='daihan']"));
		String daiHan3aText = daiHan3a.getText();

		List<WebElement> chinhTinh3a = driver
				.findElements(By.xpath("//div[@class='cung cung_3']//div[@class='cung_content']//p"));
		for (WebElement ct3a : chinhTinh3a) {
			ct3aText = ct3a.getText();
		}

		WebElement tieuHan3a = driver.findElement(
				By.xpath("//div[@class='cung cung_3']//div[@class='cung_content']//div[@class='tieu_han']"));
		String tieuhan3aText = tieuHan3a.getText();

		WebElement trangSinh3a = driver.findElement(
				By.xpath("//div[@class='cung cung_3']//div[@class='cung_content']//div[@class='truong_sinh']"));
		String Trangsinh3aText = trangSinh3a.getText();

		WebElement hanThang3a = driver.findElement(
				By.xpath("//div[@class='cung cung_3']//div[@class='cung_content']//div[@class='han_thang']"));

		String hanThang3aText = hanThang3a.getText();

//----------------------------------------//---------------------------//
		nhapDataTuViChanCo();

		WebElement cungso3b = driver.findElement(By.xpath("//tbody/tr[4]/td[1]/div/div[1]/div/div[2]/div"));
		String cungso3bText = cungso3b.getText();

		if (cungso3aText.contains(cungso3bText)) {
			System.out.println("Đúng dữ liệu lấy cung tại cung số 3");
		} else {
			System.out.println("không đúng dữ liệu");
		}

		WebElement conGiapSo3b = driver.findElement(By.xpath("//tbody/tr[4]/td[1]/div/div[1]/div/div[1]"));
		String conGiapSo3bText = conGiapSo3b.getText();
		if (conGiap3aText.equalsIgnoreCase(conGiapSo3bText)) {
			System.out.println("Đúng dữ liệu con giáp cung số 3");
		} else {
			System.out.println("Không đúng dữ liệu");
		}

		WebElement soDaiHan3b = driver.findElement(By.xpath("//tbody/tr[4]/td[1]/div/div[1]/div/div[3]"));
		String soDaiHan3bText = soDaiHan3b.getText();
		if (daiHan3aText.equalsIgnoreCase(soDaiHan3bText)) {
			System.out.println("Đúng dữ liệu số đại hạn ở cung số 3");
		} else {
			System.out.println("không đúng dữ liệu");
		}

		List<WebElement> chinhTinh3b = driver.findElements(By.xpath("//tbody/tr[4]/td[1]/div/div[1]/div/div[2]/p"));
		for (WebElement ct3b : chinhTinh3b) {
			ct3bText = ct3b.getText();
		}

		// toLowerCase() chuyển chữ hoa về chữ thường
		if (ct3bText.toLowerCase().contains(ct3aText.toLowerCase())) {
			System.out.println("Đúng dữ liệu chính tinh ở cung số 3");
		} else {
			System.out.println("không đúng dữ liệu");
		}
		WebElement tieuHan3b = driver.findElement(By.xpath("//tbody/tr[4]/td[1]/div/div[3]/div[1]"));
		String tieuHan3bText = tieuHan3b.getText();

		if (tieuHan3bText.equalsIgnoreCase(tieuhan3aText)) {
			System.out.println("Đúng dữ liệu tiểu hạn tại sung số 3");
		} else {
			System.out.println("Không Đúng dữ liệu tiểu hạn");
		}

		WebElement trangSinh3b = driver.findElement(By.xpath("//tbody/tr[4]/td[1]/div/div[3]/div[2]"));
		String trangSinh3bText = trangSinh3b.getText();

		if (trangSinh3bText.equalsIgnoreCase(Trangsinh3aText)) {
			System.out.println("Đúng dữ liệu vòng tràng Sinh ở cung số 3");
		} else {
			System.out.println("Không Đúng dữ liệu vòng tràng Sinh");
		}

		WebElement hanThang3b = driver.findElement(By.xpath("//tbody/tr[4]/td[1]/div/div[3]/div[3]"));
		String hanThang3bText = hanThang3b.getText();

		if (hanThang3aText.equalsIgnoreCase(hanThang3bText)) {
			System.out.println("Đúng dữ liệu hạn tháng cung số 3");
		} else {
			System.out.println(" Không Đúng dữ liệu hạn tháng");
		}

	}

	public static void dulieucung4() {
		nhapDataXemVanMenh();

		WebElement cungso4a = driver.findElement(
				By.xpath("//div[@class='cung cung_4']//div[@class='cung_content']//span[@class='c_cung']"));
		String cungso4aText = cungso4a.getText();

		WebElement conGiap4a = driver
				.findElement(By.xpath("//div[@class='cung cung_4']//div[@class='cung_content']//div[@class='c_giap']"));
		String conGiap4aText = conGiap4a.getText();

		WebElement daiHan4a = driver
				.findElement(By.xpath("//div[@class='cung cung_4']//div[@class='cung_content']//div[@class='daihan']"));
		String daiHan4aText = daiHan4a.getText();

		List<WebElement> chinhTinh4a = driver
				.findElements(By.xpath("//div[@class='cung cung_4']//div[@class='cung_content']//p"));
		for (WebElement ct4a : chinhTinh4a) {
			ct4aText = ct4a.getText();
		}

		WebElement tieuHan4a = driver.findElement(
				By.xpath("//div[@class='cung cung_4']//div[@class='cung_content']//div[@class='tieu_han']"));
		String tieuhan4aText = tieuHan4a.getText();

		WebElement trangSinh4a = driver.findElement(
				By.xpath("//div[@class='cung cung_4']//div[@class='cung_content']//div[@class='truong_sinh']"));
		String Trangsinh4aText = trangSinh4a.getText();

		WebElement hanThang4a = driver.findElement(
				By.xpath("//div[@class='cung cung_4']//div[@class='cung_content']//div[@class='han_thang']"));

		String hanThang4aText = hanThang4a.getText();

//----------------------------------------//---------------------------//
		nhapDataTuViChanCo();

		WebElement cungso4b = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div/div[1]/div/div[2]/div"));
		String cungso4bText = cungso4b.getText();

		if (cungso4aText.contains(cungso4bText)) {
			System.out.println("Đúng dữ liệu lấy cung tại cung số 4");
		} else {
			System.out.println("không đúng dữ liệu");
		}

		WebElement conGiapSo4b = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div/div[1]/div/div[1]"));
		String conGiapSo4bText = conGiapSo4b.getText();
		if (conGiap4aText.equalsIgnoreCase(conGiapSo4bText)) {
			System.out.println("Đúng dữ liệu con giáp cung số 4");
		} else {
			System.out.println("Không đúng dữ liệu con giáp tại cung số 4 ");
		}

		WebElement soDaiHan4b = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div/div[1]/div/div[3]"));
		String soDaiHan4bText = soDaiHan4b.getText();
		if (daiHan4aText.equalsIgnoreCase(soDaiHan4bText)) {
			System.out.println("Đúng dữ liệu số đại hạn ở cung số 4");
		} else {
			System.out.println("không đúng dữ liệu");
		}

		List<WebElement> chinhTinh4b = driver.findElements(By.xpath("//tbody/tr[3]/td[1]/div/div[1]/div/div[2]/p"));
		for (WebElement ct4b : chinhTinh4b) {
			ct4bText = ct4b.getText();
		}

		// toLowerCase() chuyển chữ hoa về chữ thường
		if (ct4bText.toLowerCase().contains(ct4aText.toLowerCase())) {
			System.out.println("Đúng dữ liệu chính tinh ở cung số 4");
		} else {
			System.out.println("không đúng dữ liệu");
		}

		WebElement tieuHan4b = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div/div[3]/div[1]"));
		String tieuHan4bText = tieuHan4b.getText();

		if (tieuHan4bText.equalsIgnoreCase(tieuhan4aText)) {
			System.out.println("Đúng dữ liệu tiểu hạn tại sung số 4");
		} else {
			System.out.println("Không Đúng dữ liệu tiểu hạn");
		}

		WebElement trangSinh4b = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div/div[3]/div[2]"));
		String trangSinh4bText = trangSinh4b.getText();

		if (trangSinh4bText.equalsIgnoreCase(Trangsinh4aText)) {
			System.out.println("Đúng dữ liệu vòng tràng Sinh ở cung số 4");
		} else {
			System.out.println("Không Đúng dữ liệu vòng tràng Sinh");
		}

		WebElement hanThang4b = driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div/div[3]/div[3]"));
		String hanThang4bText = hanThang4b.getText();

		if (hanThang4aText.equalsIgnoreCase(hanThang4bText)) {
			System.out.println("Đúng dữ liệu hạn tháng cung số 4");
		} else {
			System.out.println(" Không Đúng dữ liệu hạn tháng");
		}

	}

	public static void dulieucung5() {
		nhapDataXemVanMenh();

		WebElement cungso5a = driver.findElement(
				By.xpath("//div[@class='cung cung_5']//div[@class='cung_content']//span[@class='c_cung']"));
		String cungso5aText = cungso5a.getText();

		WebElement conGiap5a = driver
				.findElement(By.xpath("//div[@class='cung cung_5']//div[@class='cung_content']//div[@class='c_giap']"));
		String conGiap5aText = conGiap5a.getText();

		WebElement daiHan5a = driver
				.findElement(By.xpath("//div[@class='cung cung_5']//div[@class='cung_content']//div[@class='daihan']"));
		String daiHan5aText = daiHan5a.getText();

		List<WebElement> chinhTinh5a = driver
				.findElements(By.xpath("//div[@class='cung cung_5']//div[@class='cung_content']//p"));
		for (WebElement ct5a : chinhTinh5a) {
			ct5aText = ct5a.getText();
		}

		WebElement tieuHan5a = driver.findElement(
				By.xpath("//div[@class='cung cung_5']//div[@class='cung_content']//div[@class='tieu_han']"));
		String tieuhan5aText = tieuHan5a.getText();

		WebElement trangSinh5a = driver.findElement(
				By.xpath("//div[@class='cung cung_5']//div[@class='cung_content']//div[@class='truong_sinh']"));
		String Trangsinh5aText = trangSinh5a.getText();

		WebElement hanThang5a = driver.findElement(
				By.xpath("//div[@class='cung cung_5']//div[@class='cung_content']//div[@class='han_thang']"));

		String hanThang5aText = hanThang5a.getText();

//----------------------------------------//---------------------------//
		nhapDataTuViChanCo();

		WebElement cungso5b = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/div[1]/div/div[2]/div"));
		String cungso5bText = cungso5b.getText();

		if (cungso5aText.contains(cungso5bText)) {
			System.out.println("Đúng dữ liệu lấy cung tại cung số 5");
		} else {
			System.out.println("không đúng dữ liệu");
		}

		WebElement conGiapSo5b = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/div[1]/div/div[1]"));
		String conGiapSo5bText = conGiapSo5b.getText();
		if (conGiap5aText.equalsIgnoreCase(conGiapSo5bText)) {
			System.out.println("Đúng dữ liệu con giáp cung số 5");
		} else {
			System.out.println("Không đúng dữ liệu");
		}

		WebElement soDaiHan5b = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/div[1]/div/div[3]"));
		String soDaiHan5bText = soDaiHan5b.getText();
		if (daiHan5aText.equalsIgnoreCase(soDaiHan5bText)) {
			System.out.println("Đúng dữ liệu số đại hạn ở cung số 5");
		} else {
			System.out.println("không đúng dữ liệu");
		}

		List<WebElement> chinhTinh5b = driver.findElements(By.xpath("//tbody/tr[2]/td[1]/div/div[1]/div/div[2]/p"));
		for (WebElement ct5b : chinhTinh5b) {
			ct5bText = ct5b.getText();
		}

		// toLowerCase() chuyển chữ hoa về chữ thường
		if (ct5bText.toLowerCase().contains(ct5aText.toLowerCase())) {
			System.out.println("Đúng dữ liệu chính tinh ở cung số 5");
		} else {
			System.out.println("không đúng dữ liệu");
		}
		WebElement tieuHan5b = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/div[3]/div[1]"));
		String tieuHan5bText = tieuHan5b.getText();

		if (tieuHan5bText.equalsIgnoreCase(tieuhan5aText)) {
			System.out.println("Đúng dữ liệu tiểu hạn tại sung số 5");
		} else {
			System.out.println("Không Đúng dữ liệu tiểu hạn");
		}

		WebElement trangSinh5b = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/div[3]/div[2]"));
		String trangSinh5bText = trangSinh5b.getText();

		if (trangSinh5bText.equalsIgnoreCase(Trangsinh5aText)) {
			System.out.println("Đúng dữ liệu vòng tràng Sinh ở cung số 5");
		} else {
			System.out.println("Không Đúng dữ liệu vòng tràng Sinh cung số 5");
		}

		WebElement hanThang5b = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/div[3]/div[3]"));
		String hanThang5bText = hanThang5b.getText();

		if (hanThang5aText.equalsIgnoreCase(hanThang5bText)) {
			System.out.println("Đúng dữ liệu hạn tháng cung số 5");
		} else {
			System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 5");
		}

	}

	public static void dulieucung6() {
		nhapDataXemVanMenh();

		WebElement cungso6a = driver.findElement(
				By.xpath("//div[@class='cung cung_6']//div[@class='cung_content']//span[@class='c_cung']"));
		String cungso6aText = cungso6a.getText();

		WebElement conGiap6a = driver
				.findElement(By.xpath("//div[@class='cung cung_6']//div[@class='cung_content']//div[@class='c_giap']"));
		String conGiap6aText = conGiap6a.getText();

		WebElement daiHan6a = driver
				.findElement(By.xpath("//div[@class='cung cung_6']//div[@class='cung_content']//div[@class='daihan']"));
		String daiHan6aText = daiHan6a.getText();

		List<WebElement> chinhTinh6a = driver
				.findElements(By.xpath("//div[@class='cung cung_6']//div[@class='cung_content']//p"));
		for (WebElement ct6a : chinhTinh6a) {
			 ct6aText = ct6a.getText();
		}

		WebElement tieuHan6a = driver.findElement(
				By.xpath("//div[@class='cung cung_6']//div[@class='cung_content']//div[@class='tieu_han']"));
		String tieuhan6aText = tieuHan6a.getText();

		WebElement trangSinh6a = driver.findElement(
				By.xpath("//div[@class='cung cung_6']//div[@class='cung_content']//div[@class='truong_sinh']"));
		String Trangsinh6aText = trangSinh6a.getText();

		WebElement hanThang6a = driver.findElement(
				By.xpath("//div[@class='cung cung_6']//div[@class='cung_content']//div[@class='han_thang']"));

		String hanThang6aText = hanThang6a.getText();

//----------------------------------------//---------------------------//
		nhapDataTuViChanCo();

		WebElement cungso6b = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/div[1]/div/div[2]/div"));
		String cungso6bText = cungso6b.getText();

		if (cungso6aText.contains(cungso6bText)) {
			System.out.println("Đúng dữ liệu lấy cung tại cung số 6");
		} else {
			System.out.println("không đúng dữ liệu");
		}

		WebElement conGiapSo6b = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/div[1]/div/div[1]"));
		String conGiapSo6bText = conGiapSo6b.getText();
		if (conGiap6aText.equalsIgnoreCase(conGiapSo6bText)) {
			System.out.println("Đúng dữ liệu con giáp cung số 6");
		} else {
			System.out.println("Không đúng dữ liệu con giáp tại cung số 6");
		}

		WebElement soDaiHan6b = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/div[1]/div/div[3]"));
		String soDaiHan6bText = soDaiHan6b.getText();
		if (daiHan6aText.equalsIgnoreCase(soDaiHan6bText)) {
			System.out.println("Đúng dữ liệu số đại hạn ở cung số 6");
		} else {
			System.out.println("không đúng dữ liệu số đại hạn ở cung số 6");
		}

		List<WebElement> chinhTinh6b = driver.findElements(By.xpath("//tbody/tr[1]/td[1]/div/div[1]/div/div[2]/p"));
		for (WebElement ct6b : chinhTinh6b) {
			ct6bText = ct6b.getText();
			
		}

		// toLowerCase() chuyển chữ hoa về chữ thường
		if (ct6bText.toLowerCase().contains(ct6aText.toLowerCase())) {
			System.out.println("Đúng dữ liệu chính tinh ở cung số 6");
		} else {
			System.out.println("Không đúng dữ liệu chính tinh tại cung số 6");
		}
		WebElement tieuHan6b = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/div[3]/div[1]"));
		String tieuHan6bText = tieuHan6b.getText();

		if (tieuHan6bText.equalsIgnoreCase(tieuhan6aText)) {
			System.out.println("Đúng dữ liệu tiểu hạn tại sung số 6");
		} else {
			System.out.println("Không Đúng dữ liệu tiểu hạn tại cung số 6");
		}

		WebElement trangSinh6b = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/div[3]/div[2]"));
		String trangSinh6bText = trangSinh6b.getText();

		if (trangSinh6bText.equalsIgnoreCase(Trangsinh6aText)) {
			System.out.println("Đúng dữ liệu vòng tràng Sinh tại cung số 6");
		} else {
			System.out.println("Không Đúng dữ liệu vòng tràng Sinh tại cung số 6");
		}

		WebElement hanThang6b = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/div[3]/div[3]"));
		String hanThang6bText = hanThang6b.getText();

		if (hanThang6aText.equalsIgnoreCase(hanThang6bText)) {
			System.out.println("Đúng dữ liệu hạn tháng cung số 6");
		} else {
			System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 6");
		}

	}

	public static void dulieucung7() {
		nhapDataXemVanMenh();

		WebElement cungso7a = driver.findElement(
				By.xpath("//div[@class='cung cung_7']//div[@class='cung_content']//span[@class='c_cung']"));
		String cungso7aText = cungso7a.getText();

		WebElement conGiap7a = driver
				.findElement(By.xpath("//div[@class='cung cung_7']//div[@class='cung_content']//div[@class='c_giap']"));
		String conGiap7aText = conGiap7a.getText();

		WebElement daiHan7a = driver
				.findElement(By.xpath("//div[@class='cung cung_7']//div[@class='cung_content']//div[@class='daihan']"));
		String daiHan7aText = daiHan7a.getText();

		List<WebElement> chinhTinh7a = driver
				.findElements(By.xpath("//div[@class='cung cung_7']//div[@class='cung_content']//p"));
		for (WebElement ct7a : chinhTinh7a) {
			ct7aText = ct7a.getText();
		}

		WebElement tieuHan7a = driver.findElement(
				By.xpath("//div[@class='cung cung_7']//div[@class='cung_content']//div[@class='tieu_han']"));
		String tieuhan7aText = tieuHan7a.getText();

		WebElement trangSinh7a = driver.findElement(
				By.xpath("//div[@class='cung cung_7']//div[@class='cung_content']//div[@class='truong_sinh']"));
		String Trangsinh7aText = trangSinh7a.getText();

		WebElement hanThang7a = driver.findElement(
				By.xpath("//div[@class='cung cung_7']//div[@class='cung_content']//div[@class='han_thang']"));

		String hanThang7aText = hanThang7a.getText();

//----------------------------------------//---------------------------//
		nhapDataTuViChanCo();

		WebElement cungso7b = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/div[1]/div/div[2]/div"));
		String cungso7bText = cungso7b.getText();

		if (cungso7aText.contains(cungso7bText)) {
			System.out.println("Đúng dữ liệu lấy cung tại cung số 7");
		} else {
			System.out.println("Không đúng dữ liệu lấy cung tại cung số 7");
		}

		WebElement conGiapSo7b = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/div[1]/div/div[1]"));
		String conGiapSo7bText = conGiapSo7b.getText();
		if (conGiap7aText.equalsIgnoreCase(conGiapSo7bText)) {
			System.out.println("Đúng dữ liệu con giáp cung số 7");
		} else {
			System.out.println("Không đúng dữ liệu con giáp tại cung số 7");
		}

		WebElement soDaiHan7b = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/div[1]/div/div[3]"));
		String soDaiHan7bText = soDaiHan7b.getText();
		if (daiHan7aText.equalsIgnoreCase(soDaiHan7bText)) {
			System.out.println("Đúng dữ liệu số đại hạn tại cung số 7");
		} else {
			System.out.println("Không đúng dữ liệu số đại hạn tại cung số 7");
		}

		List<WebElement> chinhTinh7b = driver.findElements(By.xpath("//tbody/tr[1]/td[2]/div/div[1]/div/div[2]/p"));
		for (WebElement ct7b : chinhTinh7b) {
			ct7bText = ct7b.getText();
			
		}
 
		// toLowerCase() chuyển chữ hoa về chữ thường
		if (ct7bText.toLowerCase().contains(ct7aText.toLowerCase())) {
			System.out.println("Đúng dữ liệu chính tinh tại cung số 7");
		} else {
			System.out.println("Không đúng dữ liệu chính tinh tại cung số 7");
		}
		WebElement tieuHan7b = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/div[3]/div[1]"));
		String tieuHan7bText = tieuHan7b.getText();

		if (tieuHan7bText.equalsIgnoreCase(tieuhan7aText)) {
			System.out.println("Đúng dữ liệu tiểu hạn tại sung số 7");
		} else {
			System.out.println("Không Đúng dữ liệu tiểu hạn tại cung số 7");
		}

		WebElement trangSinh7b = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/div[3]/div[2]"));
		String trangSinh7bText = trangSinh7b.getText();

		if (trangSinh7bText.equalsIgnoreCase(Trangsinh7aText)) {
			System.out.println("Đúng dữ liệu vòng tràng Sinh tại cung số 7");
		} else {
			System.out.println("Không Đúng dữ liệu vòng tràng Sinh tại cung số 7");
		}

		WebElement hanThang7b = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/div[3]/div[3]"));
		String hanThang7bText = hanThang7b.getText();

		if (hanThang7aText.equalsIgnoreCase(hanThang7bText)) {
			System.out.println("Đúng dữ liệu hạn tháng cung số 7");
		} else {
			System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 7");
		}

	}

	public static void dulieucung8() {
		nhapDataXemVanMenh();

		WebElement cungso8a = driver.findElement(
				By.xpath("//div[@class='cung cung_8']//div[@class='cung_content']//span[@class='c_cung']"));
		String cungso8aText = cungso8a.getText();

		WebElement conGiap8a = driver
				.findElement(By.xpath("//div[@class='cung cung_8']//div[@class='cung_content']//div[@class='c_giap']"));
		String conGiap8aText = conGiap8a.getText();

		WebElement daiHan8a = driver
				.findElement(By.xpath("//div[@class='cung cung_8']//div[@class='cung_content']//div[@class='daihan']"));
		String daiHan8aText = daiHan8a.getText();

		List<WebElement> chinhTinh8a = driver
				.findElements(By.xpath("//div[@class='cung cung_8']//div[@class='cung_content']//p"));
		for (WebElement ct8a : chinhTinh8a) {
			ct8aText = ct8a.getText();
		}

		WebElement tieuHan8a = driver.findElement(
				By.xpath("//div[@class='cung cung_8']//div[@class='cung_content']//div[@class='tieu_han']"));
		String tieuhan8aText = tieuHan8a.getText();

		WebElement trangSinh8a = driver.findElement(
				By.xpath("//div[@class='cung cung_8']//div[@class='cung_content']//div[@class='truong_sinh']"));
		String Trangsinh8aText = trangSinh8a.getText();

		WebElement hanThang8a = driver.findElement(
				By.xpath("//div[@class='cung cung_8']//div[@class='cung_content']//div[@class='han_thang']"));

		String hanThang8aText = hanThang8a.getText();

//----------------------------------------//---------------------------//
		nhapDataTuViChanCo();

		WebElement cungso8b = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div/div[1]/div/div[2]/div"));
		String cungso8bText = cungso8b.getText();

		if (cungso8aText.contains(cungso8bText)) {
			System.out.println("Đúng dữ liệu lấy tên cung tại cung số 8");
		} else {
			System.out.println("không đúng dữ liệu lấy tên cung tại cung số 8");
		}

		WebElement conGiapSo8b = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div/div[1]/div/div[1]"));
		String conGiapSo8bText = conGiapSo8b.getText();
		if (conGiap8aText.equalsIgnoreCase(conGiapSo8bText)) {
			System.out.println("Đúng dữ liệu con giáp cung số 8");
		} else {
			System.out.println("Không đúng dữ liệu con giáp tại cung số 8");
		}

		WebElement soDaiHan8b = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div/div[1]/div/div[3]"));
		String soDaiHan8bText = soDaiHan8b.getText();
		if (daiHan8aText.equalsIgnoreCase(soDaiHan8bText)) {
			System.out.println("Đúng dữ liệu số đại hạn ở cung số 8");
		} else {
			System.out.println("không đúng dữ liệu số đại hạn ở cung số 8");
		}

		List<WebElement> chinhTinh8b = driver.findElements(By.xpath("//tbody/tr[1]/td[3]/div/div[1]/div/div[2]/p"));
		for (WebElement ct8b : chinhTinh8b) {
			ct8bText = ct8b.getText();
		}

		// toLowerCase() chuyển chữ hoa về chữ thường
		if (ct8bText.toLowerCase().contains(ct8aText.toLowerCase())) {
			System.out.println("Đúng dữ liệu chính tinh ở cung số 8");
		} else {
			System.out.println("không đúng dữ liệu chính tinh tại cung số 8");
		}
		WebElement tieuHan8b = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div/div[3]/div[1]"));
		String tieuHan8bText = tieuHan8b.getText();

		if (tieuHan8bText.equalsIgnoreCase(tieuhan8aText)) {
			System.out.println("Đúng dữ liệu tiểu hạn tại sung số 8");
		} else {
			System.out.println("Không Đúng dữ liệu tiểu hạn tại cung số 8");
		}

		WebElement trangSinh8b = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div/div[3]/div[2]"));
		String trangSinh8bText = trangSinh8b.getText();

		if (trangSinh8bText.equalsIgnoreCase(Trangsinh8aText)) {
			System.out.println("Đúng dữ liệu vòng tràng Sinh tại cung số 8");
		} else {
			System.out.println("Không Đúng dữ liệu vòng tràng Sinh tại cung số 8");
		}

		WebElement hanThang8b = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div/div[3]/div[3]"));
		String hanThang8bText = hanThang8b.getText();

		if (hanThang8aText.equalsIgnoreCase(hanThang8bText)) {
			System.out.println("Đúng dữ liệu hạn tháng cung số 8");
		} else {
			System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 8");
		}

	}

	public static void dulieucung9() {
		nhapDataXemVanMenh();

		WebElement cungso9a = driver.findElement(
				By.xpath("//div[@class='cung cung_9']//div[@class='cung_content']//span[@class='c_cung']"));
		String cungso9aText = cungso9a.getText();

		WebElement conGiap9a = driver
				.findElement(By.xpath("//div[@class='cung cung_9']//div[@class='cung_content']//div[@class='c_giap']"));
		String conGiap9aText = conGiap9a.getText();

		WebElement daiHan9a = driver
				.findElement(By.xpath("//div[@class='cung cung_9']//div[@class='cung_content']//div[@class='daihan']"));
		String daiHan9aText = daiHan9a.getText();

		List<WebElement> chinhTinh9a = driver
				.findElements(By.xpath("//div[@class='cung cung_9']//div[@class='cung_content']//p"));
		for (WebElement ct9a : chinhTinh9a) {
			ct9aText = ct9a.getText();
		}

		WebElement tieuHan9a = driver.findElement(
				By.xpath("//div[@class='cung cung_9']//div[@class='cung_content']//div[@class='tieu_han']"));
		String tieuhan9aText = tieuHan9a.getText();

		WebElement trangSinh9a = driver.findElement(
				By.xpath("//div[@class='cung cung_9']//div[@class='cung_content']//div[@class='truong_sinh']"));
		String Trangsinh9aText = trangSinh9a.getText();

		WebElement hanThang9a = driver.findElement(
				By.xpath("//div[@class='cung cung_9']//div[@class='cung_content']//div[@class='han_thang']"));

		String hanThang9aText = hanThang9a.getText();

//----------------------------------------//---------------------------//
		nhapDataTuViChanCo();

		WebElement cungso9b = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div/div[1]/div/div[2]/div"));
		String cungso9bText = cungso9b.getText();

		if (cungso9aText.contains(cungso9bText)) {
			System.out.println("Đúng dữ liệu lấy cung tại cung số 9");
		} else {
			System.out.println("không đúng dữ liệu tại cung số 9");
		}

		WebElement conGiapSo9b = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div/div[1]/div/div[1]"));
		String conGiapSo9bText = conGiapSo9b.getText();
		if (conGiap9aText.equalsIgnoreCase(conGiapSo9bText)) {
			System.out.println("Đúng dữ liệu con giáp cung số 9");
		} else {
			System.out.println("Không đúng dữ liệu con giáp tại cung số 9");
		}

		WebElement soDaiHan9b = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div/div[1]/div/div[3]"));
		String soDaiHan9bText = soDaiHan9b.getText();
		if (daiHan9aText.equalsIgnoreCase(soDaiHan9bText)) {
			System.out.println("Đúng dữ liệu số đại hạn tại cung số 9");
		} else {
			System.out.println("không đúng dữ liệu số đại hạn tại cung số 9");
		}

		List<WebElement> chinhTinh9b = driver.findElements(By.xpath("//tbody/tr[1]/td[4]/div/div[1]/div/div[2]/p"));
		for (WebElement ct9b : chinhTinh9b) {
			ct9bText = ct9b.getText();
		}

		// toLowerCase() chuyển chữ hoa về chữ thường
		if (ct9bText.toLowerCase().contains(ct9aText.toLowerCase())) {
			System.out.println("Đúng dữ liệu chính tinh tại cung số 9");
		} else {
			System.out.println("Không đúng dữ liệu chính tinh tại cung số 9");
		}
		WebElement tieuHan9b = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div/div[3]/div[1]"));
		String tieuHan9bText = tieuHan9b.getText();

		if (tieuHan9bText.equalsIgnoreCase(tieuhan9aText)) {
			System.out.println("Đúng dữ liệu tiểu hạn tại sung số 9");
		} else {
			System.out.println("Không Đúng dữ liệu tiểu hạn tại cung số 9");
		}

		WebElement trangSinh9b = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div/div[3]/div[2]"));
		String trangSinh9bText = trangSinh9b.getText();

		if (trangSinh9bText.equalsIgnoreCase(Trangsinh9aText)) {
			System.out.println("Đúng dữ liệu vòng tràng Sinh tại cung số 9");
		} else {
			System.out.println("Không Đúng dữ liệu vòng tràng Sinh tại cung số 9");
		}

		WebElement hanThang9b = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div/div[3]/div[3]"));
		String hanThang9bText = hanThang9b.getText();

		if (hanThang9aText.equalsIgnoreCase(hanThang9bText)) {
			System.out.println("Đúng dữ liệu hạn tháng cung số 9");
		} else {
			System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 9");
		}

	}

	public static void dulieucung10() {
		nhapDataXemVanMenh();

		WebElement cungso10a = driver.findElement(
				By.xpath("//div[@class='cung cung_10']//div[@class='cung_content']//span[@class='c_cung']"));
		String cungso10aText = cungso10a.getText();

		WebElement conGiap10a = driver.findElement(
				By.xpath("//div[@class='cung cung_10']//div[@class='cung_content']//div[@class='c_giap']"));
		String conGiap10aText = conGiap10a.getText();

		WebElement daiHan10a = driver.findElement(
				By.xpath("//div[@class='cung cung_10']//div[@class='cung_content']//div[@class='daihan']"));
		String daiHan10aText = daiHan10a.getText();

		List<WebElement> chinhTinh10a = driver
				.findElements(By.xpath("//div[@class='cung cung_10']//div[@class='cung_content']//p"));
		for (WebElement ct10a : chinhTinh10a) {
			ct10aText = ct10a.getText();
		}

		WebElement tieuHan10a = driver.findElement(
				By.xpath("//div[@class='cung cung_10']//div[@class='cung_content']//div[@class='tieu_han']"));
		String tieuhan10aText = tieuHan10a.getText();

		WebElement trangSinh10a = driver.findElement(
				By.xpath("//div[@class='cung cung_10']//div[@class='cung_content']//div[@class='truong_sinh']"));
		String Trangsinh10aText = trangSinh10a.getText();

		WebElement hanThang10a = driver.findElement(
				By.xpath("//div[@class='cung cung_10']//div[@class='cung_content']//div[@class='han_thang']"));

		String hanThang10aText = hanThang10a.getText();

//----------------------------------------//---------------------------//
		nhapDataTuViChanCo();

		WebElement cungso10b = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div/div[1]/div/div[2]/div"));
		String cungso10bText = cungso10b.getText();

		if (cungso10aText.contains(cungso10bText)) {
			System.out.println("Đúng dữ liệu lấy cung tại cung số 10");
		} else {
			System.out.println("không đúng dữ liệu tên cung tại cung số 10");
		}

		WebElement conGiapSo10b = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div/div[1]/div/div[1]"));
		String conGiapSo10bText = conGiapSo10b.getText();
		if (conGiap10aText.equalsIgnoreCase(conGiapSo10bText)) {
			System.out.println("Đúng dữ liệu con giáp cung số 10");
		} else {
			System.out.println("Không đúng dữ liệu con giáp tại cung số 10");
		}

		WebElement soDaiHan10b = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div/div[1]/div/div[3]"));
		String soDaiHan10bText = soDaiHan10b.getText();
		if (daiHan10aText.equalsIgnoreCase(soDaiHan10bText)) {
			System.out.println("Đúng dữ liệu số đại hạn ở cung số 10");
		} else {
			System.out.println("Số đại hạn không đúng tại cung số 10");
		}

		List<WebElement> chinhTinh10b = driver.findElements(By.xpath("//tbody/tr[2]/td[3]/div/div[1]/div/div[2]/p"));
		for (WebElement ct10b : chinhTinh10b) {
			ct10bText = ct10b.getText();
		}

		// toLowerCase() chuyển chữ hoa về chữ thường
		if (ct10bText.toLowerCase().contains(ct10aText.toLowerCase())) {
			System.out.println("Đúng dữ liệu chính tinh ở cung số 10");
		} else {
			System.out.println("Chính tinh không đúng tại cung số 10");
		}
		WebElement tieuHan10b = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div/div[3]/div[1]"));
		String tieuHan10bText = tieuHan10b.getText();

		if (tieuHan10bText.equalsIgnoreCase(tieuhan10aText)) {
			System.out.println("Đúng dữ liệu tiểu hạn tại sung số 10");
		} else {
			System.out.println("Không Đúng dữ liệu tiểu hạn tại cung số 10");
		}

		WebElement trangSinh10b = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div/div[3]/div[2]"));
		String trangSinh10bText = trangSinh10b.getText();

		if (trangSinh10bText.equalsIgnoreCase(Trangsinh10aText)) {
			System.out.println("Đúng dữ liệu vòng tràng Sinh ở cung số 10");
		} else {
			System.out.println("Không Đúng dữ liệu vòng tràng Sinh tại cung số 10");
		}

		WebElement hanThang10b = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div/div[3]/div[3]"));
		String hanThang10bText = hanThang10b.getText();

		if (hanThang10aText.equalsIgnoreCase(hanThang10bText)) {
			System.out.println("Đúng dữ liệu hạn tháng cung số 10");
		} else {
			System.out.println("Hạn tháng tại cung số 10 không đúng");
		}

	}

	public static void dulieucung11() {
		nhapDataXemVanMenh();

		WebElement cungso11a = driver.findElement(
				By.xpath("//div[@class='cung cung_11']//div[@class='cung_content']//span[@class='c_cung']"));
		String cungso11aText = cungso11a.getText();

		WebElement conGiap11a = driver.findElement(
				By.xpath("//div[@class='cung cung_11']//div[@class='cung_content']//div[@class='c_giap']"));
		String conGiap11aText = conGiap11a.getText();

		WebElement daiHan11a = driver.findElement(
				By.xpath("//div[@class='cung cung_11']//div[@class='cung_content']//div[@class='daihan']"));
		String daiHan11aText = daiHan11a.getText();

		List<WebElement> chinhTinh11a = driver
				.findElements(By.xpath("//div[@class='cung cung_11']//div[@class='cung_content']//p"));
		for (WebElement ct11a : chinhTinh11a) {
			ct11aText = ct11a.getText();
		}

		WebElement tieuHan11a = driver.findElement(
				By.xpath("//div[@class='cung cung_11']//div[@class='cung_content']//div[@class='tieu_han']"));
		String tieuhan11aText = tieuHan11a.getText();

		WebElement trangSinh11a = driver.findElement(
				By.xpath("//div[@class='cung cung_11']//div[@class='cung_content']//div[@class='truong_sinh']"));
		String Trangsinh11aText = trangSinh11a.getText();

		WebElement hanThang11a = driver.findElement(
				By.xpath("//div[@class='cung cung_11']//div[@class='cung_content']//div[@class='han_thang']"));

		String hanThang11aText = hanThang11a.getText();

//----------------------------------------//---------------------------//
		nhapDataTuViChanCo();

		WebElement cungso11b = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div/div[1]/div/div[2]/div"));
		String cungso11bText = cungso11b.getText();

		if (cungso11aText.contains(cungso11bText)) {
			System.out.println("Đúng dữ liệu lấy cung tại cung số 11");
		} else {
			System.out.println("Tên cung không đúng tại cung số 11");
		}

		WebElement conGiapSo11b = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div/div[1]/div/div[1]"));
		String conGiapSo11bText = conGiapSo11b.getText();
		if (conGiap11aText.equalsIgnoreCase(conGiapSo11bText)) {
			System.out.println("Đúng dữ liệu con giáp cung số 11");
		} else {
			System.out.println("Con giáp tại cung số 11 không đúng");
		}

		WebElement soDaiHan11b = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div/div[1]/div/div[3]"));
		String soDaiHan11bText = soDaiHan11b.getText();
		if (daiHan11aText.equalsIgnoreCase(soDaiHan11bText)) {
			System.out.println("Đúng dữ liệu số đại hạn ở cung số 11");
		} else {
			System.out.println("Số đại hạn tại cung số 11 không đúng");
		}

		List<WebElement> chinhTinh11b = driver.findElements(By.xpath("//tbody/tr[3]/td[2]/div/div[1]/div/div[2]/p"));
		for (WebElement ct11b : chinhTinh11b) {
			ct11bText = ct11b.getText();
		}

		// toLowerCase() chuyển chữ hoa về chữ thường
		if (ct11bText.toLowerCase().contains(ct11aText.toLowerCase())) {
			System.out.println("Đúng dữ liệu chính tinh tại cung số 11");
		} else {
			System.out.println("không đúng dữ liệu chính tính tại cung số 11");
		}
		WebElement tieuHan11b = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div/div[3]/div[1]"));
		String tieuHan11bText = tieuHan11b.getText();

		if (tieuHan11bText.equalsIgnoreCase(tieuhan11aText)) {
			System.out.println("Đúng dữ liệu tiểu hạn tại sung số 11");
		} else {
			System.out.println("Không Đúng dữ liệu tiểu hạn tại cung số 11");
		}

		WebElement trangSinh11b = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div/div[3]/div[2]"));
		String trangSinh11bText = trangSinh11b.getText();

		if (trangSinh11bText.equalsIgnoreCase(Trangsinh11aText)) {
			System.out.println("Đúng dữ liệu vòng tràng Sinh tại cung số 11");
		} else {
			System.out.println("Không Đúng dữ liệu vòng tràng Sinh tại cung số 11");
		}

		WebElement hanThang11b = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div/div[3]/div[3]"));
		String hanThang11bText = hanThang11b.getText();

		if (hanThang11aText.equalsIgnoreCase(hanThang11bText)) {
			System.out.println("Đúng dữ liệu hạn tháng cung số 11");
		} else {
			System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 11");
		}

	}

	public static void dulieucung12() {
		nhapDataXemVanMenh();

		WebElement cungso12a = driver.findElement(
				By.xpath("//div[@class='cung cung_12']//div[@class='cung_content']//span[@class='c_cung']"));
		String cungso12aText = cungso12a.getText();

		WebElement conGiap12a = driver.findElement(
				By.xpath("//div[@class='cung cung_12']//div[@class='cung_content']//div[@class='c_giap']"));
		String conGiap12aText = conGiap12a.getText();

		WebElement daiHan12a = driver.findElement(
				By.xpath("//div[@class='cung cung_12']//div[@class='cung_content']//div[@class='daihan']"));
		String daiHan12aText = daiHan12a.getText();

		List<WebElement> chinhTinh12a = driver
				.findElements(By.xpath("//div[@class='cung cung_12']//div[@class='cung_content']//p"));
		for (WebElement ct12a : chinhTinh12a) {
			ct12aText = ct12a.getText();
		}

		WebElement tieuHan12a = driver.findElement(
				By.xpath("//div[@class='cung cung_12']//div[@class='cung_content']//div[@class='tieu_han']"));
		String tieuhan12aText = tieuHan12a.getText();

		WebElement trangSinh12a = driver.findElement(
				By.xpath("//div[@class='cung cung_12']//div[@class='cung_content']//div[@class='truong_sinh']"));
		String Trangsinh12aText = trangSinh12a.getText();

		WebElement hanThang12a = driver.findElement(
				By.xpath("//div[@class='cung cung_12']//div[@class='cung_content']//div[@class='han_thang']"));

		String hanThang12aText = hanThang12a.getText();

//----------------------------------------//---------------------------//
		nhapDataTuViChanCo();

		WebElement cungso12b = driver.findElement(By.xpath("//tbody/tr[4]/td[4]/div/div[1]/div/div[2]/div"));
		String cungso12bText = cungso12b.getText();

		if (cungso12aText.contains(cungso12bText)) {
			System.out.println("Đúng dữ liệu lấy cung tại cung số 12");
		} else {
			System.out.println("Tên cung không đúng tại cung số 12");
		}

		WebElement conGiapSo12b = driver.findElement(By.xpath("//tbody/tr[4]/td[4]/div/div[1]/div/div[1]"));
		String conGiapSo12bText = conGiapSo12b.getText();

		if (conGiap12aText.equalsIgnoreCase(conGiapSo12bText)) {
			System.out.println("Đúng dữ liệu con giáp tại cung số 12");
		} else {
			System.out.println("Con giáp không đúng tại cung số 12");
		}

		WebElement soDaiHan12b = driver.findElement(By.xpath("//tbody/tr[4]/td[4]/div/div[1]/div/div[3]"));
		String soDaiHan12bText = soDaiHan12b.getText();
		if (daiHan12aText.equalsIgnoreCase(soDaiHan12bText)) {
			System.out.println("Đúng dữ liệu số đại hạn tại cung số 12");
		} else {
			System.out.println("Số đại hạn không đúng tại số 12");
		}

		List<WebElement> chinhTinh12b = driver.findElements(By.xpath("//tbody/tr[4]/td[4]/div/div[1]/div/div[2]/p"));
		for (WebElement ct12b : chinhTinh12b) {
			ct12bText = ct12b.getText();
		}

		// toLowerCase() chuyển chữ hoa về chữ thường
		if (ct12bText.toLowerCase().contains(ct12aText.toLowerCase())) {
			System.out.println("Đúng dữ liệu chính tinh tại cung số 12");
		} else {
			System.out.println("Phần chính tinh không đúng tại cung số 12");
		}
		WebElement tieuHan12b = driver.findElement(By.xpath("//tbody/tr[4]/td[4]/div/div[3]/div[1]"));
		String tieuHan12bText = tieuHan12b.getText();

		if (tieuHan12bText.equalsIgnoreCase(tieuhan12aText)) {
			System.out.println("Đúng dữ liệu tiểu hạn tại sung số 12");
		} else {
			System.out.println("Không Đúng dữ liệu tiểu hạn tại cung số 12");
		}

		WebElement trangSinh12b = driver.findElement(By.xpath("//tbody/tr[4]/td[4]/div/div[3]/div[2]"));
		String trangSinh12bText = trangSinh12b.getText();

		if (trangSinh12bText.equalsIgnoreCase(Trangsinh12aText)) {
			System.out.println("Đúng dữ liệu vòng tràng Sinh ở cung số 12");
		} else {
			System.out.println("Không Đúng dữ liệu vòng tràng Sinh tại cung số 12");
		}

		WebElement hanThang12b = driver.findElement(By.xpath("//tbody/tr[4]/td[4]/div/div[3]/div[3]"));
		String hanThang12bText = hanThang12b.getText();

		if (hanThang12aText.equalsIgnoreCase(hanThang12bText)) {
			System.out.println("Đúng dữ liệu hạn tháng cung số 12");
		} else {
			System.out.println(" Không Đúng dữ liệu hạn tháng tại cung số 12");
		}

	}

	
}
