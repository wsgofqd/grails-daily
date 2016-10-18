package cn.wsg.daily

import grails.converters.JSON

/**
 * Created by WangShiguang on 2016/9/28 0028.
 */
class TeamController {

    def list(){
       render Team.list() as JSON
    }
}
