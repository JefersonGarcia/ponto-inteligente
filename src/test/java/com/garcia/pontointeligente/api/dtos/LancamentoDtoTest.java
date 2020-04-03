package com.garcia.pontointeligente.api.dtos;

import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LancamentoDtoTest {

	private Long id;
	
	@NotEmpty(message = "Data não pode ser vazia.")
	private String data;
	
	private String tipo;
	private String descricao;
	private String localizacao;
	private Long funcionarioId;

	@Override
	public String toString() {
		return "LancamentoDto [id=" + id + ", data=" + data + ", tipo=" + tipo + ", descricao=" + descricao
				+ ", localizacao=" + localizacao + ", funcionarioId=" + funcionarioId + "]";
	}
}
