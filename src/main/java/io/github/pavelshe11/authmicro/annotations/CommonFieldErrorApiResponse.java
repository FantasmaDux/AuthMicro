package io.github.pavelshe11.authmicro.annotations;

import io.github.pavelshe11.authmicro.api.dto.ErrorDto;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@ApiResponses({
        @ApiResponse(
                responseCode = "400",
                description = "Неверно указаны данные",
                content = @Content(schema = @Schema(implementation = ErrorDto.class),
                        examples = {
                                @ExampleObject(
                                        name = "FieldValidationException",
                                        summary = "Ошибка регистрации",
                                        value = """
                                                {
                                                  "error": "Ошибка регистрации",
                                                  "detailedErrors": [
                                                    {
                                                      "field": "email",
                                                      "message": "Некорректный формат Email."
                                                    },
                                                    {
                                                      "field": "firstName",
                                                      "message": "Поле пустое."
                                                    },
                                                    {
                                                      "field": "acceptedPrivacyPolicy",
                                                      "message": "Не принято пользовательское соглашение."
                                                    },
                                                    {
                                                      "field": "acceptedPersonalDataProcessing",
                                                      "message": "Не принято соглашение на обработку персональных данных."
                                                    }
                                                  ]
                                                }
                                                """
                                )
                        }
                )
        )
})
public @interface CommonFieldErrorApiResponse {

}
