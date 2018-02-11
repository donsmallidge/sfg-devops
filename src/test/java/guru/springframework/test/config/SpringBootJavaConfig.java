package guru.springframework.test.config;

import guru.springframework.test.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootJavaConfig {

    @Value("${guru.jms.server}")
    private String jmsServer;

    @Value("${guru.jms.port}")
    private Integer jmsPort;

    @Value("${guru.jms.user}")
    private String jmsUser;

    @Value("${guru.jms.password}")
    private String jmsPassword;

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUrl(jmsServer);
        fakeJmsBroker.setPort(jmsPort);
        fakeJmsBroker.setUser(jmsUser);
        fakeJmsBroker.setPassword(jmsPassword);
        return fakeJmsBroker;
    }

}
