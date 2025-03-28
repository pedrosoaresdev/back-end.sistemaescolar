package model;

public abstract class caracteregeral {
    private String none;
    private String id;

    public caracteregeral( String none, String id){
    this.nome = nome;
    this.id = id;
  }

    public String getNone() {
        return nome;
    }

    public void setNone(String none) {
        this.none = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "caracteregeral{" +
                "nome=' " + nome + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

}