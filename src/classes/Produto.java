package classes;

import java.util.Date;

public class Produto {
    private String codigo;
    private String nome;
    private String fornecedor;
    private int qtd_estoque;
    private float valor_unitario;
    private Date data_validade;

    public Produto(String codigo, String nome, String fornecedor, float qtd_estoque, float valor_unitario, Date data_validade) {
        this.codigo = codigo;
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.qtd_estoque = (int) qtd_estoque;
        this.valor_unitario = valor_unitario;
        this.data_validade = data_validade;
    }
    
    public Produto() {
       
    }
    
    int darBaixa (int quantidade) {
        if (quantidade < qtd_estoque) {
            quantidade--;
}
         return quantidade;
    }
        

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public float getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(float valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public Date getData_validade() {
        return data_validade;
    }

    public void setData_validade(Date data_validade) {
        this.data_validade = data_validade;
    }
}

