package io.noobi.jpa;

import io.noobi.jpa.model.Author;
import io.noobi.jpa.model.Video;
import io.noobi.jpa.repository.AuthorRepository;
import io.noobi.jpa.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	// @Bean
	public CommandLineRunner commandLineRunner(
		AuthorRepository authorRepository,
		VideoRepository videoRepository
	) {
		return args -> {
			/*Author author = Author.builder()
					.firstName("santo")
					.lastName("Santhosh")
					.email("santosanthosh7656@gmail.com")
					.age(20)
					.build();
			authorRepository.save(author);*/
			Video video= Video.builder()
					.name("xyz")
					.length(5)
					.build();
			videoRepository.save(video);
		};
	}
}
