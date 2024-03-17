package M2024_03;

//public interface MessageService {
//    String getMessage();
//}
//
//public class EmailService implements MessageService {
//    @Override
//    public String getMessage() {
//        return "Email Message";
//    }
//}
//
//public class SMSService implements MessageService {
//    @Override
//    public String getMessage() {
//        return "SMS Message";
//    }
//}
//
//public class MyApplication {
//    private MessageService service;
//
//    // 의존성 주입을 통해 MessageService 구현체를 주입받음
//    public MyApplication(MessageService service) {
//        this.service = service;
//    }
//
//    public void processMessage() {
//        System.out.println(service.getMessage());
//    }
//}
//
//public class IOP {
//    public static void main(String[] args) {
//        // Spring 컨테이너를 사용하여 객체 생성과 의존성 주입을 관리
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        MyApplication app = context.getBean(MyApplication.class);
//        app.processMessage();
//    }
//}
//
//@Configuration
//public class AppConfig {
//    @Bean
//    public MessageService emailService() {
//        return new EmailService();
//    }
//
//    @Bean
//    public MyApplication myApplication() {
//        return new MyApplication(emailService());
//    }
//}

