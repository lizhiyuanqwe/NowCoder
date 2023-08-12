package edu.bjtu.community.dao;

import edu.bjtu.community.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    // 根据实体查询一页评论数据
    List<Comment> selectCommentsByEntity(int entityType, int entityId, int offset, int limit);

    // 根据实体查询评论的数量
    int selectCountByEntity(int entityType, int entityId);

    // 添加评论
    int insertComment(Comment comment);

    // 查找评论 byid
    Comment selectCommentById(int id);

}
