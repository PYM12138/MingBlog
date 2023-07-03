package com.pym.mingblog.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {


    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //第一个坑
        // WebMvcAutoConfiguration 这个注解中有一个特殊的条件(自动访问static文件下的路径)。当 WebMvcConfigurationSupport 没有加载时才生效，而为了使浏览器端不造成ID精度的丢失，配置了扩展MVC框架的消息转换器，使WebMvcConfigurationSupport加载了，无法使WebMvcAutoConfiguration生效。
       /* @ConditionalOnMissingBean({WebMvcConfigurationSupport.class})
        @AutoConfigureOrder(-2147483638)
        public class WebMvcAutoConfiguration {*/

        registry.addResourceHandler("/**", "/webjars/**").addResourceLocations("classpath:/static/", "/webjars/");
/*        registry.addResourceHandler()
                .addResourceLocations("/webjars/");*/

//        有webjars-location 才能用下面的，其实这些也是设置来的
               /* .resourceChain(false)
                .addResolver(new WebJarsResourceResolver())
                .addResolver(new PathResourceResolver());*/
    }

//    @Bean
//    public LocaleResolver localeResolver(){
//        return new MyI18n();
//    }


    //    @Override
//    protected void addInterceptors(InterceptorRegistry registry) {
//        //这边写拦截路径,两种写法都行，(会干扰静态资源访问) 验证这一步必须一开始就要做
//        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
//                .excludePathPatterns("/","/index.html", "/**/*.html", "/**/*.css", "/**/*.js","/**/*.svg");
////        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/main.html","/emp/**","/emps");
//    }
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        //第二个坑
        //妈的，手动重写这个配置，直接生效hiddenMethod，尼玛的，配置都没这个管用！我焯！
        //spring boot 2.7.2 开启hiddenMethod 认准HiddenHttpMethodFilter！
        HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
        methodFilter.setMethodParam("_method");//更改_method名的
        return methodFilter;
    }

}
