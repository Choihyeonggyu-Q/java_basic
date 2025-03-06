package siat.study.post.domain;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostResponseDTO {
    private String          title;
    private String          content;
    private String          writer;
    private LocalDateTime   regdate;
    private int             viewCnt;
}
