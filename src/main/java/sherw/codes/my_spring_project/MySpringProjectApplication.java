package sherw.codes.my_spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySpringProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MySpringProjectApplication.class, args);

        BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 12);

        System.out.println("Result: " + result);
    }
}
