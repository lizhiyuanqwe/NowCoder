package edu.bjtu.community.dao;

import edu.bjtu.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {


    // 分页查询，返回集合，集合里面是帖子
    // 首页上不用传入userId默认0，0的时候就不拼进sql里面动态sql，考虑将来用户主页查询自己的帖子
    // offset 起始行号 limit 最多显示多少数据
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit, int orderMode);

    // 查询帖子的行数，首页也不用UserId
    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在<if>里使用,则必须加别名.
    int selectDiscussPostRows(@Param("userId") int userId);

    // 添加帖子
    int insertDiscussPost(DiscussPost discussPost);

    // 根据id查找帖子
    DiscussPost selectDiscussPostById(int id);

    // 评论功能
    int updateCommentCount(int id, int commentCount);

    int updateType(int id, int type);

    int updateStatus(int id, int status);

    int updateScore(int id, double score);

}
