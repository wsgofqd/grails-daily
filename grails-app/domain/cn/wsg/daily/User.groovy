package cn.wsg.daily

/**
 * Created by WangShiguang on 2016/9/28 0028.
 */
class User {
    String name
    String email
    String qq
    String passwd

    String qqid
    int status=1

    static belongsTo = [team:Team]

}
