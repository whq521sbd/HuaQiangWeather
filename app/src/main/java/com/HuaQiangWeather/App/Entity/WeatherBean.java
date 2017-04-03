package com.HuaQiangWeather.App.Entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/3/003.
 */

public class WeatherBean implements Serializable {

    /**
     * resultcode : 200
     * reason : successed!
     * result : {"sk":{"temp":"16","wind_direction":"南风","wind_strength":"2级","humidity":"44%","time":"08:37"},"today":{"temperature":"13℃~24℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"南风3-4 级","week":"星期一","city":"济南","date_y":"2017年04月03日","dressing_index":"较舒适","dressing_advice":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。","uv_index":"中等","comfort_index":"","wash_index":"较适宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""},"future":{"day_20170403":{"temperature":"13℃~24℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"南风3-4 级","week":"星期一","date":"20170403"},"day_20170404":{"temperature":"12℃~19℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"南风3-4 级","week":"星期二","date":"20170404"},"day_20170405":{"temperature":"14℃~20℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"南风微风","week":"星期三","date":"20170405"},"day_20170406":{"temperature":"14℃~23℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"北风微风","week":"星期四","date":"20170406"},"day_20170407":{"temperature":"10℃~22℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风微风","week":"星期五","date":"20170407"},"day_20170408":{"temperature":"14℃~23℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"北风微风","week":"星期六","date":"20170408"},"day_20170409":{"temperature":"14℃~23℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"北风微风","week":"星期日","date":"20170409"}}}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

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
         * sk : {"temp":"16","wind_direction":"南风","wind_strength":"2级","humidity":"44%","time":"08:37"}
         * today : {"temperature":"13℃~24℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"南风3-4 级","week":"星期一","city":"济南","date_y":"2017年04月03日","dressing_index":"较舒适","dressing_advice":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。","uv_index":"中等","comfort_index":"","wash_index":"较适宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""}
         * future : {"day_20170403":{"temperature":"13℃~24℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"南风3-4 级","week":"星期一","date":"20170403"},"day_20170404":{"temperature":"12℃~19℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"南风3-4 级","week":"星期二","date":"20170404"},"day_20170405":{"temperature":"14℃~20℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"南风微风","week":"星期三","date":"20170405"},"day_20170406":{"temperature":"14℃~23℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"北风微风","week":"星期四","date":"20170406"},"day_20170407":{"temperature":"10℃~22℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风微风","week":"星期五","date":"20170407"},"day_20170408":{"temperature":"14℃~23℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"北风微风","week":"星期六","date":"20170408"},"day_20170409":{"temperature":"14℃~23℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"北风微风","week":"星期日","date":"20170409"}}
         */

        private SkBean sk;
        private TodayBean today;
        private FutureBean future;

        public SkBean getSk() {
            return sk;
        }

        public void setSk(SkBean sk) {
            this.sk = sk;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public FutureBean getFuture() {
            return future;
        }

        public void setFuture(FutureBean future) {
            this.future = future;
        }

        public static class SkBean {
            /**
             * temp : 16
             * wind_direction : 南风
             * wind_strength : 2级
             * humidity : 44%
             * time : 08:37
             */

            private String temp;
            private String wind_direction;
            private String wind_strength;
            private String humidity;
            private String time;

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_strength() {
                return wind_strength;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class TodayBean {
            /**
             * temperature : 13℃~24℃
             * weather : 晴转多云
             * weather_id : {"fa":"00","fb":"01"}
             * wind : 南风3-4 级
             * week : 星期一
             * city : 济南
             * date_y : 2017年04月03日
             * dressing_index : 较舒适
             * dressing_advice : 建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。
             * uv_index : 中等
             * comfort_index :
             * wash_index : 较适宜
             * travel_index : 较适宜
             * exercise_index : 较适宜
             * drying_index :
             */

            private String temperature;
            private String weather;
            private WeatherIdBean weather_id;
            private String wind;
            private String week;
            private String city;
            private String date_y;
            private String dressing_index;
            private String dressing_advice;
            private String uv_index;
            private String comfort_index;
            private String wash_index;
            private String travel_index;
            private String exercise_index;
            private String drying_index;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBean getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBean weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getDate_y() {
                return date_y;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public static class WeatherIdBean {
                /**
                 * fa : 00
                 * fb : 01
                 */

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class FutureBean {
            /**
             * day_20170403 : {"temperature":"13℃~24℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"南风3-4 级","week":"星期一","date":"20170403"}
             * day_20170404 : {"temperature":"12℃~19℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"南风3-4 级","week":"星期二","date":"20170404"}
             * day_20170405 : {"temperature":"14℃~20℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"南风微风","week":"星期三","date":"20170405"}
             * day_20170406 : {"temperature":"14℃~23℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"北风微风","week":"星期四","date":"20170406"}
             * day_20170407 : {"temperature":"10℃~22℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风微风","week":"星期五","date":"20170407"}
             * day_20170408 : {"temperature":"14℃~23℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"北风微风","week":"星期六","date":"20170408"}
             * day_20170409 : {"temperature":"14℃~23℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"北风微风","week":"星期日","date":"20170409"}
             */

            private Day20170403Bean day_20170403;
            private Day20170404Bean day_20170404;
            private Day20170405Bean day_20170405;
            private Day20170406Bean day_20170406;
            private Day20170407Bean day_20170407;
            private Day20170408Bean day_20170408;
            private Day20170409Bean day_20170409;

            public Day20170403Bean getDay_20170403() {
                return day_20170403;
            }

            public void setDay_20170403(Day20170403Bean day_20170403) {
                this.day_20170403 = day_20170403;
            }

            public Day20170404Bean getDay_20170404() {
                return day_20170404;
            }

            public void setDay_20170404(Day20170404Bean day_20170404) {
                this.day_20170404 = day_20170404;
            }

            public Day20170405Bean getDay_20170405() {
                return day_20170405;
            }

            public void setDay_20170405(Day20170405Bean day_20170405) {
                this.day_20170405 = day_20170405;
            }

            public Day20170406Bean getDay_20170406() {
                return day_20170406;
            }

            public void setDay_20170406(Day20170406Bean day_20170406) {
                this.day_20170406 = day_20170406;
            }

            public Day20170407Bean getDay_20170407() {
                return day_20170407;
            }

            public void setDay_20170407(Day20170407Bean day_20170407) {
                this.day_20170407 = day_20170407;
            }

            public Day20170408Bean getDay_20170408() {
                return day_20170408;
            }

            public void setDay_20170408(Day20170408Bean day_20170408) {
                this.day_20170408 = day_20170408;
            }

            public Day20170409Bean getDay_20170409() {
                return day_20170409;
            }

            public void setDay_20170409(Day20170409Bean day_20170409) {
                this.day_20170409 = day_20170409;
            }

            public static class Day20170403Bean {
                /**
                 * temperature : 13℃~24℃
                 * weather : 晴转多云
                 * weather_id : {"fa":"00","fb":"01"}
                 * wind : 南风3-4 级
                 * week : 星期一
                 * date : 20170403
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanX {
                    /**
                     * fa : 00
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170404Bean {
                /**
                 * temperature : 12℃~19℃
                 * weather : 小雨
                 * weather_id : {"fa":"07","fb":"07"}
                 * wind : 南风3-4 级
                 * week : 星期二
                 * date : 20170404
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXX {
                    /**
                     * fa : 07
                     * fb : 07
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170405Bean {
                /**
                 * temperature : 14℃~20℃
                 * weather : 多云
                 * weather_id : {"fa":"01","fb":"01"}
                 * wind : 南风微风
                 * week : 星期三
                 * date : 20170405
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXX {
                    /**
                     * fa : 01
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170406Bean {
                /**
                 * temperature : 14℃~23℃
                 * weather : 晴转多云
                 * weather_id : {"fa":"00","fb":"01"}
                 * wind : 北风微风
                 * week : 星期四
                 * date : 20170406
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXX {
                    /**
                     * fa : 00
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170407Bean {
                /**
                 * temperature : 10℃~22℃
                 * weather : 多云
                 * weather_id : {"fa":"01","fb":"01"}
                 * wind : 北风微风
                 * week : 星期五
                 * date : 20170407
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXX {
                    /**
                     * fa : 01
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170408Bean {
                /**
                 * temperature : 14℃~23℃
                 * weather : 晴转多云
                 * weather_id : {"fa":"00","fb":"01"}
                 * wind : 北风微风
                 * week : 星期六
                 * date : 20170408
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXX {
                    /**
                     * fa : 00
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170409Bean {
                /**
                 * temperature : 14℃~23℃
                 * weather : 晴转多云
                 * weather_id : {"fa":"00","fb":"01"}
                 * wind : 北风微风
                 * week : 星期日
                 * date : 20170409
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXXX {
                    /**
                     * fa : 00
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }
        }
    }
}
