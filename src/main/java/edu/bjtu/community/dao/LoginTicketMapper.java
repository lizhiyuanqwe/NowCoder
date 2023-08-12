package edu.bjtu.community.dao;

import edu.bjtu.community.entity.LoginTicket;
import org.apache.ibatis.annotations.*;

@Mapper
@Deprecated
public interface LoginTicketMapper {

    // @Insert({ , , ,}) 大括号里面可以写多个，会拼起来，注意末尾空格
    // 写<if>标签实现动态SQL，要用<script>套起来
    @Insert({
            "insert into login_ticket(user_id,ticket,status,expired) ",
            "values(#{userId},#{ticket},#{status},#{expired})"
    })
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertLoginTicket(LoginTicket loginTicket);

    @Select({
            "select id,user_id,ticket,status,expired ",
            "from login_ticket where ticket=#{ticket}"
    })
    LoginTicket selectByTicket(String ticket);

    @Update({
            "<script>",
            "update login_ticket set status=#{status} where ticket=#{ticket} ",
            "<if test=\"True\"> and 1=1 </if> ",
            "</script>"
    })
    int updateStatus(String ticket, int status);

}
