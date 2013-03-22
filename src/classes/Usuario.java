
package classes;

public class Usuario {
    
    private String usuario;
    private String senha;
    
    public Usuario(){
    this.usuario = "" ;
    this.senha = "" ;
    }
    
    public boolean validarsenha(String senha)
    {
    if(senha.length()>=6 && senha.isEmpty()==false)
            {
            System.out.println("Senha valida!");
            return true;
            }
    else 
        return false;
    }
    
     public boolean validarusuario(String usuario){
        
        if (usuario.isEmpty()== false)
        {   
            return true;
        }
        else
        {
            return false;
        }
    }
        
        public boolean efetuarlogin(String usuario, String senha)
        {
            usuario = usuario.toUpperCase();
            senha = senha.toUpperCase();
            
            if(getSenha().equals(senha)&& getUsuario().equals(usuario))
            {
                return true;
            }
            else
                return false;
        }

    
        
        public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
        
        
        
            
        
            
                
            
            
            
        }
        
    
    

