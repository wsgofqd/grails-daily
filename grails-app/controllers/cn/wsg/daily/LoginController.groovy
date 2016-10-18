package cn.wsg.daily

import grails.converters.JSON

/**
 * Created by WangShiguang on 2016/9/29 0029.
 */
class LoginController {

    def login(String account,String passwd){
        def user=User.findByEmailAndPasswd(account,passwd)
        def rt=user?.status==1?[success:true,user:user]:[success:false]
       render rt as JSON
    }
}
