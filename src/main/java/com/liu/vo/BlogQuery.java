package com.liu.vo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BlogQuery {

    private String title;
    private Long typeId;
    private boolean recommend;
}
