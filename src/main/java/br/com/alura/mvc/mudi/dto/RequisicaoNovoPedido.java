package br.com.alura.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;

public class RequisicaoNovoPedido {
	
	@NotBlank
	private String nomeProduto;
	
	@NotBlank
	private String urlDoProduto;
	
	@NotBlank
	private String urlDaImagem;
	private String descricao;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getUrlProduto() {
		return urlDoProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlDoProduto = urlProduto;
	}
	public String getUrlImagem() {
		return urlDaImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlDaImagem = urlImagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setDescricao(descricao);
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlDaImagem(urlDaImagem);
		pedido.setUrlDoProduto(urlDoProduto);
		pedido.setStatus(StatusPedido.AGUARDANDO);
		return pedido;
	}
	
	
}
