package edu.bjtu.community.entity;

import java.util.HashMap;
import java.util.Map;

public class Event {

    private String topic;
    private int userId;
    private int entityType;
    private int entityId;
    private int entityUserId;
    /**
     *  加上 Map 可以将来拓展未知的数据，具有拓展性
     */
    private Map<String, Object> data = new HashMap<>();

    public String getTopic() {
        return topic;
    }


    /**
     *  set 方法通常是void
     *  加上返回this本体的好处是
     *  可以实现 event.setUserId().setEntityId().setData() 连续赋值
     */
    public Event setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public Event setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getEntityType() {
        return entityType;
    }

    public Event setEntityType(int entityType) {
        this.entityType = entityType;
        return this;
    }

    public int getEntityId() {
        return entityId;
    }

    public Event setEntityId(int entityId) {
        this.entityId = entityId;
        return this;
    }

    public int getEntityUserId() {
        return entityUserId;
    }

    public Event setEntityUserId(int entityUserId) {
        this.entityUserId = entityUserId;
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public Event setData(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

}
