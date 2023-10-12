package Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        String s = context.getBean(String.class);
        System.out.println(s);
        Integer i = context.getBean(Integer.class);
        System.out.println(i);

        //multiple object of the same type Parrot.
        //the next line will give us an Exception because there are 3 objects : Parrot1 ,Parrot2 and Parrot3.

        /*
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        */

        //we need to make the next steps.

        Parrot p1  = context.getBean("parrot1",Parrot.class);//we need to define the method name of the bean.
        System.out.println(p1.getName());
        Parrot p2  = context.getBean("parrot2",Parrot.class);
        System.out.println(p2.getName());
        Parrot p3  = context.getBean("parrot3",Parrot.class);
        System.out.println(p3.getName());
        Parrot p4  = context.getBean("myParrot",Parrot.class);//we used the @Bean (name ="myParrot") here
        System.out.println(p4.getName());



    }
}