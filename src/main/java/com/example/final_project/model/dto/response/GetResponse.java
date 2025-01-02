package com.example.final_project.model.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.time.LocalDateTime;

public class GetResponse {
    public static ResponseEntity<?> getResponse(String message, Object data){
        return ResponseEntity.status(HttpStatus.OK).body(
                new APIResponse<>(
                        message,
                        data,
                        HttpStatus.OK,
                        LocalDateTime.now()
                )
        );
    }
}