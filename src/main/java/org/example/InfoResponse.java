package org.example;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.math.BigDecimal;

public record InfoResponse(
        @NonNull String data,
        @Nullable BigDecimal amount
) {
    // empty
}
