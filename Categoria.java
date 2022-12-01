public class Categoria {
  private int id;
  private String nome;
  private String status = "ATIVA";

  public Categoria(int id, String nome) {
    this.id = id;
    this.nome = nome;
  }

  public Categoria(int id, String nome, String status) {
    this(id, nome);
    this.status = status;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
