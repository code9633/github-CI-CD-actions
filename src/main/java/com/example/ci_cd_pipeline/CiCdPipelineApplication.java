package com.example.ci_cd_pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdPipelineApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Demo application of github CI/CD actions";
	}

//	echo "# github-ci-cd-actions" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/code9633/github-ci-cd-actions.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(CiCdPipelineApplication.class, args);
	}

}
