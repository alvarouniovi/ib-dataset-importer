//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.03.01 a las 10:35:31 AM CET 
//

package es.um.asio.importer.oaipmh.model.xsd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Clase Java para anonymous complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publicadoEnPublicacionImpacto" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="eanucc13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tieneLibroDePublicacion" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tieneColeccionDePublicacion" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="palabraClave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paginaInicio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="paginaFinal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="autorCorrespondiente" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="listaDeAutores" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded"&gt;
 *                   &lt;element name="Autor" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="resumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lugarDePublicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="abreviatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organizacionCorrespondiente" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tieneMetrica" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "ArticuloAcademico", namespace = "http://www.openarchives.org/OAI/2.0/")
public class ArticuloAcademico {

	protected String id;
	protected ArticuloAcademico.PublicadoEnPublicacionImpacto publicadoEnPublicacionImpacto;
	protected String eanucc13;
	protected ArticuloAcademico.TieneLibroDePublicacion tieneLibroDePublicacion;
	protected ArticuloAcademico.TieneColeccionDePublicacion tieneColeccionDePublicacion;
	@XmlElement(required = true)
	protected String titulo;
	protected String palabraClave;
	protected Integer paginaInicio;
	protected Integer paginaFinal;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar fecha;
	protected ArticuloAcademico.AutorCorrespondiente autorCorrespondiente;
	protected ArticuloAcademico.ListaDeAutores listaDeAutores;
	protected String resumen;
	protected String doi;
	protected String lugarDePublicacion;
	protected String abreviatura;
	protected ArticuloAcademico.OrganizacionCorrespondiente organizacionCorrespondiente;
	protected ArticuloAcademico.TieneMetrica tieneMetrica;

	/**
	 * Obtiene el valor de la propiedad id.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Define el valor de la propiedad id.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Obtiene el valor de la propiedad publicadoEnPublicacionImpacto.
	 * 
	 * @return possible object is
	 *         {@link ArticuloAcademico.PublicadoEnPublicacionImpacto }
	 * 
	 */
	public ArticuloAcademico.PublicadoEnPublicacionImpacto getPublicadoEnPublicacionImpacto() {
		return publicadoEnPublicacionImpacto;
	}

	/**
	 * Define el valor de la propiedad publicadoEnPublicacionImpacto.
	 * 
	 * @param value allowed object is
	 *              {@link ArticuloAcademico.PublicadoEnPublicacionImpacto }
	 * 
	 */
	public void setPublicadoEnPublicacionImpacto(ArticuloAcademico.PublicadoEnPublicacionImpacto value) {
		this.publicadoEnPublicacionImpacto = value;
	}

	/**
	 * Obtiene el valor de la propiedad eanucc13.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEanucc13() {
		return eanucc13;
	}

	/**
	 * Define el valor de la propiedad eanucc13.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEanucc13(String value) {
		this.eanucc13 = value;
	}

	/**
	 * Obtiene el valor de la propiedad tieneLibroDePublicacion.
	 * 
	 * @return possible object is {@link ArticuloAcademico.TieneLibroDePublicacion }
	 * 
	 */
	public ArticuloAcademico.TieneLibroDePublicacion getTieneLibroDePublicacion() {
		return tieneLibroDePublicacion;
	}

	/**
	 * Define el valor de la propiedad tieneLibroDePublicacion.
	 * 
	 * @param value allowed object is
	 *              {@link ArticuloAcademico.TieneLibroDePublicacion }
	 * 
	 */
	public void setTieneLibroDePublicacion(ArticuloAcademico.TieneLibroDePublicacion value) {
		this.tieneLibroDePublicacion = value;
	}

	/**
	 * Obtiene el valor de la propiedad tieneColeccionDePublicacion.
	 * 
	 * @return possible object is
	 *         {@link ArticuloAcademico.TieneColeccionDePublicacion }
	 * 
	 */
	public ArticuloAcademico.TieneColeccionDePublicacion getTieneColeccionDePublicacion() {
		return tieneColeccionDePublicacion;
	}

	/**
	 * Define el valor de la propiedad tieneColeccionDePublicacion.
	 * 
	 * @param value allowed object is
	 *              {@link ArticuloAcademico.TieneColeccionDePublicacion }
	 * 
	 */
	public void setTieneColeccionDePublicacion(ArticuloAcademico.TieneColeccionDePublicacion value) {
		this.tieneColeccionDePublicacion = value;
	}

	/**
	 * Obtiene el valor de la propiedad titulo.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Define el valor de la propiedad titulo.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTitulo(String value) {
		this.titulo = value;
	}

	/**
	 * Obtiene el valor de la propiedad palabraClave.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPalabraClave() {
		return palabraClave;
	}

	/**
	 * Define el valor de la propiedad palabraClave.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPalabraClave(String value) {
		this.palabraClave = value;
	}

	/**
	 * Obtiene el valor de la propiedad paginaInicio.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPaginaInicio() {
		return paginaInicio;
	}

	/**
	 * Define el valor de la propiedad paginaInicio.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setPaginaInicio(Integer value) {
		this.paginaInicio = value;
	}

	/**
	 * Obtiene el valor de la propiedad paginaFinal.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPaginaFinal() {
		return paginaFinal;
	}

	/**
	 * Define el valor de la propiedad paginaFinal.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setPaginaFinal(Integer value) {
		this.paginaFinal = value;
	}

	/**
	 * Obtiene el valor de la propiedad fecha.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getFecha() {
		return fecha;
	}

	/**
	 * Define el valor de la propiedad fecha.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setFecha(XMLGregorianCalendar value) {
		this.fecha = value;
	}

	/**
	 * Obtiene el valor de la propiedad autorCorrespondiente.
	 * 
	 * @return possible object is {@link ArticuloAcademico.AutorCorrespondiente }
	 * 
	 */
	public ArticuloAcademico.AutorCorrespondiente getAutorCorrespondiente() {
		return autorCorrespondiente;
	}

	/**
	 * Define el valor de la propiedad autorCorrespondiente.
	 * 
	 * @param value allowed object is
	 *              {@link ArticuloAcademico.AutorCorrespondiente }
	 * 
	 */
	public void setAutorCorrespondiente(ArticuloAcademico.AutorCorrespondiente value) {
		this.autorCorrespondiente = value;
	}

	/**
	 * Obtiene el valor de la propiedad listaDeAutores.
	 * 
	 * @return possible object is {@link ArticuloAcademico.ListaDeAutores }
	 * 
	 */
	public ArticuloAcademico.ListaDeAutores getListaDeAutores() {
		return listaDeAutores;
	}

	/**
	 * Define el valor de la propiedad listaDeAutores.
	 * 
	 * @param value allowed object is {@link ArticuloAcademico.ListaDeAutores }
	 * 
	 */
	public void setListaDeAutores(ArticuloAcademico.ListaDeAutores value) {
		this.listaDeAutores = value;
	}

	/**
	 * Obtiene el valor de la propiedad resumen.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * Define el valor de la propiedad resumen.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setResumen(String value) {
		this.resumen = value;
	}

	/**
	 * Obtiene el valor de la propiedad doi.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDoi() {
		return doi;
	}

	/**
	 * Define el valor de la propiedad doi.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDoi(String value) {
		this.doi = value;
	}

	/**
	 * Obtiene el valor de la propiedad lugarDePublicacion.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	/**
	 * Define el valor de la propiedad lugarDePublicacion.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLugarDePublicacion(String value) {
		this.lugarDePublicacion = value;
	}

	/**
	 * Obtiene el valor de la propiedad abreviatura.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAbreviatura() {
		return abreviatura;
	}

	/**
	 * Define el valor de la propiedad abreviatura.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAbreviatura(String value) {
		this.abreviatura = value;
	}

	/**
	 * Obtiene el valor de la propiedad organizacionCorrespondiente.
	 * 
	 * @return possible object is
	 *         {@link ArticuloAcademico.OrganizacionCorrespondiente }
	 * 
	 */
	public ArticuloAcademico.OrganizacionCorrespondiente getOrganizacionCorrespondiente() {
		return organizacionCorrespondiente;
	}

	/**
	 * Define el valor de la propiedad organizacionCorrespondiente.
	 * 
	 * @param value allowed object is
	 *              {@link ArticuloAcademico.OrganizacionCorrespondiente }
	 * 
	 */
	public void setOrganizacionCorrespondiente(ArticuloAcademico.OrganizacionCorrespondiente value) {
		this.organizacionCorrespondiente = value;
	}

	/**
	 * Obtiene el valor de la propiedad tieneMetrica.
	 * 
	 * @return possible object is {@link ArticuloAcademico.TieneMetrica }
	 * 
	 */
	public ArticuloAcademico.TieneMetrica getTieneMetrica() {
		return tieneMetrica;
	}

	/**
	 * Define el valor de la propiedad tieneMetrica.
	 * 
	 * @param value allowed object is {@link ArticuloAcademico.TieneMetrica }
	 * 
	 */
	public void setTieneMetrica(ArticuloAcademico.TieneMetrica value) {
		this.tieneMetrica = value;
	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *       &lt;/all&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class AutorCorrespondiente {

		protected String id;
		protected String nombre;

		/**
		 * Obtiene el valor de la propiedad id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define el valor de la propiedad id.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Obtiene el valor de la propiedad nombre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Define el valor de la propiedad nombre.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNombre(String value) {
			this.nombre = value;
		}

	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;choice maxOccurs="unbounded"&gt;
	 *         &lt;element name="Autor" minOccurs="0"&gt;
	 *           &lt;complexType&gt;
	 *             &lt;complexContent&gt;
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                 &lt;all&gt;
	 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *                 &lt;/all&gt;
	 *               &lt;/restriction&gt;
	 *             &lt;/complexContent&gt;
	 *           &lt;/complexType&gt;
	 *         &lt;/element&gt;
	 *       &lt;/choice&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "autor" })
	public static class ListaDeAutores {

		@XmlElement(name = "Autor")
		protected List<ArticuloAcademico.ListaDeAutores.Autor> autor;

		/**
		 * Gets the value of the autor property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot.
		 * Therefore any modification you make to the returned list will be present
		 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
		 * for the autor property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getAutor().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link ArticuloAcademico.ListaDeAutores.Autor }
		 * 
		 * 
		 */
		public List<ArticuloAcademico.ListaDeAutores.Autor> getAutor() {
			if (autor == null) {
				autor = new ArrayList<ArticuloAcademico.ListaDeAutores.Autor>();
			}
			return this.autor;
		}

		/**
		 * <p>
		 * Clase Java para anonymous complex type.
		 * 
		 * <p>
		 * El siguiente fragmento de esquema especifica el contenido que se espera que
		 * haya en esta clase.
		 * 
		 * <pre>
		 * &lt;complexType&gt;
		 *   &lt;complexContent&gt;
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *       &lt;all&gt;
		 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
		 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
		 *       &lt;/all&gt;
		 *     &lt;/restriction&gt;
		 *   &lt;/complexContent&gt;
		 * &lt;/complexType&gt;
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = {

		})
		public static class Autor {

			protected String id;
			protected String nombre;

			/**
			 * Obtiene el valor de la propiedad id.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getId() {
				return id;
			}

			/**
			 * Define el valor de la propiedad id.
			 * 
			 * @param value allowed object is {@link String }
			 * 
			 */
			public void setId(String value) {
				this.id = value;
			}

			/**
			 * Obtiene el valor de la propiedad nombre.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNombre() {
				return nombre;
			}

			/**
			 * Define el valor de la propiedad nombre.
			 * 
			 * @param value allowed object is {@link String }
			 * 
			 */
			public void setNombre(String value) {
				this.nombre = value;
			}

		}

	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *       &lt;/all&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class OrganizacionCorrespondiente {

		protected String id;
		protected String nombre;

		/**
		 * Obtiene el valor de la propiedad id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define el valor de la propiedad id.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Obtiene el valor de la propiedad nombre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Define el valor de la propiedad nombre.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNombre(String value) {
			this.nombre = value;
		}

	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *       &lt;/all&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class PublicadoEnPublicacionImpacto {

		protected String id;
		protected String nombre;

		/**
		 * Obtiene el valor de la propiedad id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define el valor de la propiedad id.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Obtiene el valor de la propiedad nombre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Define el valor de la propiedad nombre.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNombre(String value) {
			this.nombre = value;
		}

	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *       &lt;/all&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class TieneColeccionDePublicacion {

		protected String id;
		protected String nombre;

		/**
		 * Obtiene el valor de la propiedad id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define el valor de la propiedad id.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Obtiene el valor de la propiedad nombre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Define el valor de la propiedad nombre.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNombre(String value) {
			this.nombre = value;
		}

	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *       &lt;/all&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class TieneLibroDePublicacion {

		protected String id;
		protected String nombre;

		/**
		 * Obtiene el valor de la propiedad id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define el valor de la propiedad id.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Obtiene el valor de la propiedad nombre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Define el valor de la propiedad nombre.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNombre(String value) {
			this.nombre = value;
		}

	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *       &lt;/all&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class TieneMetrica {

		protected String id;
		protected String nombre;

		/**
		 * Obtiene el valor de la propiedad id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define el valor de la propiedad id.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Obtiene el valor de la propiedad nombre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Define el valor de la propiedad nombre.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNombre(String value) {
			this.nombre = value;
		}

	}

}
