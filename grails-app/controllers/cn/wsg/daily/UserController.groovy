package cn.wsg.daily

import grails.converters.JSON

/**
 * Created by WangShiguang on 2016/9/28 0028.
 */
class UserController {

    def list(int tid) {
        render User.findAllByTeam(Team.load(tid)) as JSON
    }

    def bindqq() {
        def user = User.findByEmailAndPasswd(params.email, params.passwd)
        if (user) {
            user.setQqid(params.qqid);
            user.save(flush: true)
        }
        def rt = [success: user ? true : false, user: user]
        render rt as JSON
    }

    def find() {
        def user = null
        if (params.email) {
            user = User.findByEmail(params.email)
        } else if (params.qqid) {
            user = User.findByQqid(params.qqid)
        }
        def rt = [user: user]
        render rt as JSON
    }

    def passwd() {
        render([success: true]) as JSON

    }

}
