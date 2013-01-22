package com.grupokx;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the templates database table.
 *
 */
@Entity
@Table(name = "formatos")
public class ModelEJBModuleTest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "formato_id")
    private int fomatoId;
    @Column(name = "nombre_formato")
    private String nombreFormato;
    private String codigo;
    @Column(name = "campos_requeridos")
    private boolean camposRequeridos;
    @Column(name = "width_maximo_sugerido_imagenes")
    private String widthMaximoSugeridoImagen;
    @Lob
    private String html;
    @Column(name = "numero_imagenes")
    private int numeroImagenes;
    @Column(name = "numero_texto")
    private int numeroTexto;
    @Column(name = "url_imagen_vista_previa")
    private String urlImagenVistaPrevia;
    @Column(name = "url_imagen_maqueta")
    private String urlImagenMaqueta;
        
    public ModelEJBModuleTest() {
    }

    public void setFomatoId(int fomatoId) {
        this.fomatoId = fomatoId;
    }

    public int getFomatoId() {
        return fomatoId;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHtml() {
        return this.html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public int getNumeroImagenes() {
        return this.numeroImagenes;
    }

    public void setNumeroImagenes(int numeroImagenes) {
        this.numeroImagenes = numeroImagenes;
    }

    public int getNumeroTexto() {
        return this.numeroTexto;
    }

    public void setNumeroTexto(int numeroTexto) {
        this.numeroTexto = numeroTexto;
    }

    public String getUrlImagenVistaPrevia() {
        return this.urlImagenVistaPrevia;
    }

    public void setUrlImagenVistaPrevia(String urlImagenVistaPrevia) {
        this.urlImagenVistaPrevia = urlImagenVistaPrevia;
    }

    /**
     * @return the nombreFormato
     */
    public String getNombreFormato() {
        return nombreFormato;
    }

    /**
     * @param nombreFormato the nombreFormato to set
     */
    public void setNombreFormato(String nombreFormato) {
        this.nombreFormato = nombreFormato;
    }

    /**
     * @return the urlImagenMaqueta
     */
    public String getUrlImagenMaqueta() {
        return urlImagenMaqueta;
    }

    /**
     * @param urlImagenMaqueta the urlImagenMaqueta to set
     */
    public void setUrlImagenMaqueta(String urlImagenMaqueta) {
        this.urlImagenMaqueta = urlImagenMaqueta;
    }

    /**
     * @return the camposRequeridos
     */
    public boolean isCamposRequeridos() {
        return camposRequeridos;
    }

    /**
     * @param camposRequeridos the camposRequeridos to set
     */
    public void setCamposRequeridos(boolean camposRequeridos) {
        this.camposRequeridos = camposRequeridos;
    }

    /**
     * @return the widthMaximoSugeridoImagen
     */
    public String getWidthMaximoSugeridoImagen() {
        return widthMaximoSugeridoImagen;
    }

    /**
     * @param widthMaximoSugeridoImagen the widthMaximoSugeridoImagen to set
     */
    public void setWidthMaximoSugeridoImagen(String widthMaximoSugeridoImagen) {
        this.widthMaximoSugeridoImagen = widthMaximoSugeridoImagen;
    }
}