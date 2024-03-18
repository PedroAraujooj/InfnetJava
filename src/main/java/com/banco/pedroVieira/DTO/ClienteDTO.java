package com.banco.pedroVieira.DTO;

import lombok.NonNull;

public record ClienteDTO(
        String cpf,
        String nome,
        Double salarioMensal
                         ) {


}
