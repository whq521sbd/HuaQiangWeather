package com.HuaQiangWeather.App.Entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/4/3/003.
 */

public class WxapiBean implements Serializable {


    /**
     * reason : 请求成功
     * result : {"list":[{"id":"wechat_20170403014537","title":"你活成这样一定有什么想不开吧","source":"LinkedIn","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-16461151.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014537"},{"id":"wechat_20170403014713","title":"别人撒盐伤不了你，除非自己身上有溃烂之处","source":"拾光相册","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18110390.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014713"},{"id":"wechat_20170403014810","title":"绝望，是因为你心里还有希望","source":"伤感说说","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-16502661.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014810"},{"id":"wechat_20170403014435","title":"专属怀集人的清明节习俗，你知道几个？","source":"怀集人网站","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18065296.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014435"},{"id":"wechat_20170403014438","title":"喝茶有\u201c范\u201d| 印坯与利坯，中国最古老的传统制瓷技艺","source":"茶香记生活家","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-12809066.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014438"},{"id":"wechat_20170403014577","title":"荥阳?第三届中国嫘祖文化节 ，将于4月8日在环翠峪举行","source":"郑州晚报·荥阳播报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18110324.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014577"},{"id":"wechat_20170403014715","title":"书香|涵江地名歇后语,你能猜出几个?","source":"海峡都市报新莆田","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18110402.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014715"},{"id":"wechat_20170403014688","title":"渐行渐远的老手艺：奉节一位76岁草鞋手工艺人的坚守","source":"大夔网","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-16543036.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014688"},{"id":"wechat_20170403014795","title":"朱光荣：人品也是决定艺术家的作品未来价值的重要因素之一","source":"020艺术空间","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18110661.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014795"},{"id":"wechat_20170403014869","title":"你若盛开，清风自来","source":"中国国家地理","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18111041.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014869"},{"id":"wechat_20170403014926","title":"又到清明时！这些绝美的清明诗词你看过几首？","source":"河南日报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18111199.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014926"},{"id":"wechat_20170403015004","title":"?清明：怀念你，我的亲人","source":"音乐图文场景","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18083523.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015004"},{"id":"wechat_20170403015065","title":"他是蒋经国的书画老师，看看他的花鸟！","source":"书画新风景","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18111827.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015065"},{"id":"wechat_20170403015061","title":"气势磅礴、壮志凌云！毛泽东1937年清明节写下的一篇祭文！","source":"书画新风景","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18111801.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015061"},{"id":"wechat_20170403015063","title":"清明追忆伟人：周恩来书法手迹十九幅","source":"书画新风景","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18111806.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015063"},{"id":"wechat_20170403015099","title":"从一个\u201c怹\u201d字开始，重新拾起北京的这些老理儿","source":"北京吃货","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18112044.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015099"},{"id":"wechat_20170403015157","title":"跟着掌上历史一起来挣钱！","source":"掌上历史","firstImg":"","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015157"},{"id":"wechat_20170403015224","title":"今年清明为什么不是4月5日？清明到底可以说\u201c节日快乐\u201d吗？关于清明你不知道的都在这！","source":"最温岭","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-17776611.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015224"},{"id":"wechat_20170403015211","title":"分享丨清明可以说\u201c节日快乐\u201d吗？","source":"深圳新闻网","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18112460.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015211"},{"id":"wechat_20170403015222","title":"荐读 | 又到清明时，诗词知多少？","source":"神木新闻","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-13084644.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015222"}],"totalPage":1748,"ps":20,"pno":1}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean implements Serializable {
        /**
         * list : [{"id":"wechat_20170403014537","title":"你活成这样一定有什么想不开吧","source":"LinkedIn","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-16461151.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014537"},{"id":"wechat_20170403014713","title":"别人撒盐伤不了你，除非自己身上有溃烂之处","source":"拾光相册","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18110390.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014713"},{"id":"wechat_20170403014810","title":"绝望，是因为你心里还有希望","source":"伤感说说","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-16502661.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014810"},{"id":"wechat_20170403014435","title":"专属怀集人的清明节习俗，你知道几个？","source":"怀集人网站","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18065296.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014435"},{"id":"wechat_20170403014438","title":"喝茶有\u201c范\u201d| 印坯与利坯，中国最古老的传统制瓷技艺","source":"茶香记生活家","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-12809066.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014438"},{"id":"wechat_20170403014577","title":"荥阳?第三届中国嫘祖文化节 ，将于4月8日在环翠峪举行","source":"郑州晚报·荥阳播报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18110324.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014577"},{"id":"wechat_20170403014715","title":"书香|涵江地名歇后语,你能猜出几个?","source":"海峡都市报新莆田","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18110402.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014715"},{"id":"wechat_20170403014688","title":"渐行渐远的老手艺：奉节一位76岁草鞋手工艺人的坚守","source":"大夔网","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-16543036.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014688"},{"id":"wechat_20170403014795","title":"朱光荣：人品也是决定艺术家的作品未来价值的重要因素之一","source":"020艺术空间","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18110661.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014795"},{"id":"wechat_20170403014869","title":"你若盛开，清风自来","source":"中国国家地理","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18111041.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014869"},{"id":"wechat_20170403014926","title":"又到清明时！这些绝美的清明诗词你看过几首？","source":"河南日报","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18111199.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014926"},{"id":"wechat_20170403015004","title":"?清明：怀念你，我的亲人","source":"音乐图文场景","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18083523.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015004"},{"id":"wechat_20170403015065","title":"他是蒋经国的书画老师，看看他的花鸟！","source":"书画新风景","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18111827.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015065"},{"id":"wechat_20170403015061","title":"气势磅礴、壮志凌云！毛泽东1937年清明节写下的一篇祭文！","source":"书画新风景","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18111801.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015061"},{"id":"wechat_20170403015063","title":"清明追忆伟人：周恩来书法手迹十九幅","source":"书画新风景","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18111806.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015063"},{"id":"wechat_20170403015099","title":"从一个\u201c怹\u201d字开始，重新拾起北京的这些老理儿","source":"北京吃货","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18112044.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015099"},{"id":"wechat_20170403015157","title":"跟着掌上历史一起来挣钱！","source":"掌上历史","firstImg":"","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015157"},{"id":"wechat_20170403015224","title":"今年清明为什么不是4月5日？清明到底可以说\u201c节日快乐\u201d吗？关于清明你不知道的都在这！","source":"最温岭","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-17776611.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015224"},{"id":"wechat_20170403015211","title":"分享丨清明可以说\u201c节日快乐\u201d吗？","source":"深圳新闻网","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-18112460.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015211"},{"id":"wechat_20170403015222","title":"荐读 | 又到清明时，诗词知多少？","source":"神木新闻","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-13084644.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20170403015222"}]
         * totalPage : 1748
         * ps : 20
         * pno : 1
         */

        private int totalPage;
        private int ps;
        private int pno;
        private List<ListBean> list;

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getPs() {
            return ps;
        }

        public void setPs(int ps) {
            this.ps = ps;
        }

        public int getPno() {
            return pno;
        }

        public void setPno(int pno) {
            this.pno = pno;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : wechat_20170403014537
             * title : 你活成这样一定有什么想不开吧
             * source : LinkedIn
             * firstImg : http://zxpic.gtimg.com/infonew/0/wechat_pics_-16461151.static/640
             * mark :
             * url : http://v.juhe.cn/weixin/redirect?wid=wechat_20170403014537
             */

            private String id;
            private String title;
            private String source;
            private String firstImg;
            private String mark;
            private String url;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getFirstImg() {
                return firstImg;
            }

            public void setFirstImg(String firstImg) {
                this.firstImg = firstImg;
            }

            public String getMark() {
                return mark;
            }

            public void setMark(String mark) {
                this.mark = mark;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
