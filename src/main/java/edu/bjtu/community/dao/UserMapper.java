package edu.bjtu.community.dao;

import edu.bjtu.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    User selectById(int id);

    @Select({"select id, username, password, salt, email, type, status, activation_code, header_url, create_time ",
            "from user ",
            "where id = #{id}"
    })
    User getById(int id);


    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);

}
