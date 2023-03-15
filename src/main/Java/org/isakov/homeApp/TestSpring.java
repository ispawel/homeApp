package org.isakov.homeApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // Указание пути и создание указанного бина
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Получаение обьекта
        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());

        // Обязатеьное закрытие ApplicationContext
        context.close();
    }
}
