package com.audio.audio_transcribe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AudioTranscribeApplication {

	public static void main(String[] args) {
		System.out.println("Here is the start flow - Audio Transcribe AI");
		SpringApplication.run(AudioTranscribeApplication.class, args);
	}

}
