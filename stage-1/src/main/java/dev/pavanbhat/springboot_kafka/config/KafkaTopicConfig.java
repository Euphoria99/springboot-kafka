package dev.pavanbhat.springboot_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic javaguidesTopic(){
        return TopicBuilder.name("JavaGuides")
                .build();
    }

    @Bean
    public NewTopic javaguidesJSONTopic(){
        return TopicBuilder.name("JavaGuides_JSON")
                .build();
    }
}
