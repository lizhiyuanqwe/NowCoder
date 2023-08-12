package edu.bjtu.community.dao.elasticsearch;

import edu.bjtu.community.entity.DiscussPost;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository   // 用来表明该类是用来执行与数据库相关的操作（即dao对象）
public interface DiscussPostRepository extends ElasticsearchRepository<DiscussPost, Integer> {

}
