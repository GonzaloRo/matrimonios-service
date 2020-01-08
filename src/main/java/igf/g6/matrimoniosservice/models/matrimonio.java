package igf.g6.matrimoniosservice.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "matrimonio")
public class matrimonio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nombre1Esposo")
    private String nombre1Esposo;
    @Column(name = "nombre2Esposo")
    private String nombre2Esposo;
    @Column(name = "apellido1Esposo")
    private String apellido1Esposo;
    @Column(name = "apellido2Esposo")
    private String apellido2Esposo;
    @Column(name = "nombre1Esposa")
    private String nombre1Esposa;
    @Column(name = "nombre2Esposa")
    private String nombre2Esposa;
    @Column(name = "apellido1Esposa")
    private String apellido1Esposa;
    @Column(name = "apellido2Esposa")
    private String apellido2Esposa;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "idEsposo")
    private long idEsposo;
    @Column(name = "idEsposa")
    private long idEsposa;
    @Column(name = "folio")
    private int folio;
    @Column(name = "libro")
    private int libro;
    @Column(name = "departamento")
    private String departamento;


    public matrimonio() {
    }

    public matrimonio(String nombre1Esposa, String nombre2Esposa, String apellido1Esposa,
                      String apellido2Esposa, String nombre1Esposo,
                      String nombre2Esposo, String apellido1Esposo,
                      String apellido2Esposo, String departamento,
                      Date fecha, long id_esposa, int libro, int folio,
                      long id_esposo) {
        this.nombre1Esposo = nombre1Esposo;
        this.nombre2Esposo = nombre2Esposo;
        this.apellido1Esposo = apellido1Esposo;
        this.apellido2Esposo = apellido2Esposo;
        this.nombre1Esposa = nombre1Esposa;
        this.nombre2Esposa = nombre2Esposa;
        this.apellido1Esposa = apellido1Esposa;
        this.apellido2Esposa = apellido2Esposa;
        this.fecha = fecha;
        this.idEsposa = id_esposa;
        this.idEsposo = id_esposo;
        this.libro = libro;
        this.folio = folio;
        this.departamento = departamento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getId_esposo() {
        return idEsposo;
    }

    public void setId_esposo(long id_esposo) {
        this.idEsposo = id_esposo;
    }

    public long getId_esposa() {
        return idEsposa;
    }

    public void setId_esposa(long id_esposa) {
        this.idEsposa = id_esposa;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getLibro() {
        return libro;
    }

    public void setLibro(int libro) {
        this.libro = libro;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}










