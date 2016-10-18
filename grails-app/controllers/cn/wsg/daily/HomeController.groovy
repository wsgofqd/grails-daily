package cn.wsg.daily

import cn.wsg.daily.BaseController

/**
 * Created by WangShiguang on 2016/9/19 0019.
 */
class HomeController implements  BaseController {
    def index() {

        def s = 1 / 0
        render 'this is a test'
    }
}
