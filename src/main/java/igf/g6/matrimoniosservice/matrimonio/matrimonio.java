package igf.g6.matrimoniosservice.matrimonio;

import javax.persistence.*;

@Entity
@Table(name = "matrimonio")
class matrimonio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nombreEsposo")
    private String nombreEsposo;
    @Column(name = "nombreEsposa")
    private String nombreEsposa;

    public matrimonio() {

    }
    public matrimonio(String nombreEsposo, String nombreEsposa) {
        this.nombreEsposo = nombreEsposo;
        this.nombreEsposa = nombreEsposa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreEsposo() {
        return nombreEsposo;
    }

    public void setNombreEsposo(String nombreEsposo) {
        this.nombreEsposo = nombreEsposo;
    }

    public String getNombreEsposa() {
        return nombreEsposa;
    }

    public void setNombreEsposa(String nombreEsposa) {
        this.nombreEsposa = nombreEsposa;
    }
}