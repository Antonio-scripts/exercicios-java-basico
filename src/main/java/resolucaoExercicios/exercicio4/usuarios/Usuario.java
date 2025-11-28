package resolucaoExercicios.exercicio4.usuarios;

public abstract class Usuario {
    private String nome;
    private String email;
    private String senha;
    private boolean adiministrador;

    public Usuario(String nome, String email, String senha, boolean adiministrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.adiministrador = adiministrador;
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdiministrador() {
        return adiministrador;
    }

    public void login() {
        System.out.println("Realizando Login");
    }

    public void logoff() {
        System.out.println("Realizando Logoff");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        setNome(novoNome);
        setEmail(novoEmail);
    }

    public void alterarSenha(String novaSenha) {
        setSenha(novaSenha);
    }
}
