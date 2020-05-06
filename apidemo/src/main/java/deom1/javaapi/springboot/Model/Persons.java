package deom1.javaapi.springboot.Model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Persons {
	private String person_cd;
	private String person_name;
	private String person_name_kana;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date Birthday;
	private String Sex;
	private String Zip;
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String Tel;
	private String Mobile;
	private String mail_address;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private String authentication_date;
	private String delete_flag;
	private String create_user;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date create_date;
	private String update_user;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date update_date;
	/**
	 * @return the person_cd
	 */
	public String getPerson_cd() {
		return person_cd;
	}
	/**
	 * @param person_cd the person_cd to set
	 */
	public void setPerson_cd(String person_cd) {
		this.person_cd = person_cd;
	}
	/**
	 * @return the person_name
	 */
	public String getPerson_name() {
		return person_name;
	}
	/**
	 * @param person_name the person_name to set
	 */
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	/**
	 * @return the person_name_kana
	 */
	public String getPerson_name_kana() {
		return person_name_kana;
	}
	/**
	 * @param person_name_kana the person_name_kana to set
	 */
	public void setPerson_name_kana(String person_name_kana) {
		this.person_name_kana = person_name_kana;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return Birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return Sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		Sex = sex;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return Zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		Zip = zip;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return Address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		Address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return Address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		Address2 = address2;
	}
	/**
	 * @return the address3
	 */
	public String getAddress3() {
		return Address3;
	}
	/**
	 * @param address3 the address3 to set
	 */
	public void setAddress3(String address3) {
		Address3 = address3;
	}
	/**
	 * @return the address4
	 */
	public String getAddress4() {
		return Address4;
	}
	/**
	 * @param address4 the address4 to set
	 */
	public void setAddress4(String address4) {
		Address4 = address4;
	}
	/**
	 * @return the tel
	 */
	public String getTel() {
		return Tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		Tel = tel;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return Mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	/**
	 * @return the mail_address
	 */
	public String getMail_address() {
		return mail_address;
	}
	/**
	 * @param mail_address the mail_address to set
	 */
	public void setMail_address(String mail_address) {
		this.mail_address = mail_address;
	}
	/**
	 * @return the authentication_date
	 */
	public String getAuthentication_date() {
		return authentication_date;
	}
	/**
	 * @param authentication_date the authentication_date to set
	 */
	public void setAuthentication_date(String authentication_date) {
		this.authentication_date = authentication_date;
	}
	/**
	 * @return the delete_flag
	 */
	public String getDelete_flag() {
		return delete_flag;
	}
	/**
	 * @param delete_flag the delete_flag to set
	 */
	public void setDelete_flag(String delete_flag) {
		this.delete_flag = delete_flag;
	}
	/**
	 * @return the create_user
	 */
	public String getCreate_user() {
		return create_user;
	}
	/**
	 * @param create_user the create_user to set
	 */
	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}
	/**
	 * @return the create_date
	 */
	public Date getCreate_date() {
		return create_date;
	}
	/**
	 * @param create_date the create_date to set
	 */
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	/**
	 * @return the update_user
	 */
	public String getUpdate_user() {
		return update_user;
	}
	/**
	 * @param update_user the update_user to set
	 */
	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}
	/**
	 * @return the update_date
	 */
	public Date getUpdate_date() {
		return update_date;
	}
	/**
	 * @param update_date the update_date to set
	 */
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	
	
}
