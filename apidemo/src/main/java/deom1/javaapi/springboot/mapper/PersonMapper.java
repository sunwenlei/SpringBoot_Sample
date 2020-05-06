package deom1.javaapi.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import deom1.javaapi.springboot.Model.Persons;

@Mapper
public interface PersonMapper {
	
	@Select("select * from mst_person_info")
	List<Persons> findALL();
	
	@Select("select * from mst_person_info where person_cd = #{person_cd}")
	Persons findByid(@Param("person_cd") String person_cd);
	
	@Insert("insert into mst_person_info (person_cd, person_name, person_name_kana, birthday, sex, zip, address1, address2, address3, address4, "
			+ "tel, mobile, mail_address, authentication_date, delete_flag, create_user, create_date, update_user, update_date) "
			+ "values ("
			+ "to_char(CURRENT_DATE,'YY') || LPAD(nextval('SEQ_PERSON_CD')::varchar, 8, '0')"
			+ ",#{person.person_name}"
			+ ",#{person.person_name_kana}"
			+ ",#{person.birthday}::date"
			+ ",#{person.sex}"
			+ ",#{person.zip}"
			+ ",#{person.address1}"
			+ ",#{person.address2}"
			+ ",#{person.address3}"
			+ ",#{person.address4}"
			+ ",#{person.tel}"
			+ ",#{person.mobile}"
			+ ",#{person.mail_address}"
			+ ",#{person.authentication_date}::date"
			+ ",#{person.delete_flag}"
			+ ",#{person.create_user}"
			+ ",current_timestamp"
			+ ",#{person.update_user}"
			+ ",current_timestamp"
			+ ")")
	void NewPerson(@Param("person") Persons person);
	
	@Update("update mst_person_info set "
			+ "person_name = #{person.person_name},\r\n" + 
			"person_name_kana = #{person.person_name_kana}, \r\n" + 
			"birthday = #{person.birthday} ::date, \r\n" + 
			"sex = #{person.sex}, \r\n" + 
			"zip = #{person.zip}, \r\n" + 
			"address1 = #{person.address1}, \r\n" + 
			"address2 = #{person.address2}, \r\n" + 
			"address3 = #{person.address3}, \r\n" + 
			"address4 = #{person.address4}, \r\n" + 
			"tel = #{person.tel}, \r\n" + 
			"mobile = #{person.mobile}, \r\n" + 
			"mail_address = #{person.mail_address}, \r\n" + 
			"authentication_date = #{person.authentication_date} ::date, \r\n" + 
			"delete_flag = #{person.delete_flag}, \r\n" + 
			"update_user = #{person.update_user}, \r\n" + 
			"update_date = current_timestamp\r\n" + 
			"where person_cd = #{person.person_cd}")
	void UpdatePerson(@Param("person") Persons person);
}
