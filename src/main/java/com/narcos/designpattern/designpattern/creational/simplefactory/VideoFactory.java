package com.narcos.designpattern.designpattern.creational.simplefactory;

/**
 * @author hbj
 * @date 2020/3/6 10:04 下午
 */
public class VideoFactory {
    // 类似的实现代码：Calendar createInstance
    // 此处便不遵循开闭原则。此时若要添加一种新的课程，则需要对getVideo方法修改
//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new PythonVideo();
//        } else {
//            return null;
//        }
//    }

    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
