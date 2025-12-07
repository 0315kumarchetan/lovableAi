package com.chetan.lovableAI.dto.usage;

public record UsageTodayResponse(
                                 Integer tokensUsed,
                                 Integer tokensLimit,
                                 Integer previewsRunning,
                                 Integer previewsLimit
) {
}
