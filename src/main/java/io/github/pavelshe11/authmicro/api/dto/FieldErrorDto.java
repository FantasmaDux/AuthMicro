package io.github.pavelshe11.authmicro.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Ответ ошибки")
public class FieldErrorDto {
    @Schema(description = "Поле ошибки")
    private String field;
    @Schema(description = "Сообщение ошибки")
    private String message;
}
