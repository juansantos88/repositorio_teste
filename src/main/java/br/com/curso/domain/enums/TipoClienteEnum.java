package br.com.curso.domain.enums;

public enum TipoClienteEnum {
	
	PESSO_FISICA(1,"Pessoa Física"),
	PESSOA_JURIDICA(2,"Pessoa Jurídica");
	
	private Integer codigo;
	private String descricao;
	
	private TipoClienteEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoClienteEnum buscarTipoCliente(Integer codigo) {
		for (TipoClienteEnum tp : TipoClienteEnum.values()) {
			if(tp.getCodigo().equals(codigo)) {
				return tp;
			}
		}
		return null;
		
	}
	
	

}
