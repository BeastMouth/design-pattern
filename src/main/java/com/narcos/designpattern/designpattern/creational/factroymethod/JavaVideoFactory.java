package com.narcos.designpattern.designpattern.creational.factroymethod;

/**
 * @author hbj
 * @date 2020/3/8 2:33 下午
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
