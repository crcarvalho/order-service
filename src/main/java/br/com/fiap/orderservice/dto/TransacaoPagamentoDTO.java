package br.com.fiap.orderservice.dto;


import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TransacaoPagamentoDTO {

    private String id;
    private String numeroCartao;
    private String dataValidadeCartao;
    private String bandeira;


}
