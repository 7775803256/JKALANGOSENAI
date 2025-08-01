public class Criador {
    private String nome;
    private String perfil;
    private String email;
    private String telefone;
    public Criador(String nome,String perfil,String email,String telefone){
        this.nome=nome;
        this.perfil=perfil;
        this.email=email;
        this.telefone=telefone;

    } 
    //Crie construtores, gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    //Crie uma lista de Criadores

}
