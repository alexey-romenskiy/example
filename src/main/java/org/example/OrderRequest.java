package org.example;

import org.springframework.lang.NonNull;

import java.math.BigDecimal;

public record OrderRequest(
        @NonNull BigDecimal amount
) {
    // empty
}
