package com.katas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HitchHikerTest {
    @Test
    public void answer_shoud_be_42() {
        // Arrange
        HitchHiker hitchHiker = new HitchHiker();

        // Act
        int answer = hitchHiker.answer();

        // Assert
        assertThat(answer).isEqualTo(42);
    }
}
