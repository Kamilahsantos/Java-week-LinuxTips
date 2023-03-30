package com.linuxtips.javaweekapi.unit;

import com.linuxtips.javaweekapi.core.domain.Curso;
import com.linuxtips.javaweekapi.core.exceptions.ValidationException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCurso {
    @Test
    public void RetornaErroSeIdNulo() {
        Exception exception = assertThrows(ValidationException.class, () -> {
            new Curso("", "Test", 1.00, "Test");
        });
        assertEquals("Id não pode ser nulo", exception.getMessage());
    }

    @Test
    public void RetornaErroSeNomeNulo() {
        Exception exception = assertThrows(ValidationException.class, () -> {
            new Curso("1", "", 1.00, "Test");
        });
        assertEquals("Nome não pode ser nulo", exception.getMessage());
    }

    @Test
    public void RetornaErroSePrecoNegativo() {
        Exception exception = assertThrows(ValidationException.class, () -> {
            new Curso("1", "Test", -1.00, "Test");
        });
        assertEquals("Preço não pode ser negativo", exception.getMessage());
    }

    @Test
    public void RetornaErroSePessoaInstrutoraNula() {
        Exception exception = assertThrows(ValidationException.class, () -> {
            new Curso("1", "Test", 1.00, "");
        });
        assertEquals("Pessoa Instrutora não pode ser nulo", exception.getMessage());
    }
}
