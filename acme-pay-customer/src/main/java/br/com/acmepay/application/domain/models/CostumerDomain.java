package br.com.acmepay.application.domain.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CostumerDomain {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String document;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
