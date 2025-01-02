package com.example.final_project.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileResponse {
    private String fileName;
    private String fileUrl;
    private String fileType;
    private Long fileSize;
}

