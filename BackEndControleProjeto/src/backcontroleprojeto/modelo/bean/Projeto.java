package backcontroleprojeto.modelo.bean;


public class Projeto {
    
    private int id;
    private String nome;
    private String tipo;
    private String descricao;

    public Projeto(int id) {
        this.id = id;
    }

    public Projeto(String nome) {
        this.nome = nome;
    }

    public Projeto(int id, String nome, String tipo, String descricao) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao= descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "Projeto{" + "id=" + id + ", nome=" + nome +", tipo=" + tipo + ", descricao=" + descricao+ '}';
    }
    
    
}
