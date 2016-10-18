package cn.wsg.daily

/**
 * Created by WangShiguang on 2016/9/28 0028.
 */
class Team {

    String name
    int status=1
    static belongsTo = [parent:Team]

}
