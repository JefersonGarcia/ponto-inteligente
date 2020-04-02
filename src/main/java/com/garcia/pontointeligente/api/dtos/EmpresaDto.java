package com.garcia.pontointeligente.api.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmpresaDto {

	private Long id;
	private String razaoSocial;
	private String cnpj;
	
}
