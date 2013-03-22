package classes;
public class Cliente {
    private String codigo;
    private String nome;
    private String CPF;
    private String telefone;
    private String email;
    private String estado_civil;
    private Endereço endereco;

    public Cliente(String codigo, String nome, String CPF, String telefone, String email, String estado_civil, Endereço endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
        this.estado_civil = estado_civil;
        this.endereco = endereco;
    }

    public Cliente() {
        
    }

    
    
    public String getInfCliente(){
        String str = "";
        
        str += "Nome: " + nome +  "\n";
        str += "Código: " + codigo + "\n";
        str += "CPF: " + CPF + "\n";
        str += "Telefone: " + telefone + "\n";
        str += "E-mail: " + email + "\n";
        str += "Estado Civil: " + estado_civil + "\n";
        str += endereco.getInfEndereco();
        
        return str;
    }
    
    boolean validarCPF(String cpf) 
    {
        if (cpf.length()==11 && cpf.isEmpty() == false)
        {
            return true;
        }
        else
            return false;
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public Endereço getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }

    public void setCodigo(int parseInt) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    
    }

   
    
    
    
    
    
    


